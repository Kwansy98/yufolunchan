import buddhism.BuddhismTools;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Scanner;

public class Client {
    private static SocketAddress socketAddress = new InetSocketAddress("gg.4fk.me", 6324);
    private static Socket socket = new Socket();
    private static BufferedReader in = null;
    private static PrintWriter out = null;
    public static void main(String[] args) {
        try {
            socket.connect(socketAddress);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
            out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);
            System.out.println("连接服务器成功");
            System.out.println("用法：输入人话，打印佛语并广播给其他人；输入佛语，翻译成人话，不广播");
            Scanner sc = new Scanner(System.in);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        String recv;
                        while ((recv = in.readLine()) != null) {
                            System.out.println(recv);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
            while (true) {
                String input = sc.nextLine();
                if (input.isBlank()) continue;
                if (input.startsWith("佛曰：") || input.startsWith("如是我闻：")) {
                    String encryptedString = BuddhismTools.buddhism2Human(input);
                    System.out.println(encryptedString);
                } else {
                    String buddhi = BuddhismTools.human2Buddhism(input);
                    System.out.println(buddhi);
                    out.println(buddhi);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) in.close();
                if (out != null) out.close();
                if (socket != null) socket.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}



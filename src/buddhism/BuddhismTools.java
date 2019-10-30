package buddhism;

import utils.AESTools;

public class BuddhismTools {
    private static final String password = "U2FsdGVkX1+9azMGhHoOZ59u"; // 默认密钥
    private static final TruthTable truthTable = TruthTable.getInstance();

    // base64密文 <-- 字符映射 --> 佛语
    private static String encode(String content) throws Exception {
        char[] arr = content.toCharArray();
        StringBuilder res = new StringBuilder();
        for (char c : arr) {
            String rp = truthTable.get(String.valueOf(c));
            if (rp == null) throw new Exception(""); // 不在真值表内的字符无法处理
            res.append(rp);
        }
        return res.toString();
    }

    public static String human2Buddhism(String human) {
        String base64EncryptedString = new String(AESTools.AESEncode(password, human.getBytes()));
        String buddhiString = "";
        try {
            buddhiString = encode(base64EncryptedString);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return human.length() % 2 == 0 ? "如是我闻：" + buddhiString : "佛曰：" + buddhiString;
    }

    public static String human2Buddhism(String human, String password) {
        String base64EncryptedString = new String(AESTools.AESEncode(password, human.getBytes()));
        String buddhiString = "";
        try {
            buddhiString = encode(base64EncryptedString);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return human.length() % 2 == 0 ? "如是我闻：" + buddhiString : "佛曰：" + buddhiString;
    }

    public static String buddhism2Human(String buddhi) {
        try {
            if (buddhi.startsWith("佛曰：")) {
                buddhi = buddhi.split("佛曰：")[1];
                String base64Encrypted = encode(buddhi);
                return new String(AESTools.AESDecode(password, base64Encrypted.getBytes()));
            } else if (buddhi.startsWith("如是我闻：")) {
                buddhi = buddhi.split("如是我闻：")[1];
                String base64Encrypted = encode(buddhi);
                return new String(AESTools.AESDecode(password, base64Encrypted.getBytes()));
            } else {
                return "太深奥了，参悟不出佛经的真意……";
            }
        } catch (Exception ex) {
            return "太深奥了，参悟不出佛经的真意……";
        }
    }

    public static String buddhism2Human(String buddhi, String password) {
        try {
            if (buddhi.startsWith("佛曰：")) {
                buddhi = buddhi.split("佛曰：")[1];
                String base64Encrypted = encode(buddhi);
                return new String(AESTools.AESDecode(password, base64Encrypted.getBytes()));
            } else if (buddhi.startsWith("如是我闻：")) {
                buddhi = buddhi.split("如是我闻：")[1];
                String base64Encrypted = encode(buddhi);
                return new String(AESTools.AESDecode(password, base64Encrypted.getBytes()));
            } else {
                return "太深奥了，参悟不出佛经的真意……";
            }
        } catch (Exception ex) {
            return "太深奥了，参悟不出佛经的真意……";
        }
    }


}

package test;

import buddhism.BuddhismTools;

public class TestBuddhism {
    public static void main(String[] args) {
        String content = "Hello world!";
        String myCustomKey = "MYCUSTOMKEY";
        String encryptedContent = BuddhismTools.human2Buddhism(content, myCustomKey);
        System.out.println(encryptedContent);

        String decryptedContent = BuddhismTools.buddhism2Human(encryptedContent, myCustomKey);
        System.out.println(decryptedContent);
    }
}

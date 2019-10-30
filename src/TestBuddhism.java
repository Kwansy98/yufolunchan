import buddhism.BuddhismTools;

public class TestBuddhism {
    public static void main(String[] args) {
        String content = "Hello world!";
        String encryptedContent = BuddhismTools.human2Buddhism(content, "MYCUSTOMKEY");
        System.out.println(encryptedContent);

        String decryptedContent = BuddhismTools.buddhism2Human(encryptedContent, "MYCUSTOMKEY");
        System.out.println(decryptedContent);
    }
}

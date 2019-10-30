import buddhism.BuddhismTools;

public class TestBuddhism {
    public static void main(String[] args) {
//        String encryptedString = "佛曰：室参哆室娑伽阇栗啰诃唵嚧输遮摩迦耶伊栗埵遮陀罚栗喝驮哆那吉俱驮伊写穆唎数提豆室埵悉无钵曳室迦伽伽卢帝阇舍度伽陀埵数耶呼无他利烁蒙";
//        System.out.println(BuddhismTools.buddhism2Human(encryptedString));
//
//        String content = "清风不识字，何故乱翻书？";
//        String customKey = "dontusedefaultkey";
//        String encryptedString2 = BuddhismTools.human2Buddhism(content, customKey);
//        System.out.println(encryptedString2);
//        System.out.println(BuddhismTools.buddhism2Human(encryptedString2)); // use wrong key
//        System.out.println(BuddhismTools.buddhism2Human(encryptedString2, customKey));

        String content = "Hello world!";
        String encryptedContent = BuddhismTools.human2Buddhism(content, "MYCUSTOMKEY");
        System.out.println(encryptedContent);

        String decryptedContent = BuddhismTools.buddhism2Human(encryptedContent, "MYCUSTOMKEY");
        System.out.println(decryptedContent);
    }
}

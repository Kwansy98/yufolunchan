package buddhism;

import utils.AESTools;

import java.util.Objects;

public class BuddhismTools {
    // 默认密钥
    private static final String PASSWORD = "U2FsdGVkX1+9azMGhHoOZ59u";
    private static final TruthTable TRUTH_TABLE = TruthTable.getInstance();

    // base64密文 <-- 字符映射 --> 佛语
    private static String encode(String content) {
        char[] arr = content.toCharArray();
        StringBuilder res = new StringBuilder();
        for (char c : arr) {
            String rp = TRUTH_TABLE.get(String.valueOf(c));
            if (rp == null) {
                // 不在真值表内的字符无法处理
                throw new NullPointerException("没有在真值表中映射");
            }
            res.append(rp);
        }
        return res.toString();
    }

    public static String human2Buddhism(String human) {
        String base64EncryptedString = new String(Objects.requireNonNull(AESTools.AESEncode(PASSWORD, human.getBytes())));
        String buddhiString = "";
        try {
            buddhiString = encode(base64EncryptedString);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return human.length() % 2 == 0 ? "如是我闻：" + buddhiString : "佛曰：" + buddhiString;
    }

    public static String human2Buddhism(String human, String password) {
        String base64EncryptedString = new String(Objects.requireNonNull(AESTools.AESEncode(password, human.getBytes())));
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
                return new String(Objects.requireNonNull(AESTools.AESDecode(PASSWORD, base64Encrypted.getBytes())));
            } else if (buddhi.startsWith("如是我闻：")) {
                buddhi = buddhi.split("如是我闻：")[1];
                String base64Encrypted = encode(buddhi);
                return new String(Objects.requireNonNull(AESTools.AESDecode(PASSWORD, base64Encrypted.getBytes())));
            } else {
                return "太深奥了，参悟不出佛经的真意……";
            }
        } catch (Exception ex) {
            return "太深奥了，参悟不出佛经的真意……" + ex;
        }
    }

    public static String buddhism2Human(String buddhi, String password) {
        try {
            if (buddhi.startsWith("佛曰：")) {
                buddhi = buddhi.split("佛曰：")[1];
                String base64Encrypted = encode(buddhi);
                return new String(Objects.requireNonNull(AESTools.AESDecode(password, base64Encrypted.getBytes())));
            } else if (buddhi.startsWith("如是我闻：")) {
                buddhi = buddhi.split("如是我闻：")[1];
                String base64Encrypted = encode(buddhi);
                return new String(Objects.requireNonNull(AESTools.AESDecode(password, base64Encrypted.getBytes())));
            } else {
                return "太深奥了，参悟不出佛经的真意……";
            }
        } catch (Exception ex) {
            return "太深奥了，参悟不出佛经的真意……" + ex;
        }
    }


}

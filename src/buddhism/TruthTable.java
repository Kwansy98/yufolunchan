package buddhism;

import java.util.HashMap;

public class TruthTable {
    private static TruthTable instance = null;
    private static HashMap<String, String> map = new HashMap<>();

    public static TruthTable getInstance() {
        if (instance != null) return instance;
        return new TruthTable();
    }

    private TruthTable() {
        map.put("啰", "e");
        map.put("羯", "E");
        map.put("婆", "t");
        map.put("提", "T");
        map.put("摩", "a");
        map.put("埵", "A");
        map.put("诃", "o");
        map.put("迦", "O");
        map.put("耶", "i");
        map.put("吉", "I");
        map.put("娑", "n");
        map.put("佛", "N");
        map.put("夜", "s");
        map.put("驮", "S");
        map.put("那", "h");
        map.put("谨", "H");
        map.put("悉", "r");
        map.put("墀", "R");
        map.put("阿", "d");
        map.put("呼", "D");
        map.put("萨", "l");
        map.put("尼", "L");
        map.put("陀", "c");
        map.put("唵", "C");
        map.put("唎", "u");
        map.put("伊", "U");
        map.put("卢", "m");
        map.put("喝", "M");
        map.put("帝", "w");
        map.put("烁", "W");
        map.put("醯", "f");
        map.put("蒙", "F");
        map.put("罚", "g");
        map.put("沙", "G");
        map.put("嚧", "y");
        map.put("他", "Y");
        map.put("南", "p");
        map.put("豆", "P");
        map.put("无", "b");
        map.put("孕", "B");
        map.put("菩", "v");
        map.put("伽", "V");
        map.put("怛", "k");
        map.put("俱", "K");
        map.put("哆", "j");
        map.put("度", "J");
        map.put("皤", "x");
        map.put("阇", "X");
        map.put("室", "q");
        map.put("地", "Q");
        map.put("利", "z");
        map.put("遮", "Z");
        map.put("穆", "0");
        map.put("参", "1");
        map.put("舍", "2");
        map.put("苏", "3");
        map.put("钵", "4");
        map.put("曳", "5");
        map.put("数", "6");
        map.put("写", "7");
        map.put("栗", "8");
        map.put("楞", "9");
        map.put("咩", "+");
        map.put("输", "/");
        map.put("漫", "=");

        map.put("e", "啰");
        map.put("E", "羯");
        map.put("t", "婆");
        map.put("T", "提");
        map.put("a", "摩");
        map.put("A", "埵");
        map.put("o", "诃");
        map.put("O", "迦");
        map.put("i", "耶");
        map.put("I", "吉");
        map.put("n", "娑");
        map.put("N", "佛");
        map.put("s", "夜");
        map.put("S", "驮");
        map.put("h", "那");
        map.put("H", "谨");
        map.put("r", "悉");
        map.put("R", "墀");
        map.put("d", "阿");
        map.put("D", "呼");
        map.put("l", "萨");
        map.put("L", "尼");
        map.put("c", "陀");
        map.put("C", "唵");
        map.put("u", "唎");
        map.put("U", "伊");
        map.put("m", "卢");
        map.put("M", "喝");
        map.put("w", "帝");
        map.put("W", "烁");
        map.put("f", "醯");
        map.put("F", "蒙");
        map.put("g", "罚");
        map.put("G", "沙");
        map.put("y", "嚧");
        map.put("Y", "他");
        map.put("p", "南");
        map.put("P", "豆");
        map.put("b", "无");
        map.put("B", "孕");
        map.put("v", "菩");
        map.put("V", "伽");
        map.put("k", "怛");
        map.put("K", "俱");
        map.put("j", "哆");
        map.put("J", "度");
        map.put("x", "皤");
        map.put("X", "阇");
        map.put("q", "室");
        map.put("Q", "地");
        map.put("z", "利");
        map.put("Z", "遮");
        map.put("0", "穆");
        map.put("1", "参");
        map.put("2", "舍");
        map.put("3", "苏");
        map.put("4", "钵");
        map.put("5", "曳");
        map.put("6", "数");
        map.put("7", "写");
        map.put("8", "栗");
        map.put("9", "楞");
        map.put("+", "咩");
        map.put("/", "输");
        map.put("=", "漫");
    }

    // 如果找不到映射返回 null
    public String get(String key) {
        return map.get(key);
    }
}

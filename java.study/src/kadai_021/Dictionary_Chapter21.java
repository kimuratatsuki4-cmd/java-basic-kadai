package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
    HashMap<String, String> dict = new HashMap<>();

    // 引数を配列とし、英単語と意味を追加
    public Dictionary_Chapter21() {
        dict.put("apple", "りんご");
        dict.put("peach", "桃");
        dict.put("banana", "バナナ");
        dict.put("lemon", "レモン");
        dict.put("pear", "梨");
        dict.put("kiwi", "キウィ");
        dict.put("strawberry", "いちご");
        dict.put("grape", "ぶどう");
        dict.put("muscat", "マスカット");
        dict.put("cherry", "さくらんぼ");
    }

    // 英単語を指定して意味を取得
    public String getMeaning(String word) {
        return dict.get(word);
    }

    // containsKeyメソッドの実装（意味ないやろこれ）
    public boolean containsKey(String word) {
        return dict.containsKey(word);
    }

}

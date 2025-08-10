package kadai_021;

public class DictionaryExec_Chapter21 {
    public static void main(String[] args) {
        Dictionary_Chapter21 dict = new Dictionary_Chapter21();
        // 調べる英単語を配列として生成
        String[] words = { "apple", "banana", "grape", "orange" };

        // 辞書で調べるメソッドを引数指定で呼び出す
        for (int i = 0; i < words.length; i++) {
            if (dict.containsKey(words[i])) {
                // 辞書に追加されている場合
                System.out.println(words[i] + "の意味は" + dict.getMeaning(words[i]));

            } else {
                System.out.println(words[i] + "は辞書に存在しません");
            }
        }

    }
}
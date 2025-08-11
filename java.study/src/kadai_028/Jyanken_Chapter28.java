package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
    public String getMyChoiceString() {
        // 自分のじゃんけんの手を入力する
        HashMap<String, String> choices = new HashMap<>();
        choices.put("r", "グー");
        choices.put("s", "チョキ");
        choices.put("p", "パー");
        System.out.println("じゃんけんの手を入力してください（r: グー, s: チョキ, p: パー）");
        // キーボードから入力した値を取得
        try (Scanner scan = new Scanner(System.in)) {
            String input = scan.nextLine();
            // 入力値がr, s, pのいずれかであれば、対応するじゃんけんの手を返す
            if (input.equals("r") || input.equals("s") || input.equals("p")) {
                return choices.get(input);
            } else {
                // 入力値が不正な場合はエラーメッセージを返し、再度自分の入力を実施する。
                System.out.println("不正な入力です。r, s, pのいずれかを入力してください。");
                return getMyChoiceString();
            }

        } catch (Exception e) {
            e.printStackTrace();
            return "不正な入力です。正しい入力をしてください。";
        }
    }

    // 対戦相手のじゃんけんの手を乱数で選ぶ
    public String getRandom() {
        // 配列にじゃんけんの手をセットする。
        String[] hands = { "グー", "チョキ", "パー" };

        // 乱数で対戦相手のじゃんけんの手を選ぶ
        int randomIndex = (int) Math.floor(Math.random() * 3);
        return hands[randomIndex];
    }

    // じゃんけんを実施するメソッド
    public void playGame(String myChoice, String computerChoice) {
        // 自分と対戦相手のじゃんけんの手を比較し、結果を出力する。
        System.out.println("自分の手: " + myChoice);
        System.out.println("対戦相手の手: " + computerChoice);

        if (myChoice.equals(computerChoice)) {
            System.out.println("あいこです。");
        } else if ((myChoice.equals("グー") && computerChoice.equals("チョキ")) ||
                (myChoice.equals("チョキ") && computerChoice.equals("パー")) ||
                (myChoice.equals("パー") && computerChoice.equals("グー"))) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
    }
}

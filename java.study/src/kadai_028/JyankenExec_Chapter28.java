package kadai_028;

public class JyankenExec_Chapter28 {
    public static void main(String[] args) {
        // ①じゃんけんクラスのインスタンスを作成
        Jyanken_Chapter28 jyanken = new Jyanken_Chapter28();
        // ②自分のじゃんけんの手を入力
        String myChoice = jyanken.getMyChoiceString();
        // ③対戦相手の手を決定
        String computerChoice = jyanken.getRandom();
        // ④結果を判定して出力
        jyanken.playGame(myChoice, computerChoice);
    }
}
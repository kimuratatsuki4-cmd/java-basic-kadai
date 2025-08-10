package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {

    // setter を記載
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    @Override
    public void eachIntroduce() {
        System.out.println("私はJavaが得意です");
    }
}

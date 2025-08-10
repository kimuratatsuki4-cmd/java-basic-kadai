package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {

    // setter を記載
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    @Override
    public void eachIntroduce() {
        System.out.println("名前は" + familyName + givenName + "です");
        System.out.println("好きな食べ物はリンゴです");
    }
}
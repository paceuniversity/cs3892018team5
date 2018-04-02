package pace.cs3892018team5.dev.chinesefortuneaide;

/**
 * Created by johnnychen on 2018/4/2.
 */

public class word {
    String CHS;
    String ENG;

    public word(String CHS, String ENG) {
        this.CHS = CHS;
        this.ENG = ENG;
    }

    public String getCHS() {
        return CHS;
    }

    public String getENG() {
        return ENG;
    }
}

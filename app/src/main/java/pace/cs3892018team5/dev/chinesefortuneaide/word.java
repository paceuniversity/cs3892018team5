package pace.cs3892018team5.dev.chinesefortuneaide;

import android.media.MediaPlayer;

import java.lang.reflect.Field;

/**
 * Created by johnnychen on 2018/4/16.
 */

public class word {
    private int img;
    private int sound;

    public word(int img, int sound) {
        this.img = img;
        this.sound = sound;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getSound() {
        return sound;
    }

    public void setSound(int sound) {
        this.sound = sound;
    }
}

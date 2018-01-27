package jp.techacademy.yuka.hongou.jumpactiongame;

import com.badlogic.gdx.graphics.Texture;

/**
 * Created by hongoyuka on 2018/01/25.
 */

public class Ufo extends GameObject {

    //横幅、高さ
    public static final float UFO_WIDTH = 2.0f;
    public static final float UFO_HEIGHT = 1.3f;

    public Ufo(Texture texture, int scrX, int scrY, int scrWidth, int scrHeight){
        super(texture, scrX, scrY, scrWidth, scrHeight);
        setSize(UFO_WIDTH, UFO_HEIGHT);
    }
}

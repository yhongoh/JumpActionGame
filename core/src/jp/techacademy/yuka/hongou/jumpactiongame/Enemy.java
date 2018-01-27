package jp.techacademy.yuka.hongou.jumpactiongame;


import com.badlogic.gdx.graphics.Texture;

/**
 * Created by hongoyuka on 2018/01/27.
 */

public class Enemy extends GameObject {
    public static final float ENEMY_WIDTH = 0.8f;
    public static final float ENEMY_HEIGHT = 0.8f;

    public Enemy(Texture texture, int scrX, int scrY, int scrWidth, int scrHeight) {
        super(texture, scrX, scrY, scrWidth, scrHeight);
        setSize(ENEMY_WIDTH, ENEMY_HEIGHT);
    }
}
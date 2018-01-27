package jp.techacademy.yuka.hongou.jumpactiongame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by hongoyuka on 2018/01/22.
 */

public class GameObject extends Sprite {
    public final Vector2 velocity;

    public GameObject(Texture texture, int scrX, int scrY, int scrWidth, int scrHeight){
        super(texture, scrX, scrY, scrWidth, scrHeight);

        velocity = new Vector2();
    }

}

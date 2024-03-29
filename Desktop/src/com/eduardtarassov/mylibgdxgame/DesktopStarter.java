package com.eduardtarassov.mylibgdxgame;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopStarter {
    public static void main(String[] args) {
        //Instantiate LwjglApplicationConfiguration class. It specifies various configuration settings.
        LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
        cfg.title = "MyLibgdxGame";
        cfg.useGL20 = true;
        cfg.width = 800;
        cfg.height = 480;
        new LwjglApplication(new MyLibgdxGame(), cfg);
    }
}

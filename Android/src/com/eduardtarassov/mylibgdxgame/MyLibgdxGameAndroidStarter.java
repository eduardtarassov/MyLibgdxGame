package com.eduardtarassov.mylibgdxgame;

import android.os.Bundle;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

public class MyLibgdxGameAndroidStarter extends AndroidApplication
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //Instance of AndroidApplicationConfiguration is created to set configurations. There are more configurations available in AndroidApplicationConfiguration Javadocs
        AndroidApplicationConfiguration cfg = new AndroidApplicationConfiguration();
        cfg.useAccelerometer = false;
        cfg.useCompass = false;
        cfg.useWakelock = true;
        cfg.useGL20 = true;
        initialize(new MyLibgdxGame(), cfg);
    }
}

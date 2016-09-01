package com.nibotek.nbourre.movethebubble;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

/**
 * Src : https://www.youtube.com/watch?v=-XOMJYZmfkw
 */
public class BubbleActivity extends Activity {

    private BubbleView bubbleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Enlever le titre
        requestWindowFeature(Window.FEATURE_NO_TITLE);


        // Plein écran
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setContentView(new GamePanel(this));
    }
}

package com.betaturtle.catsndogs.app;

import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.VideoView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
        VideoView v = (VideoView) findViewById(R.id.videoView);
        v.setVideoURI(Uri.parse("https://r2---sn-nvoxu-ioqs.googlevideo.com/videoplayback?id=o-AKQj3L3SZbGfgVFn36NFwZ4_XfXWKMkXRVm889xKSjUV&ratebypass=yes&signature=CAB3E03D5C47B02449C6920A69AE67EE19DFC7F2.14E7185B0E2F1AF05B90A5AEEC6C81CB99B1D1B8&upn=oaG3Bcp88Eo&ipbits=0&mt=1404736834&mws=yes&expire=1404759600&sparams=id%2Cip%2Cipbits%2Citag%2Cratebypass%2Crequiressl%2Csource%2Cupn%2Cexpire&itag=22&ip=118.238.220.233&key=yt5&requiressl=yes&sver=3&ms=au&source=youtube&mv=u&fexp=900220%2C902408%2C916611%2C924213%2C924217%2C924222%2C927606%2C930008%2C934024%2C934030%2C945062"));
        v.requestFocus();
        v.start();
    }
}

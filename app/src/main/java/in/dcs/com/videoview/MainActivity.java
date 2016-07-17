package in.dcs.com.videoview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;
import android.widget.MediaController;

public class MainActivity extends AppCompatActivity {

    private VideoView videoView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        videoView = (VideoView) findViewById(R.id.videoView)    ;
        videoView.setVideoPath("C:\\Users\\bird\\Downloads\\SampleVideo_1280x720_1mb.mp4");

        //Player controls play, pause, stop etc.
        MediaController mediaController = new MediaController(this) ;
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        videoView.start();
    }
}

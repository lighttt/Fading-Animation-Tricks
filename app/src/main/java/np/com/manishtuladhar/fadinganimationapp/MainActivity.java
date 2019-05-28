package np.com.manishtuladhar.fadinganimationapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public ImageView bart,homer;

    public void fade(View view){
//        fading ko code
/*     bart.animate().alpha(0f).setDuration(2000);
        homer.animate().alpha(1f).setDuration(2000);
        */

    //top right left bottom ko code
    //bart.animate().translationYBy(-1000f).setDuration(2000);
    //bart.animate().translationXBy(-1000f).setDuration(2000);

        //rotation ko code
        //bart.animate().rotation(1800f).setDuration(2000);

        //size badauney code
       // bart.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);

        //rotate garera lera aauney
        bart.animate()
                .translationXBy(1000f)
                .translationYBy(1000f)
                .rotation(1800f)
                .setDuration(2000);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bart = (ImageView)findViewById(R.id.iv_bart);
        homer = (ImageView)findViewById(R.id.iv_homer);

        bart.setTranslationX(-1000f);
        bart.setTranslationY(-1000f);

    }
}

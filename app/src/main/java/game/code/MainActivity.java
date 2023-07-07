package game.code;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //cua so khong co thanh title
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        //tao doi tuong
        GamePanel d=new GamePanel(this);
        setContentView(d);
        //setContentView(R.layout.activity_main);

    }
}
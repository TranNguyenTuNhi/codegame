package game.code;

import android.util.Log;
import android.view.SurfaceHolder;

public class MainThread extends Thread{
    //them 2 bien
    private SurfaceHolder surfaceholder;
    private GamePanel gamepanel;
    private boolean running;

    //them ham
    public MainThread(SurfaceHolder surfaceholder, GamePanel gamepanel){
        this.surfaceholder = surfaceholder;
        this.gamepanel = gamepanel;
    }
    public void setRunning(boolean r){
        running = r;
    }
    @Override
    public void run(){
        // TODO Auto-generated method stub
        super.run();
        long dem=0L;
        while (running){
            dem++;
            //cap nhat lai trang thai game
            // render du lieu ra man hinh
            Log.d("testloop:", "loop "+ dem);
        }
    }
}

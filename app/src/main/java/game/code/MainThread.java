package game.code;

import android.graphics.Canvas;
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
        long dem=0L;
        super.run();
        Canvas canvas = null;
        while (running){
            dem++;
            //cap nhat lai trang thai game
            canvas = surfaceholder.lockCanvas();
            if (canvas!=null){
                gamepanel.draw(canvas);
                surfaceholder.unlockCanvasAndPost(canvas);
            }
            // render du lieu ra man hinh
            Log.d("testloop:", "loop "+ dem);
        }
    }
}

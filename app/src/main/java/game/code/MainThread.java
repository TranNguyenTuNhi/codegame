package game.code;

import android.util.Log;

public class MainThread extends Thread{
    private boolean running;
    public void setRunning(boolean r){
        running = r;
    }
    @Override
    public void run(){
        //

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

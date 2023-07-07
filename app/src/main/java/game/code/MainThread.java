package game.code;

public class MainThread extends Thread{
    private boolean running;
    public void setRunning(boolean r){
        running = r;
    }
    @Override
    public void run(){
        //
        super.run();

        while (running){
            //cap nhat lai trang thai game
            // render du lieu ra man hinh
        }
    }
}

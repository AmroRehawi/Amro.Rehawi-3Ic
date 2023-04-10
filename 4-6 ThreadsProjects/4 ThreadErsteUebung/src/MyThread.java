import java.text.SimpleDateFormat;
import java.util.Date;

public class MyThread extends Thread{
        String message;
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:mm");
    Date date;

        public MyThread(String message){
            this.message = message;
        }
        public void run() {
            date = new Date();
            while(true) {
                System.out.println(message +" Zeitstempel: "+ formatter.format(date));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        }
    }


import java.text.SimpleDateFormat;
import java.util.Date;

public class MyThread extends Thread{
SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:mm");
Date date;
String name;
public MyThread(String name){
this.name = name;
}
public void run(){
    date = new Date();

    for (int i=0; i <= 10; i++){
        String message = name + " logt zum " + i +". Mal in der Datei";
        LogFile.WriteLine(message);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
}


import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class BMICalc {
   double weight, height, bmi;
   public void userInput(){
       Scanner scnr = new Scanner(System.in);
       boolean again;
       do{try {
           System.out.println("Groesse in Meter");
           height = scnr.nextDouble();
           System.out.print("Gewicht in Kilogram");
           weight = scnr.nextDouble();
           again = false;
       }catch (InputMismatchException ex){
           System.out.println("Eingabe von Buchstaben oder Sonderzeichen ungueltig");
           System.out.println("Gib eine Zahl ein");
           again = true;
       }
       catch (NoSuchElementException ex){
           System.out.println("Die Zahl ist zu groß, probiere nochmal");
           again = true;
       }
       } while(again);
   }
   public void BMISetter(){
       bmi = weight / (height * height);
       if (bmi < 18.5) {
           System.out.println("Untergewicht");
       } else if (bmi < 25) {
           System.out.println("Normalgewicht");
       } else if (bmi < 30) {
           System.out.println("Uebergewicht");
       } else if (bmi < 35) {
           System.out.println("Adipositas Grad |");
       } else if (bmi < 40) {
           System.out.println("Adipositas Grad ||");
       } else {
           System.out.println("Adipositas Grad |||");
       }
   }

}

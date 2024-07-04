import javax.swing.*;  
import java.awt.*;  
import java.text.*;  
import java.util.*;  
public class DigitalWatch extends Thread { 

    JLabel jl;
    JFrame jfr;

    int hours=0, minutes=0, seconds=0;  
    int hoursB=0, minutesB=0, secondsB=0;
    String timeString = "";  
    String timeB = "";
    JButton b, b2; 

    Thread t = new Thread(this);  
      
   DigitalWatch() {
        start();
    }

     public void run() 
     {
        theFace();
     } 
     public void work() { 
          try {  
             while (true) {  
      
                Calendar cal = Calendar.getInstance();  
                hours = cal.get( Calendar.HOUR_OF_DAY );  
                if ( hours > 12 ) hours -= 12;  
                minutes = cal.get( Calendar.MINUTE );  
                seconds = cal.get( Calendar.SECOND );  
      
                SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");  
                Date date = cal.getTime();  
                timeString = formatter.format( date );  
      
                printTime();  
      
                Thread.sleep( 1000 );  // interval given in milliseconds  
             }  
          }  
          catch (Exception e) { }  
           printTime();
     } 

     // public void workB() {
     //    try {
     //        while(true) {
     //            Calendar calB = Calendar.getInstance();  
     //            hoursB = calB.get( Calendar.HOUR_OF_DAY );  
     //            if ( hoursB > 12 ) hoursB -= 12;  
     //            minutesB = calB.get( Calendar.MINUTE );  
     //            secondsB = calB.get( Calendar.SECOND );  
      
     //            SimpleDateFormat formatterB = new SimpleDateFormat("hh:mm:ss"); 
     //            Date dateB = calB.getTime();
     //            DateFormat df = DateFormat.getTimeInstance(DateFormat.LONG, new Locale("au", "AU"));
     //            timeB = df.format(new Date());

     //            Thread.sleep(1000);
     //            printTimeB();
     //        }
     //    }
     //      catch (Exception e) { }  
     //       printTimeB();
     // } 

     public void theFace() {
            jfr = new JFrame("Look at the Time Now!!!");
            JPanel jp = new JPanel();
            jl = new JLabel("");
            jfr.setEnabled(true);
            // jtxfd.setBackground(Color.WHITE);
            // jp.setBackground(Color.GREEN); 
          
            b=new JButton();  
            b.setBounds(100,100,100,50);
            b.setEnabled(false);

            // b2=new JButton();  
            // b2.setBounds(200,200,200,150);
            // b2.setEnabled(false);  
          
            jfr.add(b);
            jfr.add(jp);
            // jp.add(tf);
            jp.add(jl);  
            jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jfr.setSize(300,400);  
            jfr.setLayout(null);  
            jfr.setVisible(true);  
            jfr.setResizable(false);
            jfr.setLocationRelativeTo(null);
            jfr.setVisible(true);
            work();
            // workB();
        } 
  
    public void printTime(){  
    b.setText(timeString);  
    }  

    //  public void printTimeB(){  
    // b2.setText(timeB);  
    // }  
      
    public static void main(String[] args) {  
       DigitalWatch dw = new DigitalWatch();
       // DigitalWatch d1 = new DigitalWatch();

       // dw.start();
       // dw1.start();
    }  
}  
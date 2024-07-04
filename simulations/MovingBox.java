package movingbox;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MovingBox{
        private JFrame frame;
        private JPanel box;
        private JButton[] controller = new JButton[4];
        private int x_Axis = 0;
        private int y_Axis = 0;
        
    
        public void initComp(){
            frame = new JFrame("click to move");
            frame.setSize(600,600);
            frame.setLayout(null);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            
            box = new JPanel();
            box.setBackground(Color.green);
            box.setBounds(getX_Axis(),getY_Axis(),50,50);
            box.setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.BLACK));
            
            JPanel p = new JPanel(null);
            p.setBounds(0,0,frame.getWidth(),frame.getHeight());
            p.setBackground(Color.GRAY);
            p.add(box);
            
           
            
            for(int i = 0;i<controller.length;i++){
                controller[i] = new JButton();
                controller[i].setCursor(new Cursor(12));
                controller[i].setBackground(Color.DARK_GRAY);
                controller[i].setBorder(BorderFactory.createMatteBorder(1,1,1,1, new Color(14,252,10)));
                controller[i].setFocusPainted(false);
                p.add(controller[i]);
            }
            int x = 265; int y = 380;
            controller[0].setBounds(x,y,30,70);
            controller[0].addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e) {
                    if(getY_Axis()>= 10){
                        int y = getY_Axis();
                        box.setBackground(Color.green);
                        setY_Axis(y-=10);
                    }else box.setBackground(Color.red);
                    box.setBounds(getX_Axis(),getY_Axis(),50,50);
                    System.out.printf("Co-ordinate: %d , %d%n",getX_Axis(),getY_Axis());
                }
                
            });
            
            
            controller[1].setBounds(x+35,y+65,70,30);
             controller[1].addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e) {
                    if(getX_Axis()<=540){
                        int x = getX_Axis();
                        box.setBackground(Color.GREEN);
                        setX_Axis(x+=10);
                    }else box.setBackground(Color.red);
                    box.setBounds(getX_Axis(),getY_Axis(),50,50);
                    System.out.printf("Co-ordinate: %d , %d%n",getX_Axis(),getY_Axis());
                }
            });
            
            controller[2].setBounds(x,y+95,30,70);
             controller[2].addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e) {
                    if(getY_Axis()<=310){
                        int y = getY_Axis();
                        box.setBackground(Color.GREEN);
                        setY_Axis(y+=10);
                    }else box.setBackground(Color.red);
                    box.setBounds(getX_Axis(),getY_Axis(),50,50);
                    System.out.printf("Co-ordinate: %d , %d%n",getX_Axis(),getY_Axis());
                }
            });
             
            controller[3].setBounds(x-75,y+65,70,30);
             controller[3].addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e) {
                    if(getX_Axis()>=10){
                        int x = getX_Axis();
                        box.setBackground(Color.GREEN);
                        setX_Axis(x-=10);
                    }else box.setBackground(Color.red);
                    box.setBounds(getX_Axis(),getY_Axis(),50,50);
                    System.out.printf("Co-ordinate: %d , %d%n",getX_Axis(),getY_Axis());
                }
            });

            
            
            frame.setVisible(true);
            frame.add(p);
        }    
   
    public static void main(String[] args) {
        MovingBox stress = new MovingBox();
        stress.initComp();
    }


    public int getX_Axis() {
        return x_Axis;
    }

    public void setX_Axis(int x_Axis) {
        this.x_Axis = x_Axis;
    }

    public int getY_Axis() {
        return y_Axis;
    }

    public void setY_Axis(int y_Axis) {
        this.y_Axis = y_Axis;
    }  
    
}
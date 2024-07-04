import java.awt.Container;

import javax.swing.Box;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.GroupLayout.Group;

public class TryFx extends JFrame{
    Container container = getContentPane();
    Group root = new Group();

    TryFx() {
        manners();
    }
   
    void manners() {
        Box box = new Box();
        box.setHeight(100.0);  
        box.setDepth(80.0);  
        box.setWidth(60.0); 
        root.getChildren().add(box);    
        Scene scene = new Scene(root,500,500);  
        primaryStage.setScene(scene);  
        primaryStage.setTitle("3D shape Example");  
        primaryStage.show();
    }
   
    public static void main(String[] args) {
        new TryFx();
    }
}

// Java program to demonstrate the
// event handling by the anonymous class

import java.awt.*;
import java.awt.event.*;

class AnniEvent extends Frame {

    TextField textField;

    AnniEvent() {
        tommoRrow();
    }

    void tommoRrow() {
        // Component Creation
        textField = new TextField();

        // setBounds method is used to provide
        // position and size of component
        textField.setBounds(60, 50, 180, 25);
        Button button = new Button("click Here");
        button.setBounds(100, 120, 80, 30);

        // Registering component with listener anonymously
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Setting text to field
                textField.setText("Anonymous");
            }
        });

        // add Components
        add(textField);
        add(button);

        // make size viewable
        setSize(300, 300);
        // set visibility
        setVisible(true);
    }

    public static void main(String[] args) {
        new AnniEvent();
    }
}

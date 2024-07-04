import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

class TabComponent extends JPanel implements ActionListener {
  private JTabbedPane pane;

  public TabComponent(String title, JTabbedPane pane) {
    this.pane = pane;
    setOpaque(false);
    JLabel label = new JLabel(title);
    add(label);
    JButton button = new JButton("Close");
    button.setPreferredSize(new Dimension(50,10));
    button.addActionListener(this);
    add(button);
  }

  public void actionPerformed(ActionEvent e) {
    int i = pane.indexOfTabComponent(this);
    if (i != -1)
      pane.remove(i);
  }
}

public class TabComponentDemo {
  public static void main(String[] args) {
    JTabbedPane pane = new JTabbedPane();
    String title = "Tab";
    pane.add(title, new JLabel(title));
    pane.setTabComponentAt(0, new TabComponent(title, pane));

    JFrame frame = new JFrame("Tab Component Demo");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(pane);
    frame.setSize(500, 200);
    frame.setVisible(true);
  }
}
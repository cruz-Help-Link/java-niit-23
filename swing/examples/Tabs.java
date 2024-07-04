import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import javax.swing.JButton;

public class Tabs extends JPanel {
    public Tabs() {
      super(new GridLayout(10, 10));


JTabbedPane tabbedPane = new JTabbedPane();

tabbedPane.addTab("Menu", null, null,"Does Nothing");
tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);

tabbedPane.addTab("Sign Up", null, null, "Does Nothing");
tabbedPane.setMnemonicAt(0, KeyEvent.VK_2);

// tabbedPane.addTab("POS", null, null, "Does Nothing");
// tabbedPane.setMnemonicAt(0, KeyEvent.VK_3);

add(tabbedPane);

tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);

}

private static void createAndShowGUI() {
  JFrame frame = new JFrame("Tabbed Pane");
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  frame.add(new Tabs(), BorderLayout.CENTER);

  frame.pack();
  frame.setVisible(true);
}

public static void main(String[] args) {
  SwingUtilities.invokeLater(new Runnable() {
      public void run() {
  UIManager.put("swing.boldMetal", Boolean.FALSE);
  createAndShowGUI();
      }
  });


 }

}
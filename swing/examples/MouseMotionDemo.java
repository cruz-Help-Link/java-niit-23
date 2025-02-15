import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MouseMotionDemo extends Frame implements MouseListener {

	// Jlabels to display the actions of events of mouseListener

	public static void main(String[] args)
	{
		JFrame f = new JFrame("MouseListener");
		f.setSize(600, 100);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());

		// initialize the labels
		JLabel label1 = new JLabel("no event ");
		JLabel label2 = new JLabel("no event ");
		JLabel label3 = new JLabel("no event ");

		MouseMotionDemo m = new MouseMotionDemo();

		// add mouseListener to the frame
		f.addMouseListener(m);

		// add labels to the panel
		p.add(label1);
		p.add(label2);
		p.add(label3);

		// add panel to the frame
		f.add(p);

		f.show();
	}

	// getX() and getY() functions return the x and y coordinates of the current mouse position
	// getClickCount() returns the number of clicks made by the user

	// this function is invoked when the mouse is pressed
	public void mousePressed(MouseEvent e)
	{

		// show the point where the user pressed the mouse
		label1.setText("mouse pressed at point:"
					+ e.getX() + " " + e.getY());
	}

	// this function is invoked when the mouse is released
	public void mouseReleased(MouseEvent e)
	{

		// show the point where the user released the mouse click
		label1.setText("mouse released at point:"
					+ e.getX() + " " + e.getY());
	}

	// this function is invoked when the mouse exits the component
	public void mouseExited(MouseEvent e)
	{

		// show the point through which the mouse exited the frame
		label2.setText("mouse exited through point:"
					+ e.getX() + " " + e.getY());
	}

	// this function is invoked when the mouse enters the component
	public void mouseEntered(MouseEvent e)
	{

		// show the point through which the mouse entered the frame
		label2.setText("mouse entered at point:"
					+ e.getX() + " " + e.getY());
	}

	// this function is invoked when the mouse is pressed or released
	public void mouseClicked(MouseEvent e)
	{

		// getClickCount gives the number of quick,
		// consecutive clicks made by the user
		// show the point where the mouse is i.e
		// the x and y coordinates
		label3.setText("mouse clicked at point:"
					+ e.getX() + " "
					+ e.getY() + "mouse clicked :" + e.getClickCount());
	}
}

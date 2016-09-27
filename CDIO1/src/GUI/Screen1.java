package GUI;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;


public class JPanel1 extends JPanel implements MouseListener {

	@Override
	public void paintComponent(Graphics g) {
	
// TODO graphics here

		addMouseListener(this);

	}

	//@Override
	public void mouseClicked( MouseEvent e )
	{
		// TODO mouse event here
		
		//Simple: Show coord
		System.out.println(e.getX()+" "+e.getY());

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}

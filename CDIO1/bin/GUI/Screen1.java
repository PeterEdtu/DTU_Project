package GUI;
import javax.swing.JFrame;

public class Screen1 extends JFrame {
public JPanel1 _panel = new JPanel1();
private int x,y;
private String title;

/**
 * Open the created window manually with new parameters
 * @author PeterElHabr
 * @param x : x size of the window
 * @param y : y size of the window
 * @param title : title of the window
 */
  public void OpenWindow(int x,int y,String title){ 
    this.setTitle(this.title);
    this.setSize(this.x, this.y);
    this.setLocationRelativeTo(null);               
    this.setContentPane(_panel);
    this.setVisible(true);
  }
  
  /**
   * Open the created window manually with default parameters
   * @author PeterElHabr
   */
    public void OpenWindow(){ 
      this.setTitle(this.title);
      this.setSize(this.x, this.y);
      this.setLocationRelativeTo(null);               
      //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setContentPane(_panel);
      this.setVisible(true);
    }
 
 /**
  * Default Window
  * @author PeterElHabr
  */
  public Screen1(){
	  	this.title="Default title";
	  	this.x=700;
	  	this.y=700;
	    this.setTitle(this.title);
	    this.setSize(this.x, this.y);
	    this.setLocationRelativeTo(null);               
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setContentPane(_panel);
	    this.setVisible(true);
  }
  
  /**
   * Create a window
   * @author PeterElHabr
   * @param x : x size of the window
   * @param y : y size of the window
   * @param title : title of the window
   * @param enabled : "true" the window is visible
   * @param mainwindow : "true" if the window is closed, the program will be stopped
   * @note ONE WINDOW YOU CREATE SOULD BE A MAINWINDOW
   */
   public Screen1(int x, int y, String title,boolean enabled,boolean mainwindow){
	   this.title=title;
	   this.x=x;
	   this.y=y;
	    this.setTitle(this.title);
	    this.setSize(this.x, this.y);
	    this.setLocationRelativeTo(null);    
	    if (mainwindow==true)
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setContentPane(_panel);
	    if (enabled==true)
	    this.setVisible(true);
	    else this.setVisible(false);
   }


  public static void main(String[] args){
	  //TODO Main class
	  
  }
}

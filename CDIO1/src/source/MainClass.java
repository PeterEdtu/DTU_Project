package source;

public class MainClass {
	/*
	 * Windows created with Class Screen1 are using JPanel1
	 */
	// Create a window 100*800 with title: "main window" and visible mainwindow
	public static GUI.Screen1 Window1 = new GUI.Screen1(100,800,"main window",true,true);
	// Create a window 700*700 with title: "secondary window" and NOT visible window
	public static GUI.Screen1 Window2 = new GUI.Screen1(700, 700, "secondary window", false,false);
	// Create a default window (a default window is as a mainwindow)
	public static GUI.Screen1 Window3 = new GUI.Screen1();

	
	public static void main(String[] args) {
	//Open Window2 manually
	Window2.OpenWindow();

	}

}

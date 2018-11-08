package e0202_Swing;
import java.awt.*;
import javax.swing.*;

//public class Test extends JFrame{
public class Test {

	public void CreateJFrame(String title) {
		JFrame jf = new JFrame(title);
		Container container = jf.getContentPane();
		JLabel jl = new JLabel("This is a JFrame Form");
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		container.setBackground(Color.white);
		jf.setVisible(true);
		jf.setSize(500, 400);
		
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test().CreateJFrame("Create a JFrame Form");
	}

}

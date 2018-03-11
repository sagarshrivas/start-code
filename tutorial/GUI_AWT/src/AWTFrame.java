import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;


public class AWTFrame {

	public static void main(String[] args) {
		Frame f=new Frame("Title");
		f.setResizable(true);
		f.setLayout(null);
		f.setBackground(Color.LIGHT_GRAY);
		
		Button b1= new Button("Click here");
		b1.setBounds(100,100,70,30);
		f.setVisible(true);
		f.add(b1);
	}

}

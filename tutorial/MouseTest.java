import java.awt.*;
import java.util.concurrent.TimeUnit;
public class MouseTest {

	public static void main(String[] args) throws Exception {
		while(true){
			TimeUnit.SECONDS.sleep(1/2);
        double mouseX = MouseInfo.getPointerInfo().getLocation().getX();
        double mouseY = MouseInfo.getPointerInfo().getLocation().getY();
        System.out.println("X:" + mouseX);
        System.out.println("Y:" + mouseY);

}
	}

}


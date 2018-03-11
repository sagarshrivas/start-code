import java.util.*;
public class Test{
	public static void main(String[] args) {
		String s = “Good morning sunshine the earth says hello” ;
		Scanner in = new Scanner(Test.s);
		in.useDelimiter(“\\s[s]”);
		int counter = 0;
while(in.hasNext())
{
	in.next();
	counter++;
}
System.out.println(counter);
}
}

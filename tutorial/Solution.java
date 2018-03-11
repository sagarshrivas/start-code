import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
		char[] car=s.toCharArray();
		car[1]=(char)((car[1]+48+12)%24);
        s=String.valueOf(car);
//		if(s.charAt(8)=='P'){
//		s.setCharAt(1,'p');
		return s;

//		}
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}


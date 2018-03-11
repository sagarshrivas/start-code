import java.io.*;
import java.util.*;

public class HR {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String b="";
        while(n>0){
            b=(n%2)+b;
            n/=2;
        }
        System.out.println(b);   
		char c[]=b.toCharArray();
		int s[]=new int[c.length];
		int count=0;
		for(int i=0,j=0;i<c.length;i++)
		{
			if(c[i]=='1')
				s[j]=++count;
			else if(c[i]=='0'){count=0; j++;}
		}
		System.out.println("binary");
		for(char r:c)
		System.out.println(r);

		System.out.println("occurence");
        
		int max=0;
		for(int r:s)
			if(r>max)
				max=r;
		System.out.println("max"+max);
		
        
    }
}

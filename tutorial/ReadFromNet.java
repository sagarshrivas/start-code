import java.io.*;
import java.net.*;
import java.util.Scanner;
class ReadFromNet{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter link: ");
		String link=sc.next();
		System.out.println("enter file name");
		String dest=sc.next();
		
		try {

			URL url=new URL(link);
			URLConnection urlConn = url.openConnection();
    urlConn.addRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1)");

			FileOutputStream fout=new FileOutputStream(dest);
			InputStream in=url.openStream();
			BufferedInputStream bin=new BufferedInputStream(in);
			BufferedOutputStream bout=new BufferedOutputStream(fout);
			System.err.println("Downloading");
			while(true) {
				int i=bin.read();
				if(i<0)
					break;
				bout.write(i);
				
			}
			System.out.println("downloaded");
			fout.close();
			bout.close();
			in.close();
			bin.close();
		}catch(Exception e) {
			System.out.println(e);
			
		}
	}
}

package NetWork;

import java.io.*;
import java.net.URL;

class ReadFromNet{
	public static void main(String[] args) {
		try {
			URL url=new URL("https://static.pexels.com/photos/17679/pexels-photo.jpg");
			FileOutputStream fout=new FileOutputStream("/home/sagar/Desktop/ab.jpg");
			InputStream in=url.openStream();
			BufferedInputStream bin=new BufferedInputStream(in);
			BufferedOutputStream bout=new BufferedOutputStream(fout);
			System.err.println("Downloading");
			while(true) {
				int i=bin.read();
				if(i<0)
					break;
				fout.write(i);
				
			}
			System.out.println("downloaded");
			fout.close();
			bout.close();
			in.close();
			bin.close();
		}catch(Exception e) {
			
		}
	}
}

/**
 * 
 */
package dayten;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author admi
 *
 */
public class FileOutputStreamDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\admi\\Desktop\\output\\text.txt");
		// Writing content in a file using BufferedOutputStream
		try(	
		BufferedReader bufferedReader =  new BufferedReader(new InputStreamReader(System.in));
		FileOutputStream fileOutputStream = new FileOutputStream(file,true);//append mode
		BufferedOutputStream bos = new BufferedOutputStream(fileOutputStream);
			){
			System.out.println("Enter customer name (use ctrl -z to stop)\n");
			int s;
			while((s=bufferedReader.read())!=-1) {
				bos.write(s);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Read the content 
		if(file.exists() && file.canRead()) {
			
			try {
				FileInputStream fileInputStream =  new FileInputStream(file);
				BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
				
				int n=0;
				while((n=bufferedInputStream.read())!=-1) {
					System.out.println((char)n);
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

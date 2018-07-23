import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferdreader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new FileReader("E:/temp/demo.txt"));
		String i;
		while((i=br.readLine())!=null)
		{
			System.out.println(i);
		}

	}

}

package Package;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

//class FileWriter{
//	FileWriter(path of the file){
//		opens the file in write mode
//		it creates and open the file in write mode
//	}
//	write(String arg){
//		adds this arg to the file
//	}
//	close(){
//		closes that file
//	}
//}
public class MyDemo {
	
    public static void main(String[] args) throws IOException  {
    	
    	
//    	FileWriter writer = new FileWriter("C:\\Users\\Jibinsha\\Desktop\\Screenshots\\TextFile.txt");
//    	writer.write("Hello World \n This is file handling example");
//    	writer.close();
    	
    	
    	FileReader fr = new FileReader("C:\\Users\\Jibinsha\\Desktop\\Screenshots\\TextFile.txt");
    	BufferedReader br = new BufferedReader(fr);
    	String line;
    	while((line=br.readLine())!=null) {
    		System.out.println(line);
    	}
    	
    	
    	
    	

    }  
}


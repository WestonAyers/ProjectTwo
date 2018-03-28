import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class ProjectTwo {
	
	public static void main(String[] args) throws FileNotFoundException {
	HashMap<String, Integer> map = new HashMap<String, Integer>();
	
	Scanner txtFile= new Scanner(new File("redditPost"));
	while (txtFile.hasNext()){
		String word =txtFile.next();
		if (map.containsKey(word)) {
			int count = map.get(word)+1;
			map.put(word, count);
		}
			else {
				map.put(word, 1);
		}
	}
	txtFile.close();	

	for (Map.Entry<String, Integer> entry : map.entrySet()) {
		System.out.println(entry);
	}
	}

	void readRedditFileAndDetectNoun(String fileToRead)
	{
		 String Word = null;
		System.out.println("ready to read:"+fileToRead);
		try
		{
			FileReader myFileReader=new FileReader(fileToRead);
			BufferedReader myBufferReader= new BufferedReader(myFileReader);
			String line=null;
			while ((line=myBufferReader.readLine())!=null)
			{
				if (Word(line)==true)
					
					System.out.println("line:"+line);
			}
			System.out.println("exited while:");			
			
		}
		catch (Exception ex)
		{
			System.out.println("I don't think I was able to find your file");
		}
}
	private boolean Word(String line) {
		return false;
		
	}
}
	
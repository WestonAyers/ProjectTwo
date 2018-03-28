import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
import java.util.Scanner;

public class RedditTester {
	public static void main(String[] args) throws IOException
	{
	System.out.println("Hello lets play a game like mad libs using a reddit file!");
	System.out.println("Rules pick a corresponding word to fill into an unknown sentence.");
 File file = new File("redditPosts.txt");
 Scanner fileInput = new Scanner(file);
 
String Noun = null;
String Verb = null;
String BodyPart = null;
String Adjective = null;

 Pattern filter1;
 Matcher finder1;
 
 Pattern filter2;
 Matcher finder2;
 
 Pattern filter3;
 Matcher finder3;
 
 Pattern filter4;
 Matcher finder4;
 
 Scanner input = new Scanner(System.in);
 
 System.out.println("Pick a noun that can be searched in the reddit file");
 Noun = input.nextLine();
 filter1 = Pattern.compile(Noun);
 finder1 = filter1.matcher(fileInput.nextLine());
 
 while (finder1.find()) {
		System.out.println(finder1.group());
		}
 
 System.out.println("Pick a verb (that contains ing) that can be searched in the reddit file");
 Verb = input.nextLine();
filter2 = Pattern.compile(Verb);
finder2= filter2.matcher(fileInput.nextLine());

while (finder2.find()) {
	System.out.println(finder2.group());
	}

System.out.println("Pick a Body Part that can be searched in the reddit file");
BodyPart = input.nextLine();
filter3 = Pattern.compile(BodyPart);
finder3 = filter3.matcher(fileInput.nextLine());

while (finder3.find()) {
	System.out.println(finder3.group());
	}

System.out.println("Pick a Adjective that can be searched in the reddit file");
Adjective = input.nextLine();
filter4 = Pattern.compile(Adjective);
finder4 = filter4.matcher(fileInput.nextLine());

while (finder4.find()) {
	System.out.println(finder4.group());
	}

System.out.println("dear "+Noun+" thank you for "+Verb+" hillarys "+BodyPart+" and making her call half the country "+Adjective+".");
System.out.println("The original sentence that came from the reddit file was:");
System.out.println("dear russia thank you for hacking hillarys brain and making her call half the country deplorable.");

System.out.println("Thank You for Playing! Come Back Another Day to get a New Sentence for Mad Libs!");


}	
}
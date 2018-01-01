import java.util.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.File;
import java.io.FileNotFoundException;

public class ArpManager {
	
	public static boolean matchesIpFormat(String s) {
		String regex = "[0-9]+\\.[0-9]+\\.[0-9]+\\.[0-9]+";
	      Pattern pattern = Pattern.compile(regex);
	      Matcher matcher = pattern.matcher(s);
	      return matcher.find();
	}
	
	public static boolean matchesMACFormat(String s) {
		String regex = ".+:.+:.+:.+:.+:.+";
	      Pattern pattern = Pattern.compile(regex);
	      Matcher matcher = pattern.matcher(s);
	      return (matcher.find() && !matchesMACFormatWithParen(s));
	}
	
	public static boolean matchesMACFormatWithParen(String s) {
		String regex = "\\(.+:.+:.+:.+:.+:.+\\)";
	      Pattern pattern = Pattern.compile(regex);
	      Matcher matcher = pattern.matcher(s);
	      return matcher.find();
	}

	public static void main(String[] args) {
		
		List<ArpObject> a = new ArrayList<>();
		
		File file = new File("src/ArpInput.txt");
		
		try {
			Scanner scan = new Scanner(file);
			scan.useDelimiter("/n");
		int i = 0;
		while (scan.hasNextLine()) {
			String base = scan.next();
			
			String [] temp = base.split("\\s");
			ArpObject b = new ArpObject(i, temp[0], temp[1], temp[2], temp[3]);
			//System.out.println(base);
			i++;
			a.add(b);
			/*
			if (matchesIpFormat(base)) {
				System.out.println(base);
				b.setIP(base);
			} else if (matchesMACFormat(base)) {
				System.out.println(base);
				b.setMAC(base);
			} else if (matchesMACFormatWithParen(base)) {
				System.out.println(base);
				b.setOtherMac(base);
			} else {
				b.setUnknown(base);
			}
			a.add(b);
			*/
		}
		scan.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(a);
		

	}

}

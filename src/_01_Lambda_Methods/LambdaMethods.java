package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			String backwards = "";
			for (int i = s.length()-1; i > -1; i--) {
				backwards = backwards + s.charAt(i);
			}
			System.out.println(backwards);
		}, "repeat");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			String caps = s.toUpperCase();
			String low = s.toLowerCase();
			for (int i = 0; i < s.length(); i++) {
				s = s.replace(s.charAt(i), caps.charAt(i));
			}
			System.out.println("s");
		}, "repeat");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			String n = ".";
			String mix = "";
			for (int i = 0; i < s.length(); i++) {
				mix = mix + s.charAt(i) + n;
			}
			System.out.println(mix);
		}, "repeat");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			String vowels = "aeiou";
			for (int i = 0; i < s.length(); i++) {
				for (int x = 0; x < vowels.length(); x++) {
					if(s.charAt(i) == vowels.charAt(x)) {
						s = s.replaceAll(s.charAt(i) + "", "");
					}
				}
				
			}
			
			System.out.println(s);
		}, "repeat");
	
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	

package edu.pitt.is17.homework1;
import javax.swing.JOptionPane;
public class Rot13 {
	public static void main(String[] args) {
        do{
	    String message = JOptionPane.showInputDialog("Let's use rot13 to your message!" + "\nPlease write down your message or enter 'Q' or 'q' to terminate!");
        String rot13 = rot13(message);
    
        if (message.equalsIgnoreCase("q")) {
	        JOptionPane.showMessageDialog(null, "Have a nice day!");
	        break;
        } else {
        	JOptionPane.showMessageDialog(null, breakLines(50, rot13));
        }
      }while(true);
	}
	public static String rot13(String input) {
		String result = "";
		for (int i = 0; i< input.length();i++) {
			char a = input.charAt(i);
			if(a >= 'a' && a<= 'm'){
				a = (char)(a+13);
				result += String.valueOf(a);
			} else if (a >= 'A' && a<= 'M') {
				a= (char)(a+13);
				result += String.valueOf(a);
			} else if (a >= 'n' && a<= 'z') {
				a= (char)(a-13);
				result += String.valueOf(a);
			} else if (a >= 'N' && a<= 'Z') {
				a = (char)(a-13);
				result += String.valueOf(a);
			}
	    }
		return result;
	}
	public static String breakLines(int maxLength, String text) {
		
		String b ="";
		int index = 0;
			for (int r = 0; r<text.length()/maxLength+1; r++) {
				if (text.length()>index+maxLength) {
					b  += text.substring(index, index + maxLength) + "\n";
				}
				else {
					b += text.substring(index, text.length()) + "\n";
					 }
				index = index+maxLength;
			}
			return b;	
			}
}
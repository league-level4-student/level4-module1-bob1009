package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	public static void horoscope(Zodiac z ) {
		switch(z) {
		case ARIES:
			JOptionPane.showMessageDialog(null,"sheep");
			break;
		
		case TAURUS:
			JOptionPane.showMessageDialog(null, "bull");
			break;
		case GEMINI: 
			JOptionPane.showMessageDialog(null, "twins");
			break;
		case CANCER:
			JOptionPane.showMessageDialog(null, "crab" );
			break;
		case LEO:
			JOptionPane.showMessageDialog(null, "cat");
			break;
		case VIRGO:
			JOptionPane.showMessageDialog(null, "virgin");
			break;
		case LIBRA:
			JOptionPane.showMessageDialog(null, "scale");
			break;
		case SCORPIO:
			JOptionPane.showMessageDialog(null, "bug");
			break;
		case SAGITTARIUS:
			JOptionPane.showMessageDialog(null, "weird horse man ");
			break;
		case CAPRICORN:
			JOptionPane.showMessageDialog(null, "fish goat");
			break;
		case AQUARIUS: 
			JOptionPane.showMessageDialog(null, "mermaid");
			break;
		case PISCES:
			JOptionPane.showMessageDialog(null,"fish");
		}
		
	}
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		horoscope(Zodiac.AQUARIUS);
	}
} 

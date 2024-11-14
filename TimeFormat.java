// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
				
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        // created a set of "if" conditions to get the wanted output, and ajusted hours to format
		if (hours > 12 && minutes > 9)  {int a  = hours - 12;
			 System.out.println(a + ":" + minutes + " " + "PM");}

		if (hours > 12 && minutes < 10) {int a = hours - 12;
			 System.out.println(a  + ":0" + minutes + " " + "PM");}

		if (hours == 12 && minutes < 10)
		 { System.out.println(hours + ":0" + minutes + " " + "PM");}

		if (hours == 12 && minutes > 9)
		 { System.out.println(hours + ":" + minutes + " " + "PM");}

		if (hours < 12 && minutes > 9)
		 { System.out.println(hours + ":" + minutes + " " + "AM");}

		if (hours < 12 && minutes < 10)
		 {System.out.println(hours + ":0" + minutes + " " + "AM");}
	}
}
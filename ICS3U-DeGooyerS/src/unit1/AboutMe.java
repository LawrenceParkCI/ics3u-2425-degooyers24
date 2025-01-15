package unit1;
/**
 * Description: This program prints information about myself.
 * Date: Sept. 20, 2024
 * @author Simon de Gooyer
 */

public class AboutMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// This prints information about myself, my teacher and my school
		System.out.println(" ______________________________________________________");
		System.out.println("|                                                      |");
		System.out.println("| INFORMATION:                                         |");
		System.out.println("| Name == Simon D                                      |");
		System.out.println("| Grade == 11                                          |");
		System.out.println("| Teacher == Ms Kemp                                   |");
		System.out.println("| School == Lawrence Park Collegiate Institute         |");
		System.out.println("| Go Panthers!                                         |");
		System.out.println("|                                                      |");
		// This uses format to input different classes, alongside their starting and ending times.
		System.out.println("| Day 1: Monday, Friday                                |");
		System.out.format("| Class: %-8sStart Time: %-8sEnd Time: %-8s|", "ICS3U", "09:00", "10:15");
		System.out.println(" ");
		System.out.format("| Class: %-8sStart Time: %-8sEnd Time: %-8s|", "FIF3U", "10:20", "11:40");
		System.out.println(" ");
		System.out.format("| Class: %-8sStart Time: %-8sEnd Time: %-8s|", "AMS3M", "12:40", "13:55");
		System.out.println(" ");
		System.out.format("| Class: %-8sStart Time: %-8sEnd Time: %-8s|", "NBE3U", "14:00", "15:15");
		System.out.println(" ");
		System.out.println("|                                                      |");
		System.out.println("| Day 2: Tuesday,  Thursday                            |");
		System.out.format("| Class: %-8sStart Time: %-8sEnd Time: %-8s|", "FIF3U", "09:00", "10:15");
		System.out.println(" ");
		System.out.format("| Class: %-8sStart Time: %-8sEnd Time: %-8s|", "ICS3U", "10:20", "11:40");
		System.out.println(" ");
		System.out.format("| Class: %-8sStart Time: %-8sEnd Time: %-8s|", "NBE3U", "12:40", "13:55");
		System.out.println(" ");
		System.out.format("| Class: %-8sStart Time: %-8sEnd Time: %-8s|", "AMS3M", "14:00", "15:15");
		System.out.println(" ");
		System.out.println("|                                                      |");
		System.out.println("| Late Start: Wednesday                                |");
		System.out.format("| Class: %-8sStart Time: %-8sEnd Time: %-8s|", "ICS3U", "09:55", "11:00");
		System.out.println(" ");
		System.out.format("| Class: %-8sStart Time: %-8sEnd Time: %-8s|", "FIF3U", "11:05", "12:10");
		System.out.println(" ");
		System.out.format("| Class: %-8sStart Time: %-8sEnd Time: %-8s|", "AMS3M", "13:10", "14:10");
		System.out.println(" ");
		System.out.format("| Class: %-8sStart Time: %-8sEnd Time: %-8s|", "NBE3U", "14:15", "15:15");
		System.out.println(" ");
		System.out.println("|______________________________________________________|");
	}

}

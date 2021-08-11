package searchAndSorting;

import java.util.Date;

import RegexAndDataStrProblems.RegexTest;
import RegexAndDataStrProblems.UserDetails;

public class Regex {
	public static void main(String args[]) {
		RegexTest r = new RegexTest();

		UserDetails user = new UserDetails();
		System.out.println();
	
		//asking user to enter his data
		System.out.println("Enter FirstName:");
		user.setfName(r.inputString());
		System.out.println();
	
		System.out.println("Enter LastName:");
		user.setlName(r.inputString());
		System.out.println();
	
		System.out.println("Enter Mobile Number:");
		user.setmobileNo(r.inputString());
		System.out.println();	
		
		//Setting current date
		user.setdate(r.getFormatedDate(new Date()));
		System.out.println(r.convertString(user,r.getFileText("C:\\Users\\tyagi\\eclipse-workspace\\DataStrLearningProblems\\src\\RegexAndDataStrProblems\\File")));	
	}

}

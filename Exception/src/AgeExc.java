import java.util.Scanner;

class VotingException extends Exception {
 
 public VotingException(String str) {
  System.out.println(str);
 }
}

class VoteEligibilityTracker {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	
	
	try {
		   if(age>= 18 && age<=99 ) 
		    throw new VotingException("NOT eligible vote");
		   else
		    System.out.println("Eligible to vote");
		  }
	catch(VotingException a) {
		   System.out.println(a);
	 }
}
}

public class AgeExc {
 
 public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  System.out.print("Enter ur age :: ");
  int age = s.nextInt();
  
  try {
   if(age < 18) 
    throw new VotingException("NOT eligible to vote");
   else
    System.out.println("Eligible to vote");
  }
  catch (VotingException a) {
   System.out.println(a);
  }
  }
 }
 


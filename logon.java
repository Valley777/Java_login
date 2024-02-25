import java.util.Scanner;
import java.io.*;

public class logon {
    public static void main(String[] args) {
		/*You will be given a string representing a Username. The Password is the same Username reversed.
		User enters password to login - 4 attempts (one by one).
		Until the app receives correct password, error displayed: "Incorrect password. Try again.".
		When app receives the correct password, it should print: "User {Username} logged in."
		Condition: on the fourth try, if the password is still not correct,
		 print: "User {username} blocked!" and end the program. */

		//Construction:
// >receive username 1st position -ok
// >convert the username to password - ok
// >compare password with the input ( given words) - ok
// i.e. 1st try, 2nd try, 3rd try, 4th try - end - ok

Scanner scan = new Scanner(System.in);
                                              //java program to reverse the word
System.out.print("Please enter username: ");
		String usernameToPas = scan.nextLine();   //username input
		String str= usernameToPas;
        String passwordFrUsername="";
		char ch;
	for (int i=0; i<str.length(); i++)
	{
		ch= str.charAt(i);                          //extracts each character
		passwordFrUsername= ch+passwordFrUsername; //adds each character in front of the existing string
	}
	  System.out.println("Official password is: "+ passwordFrUsername);

		System.out.print("Please enter your password to try login in: ");  //1. try first word to validate it as password ..
	    String tryFirstPass = scan.nextLine();

		 if(passwordFrUsername.equals(tryFirstPass)){
			 System.out.printf("User %s logged in.",usernameToPas);
		 }else{System.out.println("Incorrect password. Try again.");
		 }

		System.out.print("Please enter your 2nd password to try login in: ");  //2. try second word to validate it as password ..
		String trySecondPass = scan.nextLine();

		if(passwordFrUsername.equals(trySecondPass)){
			System.out.printf("User %s logged in.",usernameToPas);
		}else{System.out.println("Incorrect password. Try again.");
		}

		System.out.print("Please enter your 3rd password to try login in: ");  //3. try third word to validate it as password ..
		String tryThirdPass = scan.nextLine();

		if(passwordFrUsername.equals(tryThirdPass)){
			System.out.printf("User %s logged in.",usernameToPas);
		}else{System.out.println("Incorrect password. Try again.");
		}

		System.out.print("Please enter your 4th password to try login in: ");  //4. try fourth word to validate it as password ..
		String tryFourthPass = scan.nextLine();

		if(passwordFrUsername.equals(tryFourthPass)){
			System.out.printf("User %s logged in.",usernameToPas);
		}else{System.out.printf("User %s blocked!",usernameToPas );
		}


		}
	}


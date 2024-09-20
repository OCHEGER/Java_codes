import java.util.Scanner;
public class Emmy {
  public static void main(String [] args) {
   Scanner sc=new Scanner(System.in);
   //asking for the users name
   System.out.println("enter your name:");
   String name =sc.nextLine();
   //asking for the users girlfriendsname
   System.out.println("enter your girlfriends name:");
   String girlfriendsname=sc.nextLine();
   //asking for the users age
   System.out.println("hiw old are you?");
   Integer age=sc.nextInt();
   System.out.println("name:" + name);
   System.out.println("girlfriendsname:" + girlfriendsname);
   System.out.println("age:" + age);
   //closing the scanner
   sc.close();
   
  }
  }

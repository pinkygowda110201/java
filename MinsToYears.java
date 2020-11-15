package P2;
import java.util.*;
public class MinsToYears {
    public static void main (String[] args){
        
    System.out.println("Input the number of minutes:");
    Scanner sc = new Scanner(System.in); //Taking input from user
    long mins = sc.nextInt(); 
    long days = mins / (24*60); //Converting minutes to days
    long yrs = days / 365; //Converting to years
    long remainingDays = (mins-(yrs*365*24*60))/(24*60); //Calculating remaining days
    System.out.println(mins+" minutes is approximately "+yrs+" years and "+remainingDays+" days.");
    }
}

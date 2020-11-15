package P2;
import java.util.*;
public class MinsToYears {
    public static void main (String[] args){
        
    System.out.println("Input the number of minutes:");
    Scanner sc = new Scanner(System.in);
    long mins = sc.nextInt();
    long days = mins / (24*60);
    long yrs = mins / (365*24*60);
    long remainingDays = (mins-(yrs*365*24*60))/(24*60);
    System.out.println(mins+" minutes is approximately "+yrs+" years and "+remainingDays+" days.");
    }
}

import java.util.Scanner;
public class assignment1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bYear;
        int age;
        int diff;
        int year;

        System.out.println("what year is it this year");
        year = scan.nextInt();

        System.out.println("Please enter the year that you were born");
        bYear = scan.nextInt();

        System.out.println("please enter an age");
        age = scan.nextInt();

        int realAge = year - bYear;
        diff = age - realAge;

        if( diff == 0 ){
            System.out.println("congratulations, your birthday is this year.");
        }else if (diff < 0){
            diff = diff * -1;
            System.out.println(" your " + age + "th birthday was " + diff + " year(s) ago.");
        }else if (diff > 0){
            System.out.println(" your "+ age + "th birthday will be in " + diff + " years.");
        }


    }
}

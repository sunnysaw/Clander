import java.util.Scanner;
public class calender {
    static int MonthCalender(int date){
        if (date <= 0) {
            System.out.println("Invalid input :");
            return 0;
        }
        if (date == 20){
            System.out.println("Special day : ");
            System.out.print("Tuesday - " + " Jagannath -" + " Rath yatra");
        } else if (date == 29) {
            System.out.print("Special day :");
            System.out.println("THURSDAY -" + " Eid -ul-Adha -" + "and" + " Devshayani ekadashi -" + "and" + " Natinal statistic day");
        }
        else
            System.out.println("Normal day nothing special :");
        return date;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = 01,date;
        System.out.println("Showing the calendar of month june :");
        for (int i = 1; i <= 3; i++){
           for (int j = 1; j <= 10; j++){
               System.out.print(temp + " | ");
               temp++;
           }
            System.out.println();
        }
        System.out.println("Enter the date :");
        date = sc.nextInt();
        System.out.println(MonthCalender(date));
    }
}

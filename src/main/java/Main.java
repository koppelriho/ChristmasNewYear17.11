import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert the desired date YYYY-MM-DD :");
        String day = scanner.next();
        LocalDate christmas = LocalDate.parse( "2022-12-24");
        LocalDate newYear = LocalDate.parse("2022-12-31");
        LocalDate day1 = LocalDate.parse(day);
        int newYearDays = newYear.getDayOfYear()- day1.getDayOfYear();
        int christmasDays = christmas.getDayOfYear() - day1.getDayOfYear();
        System.out.println("There are " + christmasDays + " until Christmas and " + newYearDays + " until new year!");

    }
}

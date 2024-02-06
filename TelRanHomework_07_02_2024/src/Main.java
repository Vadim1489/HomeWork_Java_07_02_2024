import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пользователь, введите любой день недели на Английском. С главной буквы: ");
        String dayOfWeek = scanner.next();

        switch (dayOfWeek) {
            case "Monday": {
                printDayOfWeek("It's Monday ");
                break;
            }
            case "Tuesday": {
                printDayOfWeek("It's Tuesday");
                break;
            }
            case "Wednesday": {
                printDayOfWeek("It's Wednesday");
                break;
            }
            case  "Thursday": {
                printDayOfWeek("It's Thursday");
                break;
            }
            case "Friday": {
                printDayOfWeek("It's Friday");
                break;
            }
            case "Saturday": {
                printDayOfWeek("It's Saturday");
                break;
            }
            case "Sunday": {
                printDayOfWeek("It's Sunday");
                break;
            }
            default: {
                printDayOfWeek("Вы ввели несуществующий день недели. Пожалуйста попробуйте ввести заново!");
            }
        }
        if (dayOfWeek.equals("Monday")) {
            System.out.println("It's Monday!");
        }
        if (dayOfWeek.equals("Tuesday")) {
            System.out.println("It's Tuesday!");
        }
        if (dayOfWeek.equals("Wednesday")) {
            System.out.println("It's Wednesday!");
        }
        if (dayOfWeek.equals("Thursday")) {
            System.out.println("It's Thursday!");
        }
        if (dayOfWeek.equals("Friday")) {
            System.out.println("It's Friday!");
        }
        if (dayOfWeek.equals("Saturday")) {
            System.out.println("It's Saturday!");
        }
        if (dayOfWeek.equals("Sunday")) {
            System.out.println("It's Sunday!");
        } else {
            System.out.println("Вы ввели некорректно день недели, введите значение заново! ");
        }
    }
    public static void printDayOfWeek (String dayOfWeek) {
        System.out.println(dayOfWeek);
    }

}
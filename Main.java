import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    double gpa = -123.0; // for validating user's input


        Scanner scanner = new Scanner(System.in);
        
        while (gpa < 0.0 || gpa > 4.0) {
            System.out.print("Enter your GPA (from 0.0 to 4.0): ");
            if (scanner.hasNextDouble()) { // Check if input is a valid double
                gpa = scanner.nextDouble();
                if (gpa < 0.0 || gpa > 4.0) {
                    System.out.println("Invalid input, Please re-enter: ");
                }
            } else {
                System.out.println("Invalid input");
                scanner.next(); // Discard invalid input
            }
        }

        System.out.println("Your GPA is " + gpa);
        scanner.close();

        switch((int)(gpa * 10)){
            case 40:
                System.out.println("100% to 95.0%");
                break;
            case 39:
                System.out.println("< 95.0% to 94.0%");
                break;
            case 38:
                System.out.println("< 94.0% to 93.0%");
                break;
            case 37:
                System.out.println("< 93.0% to 92.0%");
                break;
            case 36:
                System.out.println("< 92.0% to 91.0%");
                break;
            case 35:
                System.out.println("< 91.0% to 90.0%");
                break;
            case 34:
                System.out.println("< 90.0% to 89.0%");
                break;
            case 33:
                System.out.println("< 89.0% to 88.0%");
                break;
            case 32:
                System.out.println("< 88.0% to 87.0%");
                break;
            case 31:
                System.out.println("< 87.0% to 86.0%");
                break;
            case 30:
                System.out.println("< 86.0% to 85.0%");
                break;
            case 29:
                System.out.println("< 85.0% to 84.0%");
                break;
            case 28:
                System.out.println("< 84.0% to 83.0%");
                break;
            case 27:
                System.out.println("< 83.0% to 82.0%");
                break;
            case 26:
                System.out.println("< 82.0% to 81.0%");
                break;
            case 25:
                System.out.println("< 81.0% to 80.0%");
                break;
            case 24:
                System.out.println("< 80.0% to 79.0%");
                break;
            case 23:
                System.out.println("< 79.0% to 78.0%");
                break;
            case 22:
                System.out.println("< 78.0% to 77.0%");
                break;
            case 21:
                System.out.println("< 77.0% to 76.0%");
                break;
            case 20:
                System.out.println("< 76.0% to 75.0%");
                break;
            case 19:
                System.out.println("< 75.0% to 74.0%");
                break;
            case 18:
                System.out.println("< 74.0% to 73.0%");
                break;
            case 17:
                System.out.println("< 73.0% to 72.0%");
                break;
            case 16:
                System.out.println("< 72.0% to 71.0%");
                break;
            case 15:
                System.out.println("< 71.0% to 70.0%");
                break;
            case 14:
                System.out.println("< 70.0% to 69.0%");
                break;
            case 13:
                System.out.println("< 69.0% to 68.0%");
                break;
            case 12:
                System.out.println("< 68.0% to 67.0%");
                break;
            case 11:
                System.out.println("< 67.0% to 66.0%");
                break;
            case 10:
                System.out.println("< 66.0% to 65.0%");
                break;
            default:
                System.out.println("< 65.0% to 0.0%");
                break;
            }
    }
}
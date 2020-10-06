import java.util.Scanner;

public class PrintSquareRECTri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Print the Rectangle");
        System.out.println("2. Print the Triangle(The corner is square at top left");
        System.out.println("3. Print the isosceles Triangle");
        System.out.println("4. Exit");
        int choice;
        while (true){
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Draw the Rectangle");
                    for (int i=0; i < 4;i++){
                        for (int j = 0; j < 12 ; j++){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("Draw the Triangle Top Left");
                    for (int i=1; i <= 5;i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("Draw the Triangle Top Right");
                    for (int i=7; i >=1 ;i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 4: System.exit(choice);
            }
        }
    }
}

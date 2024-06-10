import java.util.*;

public class TheGenevaConfectio {
    int maxSize;
    int top;
    int arr[];
    int branch[];

    public TheGenevaConfectio(int n) {
        maxSize = n;
        arr = new int[maxSize];
        branch = new int[maxSize];
        top = 0;
    }

    public void push(int num) {
        arr[top] = num;
        top++;
    }

    public String toString() {
        return Arrays.toString(arr);
    }

    public static boolean testInRange(int t) {
        return t >= 1 && t <= 10;
    }

    public static boolean nOfCars(int n) {
        return n >= 1 && n <= 100000;
    }

    public int moveToBranch() {
        int temp = arr[top-1];
        arr[top-1] = 0;
        top--;
        return temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times do you want to test (between 1 and 10)?: ");
        int testRange = scanner.nextInt();
        while (!testInRange(testRange)) {
            System.out.println("Invalid input. Please enter a number between 1 and 10: ");
            testRange = scanner.nextInt();
            scanner.nextLine();
        }

        for (int i = 0; i < testRange; i++) {
            System.out.println("Enter the number of cars: ");
            int n = scanner.nextInt();

            while (!nOfCars(n)) {
                System.out.println("Invalid input. Please enter a number between 1 and 100000: ");
                n = scanner.nextInt();
                scanner.nextLine();
            }
            TheGenevaConfectio genevaConfectio = new TheGenevaConfectio(n);

            for (int j = 0; j < n; j++) {
                System.out.print("Type the car number: ");
                int carNum = scanner.nextInt();
                genevaConfectio.push(carNum);
            }

            int branchTop = 0;
            int lake = 1;
            while (genevaConfectio.top > 0) {
                if (genevaConfectio.arr[genevaConfectio.top-1] == lake) {
                    genevaConfectio.top--;
                    lake++;
                } else if (branchTop > 0 && genevaConfectio.branch[branchTop-1] == lake) {
                    branchTop--;
                    lake++;
                } else if (genevaConfectio.top > 0) {
                    genevaConfectio.branch[branchTop] = genevaConfectio.moveToBranch();
                    branchTop++;
                } else {
                    break;
                }
            }

            while (branchTop > 0 && genevaConfectio.branch[branchTop-1] == lake) {
                branchTop--;
                lake++;
            }

            if (lake - 1 == n && branchTop == 0) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
        scanner.close();
    }
}

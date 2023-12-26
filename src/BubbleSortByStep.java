import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Nhập " + list.length + " giá trị:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Mảng bạn đã nhập: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }

        System.out.println("\nBắt đầu quá trình sắp xếp...");
        bubbleSortByStep(list);
    }

    private static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    /* Hoán đổi list[i] với list[i + 1] */
                    System.out.println("Hoán đổi " + list[i] + " với " + list[i + 1]);
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true; /* Cần tiếp tục vòng lặp */
                }
            }
            /* Mảng có thể đã được sắp xếp và không cần vòng lặp tiếp theo */
            if (needNextPass == false) {
                System.out.println("Mảng có thể đã được sắp xếp và không cần vòng lặp tiếp theo");
                break;
            }
            /* Hiển thị mảng sau khi sắp xếp */
            System.out.print("Mảng sau bước " + k + ": ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
    }
}



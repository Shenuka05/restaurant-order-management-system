import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Queue<String> pendingOrders = new LinkedList<>();
        Stack<String> processedOrders = new Stack<>();

        Scanner input = new Scanner(System.in);

        boolean running = true;

        while (running) {

            System.out.println("\n========== RESTAURANT ORDER SYSTEM ==========");
            System.out.println("1. Add Order");
            System.out.println("2. View Next Order");
            System.out.println("3. Process Order");
            System.out.println("4. Cancel Last Processed Order");
            System.out.println("5. Show Pending Orders");
            System.out.println("6. Show Processed Orders");
            System.out.println("7. Exit");

            System.out.print("Enter Your Choice: ");
            int choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Order Name: ");
                    input.nextLine(); // Clear Enter key

                    String order = input.nextLine();

                    pendingOrders.add(order);

                    System.out.println(order + " Added Successfully!");
                    break;

                case 2:
                    if (pendingOrders.isEmpty()) {
                        System.out.println("No Pending Orders.");
                    } else {
                        System.out.println(
                                "Next Order: " + pendingOrders.peek()
                        );
                    }
                    break;

                case 3:
                    if (pendingOrders.isEmpty()) {
                        System.out.println("No Orders to Process.");
                    } else {

                        String processedOrder = pendingOrders.poll();

                        processedOrders.push(processedOrder);

                        System.out.println(
                                processedOrder + " Processed Successfully!"
                        );
                    }
                    break;

                case 4:
                    if (processedOrders.isEmpty()) {
                        System.out.println("No Processed Orders to Cancel.");
                    } else {

                        String cancelledOrder = processedOrders.pop();

                        pendingOrders.add(cancelledOrder);

                        System.out.println(
                                cancelledOrder + " Cancelled and Returned to Pending Orders."
                        );
                    }
                    break;

                case 5:
                    if (pendingOrders.isEmpty()) {
                        System.out.println("No Pending Orders.");
                    } else {

                        System.out.println("Pending Orders:");

                        for (String item : pendingOrders) {
                            System.out.println("- " + item);
                        }
                    }
                    break;

                case 6:
                    if (processedOrders.isEmpty()) {
                        System.out.println("No Processed Orders.");
                    } else {

                        System.out.println("Processed Orders:");

                        for (String item : processedOrders) {
                            System.out.println("- " + item);
                        }
                    }
                    break;

                case 7:
                    System.out.println("Thank You!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        }

        input.close();
    }
}
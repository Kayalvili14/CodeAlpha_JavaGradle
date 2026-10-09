public class App {

    public static int calculateTotal(int food, int transport) {
        return food + transport;
    }

    public static int calculateRemaining(int budget, int total) {
        return budget - total;
    }

    public static void main(String[] args) {
        int budget = 5000;
        int food = 1200;
        int transport = 800;

        int total = calculateTotal(food, transport);
        int remaining = calculateRemaining(budget, total);

        System.out.println("Expense Calculator");
        System.out.println("Budget: Rs. " + budget);
        System.out.println("Total expenses: Rs. " + total);
        System.out.println("Remaining money: Rs. " + remaining);
    }
}
public class Chocolate {
    public static void main(String[] args) {
        int initialBags = 9;

        int chocolatesPerBag = 2;

        int additionalChocolates = 3;
        int totalChocolates = initialBags * (chocolatesPerBag + additionalChocolates);

        int bagsNeeded = (int) Math.ceil((double) totalChocolates / (chocolatesPerBag + additionalChocolates));

        System.out.println("You will need " + bagsNeeded + " bags to add three chocolates instead of two.");
    }
}

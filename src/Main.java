import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        LinkedList<Toys> listToys = new LinkedList<>();
        Toys plane1 = new Planes("d", 1, 60, 3);
        Toys plane2 = new Planes("da", 2, 25, 4);
        Toys plane3 = new Planes("dad", 3, 10, 5);
        Toys plane4 = new Planes("dad1", 3, 5, 5);
        listToys.add(plane1);
        listToys.add(plane2);
        listToys.add(plane3);
        listToys.add(plane4);
        vendingMachine.putToys(listToys);
        RandomToys rt = new RandomToys();
        rt.choiceWinToys(listToys);
    }
}
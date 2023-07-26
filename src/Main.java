import java.io.IOException;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        VendingMachine vendingMachine = new VendingMachine();
        LinkedList<Toys> pullAllToys = new LinkedList<>();
        LinkedList<Toys> pullWinToys = new LinkedList<>();
        RandomToys rt = new RandomToys();
        Toys plane1 = new Planes("Mig 31", 1, 45, 10);
        Toys plane2 = new Planes("Mig 29", 2, 30, 7);
        Toys plane3 = new Planes("Mig 19", 3, 20, 5);
        Toys plane4 = new Planes("IL-2", 3, 5, 1);
        pullAllToys.add(plane1);
        pullAllToys.add(plane2);
        pullAllToys.add(plane3);
        pullAllToys.add(plane4);
        vendingMachine.putToys(pullAllToys);
        rt.choiceWinToys(pullAllToys);
        try {
            rt.getWinToy();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
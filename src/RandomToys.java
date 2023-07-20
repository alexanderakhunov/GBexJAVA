import java.util.LinkedList;

public class RandomToys {
    public void choiceWinToys(LinkedList<Toys> toysWin) {
        double resultC = 0;
        for (Toys toy : toysWin) {
            double weightC = 0;
            resultC =  Math.random()* toy.getChance();
            System.out.println(resultC);
        }
    }
}

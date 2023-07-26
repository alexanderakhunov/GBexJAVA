import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class RandomToys {
    private LinkedList<Toys> winToys = new LinkedList<>();
    public void choiceWinToys(LinkedList<Toys> toysWin) {
        Toys winToy = null;
        double resultC = 0.0;
        double maxC = 0.0;
        for (Toys toy : toysWin) {
            resultC = Math.random() * toy.getChance();
            if (resultC > maxC) {
                maxC = resultC;
                winToy = toy;
            }
        }
        winToy.setCount(winToy.getCount() - 1);
        winToys.add(winToy);
    }
        public void getWinToy() throws IOException {
        if (winToys.size()>0){
            Toys prizeToy = winToys.poll();
            FileWriter writer = new FileWriter("win_toys.txt", true);
            writer.write("id" + " " +  prizeToy.getId() + "," + "name" + " " + prizeToy.getName() +  "\n");
            writer.close();
        }
        }
}

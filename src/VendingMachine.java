import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class VendingMachine {
    private LinkedList<Toys> toys;
    private LinkedList<Toys> winToys;
    public void putToys(LinkedList<Toys>item){
        this.toys=item;
    }
    public Toys getToys(){
        return toys.pollLast();
    }

    public void putWinToys(LinkedList<Toys>winToys){this.toys=winToys;}
    public Toys getWinToys(){return winToys.pollLast();}
}

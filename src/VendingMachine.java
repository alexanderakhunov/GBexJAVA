import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class VendingMachine {
    private LinkedList<Toys> toys;
    public void putToys(LinkedList<Toys>item){
        this.toys=item;
    }
    public Toys getToys(){
        return toys.pollLast();
    }

}

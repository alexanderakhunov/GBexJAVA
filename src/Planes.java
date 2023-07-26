public class Planes extends Toys {


    public Planes(String name, int id, double chance, int count) {
        super.name = name;
        super.id = id;
        super.chance = chance;
        super.count = count;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        super.id = id;
    }

    @Override
    public double getChance() {
        return chance;
    }

    @Override
    public void setChance(double chance) {
        super.chance=chance;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public void setCount(int count) {
        super.count=count;
    }

    @Override
    public String toString() {
        return "Planes{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", chance=" + chance +
                ", count=" + count +
                '}';
    }
}


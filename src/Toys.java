public abstract class Toys {
    protected String name;
    protected int id;
    protected double chance;
    protected int count;

    public abstract String getName();

    public abstract void setName(String name);

    public abstract int getId();

    public abstract void setId(int id);

    public abstract double getChance();

    public abstract void setChance(double chance);

    public abstract int getCount();

    public abstract void setCount(int count);

    @Override
    public abstract String toString();
}



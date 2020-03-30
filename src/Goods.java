
public class Goods
{
    private String name;
    private double price, weigth;
    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    public double getWeigth()
    {
        return weigth;
    }

    public Goods(String _name, double _weigth, double _price)
    {
        name = _name;
        weigth = _weigth;
        price = _price;
    }

}
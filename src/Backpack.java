import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Backpack
{
    private ArrayList<Goods> bestItems = new ArrayList<Goods>(0);

    private ArrayList<Goods> items = new ArrayList<Goods>();

    private double maxW;

    private double bestPrice;

    public Backpack(double _maxW)
    {
        maxW = _maxW;
    }

    //создание всех наборов перестановок значений
    private void MakeAllSets(ArrayList<Goods> items)
    {
        if (items.size() > 0)
            CheckSet(items);

        for (int i = 0; i < items.size(); i++)
        {
            ArrayList<Goods> newSet = new ArrayList<Goods>(items);

            newSet.remove(i);

            MakeAllSets(newSet);
        }

    }

    //проверка, является ли данный набор лучшим решением задачи
    private void CheckSet(ArrayList<Goods> items)
    {
        if (bestItems.size() == 0)
        {
            if (CalcWeigth(items) <= maxW)
            {
                bestItems = items;
                bestPrice = CalcPrice(items);
            }
        }
        else
        {
            if(CalcWeigth(items) <= maxW && CalcPrice(items) > bestPrice)
            {
                bestItems = items;
                bestPrice = CalcPrice(items);
            }
        }
    }

    //вычисляет общий вес набора предметов
    private double CalcWeigth(ArrayList<Goods> items)
    {
        double sumW = 0;

        for(Goods i : items)
        {
            sumW += i.getWeigth();
        }

        return sumW;
    }

    //вычисляет общую стоимость набора предметов
    private double CalcPrice(ArrayList<Goods> items)
    {
        double sumPrice = 0;

        for(Goods i : items)
        {
            sumPrice += i.getPrice();
        }

        return sumPrice;
    }

    public void setGoods(Scanner input)
    {
        System.out.println("Please enter the quantity of items");
        int maxItems = Integer.parseInt(input.nextLine());
        for(int i = 0; i < maxItems; i++)
        {
            System.out.println("Please enter the name of item:");
            String name = input.nextLine();
            System.out.println("Please enter the weight of item:");
            double weight = Double.parseDouble(input.nextLine());
            System.out.println("Please enter the price of item:");
            double price = Double.parseDouble(input.nextLine());
            items.add(new Goods(name, weight, price));
        }
        ToString();
    }

        //AddItems(); // main
        //ShowItems(items); // main
    private void ToString()
    {
        for (Goods i : items)
        {
            System.out.println("Name = " + i.getName() + ", weight = "+ i.getWeigth() + ", price = " + i.getPrice());
        }
    }

    //решить задачу
    public void solve()
    {
        MakeAllSets(items);

        ArrayList<Goods> solve = GetBestSet();

        if(solve.size() == 0)
        {
            System.out.println("No matching items found!");
        }
        else
        {
            System.out.println("Solve:");
            for (Goods i : solve)
            {
                System.out.println("Name = " + i.getName() + ", weight = "+ i.getWeigth() + ", price = " + i.getPrice());
            }
        }
    }



    //возвращает решение задачи (набор предметов)
    private ArrayList<Goods> GetBestSet()
    {
        return bestItems;
    }
}

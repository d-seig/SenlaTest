public class NodNok
{
    private int a, b, max;

    public void setNumbers(String a, String b) throws NumberFormatException
    {
        try
        {
            this.a = Integer.parseInt(a);
            this.b = Integer.parseInt(b);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Error: Wrong numbers!");
        }
    }

    public void findNok()
    {
        Bolshee();
        int iterator = max;
        while(!(iterator % a == 0 && iterator % b == 0))
            iterator++;
        System.out.println("Nok = " + iterator);
    }

    public void findNod()
    {
        Bolshee();
        int iterator = max;
        while (!(a % iterator == 0 && b % iterator == 0))
        {
            iterator--;
        }
        System.out.println("Nod = " + iterator);
    }

    private void Bolshee()
    {
        if(a > b)
            max = a;
        else
            max = b;
    }
}

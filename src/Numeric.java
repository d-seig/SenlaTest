public class Numeric
{
    private String number;
    Numeric(String number)
    {
        this.number = number;
    }

    public void numberProperties() throws NumberFormatException
    {
        try
        {
            int num = Integer.parseInt(number);
            propertyEven(num);
            propertyComposite(num);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Error: This text isn't a number or not a integer");
        }
    }

    private void propertyEven(int num)
    {
        if(num % 2 == 0)
        {
            System.out.println("Even number");
        }
        else
            System.out.println("Not even number");
    }

    private void propertyComposite(int num)
    {
        int iterator = 0;
        for(int i = 2; i <= num; ++i)
        {
            if(iterator % i == 0 && i < num)
            {
                iterator++;
            }
            if(i == num && iterator == 0)
            {
                System.out.println("This number is simple");
            }
            else if(i == num)
            {
                System.out.println("This number is composite");
            }
        }
    }

}

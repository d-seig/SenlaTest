import java.util.List;

public class Palindroms
{
    private String list;
    Palindroms(String list)
    {
        this.list = list;
        str(this.list);
    }

    private void str(String string)
    {
        System.out.println(string);
    }

    private Boolean isNumeric(String s) throws NumberFormatException
    {
        try
        {
            Integer.parseInt(s);
            return true;
        }
        catch (NumberFormatException e)
        {
            return false;
        }
    }

    private Boolean fromZeroTillOneHundred()
    {
        if(Integer.parseInt(list) > 0 && Integer.parseInt(list) <= 100)
        {
            System.out.println("true interval");
            return true;
        }
        else
        {
            System.out.println("false interval");
            return false;
        }
    }

    public void isPalindrom()
    {

        if(isNumeric(list) && fromZeroTillOneHundred())
        {
            int num, temp;
            for(int i = 1;i <= Integer.parseInt(list);++i)
            {
                temp = i; num = 0;
                while(temp > 0)
                {
                    num = num * 10 + (temp%10);
                    temp /= 10;
                }
                if(num == i)
                    System.out.println(i + " is palindrom");
            }
        }
        else
            System.out.println("This is a text, but not a number!");
    }

}

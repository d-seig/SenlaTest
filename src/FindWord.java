public class FindWord
{
    private String text;

    public void addText(String text)
    {
        this.text = text;
    }

    public void findWord(String word)
    {
        String[] builder = text.split(" ");
        int iterator = 0;
        for(int i = 0; i < builder.length; ++i)
        {

            if(builder[i].toLowerCase().equals(word.toLowerCase()))
            {
                iterator++;
            }
        }
        System.out.println("The word occurs " + iterator + " times in the text");
    }
}

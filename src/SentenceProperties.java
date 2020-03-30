import com.sun.jdi.CharValue;

public class SentenceProperties
{
    private String text;

    public void setText(String text)
    {
        this.text = text;
    }

    public void sentenceProperties()
    {
        String[] textWords = text.split(" ");
        System.out.println("Size of text: " + textWords.length + " words");
        for (int i = 0; i < textWords.length; i++)
            for (int j = 0; j < textWords.length-1; j++)
                if (textWords[j].charAt(0) > textWords[j+1].charAt(0)) // convert to ascii code
                {
                    String word = textWords[j];
                    textWords[j] = textWords[j + 1];
                    textWords[j + 1] = word;
                }
        output(textWords);
        for(int i = 0; i < textWords.length; ++i)
        {
            textWords[i] = textWords[i].substring(0,1).toUpperCase() + textWords[i].substring(1, textWords[i].length()); // first symbol upper
            System.out.println(textWords[i]);
        }
    }

    private void output(String[] text)
    {
        for(int i = 0; i < text.length; i++)
            System.out.print(text[i] + " ");
        System.out.println();
    }
}

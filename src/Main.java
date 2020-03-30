import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String numberTask = "";
        while(!numberTask.equals("0"))
        {
            System.out.println("Please enter number of the task, if you want to see its solution or \"0\" for exit");
            numberTask = input.nextLine();
            switch (numberTask)
            {
                case "0":
                    break;
                case "1":
                    System.out.print("Task №1\nPlease enter your number: \t");
                    String number = input.nextLine();
                    Numeric numeric = new Numeric(number);
                    numeric.numberProperties();
                    break;
                case "2":
                    System.out.print("Task №2\nPlease enter your numbers: \t");
                    NodNok nodNok = new NodNok();
                    String a = input.nextLine(), b = input.nextLine();
                    nodNok.setNumbers(a, b);
                    nodNok.findNod();
                    nodNok.findNok();
                    break;
                case "3":
                    System.out.print("Task №3\nPlease enter your sentence: \t");
                    SentenceProperties sentenceProperties = new SentenceProperties();
                    String sentence = input.nextLine();
                    sentenceProperties.setText(sentence);
                    sentenceProperties.sentenceProperties();
                    break;
                case "4":
                    System.out.print("Task №4\nPlease enter your text: \t");
                    String text = input.nextLine();
                    FindWord findWord = new FindWord();
                    findWord.addText(text);
                    System.out.print("Please enter word, which you want to find: \t");
                    String word = input.nextLine();
                    findWord.findWord(word);
                    break;
                case "5":
                    System.out.print("Task №5\nPlease enter your number: \t");
                    String numbers = input.nextLine();
                    Palindroms palindroms = new Palindroms(numbers);
                    palindroms.isPalindrom();
                    break;
                case "6":
                    System.out.print("Task №6\nPlease enter max weight\n");
                    Backpack bag = new Backpack(Double.parseDouble(input.nextLine()));
                    bag.solve();
                    break;
                default: break;
            }
        }
        input.close();
    }
}

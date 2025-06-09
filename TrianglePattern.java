import java.util.HashSet;

public class Main
 {
    public static void main(String[] args) 
{
        String sentence = "A quick brown fox jumps over a lazy dog";

        String[] words = sentence.split(" ");


        HashSet<String> uniqueWords = new HashSet<>();


        for (String word : words) 
{
            uniqueWords.add(word.toLowerCase());  
        }

        System.out.println("Unique words in the sentence:");
        for (String word : uniqueWords)
 {
            System.out.println(word);
        }
    }
}

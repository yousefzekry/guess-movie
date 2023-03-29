public class numberOfWords {
public static int countWords(String randomMovie){

    String [] words = randomMovie.split("\\S+");

    return words.length;
}
}

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // created an arraylist variable to store the movies list.
        ArrayList<String> movieList = new ArrayList<String>();
        try {
            // read the file called movies
            File file = new File("Movies.txt");
            // using file scanner class to scan the whole file
            Scanner fileScanner = new Scanner(file);

            // while loop to add each line to the arrayList
            while (fileScanner.hasNextLine()) {
                String data = fileScanner.nextLine();
                movieList.add(data);
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println(movieList);

        Random number = new Random();
        int randomIndex = number.nextInt(movieList.size()) + 1;
        String randomMovie = movieList.get(randomIndex);
        System.out.println(randomMovie);
        System.out.println("The movie is " + numberOfWords.countWords(randomMovie) + " words");

        HiddenMovie hm = new HiddenMovie();
        String pickedMovie = randomMovie;
        String hiddenMovie = hm.hideMovie(pickedMovie);
        System.out.println(hiddenMovie);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a character: ");
        String inputString = scanner.nextLine();

        if (inputString.length() != 1) {
            System.out.println("Please enter a single character.");
            return;
        }

        char guessedChar = inputString.charAt(0);
        RevealCharacters rc = new RevealCharacters(hiddenMovie);
        String newHiddenMovie = rc.reveal(guessedChar);
        if (newHiddenMovie != null) {
            hiddenMovie = newHiddenMovie;
        }
        System.out.println(hiddenMovie);

    }
}

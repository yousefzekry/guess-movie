public class RevealCharacters {
    private String hiddenMovie;
    private StringBuilder revealedMovie;

    public RevealCharacters(String hiddenMovie) {
        this.hiddenMovie = hiddenMovie;
        this.revealedMovie = new StringBuilder(hiddenMovie.replaceAll("\\S", "_"));
    }

    public String reveal(char guessedChar) {
        boolean revealed = false;

        for (int i = 0; i < hiddenMovie.length(); i++) {
            if (hiddenMovie.charAt(i) == guessedChar) {
                revealedMovie.setCharAt(i, guessedChar);
                revealed = true;
            }
        }
        if (revealed) {
            System.out.println(guessedChar);
        } else {
            return null;
        }
        System.out.println(revealedMovie);
            return revealedMovie.toString();
    }
}

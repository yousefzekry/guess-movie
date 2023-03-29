public class HiddenMovie {
    private String hiddenMovie;

    public String hideMovie(String pickedMovie) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < pickedMovie.length(); i++) {

            char space = pickedMovie.charAt(i);
            if (space == ' '){
                sb.append(" ");
            }else

            sb.append("_");
        }
        hiddenMovie = sb.toString();
        return hiddenMovie;
    }
}
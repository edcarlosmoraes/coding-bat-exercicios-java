public class Exercicio05 {

    /**
     * @param args the command line arguments
     */
    public boolean backAround(String str) {
        str = "hi there";

        if (str.length() < 2 && str.substring(0, 1).equals("hi")) {
            return true;
        } else {
            return false;
        }
    }

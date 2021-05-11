public class Exercicio07 {

    /**
     * @param args the command line arguments
     */
    public boolean hasTeen(String str) {
        if (str.length()>2 && str.substring(1, 3).equals("ix")) {
            return true;
        }
        return false;
    }

}
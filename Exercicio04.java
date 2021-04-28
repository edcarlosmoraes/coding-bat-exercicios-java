public class Exercício04 {

    /**
     * @param args the command line arguments
     */
    public String backAround(String str) {
        return String.valueOf(str.charAt(str.length()-1)) + str + String.valueOf(str.charAt(str.length()-1));
        
    }

}
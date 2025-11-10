// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	        // Recieves input as string and non-negative int
                String word = args[0];
                int nTimes = Integer.parseInt(args[1]);
                int length = word.length();
                String newWord = "";
                
                // Turn word into Uppercase
                for (int i = 0; i < length; i++) {

                        char letter = Character.toUpperCase(word.charAt(i));
                        newWord += letter;

                        // Give me a/an...
                        if ("AEFHILMNORSX".indexOf(letter) == -1) {
                                System.out.println("Give me a  " + letter + ": " + letter + "!");
                        } else {
                                System.out.println("Give me an " + letter + ": " + letter + "!");
                        }
                }

                // The cheer n times
                System.out.println("What does that spell?");

                for (int k = 0; k < nTimes; k++) {
                        
                        System.out.println(newWord + "!!!");
                }

        }
}

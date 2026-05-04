import java.util.ArrayList;

public class App {
     public  static char letter(char c, ArrayList<String> codebook) {
        int valueOfLetter = c - 'a';
        int letter = 0;
       
        int finalValue = 0;
       if ((valueOfLetter < 0 || valueOfLetter > 26) && (valueOfLetter < -32 || valueOfLetter > -7)){
        return c;
       }

       
        else if (valueOfLetter >= 13 || (valueOfLetter > -20 && valueOfLetter <= -7)){
            
           
            letter = valueOfLetter - 13;
            
             finalValue = (letter + 'a');
          

            

        } else if (valueOfLetter < 13 || (valueOfLetter <= -20 && valueOfLetter >= -32)){
            // System.out.println(valueOfLetter);
            letter = valueOfLetter + 13;
             finalValue = (letter + 'a');
             
            
        } 
        
        
        return (char)(finalValue);
        
       
    }
    public static String encode(String word, ArrayList<String> codebook) {
        String encodedWord = "";
        for (int i = 0; i < word.length(); i++){
            char a = word.charAt(i);
           char eachLetter = letter(a,codebook);
           encodedWord = encodedWord + eachLetter;
        }
        return encodedWord;



    }
    public static String encodeSentence(String sentence, ArrayList<String> codebook) {
       String all = "";
       String[] parts = sentence.split(" ");
      
      for (String allWords : parts){
       String one = encode(allWords, codebook);
       all = all + " " + one;
      }
      

        return all;
    }
    public static void main(String[] args)  {
         ArrayList<String> codebook = new ArrayList<String>();
   

         System.out.println("=== letter ===");
        System.out.println(letter('f', codebook));    
         System.out.println(letter('D', codebook));  
          System.out.println(letter('E', codebook));      
        System.out.println(letter('n', codebook));      
        System.out.println(letter('M', codebook));    
         System.out.println(letter(' ', codebook)); 
         


         System.out.println("=== Word ===");
        System.out.println(encode("hi", codebook)); 
        // Expected output: uv  
        System.out.println(encode("hello", codebook));      
        System.out.println(encode("penny", codebook));  
        // Expected output: craal
        System.out.println("\n=== encodeSentence ===");
        System.out.println(encodeSentence("I am Penny", codebook)); 

}
       
    

    public static String encode(String word){
        return "";
    }
}

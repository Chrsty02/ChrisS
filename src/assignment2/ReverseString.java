package assignment2;

public class ReverseString {

    public static void main(String[] args) {
        
        String s = ".esac gnirts esrever ym si sihT"; 
        String r = "";
        char ch;

        for (int i = 0; i < s.length(); i++) {
          	
          	// extracts each character
            ch = s.charAt(i);
          
          	// adds each character in
            // front of the existing string
            r = ch + r; 
        }
      
        System.out.println(r);
    }
}
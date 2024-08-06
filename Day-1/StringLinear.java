
import java.util.Arrays;

public class StringLinear {
    public static void main(String[] args) {
        
        String s = "Purushotham";
        char t = 'a';
        System.out.println(strlnr(s,t));
        System.out.println(Arrays.toString(s.toCharArray()));

    }

    // static int strlnr(String s, char t){      USING FOR EACH METHOD

    //     if(s.length() == 0){
    //         return -1;
    //     }
    //     for(char ch:s.toCharArray()){
    //         if(ch == t){
    //             return s.indexOf(ch);
    //         }
    //     }

    //     return -1;
    // }


    static int strlnr(String s, char t){

        if(s.length() == 0){
            return -1;
        }

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == t){
                return i;
            }
        }

        return -1;

    }
    
}

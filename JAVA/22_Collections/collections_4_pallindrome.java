import java.util.ArrayDeque;
import java.util.Deque;

public class collections_4_pallindrome {

    static boolean isPalindrome(String str){

        Deque<Character> dq = new ArrayDeque<>();

        for(char ch : str.toCharArray()){
            dq.addLast(ch);
        }

        while(dq.size() > 1){
            if(dq.removeFirst() != dq.removeLast()){
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        // "madam"
        System.out.println(isPalindrome("Madam"));
    }
}

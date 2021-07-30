import java.util.Scanner;
public class palindrome{
    static boolean Palindrome(String word){

        int i =0;
        int j = word.length()-1;

        while(i<j){
            if (word.charAt(i) != word.charAt(j)){
                return false;
            }
            i++;
            j--;
            }
            return true;
        }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        if(Palindrome(word)){
            System.out.println("Result True");
        }
        else{
            System.out.println("Result False");
        }
        input.close();
    }

}
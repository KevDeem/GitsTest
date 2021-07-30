import java.util.Scanner;

class reverseword{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        String word = input.nextLine();
        String reverse = "";

        for(int i=word.length()-1;i >= 0;i--){
            reverse = reverse + word.charAt(i);
        }
        System.out.println(reverse);
        input.close();
    }
}
import java.util.Scanner;

class helloworld{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if(num % 3 == 0 && num % 5 == 0){
            System.out.println("Hello World");
        }
        else if (num % 3 == 0){
            System.out.println("Hello");
        }
        else if (num % 5 == 0){
            System.out.println("World");
        }
        else{
            System.out.println("try another number");
        }

        input.close();


    }
}
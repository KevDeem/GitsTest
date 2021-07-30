import java.util.Scanner;

class email{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();
    if (!email.contains("@") || !email.contains(".")){
        System.out.println("not valid");
    }
    else{
        String[] emails = email.split("@");
        if(emails[0].length()>19){
            System.out.println("Address too long");
        }
        else{
            String[] domain = emails[1].split("\\.",2);
            if(domain[1].equals("id") || domain[1].equals("co.id")){
                System.out.println("email address valid");
            }
            else{
                System.out.println("Email address invalid");
            }
        }
        input.close();
    }

        
    }
}
import java.util.Scanner;
public class Input {
    private static int in;
    public static int take2(){
        Scanner input = new Scanner(System.in);
        while(true){
            String x = input.nextLine();
            if(x.equals("a") || x.equals("A")){
                in = 1;
                break;
            }
            if(x.equals("b") || x.equals("B")){
                in = 2;
                break;
            }
            else{
                System.out.println("Try again");
            }
        }

        return in;
    }
    public static int take4(){
        Scanner input = new Scanner(System.in);
        while(true){
            String x = input.nextLine();
            if(x.equals("a") || x.equals("A")){
                in = 1;
                break;
            }
            if(x.equals("b") || x.equals("B")){
                in = 2;
                break;
            }
            if(x.equals("c") || x.equals("C")){
                in = 3;
                break;
            }
            if(x.equals("d") || x.equals("D")){
                in = 4;
                break;
            }
            else{
                System.out.println("Try again");
            }
        }

        return in;
    }
}

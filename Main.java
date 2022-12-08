//import java.util.Scanner;

public class Main{
    public static boolean exit = false;
    public static void main(String[] args) {
        //Setup
        System.out.println("\033[H\033[2J");
        GameStart.Start();
        //Game Loop
        while(true){
            Turn.Run();
            if(exit){
                break;
            }
        }

    
    
    }
}









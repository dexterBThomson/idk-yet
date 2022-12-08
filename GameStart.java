import java.util.Scanner;
public class GameStart {
    public static int c;
    public static Character p;
    public static void Start(){
        System.out.println("--------------------------------------------------------");
        System.out.println("\n\n\n\n");
        System.out.println("A: New Character B: Load Character");
        System.out.println("\n\n\n\n");
        System.out.println("--------------------------------------------------------");
        c = Input.take2();
        if(c == 1){
            CharacterCreate();
            return;
        }
        else{
            GameStart.load();
            return;
        }
    }
    public static void CharacterCreate(){
        Scanner input = new Scanner(System.in);
        System.out.println("\033[H\033[2J");
        System.out.println("--------------------------------------------------------");
        System.out.println("\n\n\n\n");
        System.out.println("Input a name for your player");
        System.out.println("\n\n\n\n");
        System.out.println("--------------------------------------------------------");
        String name = input.nextLine();
        p = new Character(name);
    }
    public static void load(){
        Scanner input = new Scanner(System.in);
        System.out.println("\033[H\033[2J");
        System.out.println("--------------------------------------------------------");
        System.out.println("\n\n\n\n");
        System.out.println("Input the code for your player");
        System.out.println("\n\n\n\n");
        System.out.println("--------------------------------------------------------");
        String code = input.nextLine();
        //Character.load(name);
        //
        String a = code.substring(0,2);
        String b = code.substring(2,4);
        String c = code.substring(4,6);
        String d = code.substring(6,8);
        String e = code.substring(8,10);
        String f = code.substring(10,12);
        String g = code.substring(12,14);
        int l = Integer.parseInt(code.substring(14,15));
        String n = code.substring(15,code.length());
        p = new Character(n, l, a, b, c, d, e, f, g);
        //
        System.out.println("\033[H\033[2J");
        System.out.println("--------------------------------------------------------");
        System.out.println("\n\n\n\n");
        System.out.println("Welcome back " + p.getName());
        System.out.println("\n\n\n\n                                          A. Continue");
        System.out.println("--------------------------------------------------------");
        int o = Input.take2();
        if(o == 1 || o == 2){
            return;
        }
    }
}

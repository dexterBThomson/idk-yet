public class Turn {

    public static void Run(){
        Event a = new Event();
        while(true){
            System.out.println("\033[H\033[2J");
            System.out.println("--------------------------------------------------------");
            System.out.println("A. " + Event.opt1() + " B. Run C. view stuff D. Exit");
            System.out.println("\n\n\n\n");
            System.out.println(a);
            System.out.println("\n\n\n\n");
            System.out.println("--------------------------------------------------------");
            int c = Input.take4();
            if(c == 1){
                Event.m.fight();    
            }
            else if(c == 2){
                System.out.println("You ran.");
                break;
            }
            else if(c == 3){

            }
            else if(c == 4){
                Main.exit = true;
                String code = GameStart.p.save();
                System.out.println("\033[H\033[2J");
                System.out.println("--------------------------------------------------------");
                System.out.println("\n\n\n\n");
                System.out.println("Here is your character code: " + code);
                System.out.println("\n\n\n\n");
                System.out.println("--------------------------------------------------------");
                //int o = Input.take2();
                //if(o == 1 || o == 2){
                break;
                //}
            

            }
        }
    }
}

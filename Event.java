import java.lang.Math;
public class Event {
    public boolean good;
    public static String found;
    public static String opt;
    public static Monster m;
    public Event(){
        int a = (int)(Math.random() * 10);
        
        if(a <= 5){
            good = false;
        }
        else{
            good = true;
        }


        if(good){
            found = "treasure";
            opt = "Loot";
        }
        else{
            m = new Monster(GameStart.p.getLvl());
            found = " level " + m.getLvl() +" monster";
            opt = "Fight";
            
        }
    }
    public static String opt1(){
        return opt;
    }
    public String toString(){
        return "While exploring you found a " + found;
    }
}

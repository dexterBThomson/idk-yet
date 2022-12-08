import java.lang.Math;
public class Monster {
    public static int lvl;
    public static int hp;
    public static int str;
    //public static
    public Monster(int l){
        lvl = (int)(Math.random() * 10) + GameStart.p.getLvl();
        str = lvl * 2;
        hp = lvl * 10;
    }
    public static void fight(){
        int pHp = GameStart.p.getHealth();
        pHp -= str;
    }
    public int getHp(){
        return hp;
    }
    public int getStr(){
        return str;
    }
    public int getLvl(){
        return lvl;
    }
}

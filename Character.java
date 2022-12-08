public class Character {
    public static String n;
    public static String a;
    public static String b;
    public static String c;
    public static String d;
    public static int l;
    public static String e;
    public static String f;
    public static String g;
    public static int str;
    public static int maxHealth;
    public static int health;

    public Character(String name){
        n = name;
        l = 0;
        a = "AA";
        b = "AA";
        c = "AA";
        d = "AA";
        e = "AA";
        f = "AA";
        g = "AA";
        str = l * 3;
        maxHealth = l * 100;
        health = maxHealth;
        
    }
    public Character(String name, int lvl, String ia, String ib, String ic, String id, String ie, String fi, String ig){
        n = name;
        l = lvl;
        a = ia;
        b = ib;
        c = ic;
        d = id;
        e = ie;
        f = fi;
        g = ig;
        str = l * 3;
        maxHealth = l * 100;
        health = maxHealth;
    }
    public int getStr(){
        return str;
    }
    public int getMaxHealth(){
        return maxHealth;
    }
    public int getHealth(){
        return health;
    }
    public String getName(){
        return n;
    }
    public int getLvl(){
        return l;
    }
    public String save(){
        return a + b + c + d + e + f + g + l + n;
    }
}

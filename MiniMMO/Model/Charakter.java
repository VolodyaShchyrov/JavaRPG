package praktik.MiniMMO.Model;

public class Charakter {

    private String name;
    private int age;
    private int level;
    private int stats_STR;
    private int stats_DEX;
    private int stats_CON;
    private int stats_INT;

    public Charakter()
    {
        this.setName("unknown Name");
        this.setAge(18);
        this.setStats_CON(10);
        this.setStats_STR(10);
        this.setStats_DEX(10);
        this.setStats_INT(10);
        this.setLevel(1);

    }
    public Charakter(String name, int age, int str, int dex, int con, int intel, int lvl)
    {
        this.setName(name);
        this.setAge(age);
        this.setStats_CON(con);
        this.setStats_STR(str);
        this.setStats_DEX(dex);
        this.setStats_INT(intel);
        this.setLevel(lvl);
    }




    /// getters
    public int getLevel(){return this.level;}

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getStats_STR() {
        return stats_STR;
    }

    public int getStats_DEX() {
        return stats_DEX;
    }

    public int getStats_CON() {
        return stats_CON;
    }

    public int getStats_INT() {
        return stats_INT;
    }
/// Setters

    public void setLevel(int level){this.level = level;}
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStats_STR(int stats_STR) {
        this.stats_STR = stats_STR;
    }

    public void setStats_DEX(int stats_DEX) {
        this.stats_DEX = stats_DEX;
    }

    public void setStats_CON(int stats_CON) {
        this.stats_CON = stats_CON;
    }

    public void setStats_INT(int stats_INT) {
        this.stats_INT = stats_INT;
    }
}

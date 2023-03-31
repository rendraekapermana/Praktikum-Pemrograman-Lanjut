public class Hero {
    private String name;
    private double hp;
    private double atk;
    private double defense;

    public Hero() {
        this("", 0, 0, 0);
    }

    public Hero(String name, double hp, double atk, double defense) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.defense = defense;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public void setAtk(double atk) {
        this.atk = atk;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public double getHp() {
        return hp;
    }

    public double getAtk() {
        return atk;
    }

    public double getDefense() {
        return defense;
    }

    public void attack(Hero enemy) {
        double damage = this.atk - enemy.getDefense();
        if (damage < 0) {
            damage = 0;
        }
        System.out.println(this.getName() + " menyerang " + enemy.getName() + " dengan attack " + this.getAtk() +
                           " dan defense " + enemy.getDefense() + "\n" + "Menghasilkan damage sebesar " + damage);
        enemy.takeDamage(damage);
    }

    public void takeDamage(double damage) {
        this.hp -= damage;
        System.out.println(this.getName() + " menerima damage sebesar " + damage + ", sisa HP: " + this.getHp());
        System.out.println("");
    }
}

import java.util.Random;
public abstract class Entity {
    public Random rand = new Random();
    private double maxHp=100.0;
    private double health=100.0;
    private String name;

    public void Attack(Entity target){
        System.out.println(name + " дает леща ");
        target.takeDamage(35.0);
    }
    public void Heal(double healAmount){
        this.health+=healAmount;
        if(this.health>maxHp){
            this.health=maxHp;
        }
        System.out.println(name + " покайфовал на " + healAmount + " всего " + health);
    }
    public void Skip(){
        System.out.println(name + " Скипает ход");
    }
    public void takeDamage(double damage){
        this.health-=damage;
        if(health<=0){
            health=0;
        }
        System.out.println(name + " получил леща уроном " + damage + " осталось " + health);
    }
    public boolean isDead() {
        return health <= 0;
    }
    public abstract void takeTurn(Entity target);


    // геттеры и сеттеры на все поля
    public double getMaxHp() {
        return maxHp;
    }
    public void setMaxHp(double maxHp) {
        this.maxHp = maxHp;
    }
    public double getHealth() {
        return health;
    }
    public void setHealth(double health) {
        this.health = health;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}


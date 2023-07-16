package kg.sagida.lesson5.templates;

public class Boss {
    private int health;
    private int damage;
    private String protectionType;


    public int getHealth() {
        return health;
    }

    public void setHealth() {
        this.health = 200;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage() {
        this.damage = 40;
    }

    public String getProtectionType() {
        return protectionType;
    }

    public void setProtectionType() {
        this.protectionType = "Blocking attacks ";
    }
}


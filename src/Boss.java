public class Boss {
    private int health;
    private  int damage;
    private  String protectionType;
    public Boss( int health, int damage, String protectionType){
        this.health=health;
        this.damage=damage;
        this.protectionType=protectionType;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getProtectionType() {
        return protectionType;
    }

    public void setProtectionType(String protectionType) {
        this.protectionType = protectionType;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}

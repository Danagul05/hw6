public class hero {
    private  int  health;
    private  int damage;
    private  String superAbility;
    public hero( int health, int damage, String superAbility) {
        this.health = health;
        this.damage = damage;
        this.superAbility = superAbility;
    }
    public hero( int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {return health;
    }

    public int getDamage() {return damage;
    }

    public String getSuperAbility() {return superAbility;
    }
}

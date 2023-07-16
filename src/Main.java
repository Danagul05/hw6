public class Main {
    public static void main(String[] args) {
        Boss myBoss = new Boss(500,100,"physical" );
        System.out.println("Здоровье"+ " " + myBoss.getHealth());
        System.out.println("Урон" +" " +  myBoss.getDamage());
        System.out.println("Тип защиты" +" " +   myBoss.getProtectionType());
    }
}
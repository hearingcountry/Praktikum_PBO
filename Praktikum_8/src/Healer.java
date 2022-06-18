public class Healer extends Character {
    public Healer() {
        setHP(70);
        setAttack(10);
        setDefense(10);
    }

    public void heal() {
        setHP(getHP() + 25);
    }

    @Override
    public boolean attack() {
        int rand = (int) (Math.random() * 100) + 1;
        if (rand <= 85) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Role\t: Healer");
        System.out.println("HP\t: " + getHP());
        System.out.println("Attack\t: " +
                getAttack());
        System.out.println("Defense\t: " +
                getDefense());
    }
}
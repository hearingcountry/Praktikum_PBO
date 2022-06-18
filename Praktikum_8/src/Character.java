public abstract class Character {
    private int defense = 0, attack = 0, HP = 0;

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public abstract boolean attack();

    public void receiveDamage(int damage) {
        if (damage > getDefense()) {
            int sisa = damage - getDefense();
            setHP(getHP() - (sisa));
        }
    }

    public void info() {
        System.out.println("---------- STATUS ----------");
    }
}
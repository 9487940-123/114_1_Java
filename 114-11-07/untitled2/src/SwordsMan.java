public class SwordsMan extends  Role{

    public SwordsMan(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }


    public void attack(SwordsMan opponent) {
            System.out.println(this.getName()+"攻擊"+opponent.getName()+"造成"+this.getAttackPower()+"點傷害");
            int newHealth = opponent.getHealth() - this.getAttackPower();
            opponent.setHealth(newHealth);
            if(newHealth < 0) {
                opponent.setHealth(0);
            }

    }

    public boolean isAlive() {
        return this.getHealth() > 0;
    }
}

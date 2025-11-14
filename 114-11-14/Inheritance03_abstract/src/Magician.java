public class Magician extends Role {
    private int healPower;

    public Magician(String name, int health, int attackPower, int healPower) {
        super(name, health, attackPower);
        this.setAttackPower(attackPower);
        this.healPower = healPower;
    }

    public int getHealPower() {
        return healPower;
    }

    // 攻擊任意 Role（避免因為使用具體子類型而找不到父類方法）
    public void attack(Role opponent) {
        int damage = this.getAttackPower();
        int newHealth = Math.max(0, opponent.getHealth() - damage);
        opponent.setHealth(newHealth);
        System.out.println(this.getName() + " 攻擊 " + opponent.getName() + " 造成 " + damage + " 點傷害。 " + opponent);
    }

    // 治療劍客
    public void heal(SwordsMan ally) {
        int newHealth = ally.getHealth() + this.healPower;
        ally.setHealth(newHealth);
        System.out.println(this.getName() + " 治療 " + ally.getName() + " 回復 " + healPower + " 點生命值。 " + ally);
    }

    @Override
    public String toString() {
        return super.toString() + ", 治癒力: " + healPower;
    }
}
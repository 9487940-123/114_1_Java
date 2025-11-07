public class Role {
    private String name;

    private int health;

    private int attackPower;

    public Role(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
    public int getAttackPower() {
        return attackPower;
    }

    public  void setHealth(int health) {
        this.health = health;
    }
    public void attack(Role opponent) {
        System.out.println(this.name+"攻擊"+opponent.name+"造成"+this.attackPower+"點傷害");
        int newHealth = opponent.getHealth() - this.attackPower;
        opponent.setHealth(newHealth);
        if(newHealth < 0) {
            opponent.setHealth(0);
        }
    }
    public boolean isAlive() {
        return health > 0;
    }

    public  String toString() {
        return String.format("角色名稱: %s, 生命值: %d, 攻擊力: %d", name, health, attackPower);
    }

}

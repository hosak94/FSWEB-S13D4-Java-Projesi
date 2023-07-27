package com.workintech.model;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player (String name,int healthPercentage,Weapon weapon) {
        this.name = name;
        checkHealth(healthPercentage);
        this.weapon = weapon;
    }

    private void checkHealth (int healthPercentage) {
        if(healthPercentage > 100) {
            this.healthPercentage = 100;
        } else if (healthPercentage < 0) {
            this.healthPercentage = 0;
        }else {
            this.healthPercentage = healthPercentage;
        }

    }

    public int healthRemaining () {
        return healthPercentage;
    }

    public void loseHealth (int damage) {
        int healthRemain = healthPercentage - damage;
        if(healthRemain <= 0) {
            System.out.println(name + " player has been knocked out of game");
        }
        checkHealth(healthRemain);

    }

    public void restoreHealth(int healthPotion) {
      checkHealth(healthPercentage + healthPotion);
    }

    public String toString() {
        return "Name: " + name + " HealthPercentage: " + healthPercentage + " Weapon: " + (weapon.getDamage() +
                " - " + weapon.getAttackSpeed());
    }

}

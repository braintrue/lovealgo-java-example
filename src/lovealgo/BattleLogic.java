package lovealgo;

import java.util.Random;

public class BattleLogic {
  private static Random random = new Random();

  public static int calculateAttackPower(Pokemon attacker) {
    return attacker.getLevel() * (random.nextInt(6) + 5);
  }

  public static void takeDamage(Pokemon defender, int damage) {
    int hpAfterDamage = defender.getHp() - damage;
    defender.setHp(Math.max(hpAfterDamage, 0));
    System.out.println(defender.getName() + "의 HP가: " + defender.getHp() + "이(가) 되었습니다."); 
  }
}
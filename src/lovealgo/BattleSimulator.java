package lovealgo;

public class BattleSimulator {

    public static void battle(Pokemon p1, Pokemon p2) {
        System.out.println("🔥 " + p1.getName() + " VS " + p2.getName() + " 배틀 시작!");

        while (p1.getHp() > 0 && p2.getHp() > 0) {
            // p1 공격
            int p1Attack = BattleLogic.calculateAttackPower(p1);
            System.out.println(p1.getName() + "의 공격력: " + p1Attack);
            BattleLogic.takeDamage(p2, p1Attack);

            if (p2.getHp() <= 0) {
                System.out.println("🏆 승자는 " + p1.getName() + "입니다!");
                break;
            }

            // p2 공격
            int p2Attack = BattleLogic.calculateAttackPower(p2);
            System.out.println(p2.getName() + "의 공격력: " + p2Attack);
            BattleLogic.takeDamage(p1, p2Attack);

            if (p1.getHp() <= 0) {
                System.out.println("🏆 승자는 " + p2.getName() + "입니다!");
                break;
            }

            System.out.println("-----------------------------");
        }
    }
}

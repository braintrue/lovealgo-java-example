package lovealgo;

// lovealgo 스타일의 심플하고 직관적인 클래스
public class Pokemon {
    private String name;
    private int level;
    private int hp;

    public Pokemon(String name, int level) {
        this.name = name;
        this.level = level;
        this.hp = level * 10; // 레벨에 따라 HP 설정
    }

    public void attack() {
        System.out.println(name + "의 레벨 " + level + " 공격 성공!");
    }

    public void levelUp() {
        level++;
        System.out.println(name + "이(가) 레벨업! (현재 레벨: " + level + ")");
    }

    // Getter 메소드
    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }
    // Setter 메소드
    public void setHp(int hp) {
        this.hp = hp;
    }
} // <-- 이 괄호를 반드시 확인해주세요

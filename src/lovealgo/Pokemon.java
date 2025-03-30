package lovealgo;

// lovealgo 스타일의 심플하고 직관적인 클래스
public class Pokemon {
    private String name;
    private int level;

    public Pokemon(String name, int level) {
        this.name = name;
        this.level = level;
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
} // <-- 이 괄호를 반드시 확인해주세요

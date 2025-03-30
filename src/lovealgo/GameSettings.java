package lovealgo;

// Singleton 패턴: 게임 설정을 한 번만 생성하여 어디서든 접근 가능
public class GameSettings {
    private static GameSettings instance = null;

    private String difficulty;
    private int soundVolume;

    private GameSettings() {
        difficulty = "NORMAL";
        soundVolume = 50;
    }

    public static GameSettings getInstance() {
        if (instance == null) {
            instance = new GameSettings();
        }
        return instance;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setSoundVolume(int volume) {
        this.soundVolume = volume;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void showSettings() {
        System.out.println("난이도: " + difficulty + ", 사운드 볼륨: " + soundVolume);
    }
}

package lovealgo;

public class Main {
    public static void main(String[] args) {
        // 싱글톤: 게임 환경 설정
        GameSettings settings = GameSettings.getInstance();
        settings.setDifficulty("HARD");
        settings.setSoundVolume(80);
        settings.showSettings();

        // 팩토리: 다양한 포켓몬 자동 생성
        Pokemon p1 = PokemonFactory.createPokemon("전기");
        Pokemon p2 = PokemonFactory.createPokemon("불꽃");
        Pokemon p3 = PokemonFactory.createPokemon("물");

        p1.attack();
        p2.attack();
        p3.attack();
    }
}

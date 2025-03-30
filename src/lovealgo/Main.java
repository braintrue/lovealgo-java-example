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

        // 포켓몬 도감 초기화
        Pokedex pokedex = new Pokedex();

        // 포켓몬 등록 (CREATE)
        pokedex.registerPokemon("피카츄", 5);
        pokedex.registerPokemon("꼬부기", 4);
        pokedex.registerPokemon("파이리", 6);

        // 포켓몬 전체 조회 (READ)
        pokedex.showAllPokemon();

        // 특정 포켓몬 삭제 (DELETE)
        pokedex.removePokemon("꼬부기");

        // 삭제 후 전체 조회
        pokedex.showAllPokemon();

    }
}

package lovealgo;

public class PokemonFactory {

    // 요청된 타입에 따라 포켓몬 객체를 생성하는 Factory 메서드
    public static Pokemon createPokemon(String type) {
        switch (type) {
            case "전기":
                return new Pokemon("피카츄", 5);
            case "물":
                return new Pokemon("꼬부기", 4);
            case "불꽃":
                return new Pokemon("파이리", 4);
            default:
                return new Pokemon("이상해씨", 4);
        }
    }
}

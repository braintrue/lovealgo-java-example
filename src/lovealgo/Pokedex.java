package lovealgo;

public class Pokedex {
    private PokemonManager manager;

    public Pokedex() {
        manager = new PokemonManager();
    }

    public void registerPokemon(String name, int level) {
        Pokemon pokemon = new Pokemon(name, level);
        manager.addPokemon(pokemon);
        System.out.println(name + "을(를) 도감에 등록했습니다!");
    }

    public void showAllPokemon() {
        System.out.println("====== 포켓몬 도감 목록 ======");
        for (Pokemon p : manager.getAllPokemon()) {
            System.out.println("이름: " + p.getName() + ", 레벨: " + p.getLevel());
        }
    }

    public void removePokemon(String name) {
        boolean result = manager.removePokemonByName(name);
        if (result)
            System.out.println(name + "을(를) 도감에서 삭제했습니다.");
        else
            System.out.println(name + "을(를) 찾을 수 없습니다.");
    }
}

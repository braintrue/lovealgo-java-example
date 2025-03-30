package lovealgo;

import java.util.ArrayList;

public class PokemonManager {
    private ArrayList<Pokemon> pokemonList;

    public PokemonManager() {
        pokemonList = new ArrayList<>();
    }

    // 포켓몬 등록 (Create)
    public void addPokemon(Pokemon pokemon) {
        pokemonList.add(pokemon);
    }

    // 전체 포켓몬 목록 반환 (Read)
    public ArrayList<Pokemon> getAllPokemon() {
        return pokemonList;
    }

    // 특정 포켓몬 조회 (Read by name)
    public Pokemon findPokemonByName(String name) {
        for (Pokemon p : pokemonList) {
            if (p.getName().equals(name))
                return p;
        }
        return null;
    }

    // 포켓몬 삭제 (Delete)
    public boolean removePokemonByName(String name) {
        Pokemon target = findPokemonByName(name);
        if (target != null) {
            pokemonList.remove(target);
            return true;
        }
        return false;
    }
}

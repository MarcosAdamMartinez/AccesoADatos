package Introduccion;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapaPokemon {

    Map<String, ArrayList<Pokemon>> equipo3;

    public MapaPokemon(){
        equipo3 = new LinkedHashMap<String,ArrayList<Pokemon>>();
    }

    public void añadirPokemon(Pokemon p){

        if(!equipo3.containsKey(p.getNombre())){
            equipo3.put(p.getNombre(), new ArrayList<Pokemon>());
        }

        if(!equipo3.get(p.getNombre()).contains(p)) {
            equipo3.get(p.getNombre()).add(p);
        }

    }

    @Override
    public String toString(){

        return equipo3.toString();

    }

}

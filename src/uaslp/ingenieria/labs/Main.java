package uaslp.ingenieria.labs;

import uaslp.ingenieria.labs.list.*;

public class Main {
    public static void main(String[] args) throws MyIndexOutOfBoundsException {
        List<String> lista2 = new ArrayList<>();
        
        lista2.add("Azul");
        lista2.add("Gris");
        lista2.add("Rojo");
        lista2.add("Amarillo");
        lista2.add("Morado");
        lista2.add("Verde");


        System.out.println("---------------------");

        Iterator<String> itStrings = lista2.getIterator();

        while(itStrings.hasNext()){
            System.out.println(itStrings.next());
        }

    }
}

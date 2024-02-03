import java.util.Collections;
import java.util.LinkedList;

import static java.util.Collections.binarySearch;

public class Main {
    public static void main(String[] args) {


        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(10);
        list.add(40);
        list.add(22);
        list.add(12);
        list.add(9);
        list.add(305);
        list.add(77);
        list.add(34);

        Collections.sort(list);  // Ordena la lista antes de aplicar la búsqueda binaria

        int result = binarySearch(list, 0); // Introduzca como parámetro la el elemento que desea buscar en la lista

        if (result == -1) {
            System.out.println("Elemento no presente");
        } else {
            System.out.println("Elemento encontrado en el índice " + result);
        }
    }
    }

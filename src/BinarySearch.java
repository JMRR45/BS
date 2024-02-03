import java.util.LinkedList;

public class BinarySearch {
    public static int binarySearch (LinkedList< Comparable > list, Comparable target){
        int left = 0;
        int right = list.size() - 1;


        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Compara el elemento en la posición media con el objetivo
            if (list.get(mid).compareTo(target) == 0) {
                return mid;  // Retorna el índice si el elemento se encuentra en la posición media
            } else if (list.get(mid).compareTo(target) < 0) {
                left = mid + 1;  // Ajusta el límite izquierdo si el objetivo está en la mitad derecha
            } else {
                right = mid - 1;  // Ajusta el límite derecho si el objetivo está en la mitad izquierda
            }
        }
        return left;
    }
}

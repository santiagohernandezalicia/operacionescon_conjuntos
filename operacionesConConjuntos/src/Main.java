import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        HashSet<String> letras = new HashSet<>();
        HashSet<String> numeros = new HashSet<>();
        letras.add("a");
        letras.add("b");
        letras.add("c");

        numeros.add("1");
        numeros.add("2");
        numeros.add("3");

        Set<String> union = operaciones.union(letras, numeros);
        System.out.println("Unión: " + union);

        Set<String> interseccion = operaciones.intersect(letras, numeros);
        System.out.println("Intersección: " + interseccion);

        Set<String> diferencia = operaciones.diff(letras, numeros);
        System.out.println("Diferencia: " + diferencia);

        boolean subconjunto = operaciones.isSubset(letras, numeros);
        System.out.println("Es subconjunto: " + subconjunto);

        Set<String> productoCartesiano = operaciones.cartesiano(letras, numeros);
        System.out.println("Producto cartesiano: " + productoCartesiano);
    }
}

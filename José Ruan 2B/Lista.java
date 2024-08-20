import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ListExemplo{


    public static void main(String[] args){

        List<String> Objetos = new ArrayList();

        Objetos.add("Bacia");
        Objetos.add("Garfo");
        Objetos.add("Panela");
        Objetos.add("Faca");
        
        Collections.sort(Objetos);

        System.out.println("Essa é sua lista" + Objetos);
        System.out.println("Abaixo estão os elementos pegos na posição");
        System.out.println(Objetos.get(3));
        System.out.println(Objetos.remove(1));
        System.out.println("O tamanho da lista é: " + Objetos.size());
        System.out.println("A lista está assim agora" + Objetos);
    }
}
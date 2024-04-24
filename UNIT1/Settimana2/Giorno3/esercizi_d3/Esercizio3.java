package esercizi_d3;

import classi_base.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Esercizio3 {
    public static void main(String[] args) {

        ArrayList<Product> prodotti = new ArrayList<>();

        prodotti.add(new Product(1L, "Harry Potter e la Pietra Filosofale", "Books", 170));
        prodotti.add(new Product(2L, "T-shirt Marvel Boys", "Boys", 15));
        prodotti.add(new Product(3L, "Body Baby con stampa", "Baby", 12));
        prodotti.add(new Product(4L, "Shogun", "Books", 18));
        prodotti.add(new Product(5L, "Jeans Boys", "Boys", 25));
        prodotti.add(new Product(6L, "1984", "Books", 200));
        prodotti.add(new Product(7L, "Set regalo per neonati", "Baby", 30));
        prodotti.add(new Product(8L, "Il Codice da Vinci", "Books", 25));


        List<Product> prodottiBoys = prodotti.stream().filter((product -> product.getCategory().equals("Boys"))).map((product -> {
            product.setPrice(product.getPrice() * 0.9);
            return product;
        })).collect(Collectors.toList());

        System.out.println(prodottiBoys);

        //con peek

        /*List<Product> prodottiBoys = prodotti.stream()
                .filter(product -> product.getCategory().equals("Boys"))
                .peek(product -> product.setPrice(product.getPrice() * 0.9))
                .collect(Collectors.toList());
*/


    }
}

package esercizi_d3;

import classi_base.Customer;
import classi_base.Order;
import classi_base.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Esercizio2 {
    public static void main(String[] args) {
        ArrayList<Product> prodotti = new ArrayList<>();

        Customer customer1 = new Customer(1L, "Steve", 2);
        Customer customer2 = new Customer(2L, "Alice", 1);
        Customer customer3 = new Customer(3L, "Bob", 3);

        prodotti.add(new Product(1L, "Harry Potter e la Pietra Filosofale", "Books", 170));
        prodotti.add(new Product(2L, "T-shirt Marvel Boys", "Boys", 15));
        prodotti.add(new Product(3L, "Body Baby con stampa", "Baby", 12));


        Order ordine1 = new Order(1L, "completed", LocalDate.parse("2022-04-21"), LocalDate.parse("2022-04-23"), prodotti, customer1);


        ArrayList<Product> prodotti2 = new ArrayList<>();
        prodotti2.add(new Product(9L, "T-shirt Marvel Boys", "Boys", 15));
        prodotti2.add(new Product(10L, "Jeans Boys", "Boys", 25));
        prodotti2.add(new Product(11L, "Harry Potter e la Pietra Filosofale", "Books", 170));

        ArrayList<Product> prodotti3 = new ArrayList<>();
        prodotti3.add(new Product(12L, "Body Baby con stampa", "Baby", 12));
        prodotti3.add(new Product(13L, "Set regalo per neonati", "Baby", 30));

        Order ordine2 = new Order(2L, "completed", LocalDate.parse("2022-04-22"), LocalDate.parse("2022-04-24"), prodotti2, customer2);
        Order ordine3 = new Order(3L, "in_progress", LocalDate.parse("2022-04-23"), LocalDate.parse("2022-04-25"), prodotti3, customer3);


        ArrayList<Order> ordini = new ArrayList<>();
        ArrayList<Order> ordiniCompleti = new ArrayList<>();
        ordiniCompleti.add(ordine1);
        ordiniCompleti.add(ordine2);
        ordiniCompleti.add(ordine3);

       List<Order> ordiniBaby =  ordiniCompleti.stream()
                .filter(ordine -> ordine.getProducts().stream().anyMatch(product -> product.getCategory().equals("Baby")))
                .collect(Collectors.toList());

        System.out.println(ordiniBaby);


    }
}


/*//data di oggi
LocalDate data = LocalDate.now();
        System.out.println(data);

//data specifica
LocalDate data2 = LocalDate.of(2020,5,8);
        System.out.println(data2);

//data specifica attraverso una stringa
LocalDate data3 = LocalDate.parse("2022-04-21");
        System.out.println(data3);

//confronto date con ritorno booleano
        System.out.println(data2.isBefore(data3)) */
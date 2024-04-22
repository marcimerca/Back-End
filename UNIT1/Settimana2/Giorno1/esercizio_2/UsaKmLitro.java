package esercizio_2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class UsaKmLitro {
    static Logger logger = LoggerFactory.getLogger("logger1");

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserire km percorsi ");
        int km = scanner.nextInt();
        System.out.println("Inserire litri consumati");
        int litri = scanner.nextInt();

        KmLitro kmLitro = new KmLitro();
        try {
            kmLitro.calcolaKmLitro(km, litri);
        } catch (ArithmeticException e) {
            logger.error("Non puoi dividere i km per 0 (zero) litri percorsi");
        }
    }
}


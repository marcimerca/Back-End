package progetto;

import java.util.Scanner;

public class UsaElementoMultimediale {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int elementiCreati = 0;

        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        while (elementiCreati < 5) {
            System.out.println("Inserisci la parola 'video' se vuoi creare un elemento video,");
            System.out.println("'audio' per creare una registrazione audio,");
            System.out.println("e 'immagine' per creare un'immagine.");
            String tipoElemento = scanner.nextLine();

            switch (tipoElemento) {
                case "audio":
                    System.out.println("Inserisci titolo audio:");
                    String titoloAudio = scanner.nextLine();
                    int durataAudio;
                    do {
                        System.out.println("Inserisci durata audio (valore positivo, valori negativi non permessi):");
                        durataAudio = scanner.nextInt();
                    } while (durataAudio <= 0);
                    int volumeAudio;
                    do {
                        System.out.println("Inserisci volume audio (valore positivo, valori negativi non permessi):");
                        volumeAudio = scanner.nextInt();
                    } while (volumeAudio <= 0);
                    scanner.nextLine();
                    RegistrazioneAudio audio = new RegistrazioneAudio(titoloAudio, durataAudio, volumeAudio);
                    inserisciInArray(elementi, audio, elementiCreati);
                    elementiCreati++;
                    break;
                case "video":
                    System.out.println("Inserisci titolo video:");
                    String titoloVideo = scanner.nextLine();
                    int durataVideo;
                    do {
                        System.out.println("Inserisci durata video (possibile solo valore positivo):");
                        durataVideo = scanner.nextInt();
                    } while (durataVideo <= 0);
                    int volumeVideo;
                    do {
                        System.out.println("Inserisci volume video (possibile solo valore positivo):");
                        volumeVideo = scanner.nextInt();
                    } while (volumeVideo <= 0);
                    int luminositaVideo;
                    do {
                        System.out.println("Inserisci luminosità video (possibile solo valore positivo):");
                        luminositaVideo = scanner.nextInt();
                    } while (luminositaVideo <= 0);
                    scanner.nextLine();
                    Video video = new Video(titoloVideo, durataVideo, volumeVideo, luminositaVideo);
                    inserisciInArray(elementi, video, elementiCreati);
                    elementiCreati++;
                    break;
                case "immagine":
                    System.out.println("Inserisci titolo immagine:");
                    String titoloImmagine = scanner.nextLine();
                    int luminositaImmagine;
                    do {
                        System.out.println("Inserisci luminosità immagine (possibile solo valore positivo):");
                        luminositaImmagine = scanner.nextInt();
                    } while (luminositaImmagine <= 0);
                    scanner.nextLine();
                    Immagine immagine = new Immagine(titoloImmagine, luminositaImmagine);
                    inserisciInArray(elementi, immagine, elementiCreati);
                    elementiCreati++;
                    break;
                default:
                    System.out.println("Tipo di elemento non supportato.");
            }

        }

        System.out.println("Hai creato correttamente 5 elementi");

        int numero;
        do {
            System.out.println("Inserisci un numero da 1 a 5 per eseguire uno degli elementi appena creati, 0 per interrompere l'esecuzione");
            numero = scanner.nextInt();
            switch (numero) {
                case 1:
                    elementi[0].chiamaMetodo();
                    break;
                case 2:
                    elementi[1].chiamaMetodo();
                    break;
                case 3:
                    elementi[2].chiamaMetodo();
                    break;
                case 4:
                    elementi[3].chiamaMetodo();
                    break;
                case 5:
                    elementi[4].chiamaMetodo();
                    break;
                case 0:
                    System.out.println("Esecuzione interrotta.");
                    break;
                default:
                    System.out.println("Inserito numero non valido");

            }

        }
        while (numero != 0);

    }

    public static void inserisciInArray(ElementoMultimediale[] elementi, ElementoMultimediale elemento, int elementiCreati) {
        elementi[elementiCreati] = elemento;
        System.out.println("Elemento inserito correttamente.");

    }


}


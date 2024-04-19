package progetto;

import java.util.Scanner;

public class UsaElementoMultimediale {
    public static void main(String[] args) {
     /*   RegistrazioneAudio elemento1 = new RegistrazioneAudio("prova",3,10);
        elemento1.play();

        Video elemento2 = new Video("prova",3,10, 50);
        elemento2.play();
*/

        Scanner scanner = new Scanner(System.in);


       /* ElementoMultimediale elemento1 = new RegistrazioneAudio("audio", 3,10);
        ElementoMultimediale elemento2 = new Video("video", 3,10, 50);
        ElementoMultimediale elemento3 = new Immagine("immag", 3);

        ElementoMultimediale[] elementi = {elemento1, elemento2, elemento3};
*/
//      /* *//* ElementoMultimediale[] elementi = new ElementoMultimediale[5];*//*
//        System.out.println("Inserire titolo");
//        */


        int elementiCreati = 0;

        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        while (elementiCreati < 5) {
            System.out.println("Inserisci la parola video se vuoi creare un elemento video, audio per creare una registrazione audio e immagine per creare un'immagine:");
            String tipoElemento = scanner.nextLine();

            switch (tipoElemento) {
                case "audio":
                    System.out.println("Inserisci titolo audio:");
                    String titoloAudio = scanner.nextLine();
                    System.out.println("Inserisci durata audio:");
                    int durataAudio = scanner.nextInt();
                    System.out.println("Inserisci volume audio:");
                    int volumeAudio = scanner.nextInt();
                    scanner.nextLine();
                    RegistrazioneAudio audio = new RegistrazioneAudio(titoloAudio, durataAudio, volumeAudio);
                    inserisciInArray(elementi, audio, elementiCreati);
                    elementiCreati++;
                    break;
                case "video":
                    System.out.println("Inserisci titolo video:");
                    String titoloVideo = scanner.nextLine();
                    System.out.println("Inserisci durata video:");
                    int durataVideo= scanner.nextInt();
                    System.out.println("Inserisci volume video:");
                    int volumeVideo= scanner.nextInt();
                    System.out.println("Inserisci luminosità video:");
                    int luminositaVideo= scanner.nextInt();
                    scanner.nextLine();
                   Video video= new Video(titoloVideo, durataVideo, volumeVideo, luminositaVideo);
                    inserisciInArray(elementi, video, elementiCreati);
                    elementiCreati++;
                    break;
                case "immagine":
                    System.out.println("Inserisci titolo immagine:");
                    String titoloImmagine = scanner.nextLine();
                    System.out.println("Inserisci luminosità immagine:");
                    int luminositaImmagine= scanner.nextInt();
                    scanner.nextLine();
                   Immagine immagine= new Immagine(titoloImmagine, luminositaImmagine);
                    inserisciInArray(elementi, immagine, elementiCreati);
                    elementiCreati++;
                    break;
                default:
                    System.out.println("Tipo di elemento non supportato.");
            }

            if (elementiCreati == 5) {
               for(int i = 0; i <elementi.length; i++) {
                   System.out.println(elementi[i].getTitolo());
               }
                scanner.close();
            }
        }

        System.out.println(elementi);


    }

    public static void inserisciInArray(ElementoMultimediale[] elementi, ElementoMultimediale elemento, int elementiCreati) {
        elementi[elementiCreati] = elemento;
        System.out.println("Elemento inserito correttamente.");

    }



}

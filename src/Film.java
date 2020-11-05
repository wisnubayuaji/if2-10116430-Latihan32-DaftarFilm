/**
 * @author
 * Nim  : 10116430
 * Nama : Wisnu Bayu Aji
 * Kelas: IF-2
 */
public class Film {
    String filmName;
    String filmGenre;
    Double filmRating;
    int filmDuration;

    public void nowPlaying() {
        System.out.println("Judul Film  : " + filmName);
        System.out.println("Genre Film  : " + filmGenre);
        System.out.println("Rating Film : " + filmRating);
        System.out.println("Durasi Film : " + filmDuration);
        System.out.println("");
    }
}

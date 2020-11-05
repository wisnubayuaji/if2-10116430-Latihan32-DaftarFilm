/**
 * @author
 * Nim  : 10116430
 * Nama : Wisnu Bayu Aji
 * Kelas: IF-2
 */
public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("===Daftar Film Sedang Tayang===");

        Film list = new Film();

        list.filmName = "Venom";
        list.filmGenre = "Action, Horror, Scifi";
        list.filmRating = 8.5;
        list.filmDuration = 120;
        list.nowPlaying();

        list.filmName = "Small Foot";
        list.filmGenre = "Animation";
        list.filmRating = 9.0;
        list.filmDuration = 96;
        list.nowPlaying();

        list.filmName = "Crazy Rich Asian";
        list.filmGenre = "Comedy";
        list.filmRating = 7.8;
        list.filmDuration = 119;
        list.nowPlaying();

        list.filmName = "Asih";
        list.filmGenre = "Horror";
        list.filmRating = 6.0;
        list.filmDuration = 100;
        list.nowPlaying();
    }
}

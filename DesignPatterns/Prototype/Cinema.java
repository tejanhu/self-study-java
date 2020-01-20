import java.util.*;

public class Cinema implements Cloneable{
    String cinemaName;
    List<Film> movies = new ArrayList<>();

    public void setCinema(String cinemaName){
        this.cinemaName = cinemaName;
    }

    public String getCinema(){
        return cinemaName;
    }

    public List<Film> fetchFilms(){
        return movies;
    }

    public void setFilms(List<Film>movies){
        this.movies = movies;
    }

    public void loadDB(){
        for (int i = 1; i <= 20; i++) {
            Film movie = new Film();
            movie.setId("id: "+i);
            movie.setTitle("Title: "+i);
            movie.setRating("Rating: "+i);
            movie.setYear("Year: "+i);
            fetchFilms().add(movie);
        }
    }

    @Override
    protected Cinema clone() throws CloneNotSupportedException {
        Cinema cinema = new Cinema();

        for (Film film : this.fetchFilms()) {
            cinema.fetchFilms().add(film);
        }

        return cinema;
    }

    @Override
    public String toString() {
        return "Cinema [name: " + cinemaName + ", movies: " + movies +"]";
    }
}
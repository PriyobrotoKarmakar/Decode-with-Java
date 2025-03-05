import java.util.Scanner;
class Movie {
    private int movieId;
    private double rating;

    public Movie(int movieId, double rating) {
        this.movieId = movieId;
        this.rating = rating;
    }

    public String toString() {
        return "Movie " + movieId + " Rating: " + rating;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Movie movie = (Movie) obj;
        return movieId == movie.movieId && Double.compare(movie.rating, rating) == 0;
    }
}

class RatedMovie extends Movie {
    public RatedMovie(int movieId, double rating) {
        super(movieId, rating);
    }

    @Override
    public String toString() {
        return "[Verified] " + super.toString();
    }
}
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numMovies = scanner.nextInt();
        
        Movie[] movies = new Movie[numMovies];
        
        for (int i = 0; i < numMovies; i++) {
            double rating = scanner.nextDouble();
            movies[i] = new RatedMovie(i + 1, rating);
        }
        
        System.out.println("Movie Ratings:");
        for (Movie movie : movies) {
            if (movie instanceof RatedMovie) {
                System.out.println(movie);
            }
        }
        
        scanner.close();
    }
}
public class q1 {
    
}

import java.util.*;

public class App {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<>();
        list.add(new Movie("American Gangster", 9.0, 2001));
        list.add(new Movie("The Dark Knight", 9.7, 2017));
        list.add(new Movie("The Irishman", 8.8, 2020));
        list.add(new Movie("Sopranos", 9.9, 1999));

        System.out.println("Sorting by release year: ");
        Collections.sort(list);

        for (Movie movie : list) {
            System.out.println(movie.year + " " + movie.name + " " + movie.rating);
        }

        System.out.println("\nSorting by ratings: ");
        ratingCompare rate = new ratingCompare();
        Collections.sort(list, rate);
        for (Movie movie : list) {
            System.out.println(movie.rating + " " + movie.name + " " + movie.year);
        }

        System.out.println("\nSorting by Movie name: ");
        nameCompare compare = new nameCompare();
        Collections.sort(list, compare);
        for (Movie movie : list) {
            System.out.println(movie.name + " " + movie.year + " " + movie.rating);
        }
    }
}

class Movie implements Comparable<Movie> {
    String name;
    double rating;
    int year;

    @Override
    public int compareTo(Movie o) {
        return this.year - o.year;
    }

    public Movie(String nm, double rt, int yr) {
        this.name = nm;
        this.rating = rt;
        this.year = yr;

    }
}

// compare movies by ratings
class ratingCompare implements Comparator<Movie> {

    @Override
    public int compare(Movie o1, Movie o2) {
        if (o1.rating < o2.rating) {
            return -1;
        }
        if (o1.rating > o2.rating) {
            return 1;
        } else {
            return 0;
        }
    }
}

// compare with names 
class nameCompare implements Comparator<Movie> {

    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.name.compareTo(o2.name);
    }
    
}
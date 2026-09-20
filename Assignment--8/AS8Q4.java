import java.lang.*;
import java.util.*;

class Movie {
    String title;
    String director;
    String actors;
    String reviews[] = new String[10];
    int count = 0;

    Movie(String t, String d, String a) {
        title = t;
        director = d;
        actors = a;
    }

    void addReview(String review) {
        reviews[count] = review;
        count++;
        System.out.println("Review added");
    }

    void getReviews() {
        System.out.println("Reviews:");

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + reviews[i]);
        }
    }

    void display() {
        System.out.println("Movie Details:");
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Actors: " + actors);
    }
}

class AS8Q4 {
    public static void main(String SCP[]) {
        Scanner sc = new Scanner(System.in);

        Movie movie = new Movie("3 Idiots", "Aalok Kumar",
                                "Mohit Raja, Rishabh Raj, Piyush Joshi");

        movie.display();

        System.out.print("Enter a review: ");
        String review = sc.nextLine();
        movie.addReview(review);

        movie.getReviews();

        sc.close();
    }
}
package start.solution;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static start.solution.Solution.whoLikesIt;

class SolutionTest {
    @Test
    public void staticTests() {
        assertEquals("no one likes this", whoLikesIt());
        assertEquals("Peter likes this", whoLikesIt("Peter"));
        assertEquals("Jacob and Alex like this", whoLikesIt("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", whoLikesIt("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", whoLikesIt("Alex", "Jacob", "Mark", "Max"));
        assertEquals("Alex, Jacob and 3 others like this", whoLikesIt("Alex", "Jacob", "Mark", "Max", "Peter"));

    }
    private static String[] names = new String[]{"Brian", "Marilyn", "Pamela", "Timothy", "Jesse", "Heather", "Terry", "Carlos",
            "Bonnie", "Randy", "Lillian", "Emily", "Louis", "Chris", "Howard", "Helen", "Ralph", "Jennifer", "Mark", "Laura",
            "Jason", "Shirley", "Diane", "Phillip", "David", "Joan", "Wanda", "Jimmy", "Carl", "Betty", "Adam", "Lawrence",
            "Kathleen", "Mildred", "Rose", "Tina", "Jose", "Keith", "Janice", "Maria", "Kenneth", "Arthur", "James", "Catherine",
            "Henry", "Denise", "Ruby", "Cynthia", "Anthony", "Jeffrey", "Eugene", "Dorothy", "Lori", "Bobby", "Peter", "Alice",
            "Eric", "Wayne", "Phyllis", "Roger", "Clarence", "Scott", "John", "Philip", "Teresa", "Andrea", "Douglas", "Earl",
            "Melissa", "Benjamin", "Rebecca", "Michelle", "Alan", "Brenda", "William", "Frank", "Matthew", "George", "Anna",
            "Cheryl", "Roy", "Paula", "Tammy", "Gerald", "Christina", "Russell", "Kelly", "Albert", "Donna", "Todd", "Jessica",
            "Kimberly", "Johnny", "Dennis", "Jack", "Doris", "Martha", "Stephanie", "Stephen", "Christine"};

    @Test
    public void randomTests() {
        Random rand = new Random();
        for (int i = 0; i < 24; i++) {
            int r = rand.nextInt(100);
            String[] randNames = new String[r];
            for (int j = 0; j < r; j++) randNames[j] = names[rand.nextInt(100)];
            assertEquals(whoLikesIt(randNames), whoLikesIt(randNames));
        }
    }
}
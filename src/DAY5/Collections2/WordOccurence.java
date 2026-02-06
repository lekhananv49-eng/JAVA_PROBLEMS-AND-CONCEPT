package DAY5.Collections2;

import java.util.HashMap;
import java.util.Scanner;

public class WordOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = sc.nextLine();

        input = input.toLowerCase();
        input = input.replace("[^a-z0-9 ]", " ");
        String[] words = input.split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if (word.length() == 0) {
                continue;
            }
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        // SAMPLE INPUT
        // input="This is a test. This test is only a test".
        // words[]={this,is,a,test,this,test,is,only,a,test}

        // word="this"
        // map={this->1}
        // Word="is"
        // map={this->1,is->1}
        // word="a"
        // map={this->1,is->1,a->1}
        // word="test"
        // map={this->2,is->2,a->1,test->2}
        // word="Only"
        // map={this->2,is->2,a->2,test->3,only->1}

        System.out.println("Word Occurrences: ");

        map.forEach((word, count) -> System.out.println(word + ": " + count));

    }

}

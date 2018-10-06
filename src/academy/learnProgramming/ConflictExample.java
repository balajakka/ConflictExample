package academy.learnProgramming;

import java.util.List;

/**
 * Created by balajakka on 06/10/2018.
 */
public class ConflictExample {
    public static void main(String[] args) {
        java.util.Date date;

        java.sql.Date sqlDate;


    }

    public void checkEmpty(List list) {
        if (list.isEmpty()) {
            System.out.println("Empty");} else {System.out.println("Not empty");
        }
    }

    public class LineNumber {

        public void checkEmpty(List list) {
            if (list.isEmpty()) {System.out.println("Empty");} else {System.out.println("Not empty");
            }
        }
    }
}


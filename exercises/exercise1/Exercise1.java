package exercises.exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import exercises.exercise1.model.*;

public class Exercise1 {
    public static void main(String[] args) {

        // Initializing Random object
        Random rand = new Random();

        ArrayList<ArrayList<Integer>> quizscores = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < 20; i++) {
            ArrayList<Integer> score = new ArrayList<Integer>();
            for (int j = 0; j < 15; j++) {
                score.add(rand.nextInt(70) + 30);
            }
            quizscores.add(score);
        }

        Session session = new Session();
        for (int i = 1; i < 21; i++) {
            System.out.println("-------------------------------------------------------------------");

            if (i < 8) {
                PartTime s = new PartTime("student" + String.valueOf(i), i, quizscores.get(i));
                session.addPartTimeStudent(s);
                session.printQuizScore(s, s.getScore());
                session.calculateAvgQuizScore(s, s.getScore());
            } else {
                ArrayList<Integer> examScore = new ArrayList<Integer>(
                        Arrays.asList(rand.nextInt(60) + 40, rand.nextInt(60) + 40));
                FullTime s = new FullTime("student" + String.valueOf(i), i, quizscores.get(i - 1), examScore);
                session.addFullTimeStudent(s);
                session.printQuizScore(s, s.getScore());
                session.calculateAvgQuizScore(s, s.getScore());
            }
        }

        // System.out.println("------------------------------------ Full Time Student
        // List ------------------------------------");
        // for (int i=0; i<session.getFullTimeStudentList().size(); i++){
        // System.out.println(session.getFullTimeStudentList().get(i).getName());
        // }

        System.out.println(
                "------------------------------------ Part Time Student List ------------------------------------");
        session.printPartTimeStudentNames();

        System.out.println(
                "------------------------------------ Full Time Student's Exam Scores ------------------------------------");
        session.printFullTimeStudentScores();

    }
}

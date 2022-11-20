package exercises.exercise1.model;

import java.util.ArrayList;
import java.util.Comparator;

public class Session {
    private double avgQuizScore = 0;
    private String names;
    private ArrayList<Student> StudentList;
    private ArrayList<Student> fullTimeStudentList;
    private ArrayList<Student> partTimeStudentList;

    public Session() {
        this.StudentList = new ArrayList<Student>();
        this.fullTimeStudentList = new ArrayList<Student>();
        this.partTimeStudentList = new ArrayList<Student>();
    }

    public void addFullTimeStudent(Student student) {
        fullTimeStudentList.add(student);
    }
    
    public void addPartTimeStudent(Student student) {
        partTimeStudentList.add(student);
    }

    public double getAvgQuizScore() {
        return avgQuizScore;
    }

    public String getNames() {
        return names;
    }

    public ArrayList<Student> getStudentList() {
        return StudentList;
    }

    public ArrayList<Student> getFullTimeStudentList() {
        return fullTimeStudentList;
    }

    public ArrayList<Student> getPartTimeStudentList() {
        return partTimeStudentList;
    }

    public void calculateAvgQuizScore(Student student, ArrayList<Integer> quizScore) {
        for (int score : quizScore){
            avgQuizScore += score;
        }
        System.out.println("Average quiz score of the " + student.getName() + " is " + avgQuizScore/quizScore.size());
    }

    public void printQuizScore(Student student, ArrayList<Integer> quizScore) {
        System.out.println("Quiz scores of " + student.getName() + " in original order\n " + quizScore);
        quizScore.sort(Comparator.naturalOrder());;
        System.out.println("Quiz scores of " + student.getName() + " in ascending order\n " + quizScore);
    }

    public void printPartTimeStudentNames() {
        for (Student s: partTimeStudentList){
            System.out.println(s.getName());
        }
    }

    // public void printFullTimeStudentScores() {
    //     for (Student s: fullTimeStudentList) {
    //         System.out.println("Exam scores of full time " + s.getName() + " is " + s.getExamScore());
    //     }
    //     // System.out.println("Exam scores of full time " + s.getName() + " is " + s.getScore());
    // }
}

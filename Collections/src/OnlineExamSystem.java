import java.util.*;

class Question {
    String text;
    Question(String t){ text=t; }
    public String toString(){ return text; }
}

class Student {
    String id;
    Student(String id){ this.id=id; }
}

public class OnlineExamSystem {
    public static void main(String[] args) {

        // Unique Students
        Set<String> studentIDs = new HashSet<>();

        studentIDs.add("S1");
        studentIDs.add("S2");
        studentIDs.add("S1"); // duplicate ignored

        // Questions List
        List<Question> questions = new ArrayList<>(List.of(
                new Question("Q1"), new Question("Q2"), new Question("Q3")
        ));
        Collections.shuffle(questions);

        // Queue for students waiting
        Queue<Student> examQueue = new LinkedList<>();
        examQueue.add(new Student("S1"));
        examQueue.add(new Student("S2"));

        // Stack for navigation
        Stack<Question> navStack = new Stack<>();

        System.out.println("Serving students:");
        while (!examQueue.isEmpty()) {
            Student st = examQueue.remove();
            System.out.println(st.id + " is taking exam");
        }

        System.out.println("Navigation using stack:");
        for (Question q : questions) navStack.push(q);
        while (!navStack.isEmpty()) System.out.println(navStack.pop());
    }
}

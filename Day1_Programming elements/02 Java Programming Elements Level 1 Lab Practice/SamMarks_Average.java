public class SamMarks_Average {
    public static void main(String[] args) {
        int MathMarks=94;
        int PhysicsMarks=95;
        int ChemistryMarks=96;

        int obtained_marks = MathMarks+PhysicsMarks+ChemistryMarks;

        int totalmarks_persub= 100;
        int total_sub = 3;

        int total_marks= (totalmarks_persub)*(total_sub);

        float average = (float) obtained_marks/total_marks *100;

        System.out.println("Sams average mark in PCM is "+ average +"%");





    }
}

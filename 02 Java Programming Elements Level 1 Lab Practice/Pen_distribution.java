public class Pen_distribution {
    public static void main(String[] args) {

        int pen = 14;
        int students = 3;

        int pen_division = pen / students;

        int remaining_pen = pen % students;

        System.out.println("The pen per student is "+pen_division+" and the remaining pen not distributed is "+remaining_pen);


    }
}

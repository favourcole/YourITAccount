
import java.util.Scanner;
public class CE003 extends Module {
    private double[] homeworkmarks1 = new double[4];
    private int Exam;

    private static final double ExamWeight = 0.6;
    // we set a variable called ExamWeight to store the corresponding weights of the exam weight that weight is 60% .
    // we set the type to be a double, and we say static final, because this allows us to create a constant value, because
    // once we set the homework weight it can never be changed.
    private static final double CW_Weight = 0.4;
    // we set a variable called CW_Weight to store the corresponding weights of the coursework weight which the coursework
    // consists of the average of 4 homeworks and that weight is 40% .
    // we set the type to be a double, and we say static final, because this allows us to create a constant value, because
    // once we set the homework weight it can never be changed.

    // These are private attributes, because they can only be accessed directly within the module
    // class, so we can prevent other classes from directly accessing and modifying the internal
    // state of the object which can reduce bugs.
    public CE003(String name, int status) {
        super("CE003", 2);
        this.homeworkmarks1 = homeworkmarks1;
        calculatefMark2();
    }
    public double[] getHomeworkMarks1() {
        return homeworkmarks1;
    }
    public double[] setHomeworkMarks1() {
        for (int i=0; i<4; i++){
            System.out.println ("Enter the homework marks");
            Scanner scanner = new Scanner(System.in);
            int hwMark = scanner.nextInt();
            homeworkmarks1[i] = hwMark;
        }
        return homeworkmarks1;}
    public void setExamMark(){
        System.out.println ("Enter the Exam mark");
        Scanner scanner = new Scanner(System.in);
        Exam = scanner.nextInt();
    }
    public double getExamMark() {
        return Exam;
    }
    public void calculatefMark2() {
        double sum = 0;
        for (double homeworkmark : homeworkmarks1) {
            sum += homeworkmark;
        }
        double averagemark = sum / homeworkmarks1.length;
        double fMark = (CW_Weight * averagemark) + (ExamWeight * Exam);
        setfMark((int) fMark);
        setFinalExam((int) sum);
    }
}

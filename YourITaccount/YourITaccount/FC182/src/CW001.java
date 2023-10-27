
import java.util.Scanner;
public class CW001 extends Module{ // inherits it from the superclass Module
    private double[] homeworkmarks1 = new double[3];
    private double finalprojectmark;

    private static final double HWWeight = 0.5;
    // we set a variable called HWWeight to store the corresponding weights of the homework which the coursework consists of the
    // 3 homeworks and that weight is 50%.
    // we set the type to be a double, and we say static final, because this allows us to create a constant value, because
    // once we set the homework weight it can never be changed.
    private static final double ProjectWeight = 0.5;
    // we set a variable called ProjectWeight to store the corresponding weights of the project and that weight is 50%- ~
    // we set the type to be a double, and we say static final, because this allows us to create a constant value, because
    // once we set the homework weight it can never be changed.

    // These are private attributes, because they can only be accessed directly within the module
    // class, so we can prevent other classes from directly accessing and modifying the internal
    // state of the object which can reduce bugs.



    public CW001(String name, int status) {
        super(name, 0); // we say super because it refers to the superclass that's where we inherit the attributes from
        // the module class.  We add the 0 because for the coursework module the status is 0.
        this.homeworkmarks1 = getHomeworkMarks1();
    }
    public double[] getHomeworkMarks1() {
        return homeworkmarks1;
    }
    public double[] setHomeworkMarks1() {
        for (int i=0; i<3; i++){
            System.out.println ("Enter the homework marks");
            Scanner scanner = new Scanner(System.in);
            int hwMark = scanner.nextInt();
            homeworkmarks1[i] = hwMark;
        }
        return homeworkmarks1;
    }
    public double getProjectMark() {
        return finalprojectmark;
    }
    public void setProjectMark() {
        System.out.println ("Enter the Final Project mark");
        Scanner scanner = new Scanner(System.in);
        int projectmark = scanner.nextInt();
        finalprojectmark = projectmark;
    }
    public void calculatefMark1() {
        double sum = 0;
        for (double homeworkmark : homeworkmarks1) {
            sum += homeworkmark;
        }
        double averagehwmark = sum / homeworkmarks1.length;
        double finalmark = (HWWeight * averagehwmark) + (ProjectWeight * finalprojectmark);
        setfMark((int) finalmark);
        setFinalExam((int) sum);
    } }

    // We calculate the final mark for the coursework, since CW001 is based only on the coursework and that coursework
    // consists of three homeworks.

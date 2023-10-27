
import java.util.Scanner;
public class EX002 extends Module { // inherits it from the superclass Module
    public EX002(String name, int status){
        super("EX002", 1); // we say super because it refers to the superclass that's where we inherit the attributes from
        // the module class.  We add the 1 because for the exam module the status is 1.
        this.fMark = 0;
    }
    // We create our constructor with arguments, so we can initialise these attributes as this
    // will allow us to provide setters and getter methods that allow controlled access
    // to the attributes.
    public void setExam2(){
        System.out.println ("Enter the Exam mark");
        Scanner scanner = new Scanner(System.in);
        int Exam = scanner.nextInt();
        fMark = Exam;
        // We provide a setter, so we can modify the private attributes from outside
    }
}



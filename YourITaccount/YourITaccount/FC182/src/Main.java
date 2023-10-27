import java.util.Scanner;
import java.util.Objects;
public class Main {

    /**
     * /
     *
     * @author Favour Cole
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a name for your CW001 module:");
        String nameofCWmodule = input.nextLine();
        System.out.println("Please enter a name for your EX002 module:");
        String nameofExammodule = input.nextLine();
        System.out.println("Please enter a name for your CE003 module:");
        String nameofCombinedmodule = input.nextLine();
        //Get a number of students taking the module (entered by the user)
        System.out.print("The number of students: ");
        int studentcount = input.nextInt();

        // Prints how many students in module
        System.out.println("The number of students in module: " + studentcount);

        // Create an empty array of students to store the relevant information for all studentsobject entered above
        Student[] students = new Student[studentcount];
        CW001[] courseworkModule = new CW001[studentcount];
        EX002[] ExamModule = new EX002[studentcount];
        CE003[] CWandExamModule = new CE003[studentcount];

        for (int y = 0; y < studentcount; y++) {
            System.out.println("Enter the information of student " + (y + 1) + ":");
            System.out.print("Please enter your firstname:");
            String FIRSTNAME = input.next(); // Ask user for first name
            System.out.print("Please enter your surname:");
            String SURNAME = input.next(); // Ask user for the surname
            System.out.print("Please enter your student ID:");
            String ID = input.next(); // Ask user for the ID

            // Create objects for studentsobject
            var student1 = new Student(FIRSTNAME, SURNAME);
            students[y] = student1;
            for (int x = 0; x < 3; x++) {
                System.out.print("Enter status (0,1,2)");
                int status = input.nextInt();
                switch (status) {
                    case 0:
                        courseworkModule[y] = new CW001("CW001", 0);
                        courseworkModule[y].setHomeworkMarks1();
                        courseworkModule[y].setProjectMark();
                        courseworkModule[y].calculatefMark1();
                        break;
                    case 1:
                        ExamModule[y] = new EX002("EX002", 1);
                        ExamModule[y].setExam2();
                        break;
                    case 2:
                        CWandExamModule[y] = new CE003("CE003", 2);
                        CWandExamModule[y].setHomeworkMarks1();
                        CWandExamModule[y].setExamMark();
                        CWandExamModule[y].calculatefMark2();
                        break;
                    default:
                        System.out.println("Invalid status");
                }
            }
        }

        // prompt user to print marks
        System.out.println("Would you like to print the marks for a particular module or for all modules?");
        System.out.println("Enter 1 to print the marks all the modules, or 2 for a single module");
        int choice = input.nextInt();
        input.nextLine(); // clear newline character in input buffer
        String nameofmodule = null;
        if (choice == 1) {
            System.out.println("• Marks for all modules: ");
            System.out.printf("%20s%15s%15s%15s%15s", "Name", "Surname", "CW001", "EX002", "CE003"); // Print a table top row
            System.out.println();
            // Loop through object in each module and prints output
            for (int g = 0; g < studentcount; g++) {
                //Print the student's information and grades
                Student student1 = students[g];
                CW001 coursework = courseworkModule[g];
                EX002 exam = ExamModule[g];
                CE003 cwandexam = CWandExamModule[g];
                for (Student student : students)
                    System.out.printf("%20s%15s%15s%15s%15s", student.getfName(), student.getsName(), coursework.getfMark() + "%", exam.getfMark() + "%", cwandexam.getfMark() + "%");
            }
            System.out.println();
        }
        else {
            System.out.println("Enter the name of the module to print the marks:");
            nameofmodule = input.nextLine();
            if (Objects.equals(nameofmodule, nameofCWmodule)) {
                System.out.println("..........................................................................................................");
                System.out.println("• Marks for CW001: ");
                System.out.printf("%20s%15s%15s%15s%15s", "Name", "Surname", "HWs", "Project", "Final Mark"); // Print a table top row
                System.out.println();
                // Loop through object in each module and prints output
                for (int i = 0; i < studentcount; i++) {
                    //Print the student's information and grades
                    Student student1 = students[i];
                    CW001 coursework = courseworkModule[i];
                    EX002 exam = ExamModule[i];
                    CE003 cwandexam = CWandExamModule[i];
                    for (Student student : students)
                        System.out.printf("%20s%15s%15s%15s%15s", student.getfName(), student.getsName(), coursework.getFinalExam() + "%", coursework.getProjectMark() + "%", coursework.getfMark() + "%");
                    }
                    System.out.println();
                } }
        if(Objects.equals(nameofmodule, nameofExammodule)) {
            System.out.println("..........................................................................................................");
            System.out.println("• Marks for EX002: ");
            System.out.printf("%20s%15s%15s", "Name", "Surname", "Final Mark"); // Print a table top row
            System.out.println();
                    // Loop through object in each module and prints output
            for (int a = 0; a < studentcount; a++) {
                    //Print the student's information and grades
                Student student1 = students[a];
                CW001 coursework = courseworkModule[a];
                EX002 exam = ExamModule[a];
                CE003 cwandexam = CWandExamModule[a];
                for (Student student : students)
                    System.out.printf("%20s%15s%15s", student.getfName(), student.getsName(), exam.getfMark()+"%");
        }
                    System.out.println();
            }
        if(Objects.equals(nameofmodule, nameofExammodule)) {
            System.out.println("..........................................................................................................");
            System.out.println("• Marks for CE003: ");
            System.out.printf("%20s%15s%15s%15s%15s", "Name", "Surname", "CW", "Exam", "Final Mark"); // Print a table top row
            System.out.println();
                // Loop through object in each module and prints output
            for (int l = 0; l < studentcount; l++) {
                //Print the student's information and grades
                Student student1 = students[l];
                CW001 coursework = courseworkModule[l];
                EX002 exam = ExamModule[l];
                CE003 cwandexam = CWandExamModule[l];
                for (Student student : students)
                    System.out.printf("%20s%15s%15s%15s%15s", student.getfName(), student.getsName(), cwandexam.getFinalExam()+"%", cwandexam.getExamMark()+"%", cwandexam.getfMark()+"%");
        }
                System.out.println();

} } }

public abstract class Module {
    private String name;
    // we set a variable called name to store the name of the module and since name is a string
    // we set the type to be a String.
    private int status;
    // we set a variable called status which corresponds to the assessment pattern 0, 1, 2 etc.
    // we set the type to be an integer.

    // These are private attributes, because they can only be accessed directly within the module
    // class, so we can prevent other classes from directly accessing and modifying the internal
    // state of the object which can reduce bugs.
    double fMark;
    // we set a variable called final mark which allows us to store the final mark it could be
    // a decimal value ranging from 0-100 so that's why we use a double type.
    double finalExam;
    // we set a variable called final exam which allows us to store the final exam it could be
    // a decimal value ranging from 0-100 so that's why we use a double type.

    public Module(String name, int status) {
        this.name = name;
        this.status = status;
    }
    // We create our constructor with arguments, so we can initialise these attributes as this
    // will allow us to provide setters and getter methods that allow controlled access to
    // the attributes.
    public void setfMark(int fMark) {
        this.fMark = fMark;
    }

    public void setFinalExam(int finalExam) {
        this.finalExam = finalExam;
    }

// We provide a setter, so we can modify the private attributes from outside the class.
    public String getName() {
        return this.name;
    }
    public int getStatus() {
        return this.status;
    }
    public double getfMark() {
        return this.fMark;
    }
    public double getFinalExam() {
        return this.finalExam;
    }
}

// We provide a getter, so we can access and retrieve the private attributes


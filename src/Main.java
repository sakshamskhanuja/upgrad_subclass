public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Sujit", 2);
        System.out.println(s1.getDetails());

        ResearchStudent s2 = new ResearchStudent("siddharth", 3, "Software Engineering");
        System.out.println(s2.getDetails());

        PhDStudent s3 = new PhDStudent("hari", 1, "Software Engineering",
                "Automated Evaluation");
        System.out.println(s3.getDetails());
    }
}

class Student {

    /**
     * Name of the student.
     */
    private final String name;

    /**
     * How many years the student has covered.
     */
    private int year;

    /**
     * Annual Fees.
     */
    private static final int annualFees = 10000;

    // Parameterized Constructor.
    public Student(String name, int year) {
        this.name = name;
        this.year = year;
    }

    /**
     * @return Information about the Student, i.e., name and fees.
     */
    public String getDetails() {
        return "Name: " + name + "\nFees: " + computeFees();
    }

    /**
     * Computes the fees of the Student.
     */
    public int computeFees() {
        return Student.annualFees * year;
    }
}

class ResearchStudent extends Student {

    /**
     * Research area of the Student.
     */
    private String researchArea;

    // Parameterized Constructor.
    public ResearchStudent(String name, int year, String researchArea) {
        super(name, year);
        this.researchArea = researchArea;
    }
}

class PhDStudent extends ResearchStudent {

    private String thesisTitle;

    public PhDStudent(String name, int year, String researchArea, String thesisTitle) {
        super(name, year, researchArea);
        this.thesisTitle = thesisTitle;
    }
}
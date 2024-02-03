import java.util.HashMap;
import java.util.Map;

public class Student {
    private String firstName;
    private String lastName;
    private Map<String, Double> assignmentToGrade = new HashMap<>();

    public String getFirstName() {
        return firstName;
    }

    public Student setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Student setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Map<String, Double> getAssignmentToGrade() {
        return assignmentToGrade;
    }

    public Student setAssignmentToGrade(Map<String, Double> assignmentToGrade) {
        this.assignmentToGrade = assignmentToGrade;
        return this;
    }
}

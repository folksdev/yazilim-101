package workshop.oop.inheratance;

public class MathTeacher extends Teacher {

    private String mathType;

    public MathTeacher(String mathType) {
        this.mathType = mathType;
    }

    public MathTeacher(String name, Integer age, String mathType) {
        super(name, age);
        this.mathType = mathType;
    }

    public String getMathType() {
        return mathType;
    }

    public void setMathType(String mathType) {
        this.mathType = mathType;
    }

    @Override
    public String toString() {
        return "MathTeacher{" +
                "mathType='" + mathType + '\'' +
                "teacher=" + super.toString() +
                '}';
    }
}

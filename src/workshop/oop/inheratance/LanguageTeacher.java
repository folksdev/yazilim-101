package workshop.oop.inheratance;

public class LanguageTeacher extends Teacher {

    private boolean foreign;

    public LanguageTeacher(boolean foreign) {
        this.foreign = foreign;
    }

    public LanguageTeacher(String name, Integer age, boolean foreign) {
        super(name, age);
        this.foreign = foreign;
    }

    public boolean isForeign() {
        return foreign;
    }

    public void setForeign(boolean foreign) {
        this.foreign = foreign;
    }

    @Override
    public String toString() {
        return "LanguageTeacher{" +
                "foreign=" + foreign +
                "teacher=" + super.toString() +
                '}';
    }
}

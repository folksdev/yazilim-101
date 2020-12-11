package workshop.oop.inheratance;

public class GermanTeacher extends LanguageTeacher{

    public GermanTeacher(boolean foreign) {
        super(foreign);
    }

    public GermanTeacher(String name, Integer age, boolean foreign) {
        super(name, age, foreign);
    }
}

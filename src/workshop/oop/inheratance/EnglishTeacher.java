package workshop.oop.inheratance;

public class EnglishTeacher extends LanguageTeacher {

    private boolean nativeSpeaker;

    public EnglishTeacher(boolean foreign, boolean nativeSpeaker) {
        super(foreign);
        this.nativeSpeaker = nativeSpeaker;
    }

    public EnglishTeacher(String name, Integer age, boolean foreign, boolean nativeSpeaker) {
        super(name, age, foreign);
        this.nativeSpeaker = nativeSpeaker;
    }

    public boolean isNativeSpeaker() {
        return nativeSpeaker;
    }

    public void setNativeSpeaker(boolean nativeSpeaker) {
        this.nativeSpeaker = nativeSpeaker;
    }

    @Override
    public String toString() {
        return "EnglishTeacher{" +
                "nativeSpeaker=" + nativeSpeaker +
                "languageTeacher=" + super.toString() +
                '}';
    }
}

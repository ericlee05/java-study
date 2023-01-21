package replace_conditional_with_polymorphism;

public class LocalPerson extends Person {
    public LocalPerson(String country, String name, String job, Integer age) {
        super(country, name, job, age);
    }

    @Override
    public boolean immigration() {
        return true; // 내국인은 무조건 통과
    }
}

package replace_conditional_with_polymorphism;

public class ForeignPerson extends Person {
    public ForeignPerson(String country, String name, String job, Integer age) {
        super(country, name, job, age);
    }

    @Override
    public boolean immigration() {
        return (Math.random() <= 0.5); // 입국심사는 확률게임입니다. (?)
    }
}

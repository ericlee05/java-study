package replace_conditional_with_polymorphism;

public abstract class Person {
    public Person(String country, String name, String job, Integer age) {
        this.country = country;
        this.name = name;
        this.job = job;
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public Integer getAge() {
        return age;
    }

    private final String country;
    private final String name;
    private final String job;
    private final Integer age;

    public abstract boolean immigration();
}

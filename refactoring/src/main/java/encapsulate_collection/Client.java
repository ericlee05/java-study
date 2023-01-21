package encapsulate_collection;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        Person person = new Person();
        person.initializeJobs(new ArrayList<String>());

        System.out.printf("Before adding jobs: %s\n", person.getJobs());

        person.addJob("작가");
        person.addJob("사진작가");
        person.addJob("개발자");
        person.addJob("여우!");

        System.out.printf("After adding jobs: %s\n", person.getJobs());

        person.removeJob("여우!");

        System.out.printf("After removing job '여우!': %s\n", person.getJobs());
    }
}

package encapsulate_collection;

import java.util.Collections;
import java.util.List;

public class Person {
    private List<String> jobs;

    public List<String> getJobs() {
        return Collections.unmodifiableList(jobs); // Prevent to modify
    }

    public void addJob(String job) {
        jobs.add(job);
    }

    public void removeJob(String job) {
        jobs.removeIf(it -> it.equals(job));
    }

    public void initializeJobs(List<String> jobs) {
        this.jobs = jobs;
    }
}

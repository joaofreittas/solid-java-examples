package I.badcase;

public interface JobService {

    void saveJob(Object job);

    void updateJob(Object job);

    void deleteJob(Object job);

    void sendJob(Object job);

    void receiveJob(Object job);

    void runJob(Object job);

}

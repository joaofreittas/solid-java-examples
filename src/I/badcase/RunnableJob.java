package I.badcase;

public class RunnableJob implements JobService {

    @Override
    public void saveJob(Object job) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void updateJob(Object job) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteJob(Object job) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void sendJob(Object job) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void receiveJob(Object job) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void runJob(Object job) {
        System.out.println("Run job");
    }

}

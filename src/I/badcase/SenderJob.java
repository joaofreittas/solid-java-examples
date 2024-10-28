package I.badcase;

public class SenderJob implements JobService {

    @Override
    public void saveJob(final Object job) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void updateJob(final Object job) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteJob(final Object job) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void sendJob(final Object job) {
        System.out.println("Send job");
    }

    @Override
    public void receiveJob(final Object job) {
        System.out.println("Send job");
    }

    @Override
    public void runJob(final Object job) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}

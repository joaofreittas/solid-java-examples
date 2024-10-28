package I.badcase;

public class CrudJob implements JobService {

    @Override
    public void saveJob(final Object job) {
        System.out.println("Save job");
    }

    @Override
    public void updateJob(final Object job) {
        System.out.println("Update job");
    }

    @Override
    public void deleteJob(final Object job) {
        System.out.println("Delete job");
    }

    @Override
    public void sendJob(final Object job) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void receiveJob(final Object job) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void runJob(final Object job) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}

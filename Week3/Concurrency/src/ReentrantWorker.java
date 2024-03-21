import java.util.concurrent.locks.ReentrantLock;

public class ReentrantWorker {
    private final ReentrantLock lock = new ReentrantLock();
    public void performWork() {
        lock.lock(); // First lock
        try {
            performSubTask();
        } finally {
            lock.unlock(); // Unlocking for the first lock
        }
    }
    public void performSubTask() {
        lock.lock(); // Second lock (reentry)
        try {
            System.out.println(Thread.currentThread().getName() + ": Second level of locking");
        } finally {
            lock.unlock(); // Unlocking for the second lock
        }}
    }


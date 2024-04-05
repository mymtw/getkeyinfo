package p145io.reactivex.internal.schedulers;

import p736cq.C18981a;

/* renamed from: io.reactivex.internal.schedulers.ScheduledDirectPeriodicTask */
public final class ScheduledDirectPeriodicTask extends AbstractDirectTask implements Runnable {
    private static final long serialVersionUID = 1811839108042568751L;

    public ScheduledDirectPeriodicTask(Runnable runnable) {
        super(runnable);
    }

    public /* bridge */ /* synthetic */ Runnable getWrappedRunnable() {
        return super.getWrappedRunnable();
    }

    public void run() {
        this.runner = Thread.currentThread();
        try {
            this.runnable.run();
            this.runner = null;
        } catch (Throwable th) {
            this.runner = null;
            lazySet(AbstractDirectTask.FINISHED);
            C18981a.m32123b(th);
        }
    }
}

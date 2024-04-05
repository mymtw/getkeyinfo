package p145io.reactivex.internal.schedulers;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.EmptyDisposable;
import p248tp.C8050c;
import p248tp.C8066r;

/* renamed from: io.reactivex.internal.schedulers.SchedulerWhen */
public final class SchedulerWhen extends C8066r implements Disposable {

    /* renamed from: d */
    public static final C19216b f42962d = new C19216b();

    /* renamed from: e */
    public static final EmptyDisposable f42963e = EmptyDisposable.INSTANCE;

    /* renamed from: io.reactivex.internal.schedulers.SchedulerWhen$DelayedAction */
    public static class DelayedAction extends ScheduledAction {
        private final Runnable action;
        private final long delayTime;
        private final TimeUnit unit;

        public DelayedAction(Runnable runnable, long j, TimeUnit timeUnit) {
            this.action = runnable;
            this.delayTime = j;
            this.unit = timeUnit;
        }

        public Disposable callActual(C8066r.C8069c cVar, C8050c cVar2) {
            return cVar.mo20653b(new C19215a(this.action, cVar2), this.delayTime, this.unit);
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.SchedulerWhen$ImmediateAction */
    public static class ImmediateAction extends ScheduledAction {
        private final Runnable action;

        public ImmediateAction(Runnable runnable) {
            this.action = runnable;
        }

        public Disposable callActual(C8066r.C8069c cVar, C8050c cVar2) {
            return cVar.mo20652a(new C19215a(this.action, cVar2));
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.SchedulerWhen$ScheduledAction */
    public static abstract class ScheduledAction extends AtomicReference<Disposable> implements Disposable {
        public ScheduledAction() {
            super(SchedulerWhen.f42962d);
        }

        public void call(C8066r.C8069c cVar, C8050c cVar2) {
            C19216b bVar;
            Disposable disposable = (Disposable) get();
            if (disposable != SchedulerWhen.f42963e && disposable == (bVar = SchedulerWhen.f42962d)) {
                Disposable callActual = callActual(cVar, cVar2);
                if (!compareAndSet(bVar, callActual)) {
                    callActual.dispose();
                }
            }
        }

        public abstract Disposable callActual(C8066r.C8069c cVar, C8050c cVar2);

        public void dispose() {
            Disposable disposable;
            EmptyDisposable emptyDisposable = SchedulerWhen.f42963e;
            do {
                disposable = (Disposable) get();
                if (disposable == SchedulerWhen.f42963e) {
                    return;
                }
            } while (!compareAndSet(disposable, emptyDisposable));
            if (disposable != SchedulerWhen.f42962d) {
                disposable.dispose();
            }
        }

        public boolean isDisposed() {
            return ((Disposable) get()).isDisposed();
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.SchedulerWhen$a */
    public static class C19215a implements Runnable {

        /* renamed from: b */
        public final C8050c f42964b;

        /* renamed from: c */
        public final Runnable f42965c;

        public C19215a(Runnable runnable, C8050c cVar) {
            this.f42965c = runnable;
            this.f42964b = cVar;
        }

        public final void run() {
            try {
                this.f42965c.run();
            } finally {
                this.f42964b.onComplete();
            }
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.SchedulerWhen$b */
    public static final class C19216b implements Disposable {
        public final void dispose() {
        }

        public final boolean isDisposed() {
            return false;
        }
    }
}

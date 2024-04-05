package kotlinx.coroutines.rx2;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.rx2.DispatcherScheduler;
import p753kq.C19857l;

public final class DispatcherScheduler$DispatcherWorker$schedule$1 extends Lambda implements C19857l<C19857l<? super C19340c<? super C19394m>, ? extends Object>, Runnable> {
    public final /* synthetic */ DispatcherScheduler.DispatcherWorker this$0;

    /* renamed from: kotlinx.coroutines.rx2.DispatcherScheduler$DispatcherWorker$schedule$1$a */
    public static final class C19783a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ DispatcherScheduler.DispatcherWorker f43747b;

        /* renamed from: c */
        public final /* synthetic */ C19857l f43748c;

        public C19783a(DispatcherScheduler.DispatcherWorker dispatcherWorker, C19857l lVar) {
            this.f43747b = dispatcherWorker;
            this.f43748c = lVar;
        }

        public final void run() {
            this.f43747b.getClass();
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DispatcherScheduler$DispatcherWorker$schedule$1(DispatcherScheduler.DispatcherWorker dispatcherWorker) {
        super(1);
        this.this$0 = dispatcherWorker;
    }

    public final Runnable invoke(C19857l<? super C19340c<? super C19394m>, ? extends Object> lVar) {
        return new C19783a(this.this$0, lVar);
    }
}

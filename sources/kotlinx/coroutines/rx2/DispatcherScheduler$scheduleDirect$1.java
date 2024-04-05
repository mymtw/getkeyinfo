package kotlinx.coroutines.rx2;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import p753kq.C19857l;

public final class DispatcherScheduler$scheduleDirect$1 extends Lambda implements C19857l<C19857l<? super C19340c<? super C19394m>, ? extends Object>, Runnable> {
    public final /* synthetic */ DispatcherScheduler this$0;

    /* renamed from: kotlinx.coroutines.rx2.DispatcherScheduler$scheduleDirect$1$a */
    public static final class C19784a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ DispatcherScheduler f43749b;

        /* renamed from: c */
        public final /* synthetic */ C19857l f43750c;

        public C19784a(DispatcherScheduler dispatcherScheduler, C19857l lVar) {
            this.f43749b = dispatcherScheduler;
            this.f43750c = lVar;
        }

        public final void run() {
            DispatcherScheduler dispatcherScheduler = this.f43749b;
            AtomicLongFieldUpdater atomicLongFieldUpdater = DispatcherScheduler.f43743d;
            dispatcherScheduler.getClass();
            C19697g.m33468f((C19525d0) null, (CoroutineContext) null, (CoroutineStart) null, new DispatcherScheduler$scheduleDirect$1$1$1(this.f43750c, (C19340c<? super DispatcherScheduler$scheduleDirect$1$1$1>) null), 3);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DispatcherScheduler$scheduleDirect$1(DispatcherScheduler dispatcherScheduler) {
        super(1);
        this.this$0 = dispatcherScheduler;
    }

    public final Runnable invoke(C19857l<? super C19340c<? super C19394m>, ? extends Object> lVar) {
        return new C19784a(this.this$0, lVar);
    }
}

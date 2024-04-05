package p145io.reactivex.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import p248tp.C8066r;

/* renamed from: io.reactivex.internal.schedulers.d */
public final class C19226d extends C8066r {

    /* renamed from: e */
    public static final RxThreadFactory f43004e = new RxThreadFactory("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* renamed from: d */
    public final ThreadFactory f43005d = f43004e;

    /* renamed from: b */
    public final C8066r.C8069c mo20646b() {
        return new C19227e(this.f43005d);
    }
}

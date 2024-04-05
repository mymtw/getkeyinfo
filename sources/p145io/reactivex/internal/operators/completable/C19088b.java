package p145io.reactivex.internal.operators.completable;

import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.C7092b;
import p145io.reactivex.disposables.Disposable;
import p248tp.C8048a;
import p248tp.C8050c;
import p287xp.C8333a;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.completable.b */
public final class C19088b extends C8048a {

    /* renamed from: b */
    public final C8333a f42608b;

    public C19088b(C8333a aVar) {
        this.f42608b = aVar;
    }

    /* renamed from: d */
    public final void mo20609d(C8050c cVar) {
        Disposable a = C7092b.m13750a();
        cVar.onSubscribe(a);
        try {
            this.f42608b.run();
            if (!a.isDisposed()) {
                cVar.onComplete();
            }
        } catch (Throwable th) {
            C19421p.m32940h0(th);
            if (!a.isDisposed()) {
                cVar.onError(th);
            } else {
                C18981a.m32123b(th);
            }
        }
    }
}

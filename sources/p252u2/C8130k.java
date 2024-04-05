package p252u2;

import androidx.work.C3422l;
import androidx.work.impl.utils.futures.C3419a;
import com.google.common.util.concurrent.C16388l;

/* renamed from: u2.k */
public final class C8130k implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C16388l f17770b;

    /* renamed from: c */
    public final /* synthetic */ C3419a f17771c;

    /* renamed from: d */
    public final /* synthetic */ C8132m f17772d;

    public C8130k(C8132m mVar, C3419a aVar, C3419a aVar2) {
        this.f17772d = mVar;
        this.f17770b = aVar;
        this.f17771c = aVar2;
    }

    public final void run() {
        try {
            this.f17770b.get();
            C3422l.m8213c().mo12926a(C8132m.f17776t, String.format("Starting work for %s", new Object[]{this.f17772d.f17780e.f9646c}), new Throwable[0]);
            C8132m mVar = this.f17772d;
            mVar.f17793r = mVar.f17781f.mo12813f();
            this.f17771c.mo12919k(this.f17772d.f17793r);
        } catch (Throwable th) {
            this.f17771c.mo12918j(th);
        }
    }
}

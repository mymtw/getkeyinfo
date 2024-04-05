package p262v2;

import androidx.work.C3422l;
import p034c3.C4391o;

/* renamed from: v2.a */
public final class C8197a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C4391o f17973b;

    /* renamed from: c */
    public final /* synthetic */ C8198b f17974c;

    public C8197a(C8198b bVar, C4391o oVar) {
        this.f17974c = bVar;
        this.f17973b = oVar;
    }

    public final void run() {
        C3422l.m8213c().mo12926a(C8198b.f17975d, String.format("Scheduling work %s", new Object[]{this.f17973b.f9644a}), new Throwable[0]);
        this.f17974c.f17976a.mo20723c(this.f17973b);
    }
}

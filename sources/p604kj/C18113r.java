package p604kj;

import java.util.concurrent.ScheduledFuture;
import p605kk.C18119c;
import p605kk.C18123g;

/* renamed from: kj.r */
public final /* synthetic */ class C18113r implements C18119c {

    /* renamed from: b */
    public final /* synthetic */ C18096a f39555b;

    /* renamed from: c */
    public final /* synthetic */ String f39556c;

    /* renamed from: d */
    public final /* synthetic */ ScheduledFuture f39557d;

    public /* synthetic */ C18113r(C18096a aVar, String str, ScheduledFuture scheduledFuture) {
        this.f39555b = aVar;
        this.f39556c = str;
        this.f39557d = scheduledFuture;
    }

    public final void onComplete(C18123g gVar) {
        C18096a aVar = this.f39555b;
        String str = this.f39556c;
        ScheduledFuture scheduledFuture = this.f39557d;
        synchronized (aVar.f39510a) {
            aVar.f39510a.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}

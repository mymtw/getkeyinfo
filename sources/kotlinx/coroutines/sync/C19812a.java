package kotlinx.coroutines.sync;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import kotlin.C19394m;
import kotlinx.coroutines.C19705i;
import kotlinx.coroutines.internal.C19734r;

/* renamed from: kotlinx.coroutines.sync.a */
public final class C19812a extends C19705i {

    /* renamed from: b */
    public final C19819g f43804b;

    /* renamed from: c */
    public final int f43805c;

    public C19812a(C19819g gVar, int i) {
        this.f43804b = gVar;
        this.f43805c = i;
    }

    /* renamed from: a */
    public final void mo72155a(Throwable th) {
        C19819g gVar = this.f43804b;
        int i = this.f43805c;
        gVar.getClass();
        gVar.f43820e.set(i, C19818f.f43818e);
        if (C19734r.f43684d.incrementAndGet(gVar) == C19818f.f43819f && !gVar.mo72449c()) {
            gVar.mo72450d();
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo72155a((Throwable) obj);
        return C19394m.f43287a;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("CancelSemaphoreAcquisitionHandler[");
        h.append(this.f43804b);
        h.append(", ");
        return C0073e.m208h(h, this.f43805c, ']');
    }
}

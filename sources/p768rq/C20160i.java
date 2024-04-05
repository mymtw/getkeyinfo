package p768rq;

import android.support.p013v4.media.C0072d;
import kotlinx.coroutines.C19543e0;

/* renamed from: rq.i */
public final class C20160i extends C20157f {

    /* renamed from: d */
    public final Runnable f44641d;

    public C20160i(Runnable runnable, long j, C20158g gVar) {
        super(j, gVar);
        this.f44641d = runnable;
    }

    public final void run() {
        try {
            this.f44641d.run();
        } finally {
            this.f44639c.mo74403a();
        }
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("Task[");
        h.append(this.f44641d.getClass().getSimpleName());
        h.append('@');
        h.append(C19543e0.m33300R(this.f44641d));
        h.append(", ");
        h.append(this.f44638b);
        h.append(", ");
        h.append(this.f44639c);
        h.append(']');
        return h.toString();
    }
}

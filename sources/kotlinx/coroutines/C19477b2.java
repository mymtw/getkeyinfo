package kotlinx.coroutines;

import kotlin.coroutines.C19340c;
import kotlinx.coroutines.internal.C19733q;
import p003a2.C0015b;

/* renamed from: kotlinx.coroutines.b2 */
public final class C19477b2<U, T extends U> extends C19733q<T> implements Runnable {

    /* renamed from: e */
    public final long f43412e;

    public C19477b2(long j, C19340c<? super U> cVar) {
        super(cVar, cVar.getContext());
        this.f43412e = j;
    }

    /* renamed from: p0 */
    public final String mo72099p0() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.mo72099p0());
        sb.append("(timeMillis=");
        return C0015b.m91j(sb, this.f43412e, ')');
    }

    public final void run() {
        long j = this.f43412e;
        mo72508K(new TimeoutCancellationException("Timed out waiting for " + j + " ms", this));
    }
}

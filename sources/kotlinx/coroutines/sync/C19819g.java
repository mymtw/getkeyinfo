package kotlinx.coroutines.sync;

import android.support.p013v4.media.C0072d;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.internal.C19734r;

/* renamed from: kotlinx.coroutines.sync.g */
public final class C19819g extends C19734r<C19819g> {

    /* renamed from: e */
    public /* synthetic */ AtomicReferenceArray f43820e = new AtomicReferenceArray(C19818f.f43819f);

    public C19819g(long j, C19819g gVar, int i) {
        super(j, gVar, i);
    }

    /* renamed from: f */
    public final int mo72479f() {
        return C19818f.f43819f;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SemaphoreSegment[id=");
        h.append(this.f43685c);
        h.append(", hashCode=");
        h.append(hashCode());
        h.append(']');
        return h.toString();
    }
}

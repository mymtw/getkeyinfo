package p027b8;

import p305z7.C8462e;

/* renamed from: b8.k */
public final class C3501k implements C3504n<long[]> {
    /* renamed from: a */
    public final void mo12997a(Object obj, Appendable appendable, C8462e eVar) {
        eVar.getClass();
        appendable.append('[');
        boolean z = false;
        for (long j : (long[]) obj) {
            if (z) {
                appendable.append(',');
            } else {
                z = true;
            }
            appendable.append(Long.toString(j));
        }
        appendable.append(']');
    }
}

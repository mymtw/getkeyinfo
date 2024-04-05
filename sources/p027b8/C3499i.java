package p027b8;

import p305z7.C8462e;

/* renamed from: b8.i */
public final class C3499i implements C3504n<int[]> {
    /* renamed from: a */
    public final void mo12997a(Object obj, Appendable appendable, C8462e eVar) {
        eVar.getClass();
        appendable.append('[');
        boolean z = false;
        for (int i : (int[]) obj) {
            if (z) {
                appendable.append(',');
            } else {
                z = true;
            }
            appendable.append(Integer.toString(i));
        }
        appendable.append(']');
    }
}

package p027b8;

import p305z7.C8462e;

/* renamed from: b8.c */
public final class C3484c implements C3504n<boolean[]> {
    /* renamed from: a */
    public final void mo12997a(Object obj, Appendable appendable, C8462e eVar) {
        eVar.getClass();
        appendable.append('[');
        boolean z = false;
        for (boolean z2 : (boolean[]) obj) {
            if (z) {
                appendable.append(',');
            } else {
                z = true;
            }
            appendable.append(Boolean.toString(z2));
        }
        appendable.append(']');
    }
}

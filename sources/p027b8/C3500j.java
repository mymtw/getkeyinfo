package p027b8;

import p305z7.C8462e;

/* renamed from: b8.j */
public final class C3500j implements C3504n<short[]> {
    /* renamed from: a */
    public final void mo12997a(Object obj, Appendable appendable, C8462e eVar) {
        eVar.getClass();
        appendable.append('[');
        boolean z = false;
        for (short s : (short[]) obj) {
            if (z) {
                appendable.append(',');
            } else {
                z = true;
            }
            appendable.append(Short.toString(s));
        }
        appendable.append(']');
    }
}

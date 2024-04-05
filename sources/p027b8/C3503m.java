package p027b8;

import p305z7.C8462e;

/* renamed from: b8.m */
public final class C3503m implements C3504n<double[]> {
    /* renamed from: a */
    public final void mo12997a(Object obj, Appendable appendable, C8462e eVar) {
        eVar.getClass();
        appendable.append('[');
        boolean z = false;
        for (double d : (double[]) obj) {
            if (z) {
                appendable.append(',');
            } else {
                z = true;
            }
            appendable.append(Double.toString(d));
        }
        appendable.append(']');
    }
}

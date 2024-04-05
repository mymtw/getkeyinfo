package p027b8;

import p305z7.C8462e;

/* renamed from: b8.l */
public final class C3502l implements C3504n<float[]> {
    /* renamed from: a */
    public final void mo12997a(Object obj, Appendable appendable, C8462e eVar) {
        eVar.getClass();
        appendable.append('[');
        boolean z = false;
        for (float f : (float[]) obj) {
            if (z) {
                appendable.append(',');
            } else {
                z = true;
            }
            appendable.append(Float.toString(f));
        }
        appendable.append(']');
    }
}

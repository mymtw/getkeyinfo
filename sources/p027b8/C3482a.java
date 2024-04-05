package p027b8;

import p305z7.C8462e;
import p305z7.C8465g;

/* renamed from: b8.a */
public final class C3482a implements C3504n<Object> {
    /* renamed from: a */
    public final <E> void mo12997a(E e, Appendable appendable, C8462e eVar) {
        eVar.getClass();
        appendable.append('[');
        boolean z = false;
        for (Object obj : (Object[]) e) {
            if (z) {
                appendable.append(',');
            } else {
                z = true;
            }
            C8465g.m16900a(obj, appendable, eVar);
        }
        appendable.append(']');
    }
}

package p197o4;

import java.util.ArrayDeque;
import p036c5.C4422i;
import p197o4.C7586m;

/* renamed from: o4.l */
public final class C7585l extends C4422i<C7586m.C7587a<Object>, Object> {
    public C7585l() {
        super(500);
    }

    /* renamed from: c */
    public final void mo14375c(Object obj, Object obj2) {
        C7586m.C7587a aVar = (C7586m.C7587a) obj;
        aVar.getClass();
        ArrayDeque arrayDeque = C7586m.C7587a.f16849d;
        synchronized (arrayDeque) {
            arrayDeque.offer(aVar);
        }
    }
}

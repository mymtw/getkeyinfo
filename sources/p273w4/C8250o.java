package p273w4;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import p036c5.C4426l;
import p302z4.C8448i;

/* renamed from: w4.o */
public final class C8250o implements C8240i {

    /* renamed from: b */
    public final Set<C8448i<?>> f18085b = Collections.newSetFromMap(new WeakHashMap());

    public final void onDestroy() {
        Iterator it = C4426l.m10131e(this.f18085b).iterator();
        while (it.hasNext()) {
            ((C8448i) it.next()).onDestroy();
        }
    }

    public final void onStart() {
        Iterator it = C4426l.m10131e(this.f18085b).iterator();
        while (it.hasNext()) {
            ((C8448i) it.next()).onStart();
        }
    }

    public final void onStop() {
        Iterator it = C4426l.m10131e(this.f18085b).iterator();
        while (it.hasNext()) {
            ((C8448i) it.next()).onStop();
        }
    }
}

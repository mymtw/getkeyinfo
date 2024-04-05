package androidx.compose.foundation.lazy.layout;

import androidx.compose.p015ui.layout.C1698n0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.foundation.lazy.layout.e */
public final class C0842e implements C1698n0 {

    /* renamed from: b */
    public final C0839c f1806b;

    /* renamed from: c */
    public final LinkedHashMap f1807c = new LinkedHashMap();

    public C0842e(C0839c cVar) {
        C19383o.m32797g(cVar, "factory");
        this.f1806b = cVar;
    }

    /* renamed from: a */
    public final void mo12a(C1698n0.C1699a aVar) {
        C19383o.m32797g(aVar, "slotIds");
        this.f1807c.clear();
        Iterator<Object> it = aVar.iterator();
        while (it.hasNext()) {
            Object b = this.f1806b.mo4385b(it.next());
            Integer num = (Integer) this.f1807c.get(b);
            int intValue = num != null ? num.intValue() : 0;
            if (intValue == 7) {
                it.remove();
            } else {
                this.f1807c.put(b, Integer.valueOf(intValue + 1));
            }
        }
    }

    /* renamed from: g */
    public final boolean mo18g(Object obj, Object obj2) {
        return C19383o.m32792b(this.f1806b.mo4385b(obj), this.f1806b.mo4385b(obj2));
    }
}

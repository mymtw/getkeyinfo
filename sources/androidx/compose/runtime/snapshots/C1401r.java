package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p755lq.C19878d;

/* renamed from: androidx.compose.runtime.snapshots.r */
public final class C1401r implements Map.Entry<Object, Object>, C19878d.C19879a {

    /* renamed from: b */
    public final Object f3048b;

    /* renamed from: c */
    public Object f3049c;

    /* renamed from: d */
    public final /* synthetic */ C1402s<Object, Object> f3050d;

    public C1401r(C1402s<Object, Object> sVar) {
        this.f3050d = sVar;
        Map.Entry<? extends K, ? extends V> entry = sVar.f3054e;
        C19383o.m32794d(entry);
        this.f3048b = entry.getKey();
        Map.Entry<? extends K, ? extends V> entry2 = sVar.f3054e;
        C19383o.m32794d(entry2);
        this.f3049c = entry2.getValue();
    }

    public final Object getKey() {
        return this.f3048b;
    }

    public final Object getValue() {
        return this.f3049c;
    }

    public final Object setValue(Object obj) {
        C1402s<Object, Object> sVar = this.f3050d;
        if (sVar.f3051b.mo6035a().f3043d == sVar.f3053d) {
            Object obj2 = this.f3049c;
            sVar.f3051b.put(this.f3048b, obj);
            this.f3049c = obj;
            return obj2;
        }
        throw new ConcurrentModificationException();
    }
}

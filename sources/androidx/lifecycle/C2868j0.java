package androidx.lifecycle;

import androidx.compose.foundation.layout.C0761x;
import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2870k0;
import kotlin.C19285c;
import kotlin.jvm.internal.C19379k;
import kotlin.reflect.C19400c;
import p753kq.C19846a;

/* renamed from: androidx.lifecycle.j0 */
public final class C2868j0<VM extends C2866i0> implements C19285c<VM> {

    /* renamed from: b */
    public final C19400c<VM> f6506b;

    /* renamed from: c */
    public final C19846a<C2878l0> f6507c;

    /* renamed from: d */
    public final C19846a<C2870k0.C2872b> f6508d;

    /* renamed from: e */
    public VM f6509e;

    public C2868j0(C19379k kVar, C19846a aVar, C19846a aVar2) {
        this.f6506b = kVar;
        this.f6507c = aVar;
        this.f6508d = aVar2;
    }

    public final Object getValue() {
        VM vm = this.f6509e;
        if (vm != null) {
            return vm;
        }
        VM a = new C2870k0(this.f6507c.invoke(), this.f6508d.invoke()).mo10829a(C0761x.m1713c0(this.f6506b));
        this.f6509e = a;
        return a;
    }
}

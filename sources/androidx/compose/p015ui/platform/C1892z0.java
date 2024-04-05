package androidx.compose.p015ui.platform;

import androidx.compose.p015ui.node.C1752q;
import androidx.compose.p015ui.semantics.C1901h;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.platform.z0 */
public final class C1892z0 implements C1752q {

    /* renamed from: b */
    public final int f4171b;

    /* renamed from: c */
    public final List<C1892z0> f4172c;

    /* renamed from: d */
    public Float f4173d = null;

    /* renamed from: e */
    public Float f4174e = null;

    /* renamed from: f */
    public C1901h f4175f = null;

    /* renamed from: g */
    public C1901h f4176g = null;

    public C1892z0(int i, ArrayList arrayList) {
        C19383o.m32797g(arrayList, "allScopes");
        this.f4171b = i;
        this.f4172c = arrayList;
    }

    public final boolean isValid() {
        return this.f4172c.contains(this);
    }
}

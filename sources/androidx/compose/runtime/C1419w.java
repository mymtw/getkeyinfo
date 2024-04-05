package androidx.compose.runtime;

import androidx.compose.runtime.tooling.C1414b;
import java.util.Iterator;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p755lq.C19875a;

/* renamed from: androidx.compose.runtime.w */
public final class C1419w implements C1414b, Iterable<C1414b>, C19875a {

    /* renamed from: b */
    public final /* synthetic */ C1421x f3085b;

    /* renamed from: c */
    public final /* synthetic */ int f3086c;

    public C1419w(C1421x xVar, int i) {
        this.f3085b = xVar;
        this.f3086c = i;
    }

    /* renamed from: a */
    public final String mo6102a() {
        int i;
        if (C0005b.m65v(this.f3086c, this.f3085b.f3089b.f2820b)) {
            C1301c1 c1Var = this.f3085b.f3089b;
            Object[] objArr = c1Var.f2822d;
            int[] iArr = c1Var.f2820b;
            int i2 = this.f3086c * 5;
            if (i2 >= iArr.length) {
                i = iArr.length;
            } else {
                i = C0005b.m27U(iArr[i2 + 1] >> 29) + iArr[i2 + 4];
            }
            Object obj = objArr[i];
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final Object mo6103c() {
        if (!C0005b.m68y(this.f3086c, this.f3085b.f3089b.f2820b)) {
            return null;
        }
        C1301c1 c1Var = this.f3085b.f3089b;
        return c1Var.f2822d[c1Var.f2820b[(this.f3086c * 5) + 4]];
    }

    /* renamed from: e */
    public final Iterable<C1414b> mo5644e() {
        return this;
    }

    /* renamed from: g */
    public final Object mo6104g() {
        this.f3085b.mo6109a();
        C1301c1 c1Var = this.f3085b.f3089b;
        int i = this.f3086c;
        C1298b1 n = c1Var.mo5648n();
        try {
            return n.mo5623a(i);
        } finally {
            n.mo5624b();
        }
    }

    public final C1352o getData() {
        return new C1352o(this.f3085b.f3089b, this.f3086c);
    }

    public final Object getKey() {
        if (!C0005b.m66w(this.f3086c, this.f3085b.f3089b.f2820b)) {
            return Integer.valueOf(this.f3085b.f3089b.f2820b[this.f3086c * 5]);
        }
        C1301c1 c1Var = this.f3085b.f3089b;
        Object obj = c1Var.f2822d[C0005b.m9C(this.f3086c, c1Var.f2820b)];
        C19383o.m32794d(obj);
        return obj;
    }

    public final Iterator<C1414b> iterator() {
        this.f3085b.mo6109a();
        C1301c1 c1Var = this.f3085b.f3089b;
        int i = this.f3086c;
        return new C1421x(i + 1, C0005b.m63u(i, c1Var.f2820b) + i, c1Var);
    }
}

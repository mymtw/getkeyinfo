package androidx.compose.runtime;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import androidx.compose.runtime.C1302d;
import java.util.ArrayList;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;

/* renamed from: androidx.compose.runtime.b1 */
public final class C1298b1 {

    /* renamed from: a */
    public final C1301c1 f2805a;

    /* renamed from: b */
    public final int[] f2806b;

    /* renamed from: c */
    public final int f2807c;

    /* renamed from: d */
    public final Object[] f2808d;

    /* renamed from: e */
    public final int f2809e;

    /* renamed from: f */
    public int f2810f;

    /* renamed from: g */
    public int f2811g;

    /* renamed from: h */
    public int f2812h = -1;

    /* renamed from: i */
    public int f2813i;

    /* renamed from: j */
    public int f2814j;

    /* renamed from: k */
    public int f2815k;

    public C1298b1(C1301c1 c1Var) {
        C19383o.m32797g(c1Var, "table");
        this.f2805a = c1Var;
        this.f2806b = c1Var.f2820b;
        int i = c1Var.f2821c;
        this.f2807c = i;
        this.f2808d = c1Var.f2822d;
        this.f2809e = c1Var.f2823e;
        this.f2811g = i;
    }

    /* renamed from: a */
    public final C1296b mo5623a(int i) {
        ArrayList<C1296b> arrayList = this.f2805a.f2827i;
        int n0 = C0005b.m51n0(arrayList, i, this.f2807c);
        if (n0 < 0) {
            C1296b bVar = new C1296b(i);
            arrayList.add(-(n0 + 1), bVar);
            return bVar;
        }
        C1296b bVar2 = arrayList.get(n0);
        C19383o.m32796f(bVar2, "get(location)");
        return bVar2;
    }

    /* renamed from: b */
    public final void mo5624b() {
        C1301c1 c1Var = this.f2805a;
        c1Var.getClass();
        if (this.f2805a == c1Var && c1Var.f2824f > 0) {
            c1Var.f2824f--;
            return;
        }
        throw new IllegalArgumentException("Unexpected reader close()".toString());
    }

    /* renamed from: c */
    public final void mo5625c() {
        if (this.f2813i == 0) {
            if (this.f2810f == this.f2811g) {
                int[] iArr = this.f2806b;
                int i = iArr[(this.f2812h * 5) + 2];
                this.f2812h = i;
                this.f2811g = i < 0 ? this.f2807c : C0005b.m63u(i, iArr) + i;
                return;
            }
            throw new IllegalArgumentException("endGroup() not called at the end of a group".toString());
        }
    }

    /* renamed from: d */
    public final Object mo5626d() {
        int i;
        int i2 = this.f2810f;
        if (i2 >= this.f2811g) {
            return 0;
        }
        int[] iArr = this.f2806b;
        if (!C0005b.m65v(i2, iArr)) {
            return C1302d.C1303a.f2828a;
        }
        Object[] objArr = this.f2808d;
        int i3 = i2 * 5;
        if (i3 >= iArr.length) {
            i = iArr.length;
        } else {
            i = C0005b.m27U(iArr[i3 + 1] >> 29) + iArr[i3 + 4];
        }
        return objArr[i];
    }

    /* renamed from: e */
    public final int mo5627e() {
        int i = this.f2810f;
        if (i < this.f2811g) {
            return this.f2806b[i * 5];
        }
        return 0;
    }

    /* renamed from: f */
    public final Object mo5628f(int i, int i2) {
        int F = C0005b.m12F(i, this.f2806b);
        int i3 = i + 1;
        int i4 = F + i2;
        return i4 < (i3 < this.f2807c ? C0005b.m61t(i3, this.f2806b) : this.f2809e) ? this.f2808d[i4] : C1302d.C1303a.f2828a;
    }

    /* renamed from: g */
    public final int mo5629g(int i) {
        return C0005b.m63u(i, this.f2806b);
    }

    /* renamed from: h */
    public final boolean mo5630h(int i) {
        return C0005b.m68y(i, this.f2806b);
    }

    /* renamed from: i */
    public final Object mo5631i(int i) {
        if (!C0005b.m68y(i, this.f2806b)) {
            return null;
        }
        int[] iArr = this.f2806b;
        return C0005b.m68y(i, iArr) ? this.f2808d[iArr[(i * 5) + 4]] : C1302d.C1303a.f2828a;
    }

    /* renamed from: j */
    public final Object mo5632j(int i, int[] iArr) {
        if (C0005b.m66w(i, iArr)) {
            return this.f2808d[C0005b.m9C(i, iArr)];
        }
        return null;
    }

    /* renamed from: k */
    public final int mo5633k(int i) {
        return this.f2806b[(i * 5) + 2];
    }

    /* renamed from: l */
    public final void mo5634l(int i) {
        if (this.f2813i == 0) {
            this.f2810f = i;
            int i2 = this.f2807c;
            int i3 = i < i2 ? this.f2806b[(i * 5) + 2] : -1;
            this.f2812h = i3;
            if (i3 < 0) {
                this.f2811g = i2;
            } else {
                this.f2811g = C0005b.m63u(i3, this.f2806b) + i3;
            }
            this.f2814j = 0;
            this.f2815k = 0;
            return;
        }
        throw new IllegalArgumentException("Cannot reposition while in an empty region".toString());
    }

    /* renamed from: m */
    public final int mo5635m() {
        int i = 1;
        if (this.f2813i == 0) {
            if (!C0005b.m68y(this.f2810f, this.f2806b)) {
                i = C0005b.m8B(this.f2810f, this.f2806b);
            }
            int i2 = this.f2810f;
            this.f2810f = C0005b.m63u(i2, this.f2806b) + i2;
            return i;
        }
        throw new IllegalArgumentException("Cannot skip while in an empty region".toString());
    }

    /* renamed from: n */
    public final void mo5636n() {
        if (this.f2813i == 0) {
            this.f2810f = this.f2811g;
            return;
        }
        throw new IllegalArgumentException("Cannot skip the enclosing group while in an empty region".toString());
    }

    /* renamed from: o */
    public final void mo5637o() {
        if (this.f2813i <= 0) {
            int[] iArr = this.f2806b;
            int i = this.f2810f;
            if (iArr[(i * 5) + 2] == this.f2812h) {
                this.f2812h = i;
                this.f2811g = C0005b.m63u(i, iArr) + i;
                int i2 = this.f2810f;
                int i3 = i2 + 1;
                this.f2810f = i3;
                this.f2814j = C0005b.m12F(i2, this.f2806b);
                this.f2815k = i2 >= this.f2807c - 1 ? this.f2809e : C0005b.m61t(i3, this.f2806b);
                return;
            }
            throw new IllegalArgumentException("Invalid slot table detected".toString());
        }
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SlotReader(current=");
        h.append(this.f2810f);
        h.append(", key=");
        h.append(mo5627e());
        h.append(", parent=");
        h.append(this.f2812h);
        h.append(", end=");
        return C0073e.m208h(h, this.f2811g, ')');
    }
}

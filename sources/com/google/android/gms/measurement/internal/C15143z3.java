package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.z3 */
public final class C15143z3 {

    /* renamed from: A */
    public long f34009A;

    /* renamed from: B */
    public long f34010B;

    /* renamed from: C */
    public String f34011C;

    /* renamed from: D */
    public boolean f34012D;

    /* renamed from: E */
    public long f34013E;

    /* renamed from: F */
    public long f34014F;

    /* renamed from: a */
    public final C15103u3 f34015a;

    /* renamed from: b */
    public final String f34016b;

    /* renamed from: c */
    public String f34017c;

    /* renamed from: d */
    public String f34018d;

    /* renamed from: e */
    public String f34019e;

    /* renamed from: f */
    public String f34020f;

    /* renamed from: g */
    public long f34021g;

    /* renamed from: h */
    public long f34022h;

    /* renamed from: i */
    public long f34023i;

    /* renamed from: j */
    public String f34024j;

    /* renamed from: k */
    public long f34025k;

    /* renamed from: l */
    public String f34026l;

    /* renamed from: m */
    public long f34027m;

    /* renamed from: n */
    public long f34028n;

    /* renamed from: o */
    public boolean f34029o;

    /* renamed from: p */
    public long f34030p;

    /* renamed from: q */
    public boolean f34031q;

    /* renamed from: r */
    public String f34032r;

    /* renamed from: s */
    public Boolean f34033s;

    /* renamed from: t */
    public long f34034t;

    /* renamed from: u */
    public ArrayList f34035u;

    /* renamed from: v */
    public String f34036v;

    /* renamed from: w */
    public long f34037w;

    /* renamed from: x */
    public long f34038x;

    /* renamed from: y */
    public long f34039y;

    /* renamed from: z */
    public long f34040z;

    public C15143z3(C15103u3 u3Var, String str) {
        Preconditions.checkNotNull(u3Var);
        Preconditions.checkNotEmpty(str);
        this.f34015a = u3Var;
        this.f34016b = str;
        u3Var.mo52015a().mo51995g();
    }

    /* renamed from: A */
    public final String mo52373A() {
        this.f34015a.mo52015a().mo51995g();
        return this.f34020f;
    }

    /* renamed from: B */
    public final String mo52374B() {
        this.f34015a.mo52015a().mo51995g();
        return this.f34036v;
    }

    /* renamed from: C */
    public final String mo52375C() {
        this.f34015a.mo52015a().mo51995g();
        return this.f34018d;
    }

    /* renamed from: a */
    public final void mo52376a(String str) {
        this.f34015a.mo52015a().mo51995g();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f34012D |= true ^ C15018k7.m24472U(this.f34032r, str);
        this.f34032r = str;
    }

    /* renamed from: b */
    public final void mo52377b(long j) {
        this.f34015a.mo52015a().mo51995g();
        this.f34012D |= this.f34030p != j;
        this.f34030p = j;
    }

    /* renamed from: c */
    public final void mo52378c(String str) {
        this.f34015a.mo52015a().mo51995g();
        this.f34012D |= !C15018k7.m24472U(this.f34017c, str);
        this.f34017c = str;
    }

    /* renamed from: d */
    public final void mo52379d(String str) {
        this.f34015a.mo52015a().mo51995g();
        this.f34012D |= !C15018k7.m24472U(this.f34026l, str);
        this.f34026l = str;
    }

    /* renamed from: e */
    public final void mo52380e(String str) {
        this.f34015a.mo52015a().mo51995g();
        this.f34012D |= !C15018k7.m24472U(this.f34024j, str);
        this.f34024j = str;
    }

    /* renamed from: f */
    public final void mo52381f(long j) {
        this.f34015a.mo52015a().mo51995g();
        this.f34012D |= this.f34025k != j;
        this.f34025k = j;
    }

    /* renamed from: g */
    public final void mo52382g(long j) {
        this.f34015a.mo52015a().mo51995g();
        this.f34012D |= this.f34013E != j;
        this.f34013E = j;
    }

    /* renamed from: h */
    public final void mo52383h(long j) {
        this.f34015a.mo52015a().mo51995g();
        this.f34012D |= this.f34028n != j;
        this.f34028n = j;
    }

    /* renamed from: i */
    public final void mo52384i(long j) {
        this.f34015a.mo52015a().mo51995g();
        this.f34012D |= this.f34034t != j;
        this.f34034t = j;
    }

    /* renamed from: j */
    public final void mo52385j(String str) {
        this.f34015a.mo52015a().mo51995g();
        this.f34012D |= !C15018k7.m24472U(this.f34020f, str);
        this.f34020f = str;
    }

    /* renamed from: k */
    public final void mo52386k(String str) {
        this.f34015a.mo52015a().mo51995g();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f34012D |= true ^ C15018k7.m24472U(this.f34036v, str);
        this.f34036v = str;
    }

    /* renamed from: l */
    public final void mo52387l(String str) {
        this.f34015a.mo52015a().mo51995g();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f34012D |= true ^ C15018k7.m24472U(this.f34018d, str);
        this.f34018d = str;
    }

    /* renamed from: m */
    public final void mo52388m(long j) {
        this.f34015a.mo52015a().mo51995g();
        this.f34012D |= this.f34027m != j;
        this.f34027m = j;
    }

    /* renamed from: n */
    public final void mo52389n(String str) {
        this.f34015a.mo52015a().mo51995g();
        this.f34012D |= !C15018k7.m24472U(this.f34011C, str);
        this.f34011C = str;
    }

    /* renamed from: o */
    public final void mo52390o(long j) {
        this.f34015a.mo52015a().mo51995g();
        this.f34012D |= this.f34023i != j;
        this.f34023i = j;
    }

    /* renamed from: p */
    public final void mo52391p(long j) {
        boolean z = true;
        Preconditions.checkArgument(j >= 0);
        this.f34015a.mo52015a().mo51995g();
        boolean z2 = this.f34012D;
        if (this.f34021g == j) {
            z = false;
        }
        this.f34012D = z2 | z;
        this.f34021g = j;
    }

    /* renamed from: q */
    public final void mo52392q(long j) {
        this.f34015a.mo52015a().mo51995g();
        this.f34012D |= this.f34022h != j;
        this.f34022h = j;
    }

    /* renamed from: r */
    public final void mo52393r(boolean z) {
        this.f34015a.mo52015a().mo51995g();
        this.f34012D |= this.f34029o != z;
        this.f34029o = z;
    }

    /* renamed from: s */
    public final void mo52394s(String str) {
        this.f34015a.mo52015a().mo51995g();
        this.f34012D |= !C15018k7.m24472U(this.f34019e, str);
        this.f34019e = str;
    }

    /* renamed from: t */
    public final void mo52395t(List<String> list) {
        this.f34015a.mo52015a().mo51995g();
        ArrayList arrayList = this.f34035u;
        if (arrayList != null || list != null) {
            if (arrayList == null || !arrayList.equals(list)) {
                this.f34012D = true;
                this.f34035u = list != null ? new ArrayList(list) : null;
            }
        }
    }

    /* renamed from: u */
    public final long mo52396u() {
        this.f34015a.mo52015a().mo51995g();
        return this.f34025k;
    }

    /* renamed from: v */
    public final String mo52397v() {
        this.f34015a.mo52015a().mo51995g();
        return this.f34032r;
    }

    /* renamed from: w */
    public final String mo52398w() {
        this.f34015a.mo52015a().mo51995g();
        String str = this.f34011C;
        mo52389n((String) null);
        return str;
    }

    /* renamed from: x */
    public final String mo52399x() {
        this.f34015a.mo52015a().mo51995g();
        return this.f34016b;
    }

    /* renamed from: y */
    public final String mo52400y() {
        this.f34015a.mo52015a().mo51995g();
        return this.f34017c;
    }

    /* renamed from: z */
    public final String mo52401z() {
        this.f34015a.mo52015a().mo51995g();
        return this.f34024j;
    }
}

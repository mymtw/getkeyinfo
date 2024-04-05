package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.C0956j;
import androidx.compose.foundation.text.selection.C1004a;
import androidx.compose.p015ui.text.C1913a;
import androidx.compose.p015ui.text.C2021q;
import androidx.compose.p015ui.text.C2022r;
import androidx.compose.p015ui.text.input.C1994n;
import androidx.compose.p015ui.text.style.ResolvedTextDirection;
import java.text.BreakIterator;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p001a0.C0005b;

/* renamed from: androidx.compose.foundation.text.selection.a */
public abstract class C1004a<T extends C1004a<T>> {

    /* renamed from: a */
    public final C1913a f2105a;

    /* renamed from: b */
    public final long f2106b;

    /* renamed from: c */
    public final C2021q f2107c;

    /* renamed from: d */
    public final C1994n f2108d;

    /* renamed from: e */
    public final C1025s f2109e;

    /* renamed from: f */
    public long f2110f;

    /* renamed from: g */
    public C1913a f2111g;

    public C1004a(C1913a aVar, long j, C2021q qVar, C1994n nVar, C1025s sVar) {
        this.f2105a = aVar;
        this.f2106b = j;
        this.f2107c = qVar;
        this.f2108d = nVar;
        this.f2109e = sVar;
        this.f2110f = j;
        this.f2111g = aVar;
    }

    /* renamed from: a */
    public final Integer mo4671a() {
        C2021q qVar = this.f2107c;
        if (qVar == null) {
            return null;
        }
        return Integer.valueOf(this.f2108d.mo7683a(qVar.mo7742e(qVar.mo7744f(this.f2108d.mo7684b(C2022r.m4465d(this.f2110f))), true)));
    }

    /* renamed from: b */
    public final Integer mo4672b() {
        C2021q qVar = this.f2107c;
        if (qVar == null) {
            return null;
        }
        return Integer.valueOf(this.f2108d.mo7683a(qVar.mo7749j(qVar.mo7744f(this.f2108d.mo7684b(C2022r.m4466e(this.f2110f))))));
    }

    /* renamed from: c */
    public final int mo4673c(C2021q qVar, int i) {
        if (i >= this.f2105a.length()) {
            return this.f2105a.length();
        }
        int length = this.f2111g.f4296b.length() - 1;
        if (i <= length) {
            length = i;
        }
        long n = qVar.mo7753n(length);
        return C2022r.m4464c(n) <= i ? mo4673c(qVar, i + 1) : this.f2108d.mo7683a(C2022r.m4464c(n));
    }

    /* renamed from: d */
    public final int mo4674d(C2021q qVar, int i) {
        if (i < 0) {
            return 0;
        }
        int length = this.f2111g.f4296b.length() - 1;
        if (i <= length) {
            length = i;
        }
        int n = (int) (qVar.mo7753n(length) >> 32);
        return n >= i ? mo4674d(qVar, i - 1) : this.f2108d.mo7683a(n);
    }

    /* renamed from: e */
    public final boolean mo4675e() {
        C2021q qVar = this.f2107c;
        return (qVar != null ? qVar.mo7752m(C2022r.m4464c(this.f2110f)) : null) != ResolvedTextDirection.Rtl;
    }

    /* renamed from: f */
    public final int mo4676f(C2021q qVar, int i) {
        int b = this.f2108d.mo7684b(C2022r.m4464c(this.f2110f));
        C1025s sVar = this.f2109e;
        if (sVar.f2153a == null) {
            sVar.f2153a = Float.valueOf(qVar.mo7740c(b).f18301a);
        }
        int f = qVar.mo7744f(b) + i;
        if (f < 0) {
            return 0;
        }
        if (f >= qVar.f4590b.f4365f) {
            return this.f2111g.f4296b.length();
        }
        float d = qVar.mo7741d(f) - ((float) 1);
        Float f2 = this.f2109e.f2153a;
        C19383o.m32794d(f2);
        float floatValue = f2.floatValue();
        if ((mo4675e() && floatValue >= qVar.mo7748i(f)) || (!mo4675e() && floatValue <= qVar.mo7746h(f))) {
            return qVar.mo7742e(f, true);
        }
        return this.f2108d.mo7683a(qVar.mo7751l(C19421p.m32952q(f2.floatValue(), d)));
    }

    /* renamed from: g */
    public final void mo4677g() {
        this.f2109e.f2153a = null;
        if (!(this.f2111g.f4296b.length() > 0)) {
            return;
        }
        if (mo4675e()) {
            mo4682l();
        } else {
            mo4679i();
        }
    }

    /* renamed from: h */
    public final void mo4678h() {
        this.f2109e.f2153a = null;
        if (!(this.f2111g.f4296b.length() > 0)) {
            return;
        }
        if (mo4675e()) {
            mo4684n();
        } else {
            mo4681k();
        }
    }

    /* renamed from: i */
    public final void mo4679i() {
        this.f2109e.f2153a = null;
        if (this.f2111g.f4296b.length() > 0) {
            String str = this.f2111g.f4296b;
            int c = C2022r.m4464c(this.f2110f);
            C19383o.m32797g(str, "<this>");
            BreakIterator characterInstance = BreakIterator.getCharacterInstance();
            characterInstance.setText(str);
            int following = characterInstance.following(c);
            if (following != -1) {
                mo4693w(following, following);
            }
        }
    }

    /* renamed from: j */
    public final void mo4680j() {
        this.f2109e.f2153a = null;
        if (this.f2111g.f4296b.length() > 0) {
            int a = C0956j.m1992a(C2022r.m4465d(this.f2110f), this.f2111g.f4296b);
            mo4693w(a, a);
        }
    }

    /* renamed from: k */
    public final void mo4681k() {
        Integer num = null;
        this.f2109e.f2153a = null;
        if (this.f2111g.f4296b.length() > 0) {
            C2021q qVar = this.f2107c;
            if (qVar != null) {
                num = Integer.valueOf(mo4673c(qVar, this.f2108d.mo7684b(C2022r.m4464c(this.f2110f))));
            }
            if (num != null) {
                int intValue = num.intValue();
                mo4693w(intValue, intValue);
            }
        }
    }

    /* renamed from: l */
    public final void mo4682l() {
        this.f2109e.f2153a = null;
        if (this.f2111g.f4296b.length() > 0) {
            String str = this.f2111g.f4296b;
            int c = C2022r.m4464c(this.f2110f);
            C19383o.m32797g(str, "<this>");
            BreakIterator characterInstance = BreakIterator.getCharacterInstance();
            characterInstance.setText(str);
            int preceding = characterInstance.preceding(c);
            if (preceding != -1) {
                mo4693w(preceding, preceding);
            }
        }
    }

    /* renamed from: m */
    public final void mo4683m() {
        this.f2109e.f2153a = null;
        int i = 0;
        if (this.f2111g.f4296b.length() > 0) {
            String str = this.f2111g.f4296b;
            int e = C2022r.m4466e(this.f2110f);
            C19383o.m32797g(str, "<this>");
            int i2 = e - 1;
            while (true) {
                if (i2 <= 0) {
                    break;
                }
                int i3 = i2 - 1;
                if (str.charAt(i3) == 10) {
                    i = i2;
                    break;
                }
                i2 = i3;
            }
            mo4693w(i, i);
        }
    }

    /* renamed from: n */
    public final void mo4684n() {
        Integer num = null;
        this.f2109e.f2153a = null;
        if (this.f2111g.f4296b.length() > 0) {
            C2021q qVar = this.f2107c;
            if (qVar != null) {
                num = Integer.valueOf(mo4674d(qVar, this.f2108d.mo7684b(C2022r.m4464c(this.f2110f))));
            }
            if (num != null) {
                int intValue = num.intValue();
                mo4693w(intValue, intValue);
            }
        }
    }

    /* renamed from: o */
    public final void mo4685o() {
        this.f2109e.f2153a = null;
        if (!(this.f2111g.f4296b.length() > 0)) {
            return;
        }
        if (mo4675e()) {
            mo4679i();
        } else {
            mo4682l();
        }
    }

    /* renamed from: p */
    public final void mo4686p() {
        this.f2109e.f2153a = null;
        if (!(this.f2111g.f4296b.length() > 0)) {
            return;
        }
        if (mo4675e()) {
            mo4681k();
        } else {
            mo4684n();
        }
    }

    /* renamed from: q */
    public final void mo4687q() {
        this.f2109e.f2153a = null;
        if (this.f2111g.f4296b.length() > 0) {
            int length = this.f2111g.f4296b.length();
            mo4693w(length, length);
        }
    }

    /* renamed from: r */
    public final void mo4688r() {
        Integer a;
        this.f2109e.f2153a = null;
        if ((this.f2111g.f4296b.length() > 0) && (a = mo4671a()) != null) {
            int intValue = a.intValue();
            mo4693w(intValue, intValue);
        }
    }

    /* renamed from: s */
    public final void mo4689s() {
        this.f2109e.f2153a = null;
        if (!(this.f2111g.f4296b.length() > 0)) {
            return;
        }
        if (mo4675e()) {
            mo4691u();
        } else {
            mo4688r();
        }
    }

    /* renamed from: t */
    public final void mo4690t() {
        this.f2109e.f2153a = null;
        if (!(this.f2111g.f4296b.length() > 0)) {
            return;
        }
        if (mo4675e()) {
            mo4688r();
        } else {
            mo4691u();
        }
    }

    /* renamed from: u */
    public final void mo4691u() {
        Integer b;
        this.f2109e.f2153a = null;
        if ((this.f2111g.f4296b.length() > 0) && (b = mo4672b()) != null) {
            int intValue = b.intValue();
            mo4693w(intValue, intValue);
        }
    }

    /* renamed from: v */
    public final void mo4692v() {
        if (this.f2111g.f4296b.length() > 0) {
            long j = this.f2106b;
            int i = C2022r.f4596c;
            this.f2110f = C0005b.m47l((int) (j >> 32), C2022r.m4464c(this.f2110f));
        }
    }

    /* renamed from: w */
    public final void mo4693w(int i, int i2) {
        this.f2110f = C0005b.m47l(i, i2);
    }
}

package androidx.compose.p015ui.text;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.compose.p015ui.text.style.ResolvedTextDirection;
import java.util.ArrayList;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p001a0.C0005b;
import p003a2.C0023f;
import p174m0.C7290i;
import p288y.C8343c;
import p288y.C8345d;
import p568fn.C17782b;

/* renamed from: androidx.compose.ui.text.q */
public final class C2021q {

    /* renamed from: a */
    public final C2014p f4589a;

    /* renamed from: b */
    public final C1934c f4590b;

    /* renamed from: c */
    public final long f4591c;

    /* renamed from: d */
    public final float f4592d;

    /* renamed from: e */
    public final float f4593e;

    /* renamed from: f */
    public final ArrayList f4594f;

    public C2021q(C2014p pVar, C1934c cVar, long j) {
        this.f4589a = pVar;
        this.f4590b = cVar;
        this.f4591c = j;
        float f = 0.0f;
        this.f4592d = cVar.f4367h.isEmpty() ? 0.0f : ((C1936e) cVar.f4367h.get(0)).f4368a.mo7476f();
        if (!cVar.f4367h.isEmpty()) {
            C1936e eVar = (C1936e) C19327t.m32645a1(cVar.f4367h);
            f = eVar.f4368a.mo7486o() + eVar.f4373f;
        }
        this.f4593e = f;
        this.f4594f = cVar.f4366g;
    }

    /* renamed from: a */
    public final ResolvedTextDirection mo7738a(int i) {
        C1934c cVar = this.f4590b;
        cVar.mo7469c(i);
        C1936e eVar = (C1936e) cVar.f4367h.get(i == cVar.f4360a.f4271a.length() ? C17782b.m29859Y(cVar.f4367h) : C1993m.m4340A(i, cVar.f4367h));
        return eVar.f4368a.mo7488q(eVar.mo7493b(i));
    }

    /* renamed from: b */
    public final C8345d mo7739b(int i) {
        C1934c cVar = this.f4590b;
        if (i >= 0 && i < cVar.f4360a.f4271a.f4296b.length()) {
            C1936e eVar = (C1936e) cVar.f4367h.get(C1993m.m4340A(i, cVar.f4367h));
            return eVar.mo7492a(eVar.f4368a.mo7471a(eVar.mo7493b(i)));
        }
        cVar.getClass();
        throw new IllegalArgumentException(("offset(" + i + ") is out of bounds [0, " + cVar.f4360a.f4271a.length() + ')').toString());
    }

    /* renamed from: c */
    public final C8345d mo7740c(int i) {
        C1934c cVar = this.f4590b;
        cVar.mo7469c(i);
        C1936e eVar = (C1936e) cVar.f4367h.get(i == cVar.f4360a.f4271a.length() ? C17782b.m29859Y(cVar.f4367h) : C1993m.m4340A(i, cVar.f4367h));
        return eVar.mo7492a(eVar.f4368a.mo7474d(eVar.mo7493b(i)));
    }

    /* renamed from: d */
    public final float mo7741d(int i) {
        C1934c cVar = this.f4590b;
        cVar.mo7470d(i);
        C1936e eVar = (C1936e) cVar.f4367h.get(C1993m.m4341B(i, cVar.f4367h));
        return eVar.f4368a.mo7489r(i - eVar.f4371d) + eVar.f4373f;
    }

    /* renamed from: e */
    public final int mo7742e(int i, boolean z) {
        C1934c cVar = this.f4590b;
        cVar.mo7470d(i);
        C1936e eVar = (C1936e) cVar.f4367h.get(C1993m.m4341B(i, cVar.f4367h));
        return eVar.f4368a.mo7480i(i - eVar.f4371d, z) + eVar.f4369b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2021q)) {
            return false;
        }
        C2021q qVar = (C2021q) obj;
        if (!C19383o.m32792b(this.f4589a, qVar.f4589a) || !C19383o.m32792b(this.f4590b, qVar.f4590b) || !C7290i.m13994a(this.f4591c, qVar.f4591c)) {
            return false;
        }
        if (!(this.f4592d == qVar.f4592d)) {
            return false;
        }
        return ((this.f4593e > qVar.f4593e ? 1 : (this.f4593e == qVar.f4593e ? 0 : -1)) == 0) && C19383o.m32792b(this.f4594f, qVar.f4594f);
    }

    /* renamed from: f */
    public final int mo7744f(int i) {
        C1934c cVar = this.f4590b;
        cVar.mo7469c(i);
        C1936e eVar = (C1936e) cVar.f4367h.get(i == cVar.f4360a.f4271a.length() ? C17782b.m29859Y(cVar.f4367h) : C1993m.m4340A(i, cVar.f4367h));
        return eVar.f4368a.mo7487p(eVar.mo7493b(i)) + eVar.f4371d;
    }

    /* renamed from: g */
    public final int mo7745g(float f) {
        C1934c cVar = this.f4590b;
        C1936e eVar = (C1936e) cVar.f4367h.get(f <= 0.0f ? 0 : f >= cVar.f4364e ? C17782b.m29859Y(cVar.f4367h) : C1993m.m4342C(cVar.f4367h, f));
        int i = eVar.f4370c;
        int i2 = eVar.f4369b;
        return i - i2 == 0 ? Math.max(0, i2 - 1) : eVar.f4368a.mo7482k(f - eVar.f4373f) + eVar.f4371d;
    }

    /* renamed from: h */
    public final float mo7746h(int i) {
        C1934c cVar = this.f4590b;
        cVar.mo7470d(i);
        C1936e eVar = (C1936e) cVar.f4367h.get(C1993m.m4341B(i, cVar.f4367h));
        return eVar.f4368a.mo7485n(i - eVar.f4371d);
    }

    public final int hashCode() {
        int hashCode = this.f4590b.hashCode();
        return this.f4594f.hashCode() + C0023f.m104c(this.f4593e, C0023f.m104c(this.f4592d, C0071c.m190b(this.f4591c, (hashCode + (this.f4589a.hashCode() * 31)) * 31, 31), 31), 31);
    }

    /* renamed from: i */
    public final float mo7748i(int i) {
        C1934c cVar = this.f4590b;
        cVar.mo7470d(i);
        C1936e eVar = (C1936e) cVar.f4367h.get(C1993m.m4341B(i, cVar.f4367h));
        return eVar.f4368a.mo7481j(i - eVar.f4371d);
    }

    /* renamed from: j */
    public final int mo7749j(int i) {
        C1934c cVar = this.f4590b;
        cVar.mo7470d(i);
        C1936e eVar = (C1936e) cVar.f4367h.get(C1993m.m4341B(i, cVar.f4367h));
        return eVar.f4368a.mo7479h(i - eVar.f4371d) + eVar.f4369b;
    }

    /* renamed from: k */
    public final float mo7750k(int i) {
        C1934c cVar = this.f4590b;
        cVar.mo7470d(i);
        C1936e eVar = (C1936e) cVar.f4367h.get(C1993m.m4341B(i, cVar.f4367h));
        return eVar.f4368a.mo7473c(i - eVar.f4371d) + eVar.f4373f;
    }

    /* renamed from: l */
    public final int mo7751l(long j) {
        C1934c cVar = this.f4590b;
        cVar.getClass();
        C1936e eVar = (C1936e) cVar.f4367h.get(C8343c.m16643d(j) <= 0.0f ? 0 : C8343c.m16643d(j) >= cVar.f4364e ? C17782b.m29859Y(cVar.f4367h) : C1993m.m4342C(cVar.f4367h, C8343c.m16643d(j)));
        int i = eVar.f4370c;
        int i2 = eVar.f4369b;
        return i - i2 == 0 ? Math.max(0, i2 - 1) : eVar.f4368a.mo7477g(C19421p.m32952q(C8343c.m16642c(j), C8343c.m16643d(j) - eVar.f4373f)) + eVar.f4369b;
    }

    /* renamed from: m */
    public final ResolvedTextDirection mo7752m(int i) {
        C1934c cVar = this.f4590b;
        cVar.mo7469c(i);
        C1936e eVar = (C1936e) cVar.f4367h.get(i == cVar.f4360a.f4271a.length() ? C17782b.m29859Y(cVar.f4367h) : C1993m.m4340A(i, cVar.f4367h));
        return eVar.f4368a.mo7472b(eVar.mo7493b(i));
    }

    /* renamed from: n */
    public final long mo7753n(int i) {
        C1934c cVar = this.f4590b;
        cVar.mo7469c(i);
        C1936e eVar = (C1936e) cVar.f4367h.get(i == cVar.f4360a.f4271a.length() ? C17782b.m29859Y(cVar.f4367h) : C1993m.m4340A(i, cVar.f4367h));
        long e = eVar.f4368a.mo7475e(eVar.mo7493b(i));
        int i2 = C2022r.f4596c;
        return C0005b.m47l(((int) (e >> 32)) + eVar.f4369b, C2022r.m4464c(e) + eVar.f4369b);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("TextLayoutResult(layoutInput=");
        h.append(this.f4589a);
        h.append(", multiParagraph=");
        h.append(this.f4590b);
        h.append(", size=");
        h.append(C7290i.m13996c(this.f4591c));
        h.append(", firstBaseline=");
        h.append(this.f4592d);
        h.append(", lastBaseline=");
        h.append(this.f4593e);
        h.append(", placeholderRects=");
        h.append(this.f4594f);
        h.append(')');
        return h.toString();
    }
}

package androidx.compose.p015ui.text;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.activity.C0114h;
import androidx.compose.p015ui.text.style.C2027c;
import androidx.compose.p015ui.text.style.C2029d;
import androidx.compose.p015ui.text.style.C2031f;
import androidx.compose.p015ui.text.style.C2033h;
import kotlin.jvm.internal.C19383o;
import p174m0.C7292j;
import p174m0.C7293k;

/* renamed from: androidx.compose.ui.text.h */
public final class C1978h {

    /* renamed from: a */
    public final C2029d f4439a;

    /* renamed from: b */
    public final C2031f f4440b;

    /* renamed from: c */
    public final long f4441c;

    /* renamed from: d */
    public final C2033h f4442d;

    /* renamed from: e */
    public final C2009k f4443e;

    /* renamed from: f */
    public final C2027c f4444f;

    public C1978h(C2029d dVar, C2031f fVar, long j, C2033h hVar, C2009k kVar, C2027c cVar) {
        this.f4439a = dVar;
        this.f4440b = fVar;
        this.f4441c = j;
        this.f4442d = hVar;
        this.f4443e = kVar;
        this.f4444f = cVar;
        if (!C7292j.m13997a(j, C7292j.f16173c)) {
            if (!(C7292j.m13999c(j) >= 0.0f)) {
                StringBuilder h = C0072d.m201h("lineHeight can't be negative (");
                h.append(C7292j.m13999c(j));
                h.append(')');
                throw new IllegalStateException(h.toString().toString());
            }
        }
    }

    /* renamed from: a */
    public final C1978h mo7593a(C1978h hVar) {
        if (hVar == null) {
            return this;
        }
        long j = C0114h.m307l0(hVar.f4441c) ? this.f4441c : hVar.f4441c;
        C2033h hVar2 = hVar.f4442d;
        if (hVar2 == null) {
            hVar2 = this.f4442d;
        }
        C2033h hVar3 = hVar2;
        C2029d dVar = hVar.f4439a;
        if (dVar == null) {
            dVar = this.f4439a;
        }
        C2029d dVar2 = dVar;
        C2031f fVar = hVar.f4440b;
        if (fVar == null) {
            fVar = this.f4440b;
        }
        C2031f fVar2 = fVar;
        C2009k kVar = hVar.f4443e;
        C2009k kVar2 = this.f4443e;
        C2009k kVar3 = (kVar2 != null && kVar == null) ? kVar2 : kVar;
        C2027c cVar = hVar.f4444f;
        if (cVar == null) {
            cVar = this.f4444f;
        }
        return new C1978h(dVar2, fVar2, j, hVar3, kVar3, cVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1978h)) {
            return false;
        }
        C1978h hVar = (C1978h) obj;
        return C19383o.m32792b(this.f4439a, hVar.f4439a) && C19383o.m32792b(this.f4440b, hVar.f4440b) && C7292j.m13997a(this.f4441c, hVar.f4441c) && C19383o.m32792b(this.f4442d, hVar.f4442d) && C19383o.m32792b(this.f4443e, hVar.f4443e) && C19383o.m32792b(this.f4444f, hVar.f4444f);
    }

    public final int hashCode() {
        C2029d dVar = this.f4439a;
        int i = 0;
        int hashCode = (dVar != null ? Integer.hashCode(dVar.f4611a) : 0) * 31;
        C2031f fVar = this.f4440b;
        int hashCode2 = fVar != null ? Integer.hashCode(fVar.f4616a) : 0;
        long j = this.f4441c;
        C7293k[] kVarArr = C7292j.f16172b;
        int b = C0071c.m190b(j, (hashCode + hashCode2) * 31, 31);
        C2033h hVar = this.f4442d;
        int hashCode3 = (b + (hVar != null ? hVar.hashCode() : 0)) * 31;
        C2009k kVar = this.f4443e;
        int hashCode4 = (hashCode3 + (kVar != null ? kVar.hashCode() : 0)) * 31;
        C2027c cVar = this.f4444f;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ParagraphStyle(textAlign=");
        h.append(this.f4439a);
        h.append(", textDirection=");
        h.append(this.f4440b);
        h.append(", lineHeight=");
        h.append(C7292j.m14000d(this.f4441c));
        h.append(", textIndent=");
        h.append(this.f4442d);
        h.append(", platformStyle=");
        h.append(this.f4443e);
        h.append(", lineHeightStyle=");
        h.append(this.f4444f);
        h.append(')');
        return h.toString();
    }
}

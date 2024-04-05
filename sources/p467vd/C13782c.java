package p467vd;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;

/* renamed from: vd.c */
public final class C13782c {

    /* renamed from: a */
    public final C13780a f30311a;

    /* renamed from: b */
    public final C13780a f30312b;

    /* renamed from: c */
    public final C13780a f30313c;

    /* renamed from: d */
    public final C13780a f30314d;

    public C13782c(C13780a aVar, C13780a aVar2, C13780a aVar3, C13780a aVar4) {
        this.f30311a = aVar;
        this.f30312b = aVar2;
        this.f30313c = aVar3;
        this.f30314d = aVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13782c)) {
            return false;
        }
        C13782c cVar = (C13782c) obj;
        return C19383o.m32792b(this.f30311a, cVar.f30311a) && C19383o.m32792b(this.f30312b, cVar.f30312b) && C19383o.m32792b(this.f30313c, cVar.f30313c) && C19383o.m32792b(this.f30314d, cVar.f30314d);
    }

    public final int hashCode() {
        int hashCode = this.f30312b.hashCode();
        int hashCode2 = this.f30313c.hashCode();
        return this.f30314d.hashCode() + ((hashCode2 + ((hashCode + (this.f30311a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("Spaces(space4=");
        h.append(this.f30311a);
        h.append(", space8=");
        h.append(this.f30312b);
        h.append(", space12=");
        h.append(this.f30313c);
        h.append(", space16=");
        h.append(this.f30314d);
        h.append(')');
        return h.toString();
    }
}

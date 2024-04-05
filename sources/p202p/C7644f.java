package p202p;

import android.support.p013v4.media.C0072d;
import androidx.activity.C0114h;
import androidx.compose.p015ui.graphics.C1606z;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p288y.C8343c;
import p288y.C8345d;
import p288y.C8346e;

/* renamed from: p.f */
public final class C7644f extends C7638a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7644f(C7639b bVar, C7639b bVar2, C7639b bVar3, C7639b bVar4) {
        super(bVar, bVar2, bVar3, bVar4);
        C19383o.m32797g(bVar, "topStart");
        C19383o.m32797g(bVar2, "topEnd");
        C19383o.m32797g(bVar3, "bottomEnd");
        C19383o.m32797g(bVar4, "bottomStart");
    }

    /* renamed from: b */
    public final C7644f mo20043b(C7639b bVar, C7639b bVar2, C7639b bVar3, C7639b bVar4) {
        C19383o.m32797g(bVar, "topStart");
        C19383o.m32797g(bVar2, "topEnd");
        C19383o.m32797g(bVar3, "bottomEnd");
        C19383o.m32797g(bVar4, "bottomStart");
        return new C7644f(bVar, bVar2, bVar3, bVar4);
    }

    /* renamed from: d */
    public final C1606z mo20044d(long j, float f, float f2, float f3, float f4, LayoutDirection layoutDirection) {
        long j2 = j;
        LayoutDirection layoutDirection2 = layoutDirection;
        C19383o.m32797g(layoutDirection2, "layoutDirection");
        if (((f + f2) + f3) + f4 == 0.0f) {
            return new C1606z.C1608b(C0005b.m40h(C8343c.f18295b, j2));
        }
        C8345d h = C0005b.m40h(C8343c.f18295b, j2);
        LayoutDirection layoutDirection3 = LayoutDirection.Ltr;
        float f5 = layoutDirection2 == layoutDirection3 ? f : f2;
        long s = C0114h.m317s(f5, f5);
        float f6 = layoutDirection2 == layoutDirection3 ? f2 : f;
        long s2 = C0114h.m317s(f6, f6);
        float f7 = layoutDirection2 == layoutDirection3 ? f3 : f4;
        long s3 = C0114h.m317s(f7, f7);
        float f8 = layoutDirection2 == layoutDirection3 ? f4 : f3;
        return new C1606z.C1609c(new C8346e(h.f18301a, h.f18302b, h.f18303c, h.f18304d, s, s2, s3, C0114h.m317s(f8, f8)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7644f)) {
            return false;
        }
        C7644f fVar = (C7644f) obj;
        return C19383o.m32792b(this.f16934a, fVar.f16934a) && C19383o.m32792b(this.f16935b, fVar.f16935b) && C19383o.m32792b(this.f16936c, fVar.f16936c) && C19383o.m32792b(this.f16937d, fVar.f16937d);
    }

    public final int hashCode() {
        int hashCode = this.f16935b.hashCode();
        int hashCode2 = this.f16936c.hashCode();
        return this.f16937d.hashCode() + ((hashCode2 + ((hashCode + (this.f16934a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("RoundedCornerShape(topStart = ");
        h.append(this.f16934a);
        h.append(", topEnd = ");
        h.append(this.f16935b);
        h.append(", bottomEnd = ");
        h.append(this.f16936c);
        h.append(", bottomStart = ");
        h.append(this.f16937d);
        h.append(')');
        return h.toString();
    }
}

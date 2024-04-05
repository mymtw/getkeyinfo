package p202p;

import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.p015ui.graphics.C1606z;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.jvm.internal.C19383o;
import p174m0.C7282b;
import p202p.C7640c;
import p288y.C8347f;

/* renamed from: p.a */
public abstract class C7638a implements C1530k0 {

    /* renamed from: a */
    public final C7639b f16934a;

    /* renamed from: b */
    public final C7639b f16935b;

    /* renamed from: c */
    public final C7639b f16936c;

    /* renamed from: d */
    public final C7639b f16937d;

    public C7638a(C7639b bVar, C7639b bVar2, C7639b bVar3, C7639b bVar4) {
        C19383o.m32797g(bVar, "topStart");
        C19383o.m32797g(bVar2, "topEnd");
        C19383o.m32797g(bVar3, "bottomEnd");
        C19383o.m32797g(bVar4, "bottomStart");
        this.f16934a = bVar;
        this.f16935b = bVar2;
        this.f16936c = bVar3;
        this.f16937d = bVar4;
    }

    /* renamed from: c */
    public static /* synthetic */ C7638a m14651c(C7638a aVar, C7642d dVar, C7642d dVar2, C7640c.C7641a aVar2, C7640c.C7641a aVar3, int i) {
        C7639b bVar = dVar;
        if ((i & 1) != 0) {
            bVar = aVar.f16934a;
        }
        C7639b bVar2 = dVar2;
        if ((i & 2) != 0) {
            bVar2 = aVar.f16935b;
        }
        C7639b bVar3 = aVar2;
        if ((i & 4) != 0) {
            bVar3 = aVar.f16936c;
        }
        C7639b bVar4 = aVar3;
        if ((i & 8) != 0) {
            bVar4 = aVar.f16937d;
        }
        return aVar.mo20043b(bVar, bVar2, bVar3, bVar4);
    }

    /* renamed from: a */
    public final C1606z mo3864a(long j, LayoutDirection layoutDirection, C7282b bVar) {
        C19383o.m32797g(layoutDirection, "layoutDirection");
        C19383o.m32797g(bVar, "density");
        float a = this.f16934a.mo20045a(bVar, j);
        float a2 = this.f16935b.mo20045a(bVar, j);
        float a3 = this.f16936c.mo20045a(bVar, j);
        float a4 = this.f16937d.mo20045a(bVar, j);
        float c = C8347f.m16655c(j);
        float f = a + a4;
        if (f > c) {
            float f2 = c / f;
            a *= f2;
            a4 *= f2;
        }
        float f3 = a4;
        float f4 = a2 + a3;
        if (f4 > c) {
            float f5 = c / f4;
            a2 *= f5;
            a3 *= f5;
        }
        if (a >= 0.0f && a2 >= 0.0f && a3 >= 0.0f && f3 >= 0.0f) {
            return mo20044d(j, a, a2, a3, f3, layoutDirection);
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + a + ", topEnd = " + a2 + ", bottomEnd = " + a3 + ", bottomStart = " + f3 + ")!").toString());
    }

    /* renamed from: b */
    public abstract C7644f mo20043b(C7639b bVar, C7639b bVar2, C7639b bVar3, C7639b bVar4);

    /* renamed from: d */
    public abstract C1606z mo20044d(long j, float f, float f2, float f3, float f4, LayoutDirection layoutDirection);
}

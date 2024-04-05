package androidx.compose.animation;

import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.animation.k */
public abstract class C0475k {
    static {
        new C0476l(new C0489x((C0477m) null, (C0470f) null, (C0482q) null, 15));
    }

    /* renamed from: a */
    public abstract C0489x mo3550a();

    /* renamed from: b */
    public final C0476l mo3551b(C0476l lVar) {
        C0489x xVar = ((C0476l) this).f1216a;
        C0477m mVar = xVar.f1233a;
        if (mVar == null) {
            mVar = lVar.f1216a.f1233a;
        }
        C0486u uVar = xVar.f1234b;
        if (uVar == null) {
            uVar = lVar.f1216a.f1234b;
        }
        C0470f fVar = xVar.f1235c;
        if (fVar == null) {
            fVar = lVar.f1216a.f1235c;
        }
        C0482q qVar = xVar.f1236d;
        if (qVar == null) {
            qVar = lVar.f1216a.f1236d;
        }
        return new C0476l(new C0489x(mVar, uVar, fVar, qVar));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0475k) && C19383o.m32792b(((C0475k) obj).mo3550a(), mo3550a());
    }

    public final int hashCode() {
        return mo3550a().hashCode();
    }
}

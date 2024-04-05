package androidx.compose.animation;

import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.animation.i */
public abstract class C0473i {
    static {
        new C0474j(new C0489x((C0477m) null, (C0470f) null, (C0482q) null, 15));
    }

    /* renamed from: a */
    public abstract C0489x mo3546a();

    /* renamed from: b */
    public final C0474j mo3547b(C0474j jVar) {
        C0489x xVar = ((C0474j) this).f1215a;
        C0477m mVar = xVar.f1233a;
        if (mVar == null) {
            mVar = jVar.f1215a.f1233a;
        }
        C0486u uVar = xVar.f1234b;
        if (uVar == null) {
            uVar = jVar.f1215a.f1234b;
        }
        C0470f fVar = xVar.f1235c;
        if (fVar == null) {
            fVar = jVar.f1215a.f1235c;
        }
        C0482q qVar = xVar.f1236d;
        if (qVar == null) {
            qVar = jVar.f1215a.f1236d;
        }
        return new C0474j(new C0489x(mVar, uVar, fVar, qVar));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0473i) && C19383o.m32792b(((C0473i) obj).mo3546a(), mo3546a());
    }

    public final int hashCode() {
        return mo3546a().hashCode();
    }
}

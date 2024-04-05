package androidx.compose.animation;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.animation.x */
public final class C0489x {

    /* renamed from: a */
    public final C0477m f1233a;

    /* renamed from: b */
    public final C0486u f1234b;

    /* renamed from: c */
    public final C0470f f1235c;

    /* renamed from: d */
    public final C0482q f1236d;

    public C0489x() {
        this((C0477m) null, (C0470f) null, (C0482q) null, 15);
    }

    public C0489x(C0477m mVar, C0486u uVar, C0470f fVar, C0482q qVar) {
        this.f1233a = mVar;
        this.f1234b = uVar;
        this.f1235c = fVar;
        this.f1236d = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0489x)) {
            return false;
        }
        C0489x xVar = (C0489x) obj;
        return C19383o.m32792b(this.f1233a, xVar.f1233a) && C19383o.m32792b(this.f1234b, xVar.f1234b) && C19383o.m32792b(this.f1235c, xVar.f1235c) && C19383o.m32792b(this.f1236d, xVar.f1236d);
    }

    public final int hashCode() {
        C0477m mVar = this.f1233a;
        int i = 0;
        int hashCode = (mVar == null ? 0 : mVar.hashCode()) * 31;
        C0486u uVar = this.f1234b;
        if (uVar == null) {
            int i2 = (hashCode + 0) * 31;
            C0470f fVar = this.f1235c;
            int hashCode2 = (i2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            C0482q qVar = this.f1236d;
            if (qVar != null) {
                i = qVar.hashCode();
            }
            return hashCode2 + i;
        }
        uVar.getClass();
        throw null;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("TransitionData(fade=");
        h.append(this.f1233a);
        h.append(", slide=");
        h.append(this.f1234b);
        h.append(", changeSize=");
        h.append(this.f1235c);
        h.append(", scale=");
        h.append(this.f1236d);
        h.append(')');
        return h.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0489x(C0477m mVar, C0470f fVar, C0482q qVar, int i) {
        this((i & 1) != 0 ? null : mVar, (C0486u) null, (i & 4) != 0 ? null : fVar, (i & 8) != 0 ? null : qVar);
    }
}

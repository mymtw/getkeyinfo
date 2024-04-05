package androidx.compose.animation;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.core.C0454t;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.animation.m */
public final class C0477m {

    /* renamed from: a */
    public final float f1217a;

    /* renamed from: b */
    public final C0454t<Float> f1218b;

    public C0477m(float f, C0454t<Float> tVar) {
        this.f1217a = f;
        this.f1218b = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0477m)) {
            return false;
        }
        C0477m mVar = (C0477m) obj;
        return C19383o.m32792b(Float.valueOf(this.f1217a), Float.valueOf(mVar.f1217a)) && C19383o.m32792b(this.f1218b, mVar.f1218b);
    }

    public final int hashCode() {
        return this.f1218b.hashCode() + (Float.hashCode(this.f1217a) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("Fade(alpha=");
        h.append(this.f1217a);
        h.append(", animationSpec=");
        h.append(this.f1218b);
        h.append(')');
        return h.toString();
    }
}

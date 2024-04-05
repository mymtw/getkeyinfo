package androidx.compose.material;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0388a;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.jvm.internal.C19383o;
import p174m0.C7282b;

/* renamed from: androidx.compose.material.x0 */
public final class C1266x0 implements C1174c2 {

    /* renamed from: a */
    public final float f2655a = 0.5f;

    /* renamed from: a */
    public final float mo5236a(C7282b bVar, float f, float f2) {
        C19383o.m32797g(bVar, "<this>");
        return C15588c1.m25354w0(f, f2, this.f2655a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1266x0) && C19383o.m32792b(Float.valueOf(this.f2655a), Float.valueOf(((C1266x0) obj).f2655a));
    }

    public final int hashCode() {
        return Float.hashCode(this.f2655a);
    }

    public final String toString() {
        return C0388a.m1048d(C0072d.m201h("FractionalThreshold(fraction="), this.f2655a, ')');
    }
}

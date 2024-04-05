package p297z;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.compose.p015ui.graphics.C1534m0;
import androidx.compose.p015ui.graphics.C1536n0;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: z.i */
public final class C8416i extends C8413f {

    /* renamed from: a */
    public final float f18434a;

    /* renamed from: b */
    public final float f18435b;

    /* renamed from: c */
    public final int f18436c;

    /* renamed from: d */
    public final int f18437d;

    public C8416i(float f, float f2, int i, int i2, int i3) {
        f = (i3 & 1) != 0 ? 0.0f : f;
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        this.f18434a = f;
        this.f18435b = f2;
        this.f18436c = i;
        this.f18437d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8416i)) {
            return false;
        }
        C8416i iVar = (C8416i) obj;
        if (!(this.f18434a == iVar.f18434a)) {
            return false;
        }
        if (!(this.f18435b == iVar.f18435b)) {
            return false;
        }
        if (!(this.f18436c == iVar.f18436c)) {
            return false;
        }
        if (!(this.f18437d == iVar.f18437d)) {
            return false;
        }
        iVar.getClass();
        return C19383o.m32792b((Object) null, (Object) null);
    }

    public final int hashCode() {
        return C0069a.m170a(this.f18437d, C0069a.m170a(this.f18436c, C0023f.m104c(this.f18435b, Float.hashCode(this.f18434a) * 31, 31), 31), 31) + 0;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("Stroke(width=");
        h.append(this.f18434a);
        h.append(", miter=");
        h.append(this.f18435b);
        h.append(", cap=");
        h.append(C1534m0.m3312a(this.f18436c));
        h.append(", join=");
        h.append(C1536n0.m3314a(this.f18437d));
        h.append(", pathEffect=");
        h.append((Object) null);
        h.append(')');
        return h.toString();
    }
}

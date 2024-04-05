package p370ie;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.core.listingnomapper.TextDialogActivity;
import com.etsy.android.p327ui.navigation.ActivityAnimationMode;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p010a9.C0048b;
import p363he.C12818b;
import p363he.C12824f;

/* renamed from: ie.k */
public final class C12951k implements C12818b {

    /* renamed from: b */
    public final String f28526b;

    /* renamed from: c */
    public final String f28527c;

    /* renamed from: d */
    public final String f28528d;

    public C12951k(String str, String str2, String str3) {
        C0048b.m167f(str, "referrer", str2, "text", str3, "title");
        this.f28526b = str;
        this.f28527c = str2;
        this.f28528d = str3;
    }

    public final boolean clearTask() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12951k)) {
            return false;
        }
        C12951k kVar = (C12951k) obj;
        return C19383o.m32792b(this.f28526b, kVar.f28526b) && C19383o.m32792b(this.f28527c, kVar.f28527c) && C19383o.m32792b(this.f28528d, kVar.f28528d);
    }

    public final ActivityAnimationMode getAnimationMode() {
        return ActivityAnimationMode.SLIDE_BOTTOM;
    }

    public final Class<?> getClazz() {
        return TextDialogActivity.class;
    }

    public final C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", this.f28526b);
        fVar.f28304a.put("text", this.f28527c);
        fVar.f28304a.put("title", this.f28528d);
        return fVar;
    }

    public final int hashCode() {
        return this.f28528d.hashCode() + C0023f.m105e(this.f28527c, this.f28526b.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("TextDialogActivityKey(referrer=");
        h.append(this.f28526b);
        h.append(", text=");
        h.append(this.f28527c);
        h.append(", title=");
        return C0391c.m1057c(h, this.f28528d, ')');
    }
}

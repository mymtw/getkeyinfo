package p370ie;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.dialog.TextInfoActivity;
import com.etsy.android.p327ui.navigation.ActivityAnimationMode;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p363he.C12818b;
import p363he.C12824f;

/* renamed from: ie.l */
public final class C12952l implements C12818b {

    /* renamed from: b */
    public final String f28529b;

    /* renamed from: c */
    public final String f28530c;

    /* renamed from: d */
    public final String f28531d;

    public C12952l(String str, String str2, String str3) {
        this.f28529b = str;
        this.f28530c = str2;
        this.f28531d = str3;
    }

    public final boolean clearTask() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12952l)) {
            return false;
        }
        C12952l lVar = (C12952l) obj;
        return C19383o.m32792b(this.f28529b, lVar.f28529b) && C19383o.m32792b(this.f28530c, lVar.f28530c) && C19383o.m32792b(this.f28531d, lVar.f28531d);
    }

    public final ActivityAnimationMode getAnimationMode() {
        return ActivityAnimationMode.FADE_SLOW;
    }

    public final Class<?> getClazz() {
        return TextInfoActivity.class;
    }

    public final C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", this.f28529b);
        fVar.f28304a.put("title", this.f28530c);
        fVar.f28304a.put("text", this.f28531d);
        return fVar;
    }

    public final int hashCode() {
        return this.f28531d.hashCode() + C0023f.m105e(this.f28530c, this.f28529b.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("TextInfoActivityKey(referrer=");
        h.append(this.f28529b);
        h.append(", title=");
        h.append(this.f28530c);
        h.append(", content=");
        return C0391c.m1057c(h, this.f28531d, ')');
    }
}

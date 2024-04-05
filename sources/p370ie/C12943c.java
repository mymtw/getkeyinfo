package p370ie;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.navigation.ActivityAnimationMode;
import com.etsy.android.uikit.CustomViewDemoActivity;
import kotlin.jvm.internal.C19383o;
import p363he.C12818b;
import p363he.C12824f;

/* renamed from: ie.c */
public final class C12943c implements C12818b {

    /* renamed from: b */
    public final String f28509b;

    public C12943c(String str) {
        this.f28509b = str;
    }

    public final boolean clearTask() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12943c) && C19383o.m32792b(this.f28509b, ((C12943c) obj).f28509b);
    }

    public final ActivityAnimationMode getAnimationMode() {
        return ActivityAnimationMode.BOTTOM_NAV_FADE_IN_OUT;
    }

    public final Class<?> getClazz() {
        return CustomViewDemoActivity.class;
    }

    public final C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", this.f28509b);
        return fVar;
    }

    public final int hashCode() {
        return this.f28509b.hashCode();
    }

    public final String toString() {
        return C0391c.m1057c(C0072d.m201h("CustomViewDemoActivityKey(referrer="), this.f28509b, ')');
    }
}

package p370ie;

import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.BOEActivity;
import com.etsy.android.p327ui.navigation.ActivityAnimationMode;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import kotlin.jvm.internal.C19383o;
import p363he.C12818b;
import p363he.C12824f;

/* renamed from: ie.a */
public final class C12941a implements C12818b {

    /* renamed from: b */
    public final String f28499b;

    /* renamed from: c */
    public final FragmentNavigationKey f28500c;

    /* renamed from: d */
    public final Bundle f28501d;

    /* renamed from: e */
    public final boolean f28502e;

    public C12941a(String str, FragmentNavigationKey fragmentNavigationKey, Bundle bundle, boolean z) {
        this.f28499b = str;
        this.f28500c = fragmentNavigationKey;
        this.f28501d = bundle;
        this.f28502e = z;
    }

    public final boolean clearTask() {
        return this.f28502e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12941a)) {
            return false;
        }
        C12941a aVar = (C12941a) obj;
        return C19383o.m32792b(this.f28499b, aVar.f28499b) && C19383o.m32792b(this.f28500c, aVar.f28500c) && C19383o.m32792b(this.f28501d, aVar.f28501d) && this.f28502e == aVar.f28502e;
    }

    public final ActivityAnimationMode getAnimationMode() {
        return ActivityAnimationMode.BOTTOM_NAV_FADE_IN_OUT;
    }

    public final Class<?> getClazz() {
        return BOEActivity.class;
    }

    public final C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put("fragment_key_param", this.f28500c);
        if (this.f28499b.length() > 0) {
            fVar.f28304a.put(".ref", this.f28499b);
        }
        Bundle bundle = this.f28501d;
        if (bundle != null) {
            fVar.f28304a.put("referral_args", bundle);
        }
        return fVar;
    }

    public final int hashCode() {
        int hashCode = (this.f28500c.hashCode() + (this.f28499b.hashCode() * 31)) * 31;
        Bundle bundle = this.f28501d;
        int hashCode2 = (hashCode + (bundle == null ? 0 : bundle.hashCode())) * 31;
        boolean z = this.f28502e;
        if (z) {
            z = true;
        }
        return hashCode2 + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("BOEActivityKey(referrer=");
        h.append(this.f28499b);
        h.append(", fragmentNavigationKey=");
        h.append(this.f28500c);
        h.append(", referrerBundle=");
        h.append(this.f28501d);
        h.append(", forceClearTask=");
        return C0391c.m1058d(h, this.f28502e, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12941a(String str, FragmentNavigationKey fragmentNavigationKey, boolean z, int i) {
        this(str, fragmentNavigationKey, (Bundle) null, (i & 8) != 0 ? false : z);
    }
}

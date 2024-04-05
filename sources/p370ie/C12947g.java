package p370ie;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.core.ShopAboutVideoActivity;
import com.etsy.android.p327ui.navigation.ActivityAnimationMode;
import kotlin.jvm.internal.C19383o;
import p363he.C12818b;
import p363he.C12824f;

/* renamed from: ie.g */
public final class C12947g implements C12818b {

    /* renamed from: b */
    public final String f28512b;

    /* renamed from: c */
    public final EtsyId f28513c;

    /* renamed from: d */
    public final String f28514d;

    public C12947g(String str, EtsyId etsyId, String str2) {
        this.f28512b = str;
        this.f28513c = etsyId;
        this.f28514d = str2;
    }

    public final boolean clearTask() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12947g)) {
            return false;
        }
        C12947g gVar = (C12947g) obj;
        return C19383o.m32792b(this.f28512b, gVar.f28512b) && C19383o.m32792b(this.f28513c, gVar.f28513c) && C19383o.m32792b(this.f28514d, gVar.f28514d);
    }

    public final ActivityAnimationMode getAnimationMode() {
        return ActivityAnimationMode.BOTTOM_NAV_FADE_IN_OUT;
    }

    public final Class<?> getClazz() {
        return ShopAboutVideoActivity.class;
    }

    public final C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", this.f28512b);
        fVar.f28304a.put("video_url", this.f28514d);
        fVar.f28304a.put("shop_id", this.f28513c);
        return fVar;
    }

    public final int hashCode() {
        int hashCode = this.f28513c.hashCode();
        return this.f28514d.hashCode() + ((hashCode + (this.f28512b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ShopAboutVideoKey(referrer=");
        h.append(this.f28512b);
        h.append(", shopId=");
        h.append(this.f28513c);
        h.append(", videoUrl=");
        return C0391c.m1057c(h, this.f28514d, ')');
    }
}

package p370ie;

import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.deeplinks.EtsyAction;
import com.etsy.android.p327ui.navigation.ActivityAnimationMode;
import com.etsy.android.p327ui.user.auth.SignInActivity;
import kotlin.jvm.internal.C19383o;
import p363he.C12818b;
import p363he.C12824f;
import p628nj.C18263b;

/* renamed from: ie.h */
public final class C12948h implements C12818b {

    /* renamed from: b */
    public final String f28515b;

    /* renamed from: c */
    public final EtsyAction f28516c;

    /* renamed from: d */
    public final Bundle f28517d;

    /* renamed from: e */
    public final String f28518e;

    /* renamed from: f */
    public final String f28519f;

    /* renamed from: g */
    public final String f28520g;

    public C12948h(String str, EtsyAction etsyAction, Bundle bundle, String str2, String str3, String str4, int i) {
        etsyAction = (i & 2) != 0 ? EtsyAction.VIEW : etsyAction;
        bundle = (i & 4) != 0 ? null : bundle;
        str2 = (i & 8) != 0 ? null : str2;
        str3 = (i & 16) != 0 ? null : str3;
        str4 = (i & 32) != 0 ? null : str4;
        C19383o.m32797g(etsyAction, "signInAction");
        this.f28515b = str;
        this.f28516c = etsyAction;
        this.f28517d = bundle;
        this.f28518e = str2;
        this.f28519f = str3;
        this.f28520g = str4;
    }

    public final boolean clearTask() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12948h)) {
            return false;
        }
        C12948h hVar = (C12948h) obj;
        return C19383o.m32792b(this.f28515b, hVar.f28515b) && this.f28516c == hVar.f28516c && C19383o.m32792b(this.f28517d, hVar.f28517d) && C19383o.m32792b(this.f28518e, hVar.f28518e) && C19383o.m32792b(this.f28519f, hVar.f28519f) && C19383o.m32792b(this.f28520g, hVar.f28520g);
    }

    public final ActivityAnimationMode getAnimationMode() {
        return ActivityAnimationMode.FADE_SLOW;
    }

    public final Class<?> getClazz() {
        return SignInActivity.class;
    }

    public final C12824f getNavigationParams() {
        String type;
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", this.f28515b);
        fVar.f28304a.put(EtsyAction.ACTION_TYPE_NAME, this.f28516c.getType());
        Boolean bool = Boolean.TRUE;
        fVar.f28304a.put(SignInActivity.EXTRA_SHOW_SOCIAL_BUTTONS, bool);
        if (this.f28517d != null) {
            String type2 = this.f28516c.getType();
            if (type2 != null) {
                fVar.f28304a.put(type2, this.f28517d);
            }
        } else if (C18263b.m30839d0(this.f28518e) && (type = this.f28516c.getType()) != null) {
            fVar.f28304a.put(type, this.f28518e);
        }
        if (C18263b.m30839d0(this.f28519f)) {
            fVar.f28304a.put(SignInActivity.EXTRA_SIGN_IN_AS, bool);
            fVar.f28304a.put(SignInActivity.EXTRA_SIGN_IN_AS_TOKEN, this.f28519f);
        } else if (C18263b.m30839d0(this.f28520g)) {
            fVar.f28304a.put(SignInActivity.EXTRA_MAGIC_LINK, this.f28520g);
        } else {
            fVar.f28304a.put(SignInActivity.EXTRA_SIGN_IN, bool);
        }
        return fVar;
    }

    public final int hashCode() {
        int hashCode = (this.f28516c.hashCode() + (this.f28515b.hashCode() * 31)) * 31;
        Bundle bundle = this.f28517d;
        int i = 0;
        int hashCode2 = (hashCode + (bundle == null ? 0 : bundle.hashCode())) * 31;
        String str = this.f28518e;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f28519f;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f28520g;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SignInActivityKey(referrer=");
        h.append(this.f28515b);
        h.append(", signInAction=");
        h.append(this.f28516c);
        h.append(", actionBundle=");
        h.append(this.f28517d);
        h.append(", actionData=");
        h.append(this.f28518e);
        h.append(", signInAsToken=");
        h.append(this.f28519f);
        h.append(", magicLink=");
        return C0391c.m1057c(h, this.f28520g, ')');
    }
}

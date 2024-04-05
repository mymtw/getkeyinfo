package p370ie;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import androidx.fragment.app.Fragment;
import com.etsy.android.p327ui.navigation.ActivityAnimationMode;
import com.etsy.android.p327ui.shop.ShopHomeFragment;
import com.etsy.android.p327ui.user.auth.SignInActivity;
import com.google.logging.type.LogSeverity;
import kotlin.jvm.internal.C19383o;
import p363he.C12817a;
import p363he.C12824f;

/* renamed from: ie.i */
public final class C12949i implements C12817a {

    /* renamed from: b */
    public final C12948h f28521b;

    /* renamed from: c */
    public final Fragment f28522c;

    /* renamed from: d */
    public final int f28523d;

    public C12949i(C12948h hVar, Fragment fragment, int i) {
        this.f28521b = hVar;
        this.f28522c = fragment;
        this.f28523d = i;
    }

    /* renamed from: a */
    public final String mo45589a() {
        return this.f28521b.f28516c.getIntentAction();
    }

    /* renamed from: b */
    public final int mo45590b() {
        return this.f28523d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12949i)) {
            return false;
        }
        C12949i iVar = (C12949i) obj;
        return C19383o.m32792b(this.f28521b, iVar.f28521b) && C19383o.m32792b(this.f28522c, iVar.f28522c) && this.f28523d == iVar.f28523d;
    }

    public final ActivityAnimationMode getAnimationMode() {
        return ActivityAnimationMode.FADE_SLOW;
    }

    public final Class<?> getClazz() {
        return SignInActivity.class;
    }

    public final Fragment getFragment() {
        return this.f28522c;
    }

    public final C12824f getNavigationParams() {
        return this.f28521b.getNavigationParams();
    }

    public final int hashCode() {
        int hashCode = this.f28521b.hashCode() * 31;
        Fragment fragment = this.f28522c;
        return Integer.hashCode(this.f28523d) + ((hashCode + (fragment == null ? 0 : fragment.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SignInForResultKey(key=");
        h.append(this.f28521b);
        h.append(", fragment=");
        h.append(this.f28522c);
        h.append(", requestCode=");
        return C0073e.m208h(h, this.f28523d, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12949i(C12948h hVar, ShopHomeFragment shopHomeFragment, int i) {
        this(hVar, (Fragment) (i & 2) != 0 ? null : shopHomeFragment, (i & 4) != 0 ? LogSeverity.NOTICE_VALUE : 0);
    }
}

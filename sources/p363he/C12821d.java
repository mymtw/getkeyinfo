package p363he;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.nav.NotificationActivity;
import kotlin.jvm.internal.C19383o;

/* renamed from: he.d */
public final class C12821d implements C12822e {

    /* renamed from: b */
    public final String f28302b;

    /* renamed from: c */
    public final Class<NotificationActivity> f28303c = NotificationActivity.class;

    public C12821d(String str) {
        C19383o.m32797g(str, "deepLinkUrl");
        this.f28302b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12821d) && C19383o.m32792b(this.f28302b, ((C12821d) obj).f28302b);
    }

    public final int hashCode() {
        return this.f28302b.hashCode();
    }

    public final String toString() {
        return C0391c.m1057c(C0072d.m201h("InternalDeepLinkKey(deepLinkUrl="), this.f28302b, ')');
    }
}

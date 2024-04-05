package p458uc;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import com.etsy.android.stylekit.views.CollageAlert;
import kotlin.jvm.internal.C19383o;

/* renamed from: uc.e */
public final class C13472e {

    /* renamed from: a */
    public final CollageAlert.AlertType f29492a;

    /* renamed from: b */
    public final int f29493b;

    /* renamed from: c */
    public final int f29494c;

    public C13472e(CollageAlert.AlertType alertType, int i, int i2) {
        C19383o.m32797g(alertType, "alertType");
        this.f29492a = alertType;
        this.f29493b = i;
        this.f29494c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13472e)) {
            return false;
        }
        C13472e eVar = (C13472e) obj;
        return this.f29492a == eVar.f29492a && this.f29493b == eVar.f29493b && this.f29494c == eVar.f29494c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f29494c) + C0069a.m170a(this.f29493b, this.f29492a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("PurchaseClaimUiModel(alertType=");
        h.append(this.f29492a);
        h.append(", bodyText=");
        h.append(this.f29493b);
        h.append(", icon=");
        return C0073e.m208h(h, this.f29494c, ')');
    }
}

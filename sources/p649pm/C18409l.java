package p649pm;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.nav.NotificationActivity;
import p003a2.C0015b;
import p003a2.C0023f;

/* renamed from: pm.l */
public final class C18409l {

    /* renamed from: a */
    public final Class<?> f40487a;

    /* renamed from: b */
    public final int f40488b;

    /* renamed from: c */
    public final int f40489c;

    public C18409l(int i, int i2, Class cls) {
        this.f40487a = cls;
        this.f40488b = i;
        this.f40489c = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18409l)) {
            return false;
        }
        C18409l lVar = (C18409l) obj;
        return this.f40487a == lVar.f40487a && this.f40488b == lVar.f40488b && this.f40489c == lVar.f40489c;
    }

    public final int hashCode() {
        return ((((this.f40487a.hashCode() ^ 1000003) * 1000003) ^ this.f40488b) * 1000003) ^ this.f40489c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f40487a);
        sb.append(", type=");
        int i = this.f40488b;
        sb.append(i == 1 ? ResponseConstants.REQUIRED : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i2 = this.f40489c;
        if (i2 == 0) {
            str = "direct";
        } else if (i2 == 1) {
            str = "provider";
        } else if (i2 == 2) {
            str = NotificationActivity.ETSY_DEFERRED_PARAM;
        } else {
            throw new AssertionError(C0015b.m88g("Unsupported injection: ", i2));
        }
        return C0023f.m110k(sb, str, "}");
    }
}

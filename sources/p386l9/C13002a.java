package p386l9;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.User;
import com.etsy.android.lib.network.oauth2.XAuthAccessToken;
import kotlin.jvm.internal.C19383o;

/* renamed from: l9.a */
public abstract class C13002a {

    /* renamed from: l9.a$a */
    public static final class C13003a extends C13002a {

        /* renamed from: a */
        public final XAuthAccessToken f28623a;

        /* renamed from: b */
        public final User f28624b = null;

        public C13003a(XAuthAccessToken xAuthAccessToken) {
            this.f28623a = xAuthAccessToken;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13003a)) {
                return false;
            }
            C13003a aVar = (C13003a) obj;
            return C19383o.m32792b(this.f28623a, aVar.f28623a) && C19383o.m32792b(this.f28624b, aVar.f28624b);
        }

        public final int hashCode() {
            int hashCode = this.f28623a.hashCode() * 31;
            User user = this.f28624b;
            return hashCode + (user == null ? 0 : user.hashCode());
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("SuccessSignInAs(xAuthAccessToken=");
            h.append(this.f28623a);
            h.append(", user=");
            h.append(this.f28624b);
            h.append(')');
            return h.toString();
        }
    }
}

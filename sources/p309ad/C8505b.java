package p309ad;

import androidx.compose.p015ui.text.input.C1993m;
import com.paypal.pyplcheckout.userprofile.model.UserStateKt;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p001a0.C0005b;
import p322cd.C8580a;
import p322cd.C8581b;
import p772tq.C20203a;

/* renamed from: ad.b */
public final class C8505b {
    /* renamed from: a */
    public static C8508d m16923a(String str) {
        C19383o.m32797g(str, "countryCode");
        int hashCode = str.hashCode();
        if (hashCode != 2142) {
            if (hashCode != 2341) {
                if (hashCode == 2718 && str.equals(UserStateKt.US_COUNTRY)) {
                    return new C19421p();
                }
            } else if (str.equals("IN")) {
                return new C8580a();
            }
        } else if (str.equals("CA")) {
            return new C20203a();
        }
        return null;
    }

    /* renamed from: b */
    public static C8509e m16924b(String str) {
        C19383o.m32797g(str, "countryCode");
        int hashCode = str.hashCode();
        if (hashCode != 2142) {
            if (hashCode != 2341) {
                if (hashCode == 2718 && str.equals(UserStateKt.US_COUNTRY)) {
                    return new C0005b();
                }
            } else if (str.equals("IN")) {
                return new C8581b();
            }
        } else if (str.equals("CA")) {
            return new C1993m();
        }
        return null;
    }
}

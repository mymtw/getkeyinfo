package p370ie;

import android.net.Uri;
import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;

/* renamed from: ie.d */
public final class C12944d implements C12946f {

    /* renamed from: a */
    public final String f28510a;

    public C12944d(String str) {
        C19383o.m32797g(str, "phoneNumber");
        this.f28510a = str;
    }

    /* renamed from: a */
    public final String mo45714a() {
        return "android.intent.action.DIAL";
    }

    /* renamed from: b */
    public final Uri mo45715b() {
        StringBuilder h = C0072d.m201h("tel:");
        h.append(this.f28510a);
        return Uri.parse(h.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12944d) && C19383o.m32792b(this.f28510a, ((C12944d) obj).f28510a);
    }

    public final Bundle getExtras() {
        return null;
    }

    public final int hashCode() {
        return this.f28510a.hashCode();
    }

    public final String toString() {
        return C0391c.m1057c(C0072d.m201h("DialerActivityKey(phoneNumber="), this.f28510a, ')');
    }
}

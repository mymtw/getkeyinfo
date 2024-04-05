package p370ie;

import android.net.Uri;
import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import kotlin.jvm.internal.C19383o;

/* renamed from: ie.j */
public final class C12950j implements C12946f {

    /* renamed from: a */
    public final String f28524a;

    /* renamed from: b */
    public final int f28525b;

    public C12950j(String str, int i) {
        this.f28524a = str;
        this.f28525b = i;
    }

    /* renamed from: a */
    public final String mo45714a() {
        return "android.settings.APP_NOTIFICATION_SETTINGS";
    }

    /* renamed from: b */
    public final Uri mo45715b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12950j)) {
            return false;
        }
        C12950j jVar = (C12950j) obj;
        return C19383o.m32792b(this.f28524a, jVar.f28524a) && this.f28525b == jVar.f28525b;
    }

    public final Bundle getExtras() {
        Bundle bundle = new Bundle();
        bundle.putString("android.provider.extra.APP_PACKAGE", this.f28524a);
        return bundle;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f28525b) + (this.f28524a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SystemNotificationSettingsActivityKey(packageName=");
        h.append(this.f28524a);
        h.append(", appUid=");
        return C0073e.m208h(h, this.f28525b, ')');
    }
}

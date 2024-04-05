package p094e7;

import java.security.PrivilegedAction;

/* renamed from: e7.a */
public final class C6755a implements PrivilegedAction {

    /* renamed from: a */
    public final /* synthetic */ String f14883a;

    public C6755a(String str) {
        this.f14883a = str;
    }

    public final Object run() {
        try {
            return Class.forName(this.f14883a);
        } catch (Exception unused) {
            return null;
        }
    }
}

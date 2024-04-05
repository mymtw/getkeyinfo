package p708wo;

import android.support.p013v4.media.C0073e;
import android.util.Log;

/* renamed from: wo.a */
public final class C18755a {

    /* renamed from: b */
    public static C18755a f41538b;

    /* renamed from: a */
    public final int f41539a;

    public C18755a() {
        int i = 7;
        while (i >= 2 && Log.isLoggable("AppAuth", i)) {
            i--;
        }
        this.f41539a = i + 1;
    }

    /* renamed from: a */
    public static void m31630a(String str, Object... objArr) {
        m31631b().mo70245c(3, (Exception) null, str, objArr);
    }

    /* renamed from: b */
    public static synchronized C18755a m31631b() {
        C18755a aVar;
        synchronized (C18755a.class) {
            if (f41538b == null) {
                f41538b = new C18755a();
            }
            aVar = f41538b;
        }
        return aVar;
    }

    /* renamed from: c */
    public final void mo70245c(int i, Exception exc, String str, Object... objArr) {
        if (this.f41539a <= i) {
            if (objArr.length >= 1) {
                str = String.format(str, objArr);
            }
            if (exc != null) {
                StringBuilder k = C0073e.m211k(str, "\n");
                k.append(Log.getStackTraceString(exc));
                str = k.toString();
            }
            Log.println(i, "AppAuth", str);
        }
    }
}

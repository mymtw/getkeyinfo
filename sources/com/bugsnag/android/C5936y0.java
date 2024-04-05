package com.bugsnag.android;

import android.os.StrictMode;
import androidx.compose.foundation.layout.C0761x;
import java.lang.Thread;
import java.util.List;
import java.util.Locale;

/* renamed from: com.bugsnag.android.y0 */
public final class C5936y0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final Thread.UncaughtExceptionHandler f12713a;

    /* renamed from: b */
    public final C5804l2 f12714b = new C5804l2();

    /* renamed from: c */
    public final C5917u f12715c;

    /* renamed from: d */
    public final C5816o1 f12716d;

    public C5936y0(C5917u uVar, C5816o1 o1Var) {
        this.f12715c = uVar;
        this.f12716d = o1Var;
        this.f12713a = Thread.getDefaultUncaughtExceptionHandler();
    }

    /* renamed from: a */
    public final void mo16702a(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f12713a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
            return;
        }
        System.err.printf("Exception in thread \"%s\" ", new Object[]{thread.getName()});
        this.f12716d.mo16602b("Exception", th);
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        String str;
        try {
            if (this.f12715c.f12622a.mo16547d(th)) {
                mo16702a(thread, th);
                return;
            }
            this.f12714b.getClass();
            List J0 = C0761x.m1674J0(th);
            boolean startsWith = ((Throwable) J0.get(J0.size() - 1)).getClass().getName().toLowerCase(Locale.US).startsWith("android.os.strictmode");
            C5829r1 r1Var = new C5829r1();
            if (startsWith) {
                C5804l2 l2Var = this.f12714b;
                String message = th.getMessage();
                l2Var.getClass();
                String a = C5804l2.m11580a(message);
                C5829r1 r1Var2 = new C5829r1();
                r1Var2.mo16615a("StrictMode", "Violation", a);
                C5829r1 r1Var3 = r1Var2;
                str = a;
                r1Var = r1Var3;
            } else {
                str = null;
            }
            String str2 = startsWith ? "strictMode" : "unhandledException";
            if (startsWith) {
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
                this.f12715c.mo16686e(th, r1Var, str2, str);
                StrictMode.setThreadPolicy(threadPolicy);
            } else {
                this.f12715c.mo16686e(th, r1Var, str2, (String) null);
            }
            mo16702a(thread, th);
        } catch (Throwable unused) {
        }
    }
}

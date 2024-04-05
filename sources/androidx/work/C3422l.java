package androidx.work;

import android.support.p013v4.media.C0069a;
import android.util.Log;

/* renamed from: androidx.work.l */
public abstract class C3422l {

    /* renamed from: a */
    public static C3422l f8027a;

    /* renamed from: androidx.work.l$a */
    public static class C3423a extends C3422l {

        /* renamed from: b */
        public int f8028b;

        public C3423a(int i) {
            this.f8028b = i;
        }

        /* renamed from: a */
        public final void mo12926a(String str, String str2, Throwable... thArr) {
            if (this.f8028b > 3) {
                return;
            }
            if (thArr.length >= 1) {
                Log.d(str, str2, thArr[0]);
            } else {
                Log.d(str, str2);
            }
        }

        /* renamed from: b */
        public final void mo12927b(String str, String str2, Throwable... thArr) {
            if (this.f8028b > 6) {
                return;
            }
            if (thArr.length >= 1) {
                Log.e(str, str2, thArr[0]);
            } else {
                Log.e(str, str2);
            }
        }

        /* renamed from: d */
        public final void mo12928d(String str, String str2, Throwable... thArr) {
            if (this.f8028b > 4) {
                return;
            }
            if (thArr.length >= 1) {
                Log.i(str, str2, thArr[0]);
            } else {
                Log.i(str, str2);
            }
        }

        /* renamed from: f */
        public final void mo12929f(String str, String str2, Throwable... thArr) {
            if (this.f8028b > 5) {
                return;
            }
            if (thArr.length >= 1) {
                Log.w(str, str2, thArr[0]);
            } else {
                Log.w(str, str2);
            }
        }
    }

    /* renamed from: c */
    public static synchronized C3422l m8213c() {
        C3422l lVar;
        synchronized (C3422l.class) {
            if (f8027a == null) {
                f8027a = new C3423a(3);
            }
            lVar = f8027a;
        }
        return lVar;
    }

    /* renamed from: e */
    public static String m8214e(String str) {
        int length = str.length();
        StringBuilder g = C0069a.m176g(23, "WM-");
        if (length >= 20) {
            g.append(str.substring(0, 20));
        } else {
            g.append(str);
        }
        return g.toString();
    }

    /* renamed from: a */
    public abstract void mo12926a(String str, String str2, Throwable... thArr);

    /* renamed from: b */
    public abstract void mo12927b(String str, String str2, Throwable... thArr);

    /* renamed from: d */
    public abstract void mo12928d(String str, String str2, Throwable... thArr);

    /* renamed from: f */
    public abstract void mo12929f(String str, String str2, Throwable... thArr);
}

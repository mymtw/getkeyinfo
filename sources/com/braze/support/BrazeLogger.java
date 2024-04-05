package com.braze.support;

import android.support.p013v4.media.C0072d;
import android.util.Log;
import com.appboy.Constants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C19457k;
import kotlin.text.C19459m;
import p003a2.C0023f;
import p030bo.app.C4105q5;
import p030bo.app.C4281x5;
import p753kq.C19846a;

public final class BrazeLogger {

    /* renamed from: a */
    public static final BrazeLogger f11932a = new BrazeLogger();

    /* renamed from: b */
    public static C4281x5 f11933b = null;

    /* renamed from: c */
    public static boolean f11934c = false;

    /* renamed from: d */
    public static boolean f11935d = false;

    /* renamed from: e */
    public static int f11936e = 4;

    public enum Priority {
        D(3),
        I(4),
        E(6),
        V(2),
        W(5);
        
        private final int logLevel;

        private Priority(int i) {
            this.logLevel = i;
        }

        public final int getLogLevel() {
            return this.logLevel;
        }
    }

    /* renamed from: com.braze.support.BrazeLogger$a */
    public /* synthetic */ class C5571a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11942a;

        static {
            int[] iArr = new int[Priority.values().length];
            iArr[Priority.D.ordinal()] = 1;
            iArr[Priority.I.ordinal()] = 2;
            iArr[Priority.E.ordinal()] = 3;
            iArr[Priority.W.ordinal()] = 4;
            iArr[Priority.V.ordinal()] = 5;
            f11942a = iArr;
        }
    }

    /* renamed from: com.braze.support.BrazeLogger$b */
    public static final class C5572b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Exception f11943b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5572b(Exception exc) {
            super(0);
            this.f11943b = exc;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11943b, "Failed to append to test user device log. ");
        }
    }

    /* renamed from: com.braze.support.BrazeLogger$c */
    public static final class C5573c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11944b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5573c(String str) {
            super(0);
            this.f11944b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C0023f.m110k(C0072d.m201h("BrazeLogger log level set to "), this.f11944b, " via device system property. Note that subsequent calls to BrazeLogger.setLogLevel() will have no effect.");
        }
    }

    /* renamed from: com.braze.support.BrazeLogger$d */
    public static final class C5574d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ int f11945b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5574d(int i) {
            super(0);
            this.f11945b = i;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(Integer.valueOf(this.f11945b), "Log level already set via system property. BrazeLogger.setLogLevel() ignored for level: ");
        }
    }

    /* renamed from: b */
    public static String m11280b(Object obj) {
        C19383o.m32797g(obj, "<this>");
        String name = obj.getClass().getName();
        String F1 = C19459m.m33033F1(name, '$');
        String D1 = C19459m.m33031D1(F1, F1);
        return D1.length() == 0 ? C19383o.m32802l(name, Constants.LOG_TAG_PREFIX) : C19383o.m32802l(D1, Constants.LOG_TAG_PREFIX);
    }

    /* renamed from: c */
    public static void m11281c(String str, Priority priority, Throwable th, boolean z, C19846a aVar) {
        C19383o.m32797g(str, "tag");
        C19383o.m32797g(priority, "priority");
        C19383o.m32797g(aVar, "message");
        if (f11936e > priority.getLogLevel()) {
            boolean z2 = false;
            if (z) {
                C4281x5 x5Var = f11933b;
                if (x5Var == null ? false : x5Var.mo14185e()) {
                    z2 = true;
                }
            }
            if (!z2) {
                return;
            }
        }
        int i = C5571a.f11942a[priority.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            if (th == null) {
                                m11290l(aVar);
                            } else {
                                m11290l(aVar);
                            }
                        }
                    } else if (th == null) {
                        Log.w(str, m11290l(aVar));
                    } else {
                        Log.w(str, m11290l(aVar), th);
                    }
                } else if (th == null) {
                    Log.w(str, m11290l(aVar));
                } else {
                    Log.e(str, m11290l(aVar), th);
                }
            } else if (th == null) {
                Log.i(str, m11290l(aVar));
            } else {
                Log.i(str, m11290l(aVar), th);
            }
        } else if (th == null) {
            Log.d(str, m11290l(aVar));
        } else {
            Log.d(str, m11290l(aVar), th);
        }
    }

    /* renamed from: d */
    public static void m11282d(BrazeLogger brazeLogger, Object obj, Priority priority, Throwable th, C19846a aVar, int i) {
        if ((i & 1) != 0) {
            priority = Priority.D;
        }
        if ((i & 2) != 0) {
            th = null;
        }
        boolean z = false;
        boolean z2 = (i & 4) != 0;
        brazeLogger.getClass();
        C19383o.m32797g(obj, "<this>");
        C19383o.m32797g(priority, "priority");
        C19383o.m32797g(aVar, "message");
        if (f11936e > priority.getLogLevel()) {
            if (z2) {
                C4281x5 x5Var = f11933b;
                if (x5Var == null ? false : x5Var.mo14185e()) {
                    z = true;
                }
            }
            if (!z) {
                return;
            }
        }
        m11281c(m11280b(obj), priority, th, z2, aVar);
    }

    /* renamed from: e */
    public static /* synthetic */ void m11283e(String str, Priority priority, Throwable th, C19846a aVar, int i) {
        if ((i & 2) != 0) {
            priority = Priority.D;
        }
        if ((i & 4) != 0) {
            th = null;
        }
        m11281c(str, priority, th, (i & 8) != 0, aVar);
    }

    /* renamed from: f */
    public static final synchronized void m11284f() {
        synchronized (BrazeLogger.class) {
            C4105q5 q5Var = C4105q5.f9134a;
            BrazeLogger brazeLogger = f11932a;
            String a = q5Var.mo13916a("log.tag.APPBOY");
            if (C19457k.m33019W0("verbose", C19459m.m33035H1(a).toString(), true)) {
                f11934c = true;
                m11289k(2);
                m11282d(brazeLogger, brazeLogger, Priority.I, (Throwable) null, new C5573c(a), 6);
            }
        }
    }

    /* renamed from: g */
    public static final void m11285g(String str, String str2) {
        C19383o.m32797g(str, "tag");
        C19383o.m32797g(str2, "msg");
        f11932a.mo16117a(str, str2, (Throwable) null);
        if (f11936e <= 3) {
            Log.d(str, str2);
        }
    }

    /* renamed from: h */
    public static final void m11286h(String str, String str2, Throwable th) {
        C19383o.m32797g(str, "tag");
        C19383o.m32797g(str2, "msg");
        f11932a.mo16117a(str, str2, th);
        if (f11936e <= 6) {
            Log.e(str, str2, th);
        }
    }

    /* renamed from: i */
    public static final String m11287i(Class<?> cls) {
        String name = cls.getName();
        int length = name.length();
        if (length > 65) {
            name = name.substring(length - 65);
            C19383o.m32796f(name, "this as java.lang.String).substring(startIndex)");
        }
        return C19383o.m32802l(name, Constants.LOG_TAG_PREFIX);
    }

    /* renamed from: j */
    public static final void m11288j(String str, String str2) {
        C19383o.m32797g(str, "tag");
        C19383o.m32797g(str2, "msg");
        f11932a.mo16117a(str, str2, (Throwable) null);
        if (f11936e <= 4) {
            Log.i(str, str2);
        }
    }

    /* renamed from: k */
    public static final synchronized void m11289k(int i) {
        synchronized (BrazeLogger.class) {
            if (!f11934c) {
                f11935d = true;
                f11936e = i;
            } else {
                BrazeLogger brazeLogger = f11932a;
                m11282d(brazeLogger, brazeLogger, Priority.W, (Throwable) null, new C5574d(i), 6);
            }
        }
    }

    /* renamed from: l */
    public static String m11290l(C19846a aVar) {
        try {
            return String.valueOf(aVar.invoke());
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: m */
    public static final void m11291m(String str, String str2) {
        C19383o.m32797g(str, "tag");
        C19383o.m32797g(str2, "msg");
    }

    /* renamed from: n */
    public static final void m11292n(String str, String str2) {
        C19383o.m32797g(str, "tag");
        C19383o.m32797g(str2, "msg");
        m11294p(str, str2, (Exception) null, 12);
    }

    /* renamed from: o */
    public static final void m11293o(String str, String str2, Exception exc) {
        C19383o.m32797g(str, "tag");
        C19383o.m32797g(str2, "msg");
        m11294p(str, str2, exc, 8);
    }

    /* renamed from: p */
    public static void m11294p(String str, String str2, Exception exc, int i) {
        if ((i & 4) != 0) {
            exc = null;
        }
        boolean z = (i & 8) != 0;
        C19383o.m32797g(str, "tag");
        C19383o.m32797g(str2, "msg");
        if (z) {
            f11932a.mo16117a(str, str2, exc);
        }
        if (f11936e > 5) {
            return;
        }
        if (exc != null) {
            Log.w(str, str2, exc);
        } else {
            Log.w(str, str2);
        }
    }

    /* renamed from: a */
    public final void mo16117a(String str, String str2, Throwable th) {
        try {
            C4281x5 x5Var = f11933b;
            if (x5Var == null ? false : x5Var.mo14185e()) {
                C4281x5 x5Var2 = f11933b;
                if (x5Var2 != null) {
                    x5Var2.mo14180a(str, str2, th);
                } else {
                    C19383o.m32805o("testUserDeviceLoggingManager");
                    throw null;
                }
            }
        } catch (Exception e) {
            Exception exc = e;
            m11282d(this, this, Priority.E, exc, new C5572b(exc), 4);
        }
    }
}

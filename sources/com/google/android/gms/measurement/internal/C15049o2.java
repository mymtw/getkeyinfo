package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import org.apache.commons.cli.HelpFormatter;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: com.google.android.gms.measurement.internal.o2 */
public final class C15049o2 extends C15042n4 {

    /* renamed from: d */
    public char f33721d = 0;

    /* renamed from: e */
    public long f33722e = -1;

    /* renamed from: f */
    public String f33723f;

    /* renamed from: g */
    public final C15031m2 f33724g = new C15031m2(this, 6, false, false);

    /* renamed from: h */
    public final C15031m2 f33725h = new C15031m2(this, 6, true, false);

    /* renamed from: i */
    public final C15031m2 f33726i = new C15031m2(this, 6, false, true);

    /* renamed from: j */
    public final C15031m2 f33727j = new C15031m2(this, 5, false, false);

    /* renamed from: k */
    public final C15031m2 f33728k = new C15031m2(this, 5, true, false);

    /* renamed from: l */
    public final C15031m2 f33729l = new C15031m2(this, 5, false, true);

    /* renamed from: m */
    public final C15031m2 f33730m = new C15031m2(this, 4, false, false);

    /* renamed from: n */
    public final C15031m2 f33731n = new C15031m2(this, 3, false, false);

    /* renamed from: o */
    public final C15031m2 f33732o = new C15031m2(this, 2, false, false);

    public C15049o2(C15103u3 u3Var) {
        super(u3Var);
    }

    /* renamed from: p */
    public static C15040n2 m24575p(String str) {
        if (str == null) {
            return null;
        }
        return new C15040n2(str);
    }

    /* renamed from: q */
    public static String m24576q(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String r = m24577r(obj, z);
        String r2 = m24577r(obj2, z);
        String r3 = m24577r(obj3, z);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(r)) {
            sb.append(str2);
            sb.append(r);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(r2)) {
            sb.append(str2);
            sb.append(r2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(r3)) {
            sb.append(str3);
            sb.append(r3);
        }
        return sb.toString();
    }

    @VisibleForTesting
    /* renamed from: r */
    public static String m24577r(Object obj, boolean z) {
        String className;
        String str = "";
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            if (obj.toString().charAt(0) == '-') {
                str = HelpFormatter.DEFAULT_OPT_PREFIX;
            }
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 4.0d);
            StringBuilder sb = new StringBuilder(str.length() + str.length() + 43);
            sb.append(str);
            sb.append(round);
            sb.append("...");
            sb.append(str);
            sb.append(round2);
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return obj.toString();
        } else {
            if (!(obj instanceof Throwable)) {
                return obj instanceof C15040n2 ? ((C15040n2) obj).f33699a : z ? HelpFormatter.DEFAULT_OPT_PREFIX : obj.toString();
            }
            Throwable th = (Throwable) obj;
            StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
            String canonicalName = C15103u3.class.getCanonicalName();
            if (TextUtils.isEmpty(canonicalName)) {
                canonicalName = str;
            } else {
                int lastIndexOf = canonicalName.lastIndexOf(46);
                if (lastIndexOf != -1) {
                    canonicalName = canonicalName.substring(0, lastIndexOf);
                }
            }
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                    if (TextUtils.isEmpty(className)) {
                        className = str;
                    } else {
                        int lastIndexOf2 = className.lastIndexOf(46);
                        if (lastIndexOf2 != -1) {
                            className = className.substring(0, lastIndexOf2);
                        }
                    }
                    if (className.equals(canonicalName)) {
                        sb2.append(": ");
                        sb2.append(stackTraceElement);
                        break;
                    }
                }
                i++;
            }
            return sb2.toString();
        }
    }

    /* renamed from: h */
    public final boolean mo51952h() {
        return false;
    }

    /* renamed from: k */
    public final C15031m2 mo52274k() {
        return this.f33731n;
    }

    /* renamed from: l */
    public final C15031m2 mo52275l() {
        return this.f33724g;
    }

    /* renamed from: m */
    public final C15031m2 mo52276m() {
        return this.f33732o;
    }

    /* renamed from: n */
    public final C15031m2 mo52277n() {
        return this.f33727j;
    }

    /* renamed from: o */
    public final C15031m2 mo52278o() {
        return this.f33729l;
    }

    @EnsuresNonNull({"logTagDoNotUseDirectly"})
    @VisibleForTesting
    /* renamed from: s */
    public final String mo52279s() {
        String str;
        synchronized (this) {
            try {
                if (this.f33723f == null) {
                    C15051o4 o4Var = this.f33681b;
                    if (((C15103u3) o4Var).f33875e != null) {
                        this.f33723f = ((C15103u3) o4Var).f33875e;
                    } else {
                        ((C15103u3) ((C15103u3) o4Var).f33878h.f33681b).getClass();
                        this.f33723f = "FA";
                    }
                }
                Preconditions.checkNotNull(this.f33723f);
                str = this.f33723f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* renamed from: t */
    public final void mo52280t(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(mo52279s(), i)) {
            Log.println(i, mo52279s(), m24576q(false, str, obj, obj2, obj3));
        }
        if (!z2 && i >= 5) {
            Preconditions.checkNotNull(str);
            C15086s3 s3Var = ((C15103u3) this.f33681b).f33881k;
            if (s3Var == null) {
                Log.println(6, mo52279s(), "Scheduler not set. Not logging error/warn");
            } else if (!s3Var.f33708c) {
                Log.println(6, mo52279s(), "Scheduler not initialized. Not logging error/warn");
            } else {
                if (i >= 9) {
                    i = 8;
                }
                s3Var.mo52308o(new C15022l2(this, i, str, obj, obj2, obj3));
            }
        }
    }
}

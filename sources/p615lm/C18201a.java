package p615lm;

import android.os.Bundle;
import com.google.android.gms.common.util.ArrayUtils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import kotlinx.coroutines.C19543e0;

/* renamed from: lm.a */
public final class C18201a {

    /* renamed from: a */
    public static final List<String> f39847a = Arrays.asList(new String[]{"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"});

    /* renamed from: b */
    public static final List<String> f39848b = Arrays.asList(new String[]{"auto", "app", "am"});

    /* renamed from: c */
    public static final List<String> f39849c = Arrays.asList(new String[]{"_r", "_dbg"});

    /* renamed from: d */
    public static final List<String> f39850d = Arrays.asList((String[]) ArrayUtils.concat(C19543e0.f43494g, C19543e0.f43495h));

    /* renamed from: e */
    public static final List<String> f39851e = Arrays.asList(new String[]{"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"});

    static {
        new HashSet(Arrays.asList(new String[]{"_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}));
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m30700a(java.lang.String r4, android.os.Bundle r5, java.lang.String r6) {
        /*
            java.lang.String r0 = "_cmp"
            boolean r6 = r0.equals(r6)
            r0 = 1
            if (r6 != 0) goto L_0x000a
            return r0
        L_0x000a:
            java.util.List<java.lang.String> r6 = f39848b
            boolean r6 = r6.contains(r4)
            r6 = r6 ^ r0
            r1 = 0
            if (r6 != 0) goto L_0x0015
            return r1
        L_0x0015:
            if (r5 != 0) goto L_0x0018
            return r1
        L_0x0018:
            java.util.List<java.lang.String> r6 = f39849c
            java.util.Iterator r6 = r6.iterator()
        L_0x001e:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0031
            java.lang.Object r2 = r6.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r5.containsKey(r2)
            if (r2 == 0) goto L_0x001e
            return r1
        L_0x0031:
            int r6 = r4.hashCode()
            r2 = 101200(0x18b50, float:1.41811E-40)
            r3 = 2
            if (r6 == r2) goto L_0x005a
            r2 = 101230(0x18b6e, float:1.41853E-40)
            if (r6 == r2) goto L_0x0050
            r2 = 3142703(0x2ff42f, float:4.403865E-39)
            if (r6 == r2) goto L_0x0046
            goto L_0x0064
        L_0x0046:
            java.lang.String r6 = "fiam"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x0064
            r4 = r3
            goto L_0x0065
        L_0x0050:
            java.lang.String r6 = "fdl"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x0064
            r4 = r0
            goto L_0x0065
        L_0x005a:
            java.lang.String r6 = "fcm"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x0064
            r4 = r1
            goto L_0x0065
        L_0x0064:
            r4 = -1
        L_0x0065:
            java.lang.String r6 = "_cis"
            if (r4 == 0) goto L_0x007a
            if (r4 == r0) goto L_0x0074
            if (r4 == r3) goto L_0x006e
            return r1
        L_0x006e:
            java.lang.String r4 = "fiam_integration"
            r5.putString(r6, r4)
            return r0
        L_0x0074:
            java.lang.String r4 = "fdl_integration"
            r5.putString(r6, r4)
            return r0
        L_0x007a:
            java.lang.String r4 = "fcm_integration"
            r5.putString(r6, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p615lm.C18201a.m30700a(java.lang.String, android.os.Bundle, java.lang.String):boolean");
    }

    /* renamed from: b */
    public static boolean m30701b(Bundle bundle, String str) {
        if (f39847a.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        for (String containsKey : f39849c) {
            if (bundle.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m30702c(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (f39850d.contains(str2)) {
            return false;
        }
        for (String matches : f39851e) {
            if (str2.matches(matches)) {
                return false;
            }
        }
        return true;
    }
}

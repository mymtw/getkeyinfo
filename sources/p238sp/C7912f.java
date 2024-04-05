package p238sp;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.paypal.pyplcheckout.utils.BrowserPackages;
import java.lang.ref.WeakReference;

/* renamed from: sp.f */
public final class C7912f {

    /* renamed from: a */
    public static WeakReference<Activity> f17366a;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044 A[SYNTHETIC, Splitter:B:12:0x0044] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m15860a(java.lang.String r10, org.json.JSONObject r11) {
        /*
            java.lang.String r0 = "t5"
            java.lang.String r1 = "t4"
            java.lang.String r2 = "t3"
            java.lang.String r3 = "t2"
            java.lang.String r4 = "t1"
            java.lang.String r5 = "ct"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0031 }
            r6.<init>()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r7 = "~"
            r6.append(r7)     // Catch:{ Exception -> 0x0031 }
            io.branch.referral.Defines$Jsonkey r7 = p145io.branch.referral.Defines$Jsonkey.ReferringLink     // Catch:{ Exception -> 0x0031 }
            java.lang.String r7 = r7.getKey()     // Catch:{ Exception -> 0x0031 }
            r6.append(r7)     // Catch:{ Exception -> 0x0031 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r6 = r11.getString(r6)     // Catch:{ Exception -> 0x0031 }
            java.lang.String r7 = "\\?"
            java.lang.String[] r7 = r6.split(r7)     // Catch:{ Exception -> 0x0033 }
            r8 = 0
            r6 = r7[r8]     // Catch:{ Exception -> 0x0033 }
            goto L_0x0038
        L_0x0031:
            java.lang.String r6 = ""
        L_0x0033:
            java.lang.String r7 = "Failed to get referring link"
            p145io.branch.referral.C7077r.m13675a(r7)
        L_0x0038:
            java.lang.String r7 = "?validate=true"
            java.lang.String r6 = androidx.appcompat.widget.C0326j.m864i(r6, r7)
            boolean r7 = android.text.TextUtils.isEmpty(r10)
            if (r7 != 0) goto L_0x017f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017b }
            r7.<init>()     // Catch:{ Exception -> 0x017b }
            r7.append(r6)     // Catch:{ Exception -> 0x017b }
            java.lang.String r8 = r11.getString(r5)     // Catch:{ Exception -> 0x017b }
            boolean r8 = r8.equals(r4)     // Catch:{ Exception -> 0x017b }
            java.lang.String r9 = "&t1="
            if (r8 == 0) goto L_0x0068
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017b }
            r4.<init>()     // Catch:{ Exception -> 0x017b }
            r4.append(r9)     // Catch:{ Exception -> 0x017b }
            r4.append(r10)     // Catch:{ Exception -> 0x017b }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x017b }
            goto L_0x007b
        L_0x0068:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017b }
            r8.<init>()     // Catch:{ Exception -> 0x017b }
            r8.append(r9)     // Catch:{ Exception -> 0x017b }
            java.lang.String r4 = r11.getString(r4)     // Catch:{ Exception -> 0x017b }
            r8.append(r4)     // Catch:{ Exception -> 0x017b }
            java.lang.String r4 = r8.toString()     // Catch:{ Exception -> 0x017b }
        L_0x007b:
            r7.append(r4)     // Catch:{ Exception -> 0x017b }
            java.lang.String r6 = r7.toString()     // Catch:{ Exception -> 0x017b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017b }
            r4.<init>()     // Catch:{ Exception -> 0x017b }
            r4.append(r6)     // Catch:{ Exception -> 0x017b }
            java.lang.String r7 = r11.getString(r5)     // Catch:{ Exception -> 0x017b }
            boolean r7 = r7.equals(r3)     // Catch:{ Exception -> 0x017b }
            java.lang.String r8 = "&t2="
            if (r7 == 0) goto L_0x00a6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017b }
            r3.<init>()     // Catch:{ Exception -> 0x017b }
            r3.append(r8)     // Catch:{ Exception -> 0x017b }
            r3.append(r10)     // Catch:{ Exception -> 0x017b }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x017b }
            goto L_0x00b9
        L_0x00a6:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017b }
            r7.<init>()     // Catch:{ Exception -> 0x017b }
            r7.append(r8)     // Catch:{ Exception -> 0x017b }
            java.lang.String r3 = r11.getString(r3)     // Catch:{ Exception -> 0x017b }
            r7.append(r3)     // Catch:{ Exception -> 0x017b }
            java.lang.String r3 = r7.toString()     // Catch:{ Exception -> 0x017b }
        L_0x00b9:
            r4.append(r3)     // Catch:{ Exception -> 0x017b }
            java.lang.String r6 = r4.toString()     // Catch:{ Exception -> 0x017b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017b }
            r3.<init>()     // Catch:{ Exception -> 0x017b }
            r3.append(r6)     // Catch:{ Exception -> 0x017b }
            java.lang.String r4 = r11.getString(r5)     // Catch:{ Exception -> 0x017b }
            boolean r4 = r4.equals(r2)     // Catch:{ Exception -> 0x017b }
            java.lang.String r7 = "&t3="
            if (r4 == 0) goto L_0x00e4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017b }
            r2.<init>()     // Catch:{ Exception -> 0x017b }
            r2.append(r7)     // Catch:{ Exception -> 0x017b }
            r2.append(r10)     // Catch:{ Exception -> 0x017b }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x017b }
            goto L_0x00f7
        L_0x00e4:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017b }
            r4.<init>()     // Catch:{ Exception -> 0x017b }
            r4.append(r7)     // Catch:{ Exception -> 0x017b }
            java.lang.String r2 = r11.getString(r2)     // Catch:{ Exception -> 0x017b }
            r4.append(r2)     // Catch:{ Exception -> 0x017b }
            java.lang.String r2 = r4.toString()     // Catch:{ Exception -> 0x017b }
        L_0x00f7:
            r3.append(r2)     // Catch:{ Exception -> 0x017b }
            java.lang.String r6 = r3.toString()     // Catch:{ Exception -> 0x017b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017b }
            r2.<init>()     // Catch:{ Exception -> 0x017b }
            r2.append(r6)     // Catch:{ Exception -> 0x017b }
            java.lang.String r3 = r11.getString(r5)     // Catch:{ Exception -> 0x017b }
            boolean r3 = r3.equals(r1)     // Catch:{ Exception -> 0x017b }
            java.lang.String r4 = "&t4="
            if (r3 == 0) goto L_0x0122
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017b }
            r1.<init>()     // Catch:{ Exception -> 0x017b }
            r1.append(r4)     // Catch:{ Exception -> 0x017b }
            r1.append(r10)     // Catch:{ Exception -> 0x017b }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x017b }
            goto L_0x0135
        L_0x0122:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017b }
            r3.<init>()     // Catch:{ Exception -> 0x017b }
            r3.append(r4)     // Catch:{ Exception -> 0x017b }
            java.lang.String r1 = r11.getString(r1)     // Catch:{ Exception -> 0x017b }
            r3.append(r1)     // Catch:{ Exception -> 0x017b }
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x017b }
        L_0x0135:
            r2.append(r1)     // Catch:{ Exception -> 0x017b }
            java.lang.String r6 = r2.toString()     // Catch:{ Exception -> 0x017b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017b }
            r1.<init>()     // Catch:{ Exception -> 0x017b }
            r1.append(r6)     // Catch:{ Exception -> 0x017b }
            java.lang.String r2 = r11.getString(r5)     // Catch:{ Exception -> 0x017b }
            boolean r2 = r2.equals(r0)     // Catch:{ Exception -> 0x017b }
            java.lang.String r3 = "&t5="
            if (r2 == 0) goto L_0x0160
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017b }
            r11.<init>()     // Catch:{ Exception -> 0x017b }
            r11.append(r3)     // Catch:{ Exception -> 0x017b }
            r11.append(r10)     // Catch:{ Exception -> 0x017b }
            java.lang.String r10 = r11.toString()     // Catch:{ Exception -> 0x017b }
            goto L_0x0173
        L_0x0160:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017b }
            r10.<init>()     // Catch:{ Exception -> 0x017b }
            r10.append(r3)     // Catch:{ Exception -> 0x017b }
            java.lang.String r11 = r11.getString(r0)     // Catch:{ Exception -> 0x017b }
            r10.append(r11)     // Catch:{ Exception -> 0x017b }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x017b }
        L_0x0173:
            r1.append(r10)     // Catch:{ Exception -> 0x017b }
            java.lang.String r6 = r1.toString()     // Catch:{ Exception -> 0x017b }
            goto L_0x017f
        L_0x017b:
            r10 = move-exception
            r10.printStackTrace()
        L_0x017f:
            java.lang.String r10 = "&os=android"
            java.lang.String r10 = androidx.appcompat.widget.C0326j.m864i(r6, r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p238sp.C7912f.m15860a(java.lang.String, org.json.JSONObject):java.lang.String");
    }

    /* renamed from: b */
    public static void m15861b(String str) {
        if (f17366a.get() != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str).buildUpon().appendQueryParameter("$uri_redirect_mode", "2").build());
            intent.addFlags(268435456);
            intent.setPackage(BrowserPackages.CHROME_PACKAGE);
            f17366a.get().getPackageManager().queryIntentActivities(intent, 0);
            try {
                f17366a.get().startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                intent.setPackage((String) null);
                f17366a.get().startActivity(intent);
            }
        }
    }
}

package p089e2;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.SystemClock;
import android.support.p013v4.media.C0072d;
import android.text.TextUtils;
import androidx.slice.SliceSpec;
import com.paypal.pyplcheckout.services.api.interceptor.NetworkRetryInterceptor;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import p193o.C7496d;

/* renamed from: e2.b */
public final class C6708b {

    /* renamed from: a */
    public final Context f14792a;

    /* renamed from: b */
    public final String f14793b;

    public C6708b(Context context, String str) {
        this.f14792a = context;
        this.f14793b = str;
    }

    /* renamed from: d */
    public static void m13094d(C7496d dVar, C7496d dVar2) {
        SliceSpec sliceSpec;
        int i;
        int i2 = 0;
        while (i2 < dVar.f16715d) {
            SliceSpec sliceSpec2 = (SliceSpec) dVar.f16714c[i2];
            String str = sliceSpec2.f7618a;
            Iterator it = dVar2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    sliceSpec = null;
                    break;
                }
                sliceSpec = (SliceSpec) it.next();
                if (Objects.equals(sliceSpec.f7618a, str)) {
                    break;
                }
            }
            if (sliceSpec == null) {
                i = i2 - 1;
                dVar.mo19876l(i2);
            } else if (sliceSpec.f7619b < sliceSpec2.f7619b) {
                i = i2 - 1;
                dVar.mo19876l(i2);
                dVar.add(sliceSpec);
            } else {
                i2++;
            }
            i2 = i;
            i2++;
        }
    }

    /* renamed from: a */
    public final Set<String> mo18893a(Uri uri) {
        SharedPreferences b = mo18894b();
        StringBuilder h = C0072d.m201h("pinned_");
        h.append(uri.toString());
        return b.getStringSet(h.toString(), new C7496d());
    }

    /* renamed from: b */
    public final SharedPreferences mo18894b() {
        SharedPreferences sharedPreferences = this.f14792a.getSharedPreferences(this.f14793b, 0);
        long j = sharedPreferences.getLong("last_boot", 0);
        long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        if (Math.abs(j - currentTimeMillis) > NetworkRetryInterceptor.DEFAULT_RETRY_DELAY) {
            sharedPreferences.edit().clear().putLong("last_boot", currentTimeMillis).apply();
        }
        return sharedPreferences;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:13:0x0063=Splitter:B:13:0x0063, B:20:0x007b=Splitter:B:20:0x007b} */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized p193o.C7496d<androidx.slice.SliceSpec> mo18895c(android.net.Uri r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            o.d r0 = new o.d     // Catch:{ all -> 0x0082 }
            r0.<init>()     // Catch:{ all -> 0x0082 }
            android.content.SharedPreferences r1 = r6.mo18894b()     // Catch:{ all -> 0x0082 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0082 }
            r2.<init>()     // Catch:{ all -> 0x0082 }
            java.lang.String r3 = "spec_names_"
            r2.append(r3)     // Catch:{ all -> 0x0082 }
            java.lang.String r3 = r7.toString()     // Catch:{ all -> 0x0082 }
            r2.append(r3)     // Catch:{ all -> 0x0082 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0082 }
            r3 = 0
            java.lang.String r2 = r1.getString(r2, r3)     // Catch:{ all -> 0x0082 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0082 }
            r4.<init>()     // Catch:{ all -> 0x0082 }
            java.lang.String r5 = "spec_revs_"
            r4.append(r5)     // Catch:{ all -> 0x0082 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0082 }
            r4.append(r7)     // Catch:{ all -> 0x0082 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0082 }
            java.lang.String r7 = r1.getString(r7, r3)     // Catch:{ all -> 0x0082 }
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0082 }
            if (r1 != 0) goto L_0x007b
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0082 }
            if (r1 == 0) goto L_0x004a
            goto L_0x007b
        L_0x004a:
            java.lang.String r1 = ","
            r3 = -1
            java.lang.String[] r1 = r2.split(r1, r3)     // Catch:{ all -> 0x0082 }
            java.lang.String r2 = ","
            java.lang.String[] r7 = r7.split(r2, r3)     // Catch:{ all -> 0x0082 }
            int r2 = r1.length     // Catch:{ all -> 0x0082 }
            int r3 = r7.length     // Catch:{ all -> 0x0082 }
            if (r2 == r3) goto L_0x0062
            o.d r7 = new o.d     // Catch:{ all -> 0x0082 }
            r7.<init>()     // Catch:{ all -> 0x0082 }
            monitor-exit(r6)
            return r7
        L_0x0062:
            r2 = 0
        L_0x0063:
            int r3 = r1.length     // Catch:{ all -> 0x0082 }
            if (r2 >= r3) goto L_0x0079
            androidx.slice.SliceSpec r3 = new androidx.slice.SliceSpec     // Catch:{ all -> 0x0082 }
            r4 = r1[r2]     // Catch:{ all -> 0x0082 }
            r5 = r7[r2]     // Catch:{ all -> 0x0082 }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ all -> 0x0082 }
            r3.<init>(r4, r5)     // Catch:{ all -> 0x0082 }
            r0.add(r3)     // Catch:{ all -> 0x0082 }
            int r2 = r2 + 1
            goto L_0x0063
        L_0x0079:
            monitor-exit(r6)
            return r0
        L_0x007b:
            o.d r7 = new o.d     // Catch:{ all -> 0x0082 }
            r7.<init>()     // Catch:{ all -> 0x0082 }
            monitor-exit(r6)
            return r7
        L_0x0082:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p089e2.C6708b.mo18895c(android.net.Uri):o.d");
    }

    /* renamed from: e */
    public final void mo18896e(Uri uri, Set<String> set) {
        SharedPreferences.Editor edit = mo18894b().edit();
        StringBuilder h = C0072d.m201h("pinned_");
        h.append(uri.toString());
        edit.putStringSet(h.toString(), set).apply();
    }

    /* renamed from: f */
    public final void mo18897f(Uri uri, C7496d<SliceSpec> dVar) {
        int i = dVar.f16715d;
        String[] strArr = new String[i];
        String[] strArr2 = new String[i];
        for (int i2 = 0; i2 < dVar.f16715d; i2++) {
            Object[] objArr = dVar.f16714c;
            strArr[i2] = ((SliceSpec) objArr[i2]).f7618a;
            strArr2[i2] = String.valueOf(((SliceSpec) objArr[i2]).f7619b);
        }
        SharedPreferences.Editor edit = mo18894b().edit();
        StringBuilder h = C0072d.m201h("spec_names_");
        h.append(uri.toString());
        SharedPreferences.Editor putString = edit.putString(h.toString(), TextUtils.join(",", strArr));
        StringBuilder h2 = C0072d.m201h("spec_revs_");
        h2.append(uri.toString());
        putString.putString(h2.toString(), TextUtils.join(",", strArr2)).apply();
    }
}

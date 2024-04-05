package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.android.play.core.assetpacks.C15588c1;

/* renamed from: com.google.android.gms.internal.measurement.c4 */
public final class C14599c4 {

    /* renamed from: c */
    public static C14599c4 f32782c;

    /* renamed from: a */
    public final Context f32783a;

    /* renamed from: b */
    public final C14586b4 f32784b;

    public C14599c4() {
        this.f32783a = null;
        this.f32784b = null;
    }

    public C14599c4(Context context) {
        this.f32783a = context;
        C14586b4 b4Var = new C14586b4();
        this.f32784b = b4Var;
        context.getContentResolver().registerContentObserver(C14841v3.f33120a, true, b4Var);
    }

    /* renamed from: a */
    public static C14599c4 m23393a(Context context) {
        C14599c4 c4Var;
        synchronized (C14599c4.class) {
            if (f32782c == null) {
                f32782c = C15588c1.m25294N(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C14599c4(context) : new C14599c4();
            }
            c4Var = f32782c;
        }
        return c4Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0 = r0.zza();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        android.os.Binder.restoreCallingIdentity(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0024, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0035, code lost:
        r5 = "Unable to read GServices for: ".concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        r5 = new java.lang.String("Unable to read GServices for: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r2 = android.os.Binder.clearCallingIdentity();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0011 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0024 A[ExcHandler: IllegalStateException | NullPointerException (e java.lang.Throwable), Splitter:B:3:0x0006] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo50406b(java.lang.String r5) {
        /*
            r4 = this;
            android.content.Context r0 = r4.f32783a
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            androidx.compose.ui.input.pointer.f r0 = new androidx.compose.ui.input.pointer.f     // Catch:{ IllegalStateException -> 0x0028, SecurityException -> 0x0026, NullPointerException -> 0x0024 }
            r2 = 4
            r0.<init>(r2, r4, r5)     // Catch:{ IllegalStateException -> 0x0028, SecurityException -> 0x0026, NullPointerException -> 0x0024 }
            java.lang.Object r0 = r0.zza()     // Catch:{ SecurityException -> 0x0011, IllegalStateException -> 0x0028, NullPointerException -> 0x0024 }
            goto L_0x001c
        L_0x0011:
            long r2 = android.os.Binder.clearCallingIdentity()     // Catch:{ IllegalStateException -> 0x0028, SecurityException -> 0x0026, NullPointerException -> 0x0024 }
            java.lang.Object r0 = r0.zza()     // Catch:{ all -> 0x001f }
            android.os.Binder.restoreCallingIdentity(r2)     // Catch:{ IllegalStateException -> 0x0028, SecurityException -> 0x0026, NullPointerException -> 0x0024 }
        L_0x001c:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IllegalStateException -> 0x0028, SecurityException -> 0x0026, NullPointerException -> 0x0024 }
            return r0
        L_0x001f:
            r0 = move-exception
            android.os.Binder.restoreCallingIdentity(r2)     // Catch:{ IllegalStateException -> 0x0028, SecurityException -> 0x0026, NullPointerException -> 0x0024 }
            throw r0     // Catch:{ IllegalStateException -> 0x0028, SecurityException -> 0x0026, NullPointerException -> 0x0024 }
        L_0x0024:
            r0 = move-exception
            goto L_0x0029
        L_0x0026:
            r0 = move-exception
            goto L_0x0029
        L_0x0028:
            r0 = move-exception
        L_0x0029:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r2 = "Unable to read GServices for: "
            int r3 = r5.length()
            if (r3 == 0) goto L_0x003a
            java.lang.String r5 = r2.concat(r5)
            goto L_0x003f
        L_0x003a:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r2)
        L_0x003f:
            java.lang.String r2 = "GservicesLoader"
            android.util.Log.e(r2, r5, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C14599c4.mo50406b(java.lang.String):java.lang.String");
    }
}

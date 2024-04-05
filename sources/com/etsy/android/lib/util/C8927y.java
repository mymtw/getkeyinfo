package com.etsy.android.lib.util;

import android.database.ContentObserver;
import android.os.Handler;
import p248tp.C8063o;

/* renamed from: com.etsy.android.lib.util.y */
public final class C8927y extends ContentObserver {

    /* renamed from: a */
    public final /* synthetic */ C8063o f19690a;

    /* renamed from: b */
    public final /* synthetic */ C8879a0 f19691b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8927y(C8879a0 a0Var, C8063o oVar) {
        super((Handler) null);
        this.f19691b = a0Var;
        this.f19690a = oVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
        if (r0 != null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0057, code lost:
        if (r0 == null) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        super.onChange(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onChange(boolean r9, android.net.Uri r10) {
        /*
            r8 = this;
            java.lang.String r0 = r10.toString()
            java.lang.String r1 = com.etsy.android.lib.util.C8881b0.f19629b
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L_0x0010
            super.onChange(r9, r10)
            return
        L_0x0010:
            r0 = 0
            com.etsy.android.lib.util.a0 r1 = r8.f19691b     // Catch:{ Exception -> 0x0051 }
            android.content.ContentResolver r2 = r1.f19625a     // Catch:{ Exception -> 0x0051 }
            java.lang.String[] r4 = com.etsy.android.lib.util.C8881b0.f19630c     // Catch:{ Exception -> 0x0051 }
            r5 = 0
            r6 = 0
            java.lang.String r7 = "date_added DESC"
            r3 = r10
            android.database.Cursor r0 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0051 }
            if (r0 == 0) goto L_0x004c
            boolean r1 = r0.moveToFirst()     // Catch:{ Exception -> 0x0051 }
            if (r1 == 0) goto L_0x004c
            java.lang.String r1 = "_data"
            int r1 = r0.getColumnIndex(r1)     // Catch:{ Exception -> 0x0051 }
            java.lang.String r1 = r0.getString(r1)     // Catch:{ Exception -> 0x0051 }
            com.etsy.android.lib.util.a0 r2 = r8.f19691b     // Catch:{ Exception -> 0x0051 }
            com.etsy.android.lib.util.b0 r2 = r2.f19626b     // Catch:{ Exception -> 0x0051 }
            r2.getClass()     // Catch:{ Exception -> 0x0051 }
            java.util.Locale r2 = java.util.Locale.ROOT     // Catch:{ Exception -> 0x0051 }
            java.lang.String r2 = r1.toLowerCase(r2)     // Catch:{ Exception -> 0x0051 }
            java.lang.String r3 = "screenshot"
            boolean r2 = r2.contains(r3)     // Catch:{ Exception -> 0x0051 }
            if (r2 == 0) goto L_0x004c
            tp.o r2 = r8.f19690a     // Catch:{ Exception -> 0x0051 }
            r2.onNext(r1)     // Catch:{ Exception -> 0x0051 }
        L_0x004c:
            if (r0 == 0) goto L_0x005c
            goto L_0x0059
        L_0x004f:
            r9 = move-exception
            goto L_0x0060
        L_0x0051:
            r1 = move-exception
            tp.o r2 = r8.f19690a     // Catch:{ all -> 0x004f }
            r2.tryOnError(r1)     // Catch:{ all -> 0x004f }
            if (r0 == 0) goto L_0x005c
        L_0x0059:
            r0.close()
        L_0x005c:
            super.onChange(r9, r10)
            return
        L_0x0060:
            if (r0 == 0) goto L_0x0065
            r0.close()
        L_0x0065:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.util.C8927y.onChange(boolean, android.net.Uri):void");
    }
}

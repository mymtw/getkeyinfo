package com.airbnb.lottie;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: com.airbnb.lottie.e */
public final class C4834e implements Callable<C4841l<C4828c>> {

    /* renamed from: b */
    public final /* synthetic */ Context f10863b;

    /* renamed from: c */
    public final /* synthetic */ String f10864c;

    public C4834e(Context context, String str) {
        this.f10863b = context;
        this.f10864c = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() throws java.lang.Exception {
        /*
            r9 = this;
            android.content.Context r0 = r9.f10863b
            java.lang.String r1 = r9.f10864c
            n3.b r2 = new n3.b
            r2.<init>(r0, r1)
            n3.a r0 = r2.f16630b
            r0.getClass()
            r1 = 0
            java.lang.String r3 = r0.f16628b     // Catch:{ FileNotFoundException -> 0x0065 }
            java.io.File r4 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0065 }
            android.content.Context r5 = r0.f16627a     // Catch:{ FileNotFoundException -> 0x0065 }
            java.io.File r5 = r5.getCacheDir()     // Catch:{ FileNotFoundException -> 0x0065 }
            com.airbnb.lottie.network.FileExtension r6 = com.airbnb.lottie.network.FileExtension.JSON     // Catch:{ FileNotFoundException -> 0x0065 }
            r7 = 0
            java.lang.String r8 = p187n3.C7443a.m14376a(r3, r6, r7)     // Catch:{ FileNotFoundException -> 0x0065 }
            r4.<init>(r5, r8)     // Catch:{ FileNotFoundException -> 0x0065 }
            boolean r5 = r4.exists()     // Catch:{ FileNotFoundException -> 0x0065 }
            if (r5 == 0) goto L_0x002a
            goto L_0x0043
        L_0x002a:
            java.io.File r4 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0065 }
            android.content.Context r0 = r0.f16627a     // Catch:{ FileNotFoundException -> 0x0065 }
            java.io.File r0 = r0.getCacheDir()     // Catch:{ FileNotFoundException -> 0x0065 }
            com.airbnb.lottie.network.FileExtension r5 = com.airbnb.lottie.network.FileExtension.ZIP     // Catch:{ FileNotFoundException -> 0x0065 }
            java.lang.String r3 = p187n3.C7443a.m14376a(r3, r5, r7)     // Catch:{ FileNotFoundException -> 0x0065 }
            r4.<init>(r0, r3)     // Catch:{ FileNotFoundException -> 0x0065 }
            boolean r0 = r4.exists()     // Catch:{ FileNotFoundException -> 0x0065 }
            if (r0 == 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r4 = r1
        L_0x0043:
            if (r4 != 0) goto L_0x0046
            goto L_0x0065
        L_0x0046:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0065 }
            r0.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0065 }
            java.lang.String r3 = r4.getAbsolutePath()
            java.lang.String r5 = ".zip"
            boolean r3 = r3.endsWith(r5)
            if (r3 == 0) goto L_0x0059
            com.airbnb.lottie.network.FileExtension r6 = com.airbnb.lottie.network.FileExtension.ZIP
        L_0x0059:
            r4.getAbsolutePath()
            p206p3.C7656b.m14694a()
            d1.c r3 = new d1.c
            r3.<init>(r6, r0)
            goto L_0x0066
        L_0x0065:
            r3 = r1
        L_0x0066:
            if (r3 != 0) goto L_0x0069
            goto L_0x0096
        L_0x0069:
            F r0 = r3.f14606a
            com.airbnb.lottie.network.FileExtension r0 = (com.airbnb.lottie.network.FileExtension) r0
            S r3 = r3.f14607b
            java.io.InputStream r3 = (java.io.InputStream) r3
            com.airbnb.lottie.network.FileExtension r4 = com.airbnb.lottie.network.FileExtension.ZIP
            if (r0 != r4) goto L_0x0089
            java.util.zip.ZipInputStream r0 = new java.util.zip.ZipInputStream
            r0.<init>(r3)
            java.lang.String r3 = r2.f16629a
            com.airbnb.lottie.l r3 = com.airbnb.lottie.C4829d.m10422e(r0, r3)     // Catch:{ all -> 0x0084 }
            p206p3.C7659e.m14701b(r0)
            goto L_0x008f
        L_0x0084:
            r1 = move-exception
            p206p3.C7659e.m14701b(r0)
            throw r1
        L_0x0089:
            java.lang.String r0 = r2.f16629a
            com.airbnb.lottie.l r3 = com.airbnb.lottie.C4829d.m10419b(r3, r0)
        L_0x008f:
            V r0 = r3.f10902a
            if (r0 == 0) goto L_0x0096
            r1 = r0
            com.airbnb.lottie.c r1 = (com.airbnb.lottie.C4828c) r1
        L_0x0096:
            if (r1 == 0) goto L_0x009e
            com.airbnb.lottie.l r0 = new com.airbnb.lottie.l
            r0.<init>((com.airbnb.lottie.C4828c) r1)
            goto L_0x00ad
        L_0x009e:
            p206p3.C7656b.m14694a()
            com.airbnb.lottie.l r0 = r2.mo19817a()     // Catch:{ IOException -> 0x00a6 }
            goto L_0x00ad
        L_0x00a6:
            r0 = move-exception
            com.airbnb.lottie.l r1 = new com.airbnb.lottie.l
            r1.<init>((java.lang.Throwable) r0)
            r0 = r1
        L_0x00ad:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.C4834e.call():java.lang.Object");
    }
}

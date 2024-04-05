package com.etsy.android.lib.config.bucketing;

import com.etsy.android.lib.config.bucketing.NativeConfig;
import com.etsy.android.lib.logger.LogCatKt;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.C19383o;
import p409o9.C13138q;

/* renamed from: com.etsy.android.lib.config.bucketing.a */
public final class C8612a {

    /* renamed from: a */
    public final C8614b f18924a;

    /* renamed from: com.etsy.android.lib.config.bucketing.a$a */
    public /* synthetic */ class C8613a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18925a;

        static {
            int[] iArr = new int[NativeConfig.BucketType.values().length];
            iArr[NativeConfig.BucketType.Device.ordinal()] = 1;
            iArr[NativeConfig.BucketType.User.ordinal()] = 2;
            f18925a = iArr;
        }
    }

    public C8612a(C8614b bVar) {
        this.f18924a = bVar;
    }

    /* renamed from: a */
    public final long mo21121a(String str) {
        try {
            this.f18924a.getClass();
            String str2 = C13138q.m20808a().f28895a;
            C19383o.m32796f(str2, "getInstance().uuid");
            String str3 = str + '-' + str2;
            this.f18924a.getClass();
            return C8614b.m17004a(str3);
        } catch (NoSuchAlgorithmException e) {
            LogCatKt.m17045a().mo21309d("Error when bucketing for device " + str, e);
            return -1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0026 A[Catch:{ NoSuchAlgorithmException -> 0x0055 }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0027 A[Catch:{ NoSuchAlgorithmException -> 0x0055 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0036 A[Catch:{ NoSuchAlgorithmException -> 0x0055 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0037 A[Catch:{ NoSuchAlgorithmException -> 0x0055 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo21122b(java.lang.String r8) {
        /*
            r7 = this;
            r0 = -1
            com.etsy.android.lib.config.bucketing.b r2 = r7.f18924a     // Catch:{ NoSuchAlgorithmException -> 0x0055 }
            r2.getClass()     // Catch:{ NoSuchAlgorithmException -> 0x0055 }
            q9.p r2 = p628nj.C18263b.f40057V     // Catch:{ NoSuchAlgorithmException -> 0x0055 }
            com.etsy.android.lib.models.datatypes.EtsyId r2 = r2.mo45958c()     // Catch:{ NoSuchAlgorithmException -> 0x0055 }
            r3 = 0
            if (r2 == 0) goto L_0x0015
            java.lang.String r4 = r2.getId()     // Catch:{ NoSuchAlgorithmException -> 0x0055 }
            goto L_0x0016
        L_0x0015:
            r4 = r3
        L_0x0016:
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x0023
            int r4 = r4.length()     // Catch:{ NoSuchAlgorithmException -> 0x0055 }
            if (r4 != 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r4 = r5
            goto L_0x0024
        L_0x0023:
            r4 = r6
        L_0x0024:
            if (r4 == 0) goto L_0x0027
            goto L_0x002b
        L_0x0027:
            java.lang.String r3 = r2.getId()     // Catch:{ NoSuchAlgorithmException -> 0x0055 }
        L_0x002b:
            if (r3 == 0) goto L_0x0033
            int r2 = r3.length()     // Catch:{ NoSuchAlgorithmException -> 0x0055 }
            if (r2 != 0) goto L_0x0034
        L_0x0033:
            r5 = r6
        L_0x0034:
            if (r5 == 0) goto L_0x0037
            return r0
        L_0x0037:
            com.etsy.android.lib.config.bucketing.b r2 = r7.f18924a     // Catch:{ NoSuchAlgorithmException -> 0x0055 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ NoSuchAlgorithmException -> 0x0055 }
            r4.<init>()     // Catch:{ NoSuchAlgorithmException -> 0x0055 }
            r4.append(r8)     // Catch:{ NoSuchAlgorithmException -> 0x0055 }
            r5 = 45
            r4.append(r5)     // Catch:{ NoSuchAlgorithmException -> 0x0055 }
            r4.append(r3)     // Catch:{ NoSuchAlgorithmException -> 0x0055 }
            java.lang.String r3 = r4.toString()     // Catch:{ NoSuchAlgorithmException -> 0x0055 }
            r2.getClass()     // Catch:{ NoSuchAlgorithmException -> 0x0055 }
            long r0 = com.etsy.android.lib.config.bucketing.C8614b.m17004a(r3)     // Catch:{ NoSuchAlgorithmException -> 0x0055 }
            return r0
        L_0x0055:
            r2 = move-exception
            com.etsy.android.lib.logger.h r3 = com.etsy.android.lib.logger.LogCatKt.m17045a()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Error when bucketing for user "
            r4.append(r5)
            r4.append(r8)
            java.lang.String r8 = r4.toString()
            r3.mo21309d(r8, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.config.bucketing.C8612a.mo21122b(java.lang.String):long");
    }
}

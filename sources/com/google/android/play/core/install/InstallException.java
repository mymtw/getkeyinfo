package com.google.android.play.core.install;

import com.google.android.play.core.tasks.zzj;

public class InstallException extends zzj {
    private final int zza;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public InstallException(int r7) {
        /*
            r6 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r2 = 0
            r0[r2] = r1
            java.util.HashMap r1 = p630nl.C18272a.f40103a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            boolean r3 = r1.containsKey(r2)
            if (r3 == 0) goto L_0x004c
            java.util.HashMap r3 = p630nl.C18272a.f40104b
            boolean r4 = r3.containsKey(r2)
            if (r4 != 0) goto L_0x001f
            goto L_0x004c
        L_0x001f:
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            java.lang.String r4 = java.lang.String.valueOf(r2)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r3 = r3 + 103
            int r3 = r3 + r4
            r5.<init>(r3)
            java.lang.String r3 = " (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#"
            java.lang.String r4 = ")"
            java.lang.String r1 = android.support.p013v4.media.C0073e.m210j(r5, r1, r3, r2, r4)
            goto L_0x004e
        L_0x004c:
            java.lang.String r1 = ""
        L_0x004e:
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "Install Error(%d): %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r6.<init>((java.lang.String) r0)
            if (r7 == 0) goto L_0x005f
            r6.zza = r7
            return
        L_0x005f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "errorCode should not be 0."
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.install.InstallException.<init>(int):void");
    }

    public int getErrorCode() {
        return this.zza;
    }
}

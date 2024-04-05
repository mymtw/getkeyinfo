package com.google.android.play.core.review;

import com.google.android.play.core.tasks.zzj;

public class ReviewException extends zzj {
    private final int zza;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ReviewException(int r8) {
        /*
            r7 = this;
            java.util.Locale r0 = java.util.Locale.getDefault()
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            r3 = 0
            r1[r3] = r2
            java.util.HashMap r2 = p657ql.C18466a.f40669a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            boolean r4 = r2.containsKey(r3)
            if (r4 != 0) goto L_0x001d
            java.lang.String r2 = ""
            goto L_0x004b
        L_0x001d:
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            java.util.HashMap r4 = p657ql.C18466a.f40670b
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = java.lang.String.valueOf(r2)
            int r4 = r4.length()
            java.lang.String r5 = java.lang.String.valueOf(r3)
            int r5 = r5.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r4 = r4 + 106
            int r4 = r4 + r5
            r6.<init>(r4)
            java.lang.String r4 = " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#"
            java.lang.String r5 = ")"
            java.lang.String r2 = android.support.p013v4.media.C0073e.m210j(r6, r2, r4, r3, r5)
        L_0x004b:
            r3 = 1
            r1[r3] = r2
            java.lang.String r2 = "Review Error(%d): %s"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            r7.<init>((java.lang.String) r0)
            r7.zza = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.review.ReviewException.<init>(int):void");
    }

    public int getErrorCode() {
        return this.zza;
    }
}

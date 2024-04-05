package com.google.android.play.core.appupdate;

/* renamed from: com.google.android.play.core.appupdate.c */
public abstract class C15561c {
    /* renamed from: c */
    public static C15577s m25160c(int i) {
        byte b = (byte) (((byte) 1) | 2);
        if (b == 3) {
            return new C15577s(i, false);
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" appUpdateType");
        }
        if ((b & 2) == 0) {
            sb.append(" allowAssetPackDeletion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: a */
    public abstract boolean mo55339a();

    /* renamed from: b */
    public abstract int mo55340b();
}

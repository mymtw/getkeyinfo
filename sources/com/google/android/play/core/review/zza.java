package com.google.android.play.core.review;

import android.app.PendingIntent;

final class zza extends ReviewInfo {

    /* renamed from: b */
    public final PendingIntent f35527b;

    /* renamed from: c */
    public final boolean f35528c;

    public zza(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent != null) {
            this.f35527b = pendingIntent;
            this.f35528c = z;
            return;
        }
        throw new NullPointerException("Null pendingIntent");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            ReviewInfo reviewInfo = (ReviewInfo) obj;
            return this.f35527b.equals(reviewInfo.zza()) && this.f35528c == reviewInfo.zzb();
        }
    }

    public final int hashCode() {
        return ((this.f35527b.hashCode() ^ 1000003) * 1000003) ^ (true != this.f35528c ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.f35527b.toString();
        boolean z = this.f35528c;
        StringBuilder sb = new StringBuilder(obj.length() + 40);
        sb.append("ReviewInfo{pendingIntent=");
        sb.append(obj);
        sb.append(", isNoOp=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    public final PendingIntent zza() {
        return this.f35527b;
    }

    public final boolean zzb() {
        return this.f35528c;
    }
}

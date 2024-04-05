package com.google.firebase.heartbeatinfo;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.session.C0087d;

final class AutoValue_SdkHeartBeatResult extends C16556g {
    private final long millis;
    private final String sdkName;

    public AutoValue_SdkHeartBeatResult(String str, long j) {
        if (str != null) {
            this.sdkName = str;
            this.millis = j;
            return;
        }
        throw new NullPointerException("Null sdkName");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16556g)) {
            return false;
        }
        C16556g gVar = (C16556g) obj;
        return this.sdkName.equals(gVar.getSdkName()) && this.millis == gVar.getMillis();
    }

    public long getMillis() {
        return this.millis;
    }

    public String getSdkName() {
        return this.sdkName;
    }

    public int hashCode() {
        long j = this.millis;
        return ((this.sdkName.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("SdkHeartBeatResult{sdkName=");
        h.append(this.sdkName);
        h.append(", millis=");
        return C0087d.m236f(h, this.millis, "}");
    }
}

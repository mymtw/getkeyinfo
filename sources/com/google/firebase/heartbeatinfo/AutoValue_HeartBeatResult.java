package com.google.firebase.heartbeatinfo;

import android.support.p013v4.media.C0072d;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;

final class AutoValue_HeartBeatResult extends C16555f {
    private final HeartBeatInfo.HeartBeat heartBeat;
    private final long millis;
    private final String sdkName;

    public AutoValue_HeartBeatResult(String str, long j, HeartBeatInfo.HeartBeat heartBeat2) {
        if (str != null) {
            this.sdkName = str;
            this.millis = j;
            if (heartBeat2 != null) {
                this.heartBeat = heartBeat2;
                return;
            }
            throw new NullPointerException("Null heartBeat");
        }
        throw new NullPointerException("Null sdkName");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16555f)) {
            return false;
        }
        C16555f fVar = (C16555f) obj;
        return this.sdkName.equals(fVar.getSdkName()) && this.millis == fVar.getMillis() && this.heartBeat.equals(fVar.getHeartBeat());
    }

    public HeartBeatInfo.HeartBeat getHeartBeat() {
        return this.heartBeat;
    }

    public long getMillis() {
        return this.millis;
    }

    public String getSdkName() {
        return this.sdkName;
    }

    public int hashCode() {
        long j = this.millis;
        return ((((this.sdkName.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.heartBeat.hashCode();
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("HeartBeatResult{sdkName=");
        h.append(this.sdkName);
        h.append(", millis=");
        h.append(this.millis);
        h.append(", heartBeat=");
        h.append(this.heartBeat);
        h.append("}");
        return h.toString();
    }
}

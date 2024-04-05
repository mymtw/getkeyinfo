package com.google.firebase.heartbeatinfo;

import com.google.auto.value.AutoValue;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;

@AutoValue
/* renamed from: com.google.firebase.heartbeatinfo.f */
public abstract class C16555f {
    public static C16555f create(String str, long j, HeartBeatInfo.HeartBeat heartBeat) {
        return new AutoValue_HeartBeatResult(str, j, heartBeat);
    }

    public abstract HeartBeatInfo.HeartBeat getHeartBeat();

    public abstract long getMillis();

    public abstract String getSdkName();
}

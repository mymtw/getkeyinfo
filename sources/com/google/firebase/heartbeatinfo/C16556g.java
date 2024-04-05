package com.google.firebase.heartbeatinfo;

import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: com.google.firebase.heartbeatinfo.g */
public abstract class C16556g implements Comparable<C16556g> {
    public static C16556g create(String str, long j) {
        return new AutoValue_SdkHeartBeatResult(str, j);
    }

    public abstract long getMillis();

    public abstract String getSdkName();

    public int compareTo(C16556g gVar) {
        return getMillis() < gVar.getMillis() ? -1 : 1;
    }
}

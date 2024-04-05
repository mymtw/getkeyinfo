package com.paypal.android.platform.authsdk.authcommon.network.utils;

import androidx.annotation.Keep;
import androidx.compose.animation.C0388a;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p010a9.C0048b;

@Keep
public final class ChecksumData {
    private final String appGuid;
    private final String appName;
    private final String deviceInfo;

    public ChecksumData(String str, String str2, String str3) {
        C0048b.m167f(str, "appGuid", str2, "appName", str3, "deviceInfo");
        this.appGuid = str;
        this.appName = str2;
        this.deviceInfo = str3;
    }

    public static /* synthetic */ ChecksumData copy$default(ChecksumData checksumData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checksumData.appGuid;
        }
        if ((i & 2) != 0) {
            str2 = checksumData.appName;
        }
        if ((i & 4) != 0) {
            str3 = checksumData.deviceInfo;
        }
        return checksumData.copy(str, str2, str3);
    }

    public final String component1() {
        return this.appGuid;
    }

    public final String component2() {
        return this.appName;
    }

    public final String component3() {
        return this.deviceInfo;
    }

    public final ChecksumData copy(String str, String str2, String str3) {
        C19383o.m32797g(str, "appGuid");
        C19383o.m32797g(str2, "appName");
        C19383o.m32797g(str3, "deviceInfo");
        return new ChecksumData(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChecksumData)) {
            return false;
        }
        ChecksumData checksumData = (ChecksumData) obj;
        return C19383o.m32792b(this.appGuid, checksumData.appGuid) && C19383o.m32792b(this.appName, checksumData.appName) && C19383o.m32792b(this.deviceInfo, checksumData.deviceInfo);
    }

    public final String getAppGuid() {
        return this.appGuid;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getDeviceInfo() {
        return this.deviceInfo;
    }

    public int hashCode() {
        return this.deviceInfo.hashCode() + C0023f.m105e(this.appName, this.appGuid.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.appGuid;
        String str2 = this.appName;
        return C0023f.m110k(C0388a.m1050f("ChecksumData(appGuid=", str, ", appName=", str2, ", deviceInfo="), this.deviceInfo, ")");
    }
}

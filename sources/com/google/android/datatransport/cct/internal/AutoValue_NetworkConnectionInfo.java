package com.google.android.datatransport.cct.internal;

import android.support.p013v4.media.C0072d;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;

final class AutoValue_NetworkConnectionInfo extends NetworkConnectionInfo {
    private final NetworkConnectionInfo.MobileSubtype mobileSubtype;
    private final NetworkConnectionInfo.NetworkType networkType;

    public static final class Builder extends NetworkConnectionInfo.C6502a {
        private NetworkConnectionInfo.MobileSubtype mobileSubtype;
        private NetworkConnectionInfo.NetworkType networkType;

        public NetworkConnectionInfo build() {
            return new AutoValue_NetworkConnectionInfo(this.networkType, this.mobileSubtype);
        }

        public NetworkConnectionInfo.C6502a setMobileSubtype(NetworkConnectionInfo.MobileSubtype mobileSubtype2) {
            this.mobileSubtype = mobileSubtype2;
            return this;
        }

        public NetworkConnectionInfo.C6502a setNetworkType(NetworkConnectionInfo.NetworkType networkType2) {
            this.networkType = networkType2;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NetworkConnectionInfo)) {
            return false;
        }
        NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
        NetworkConnectionInfo.NetworkType networkType2 = this.networkType;
        if (networkType2 != null ? networkType2.equals(networkConnectionInfo.getNetworkType()) : networkConnectionInfo.getNetworkType() == null) {
            NetworkConnectionInfo.MobileSubtype mobileSubtype2 = this.mobileSubtype;
            if (mobileSubtype2 == null) {
                if (networkConnectionInfo.getMobileSubtype() == null) {
                    return true;
                }
            } else if (mobileSubtype2.equals(networkConnectionInfo.getMobileSubtype())) {
                return true;
            }
        }
        return false;
    }

    public NetworkConnectionInfo.MobileSubtype getMobileSubtype() {
        return this.mobileSubtype;
    }

    public NetworkConnectionInfo.NetworkType getNetworkType() {
        return this.networkType;
    }

    public int hashCode() {
        NetworkConnectionInfo.NetworkType networkType2 = this.networkType;
        int i = 0;
        int hashCode = ((networkType2 == null ? 0 : networkType2.hashCode()) ^ 1000003) * 1000003;
        NetworkConnectionInfo.MobileSubtype mobileSubtype2 = this.mobileSubtype;
        if (mobileSubtype2 != null) {
            i = mobileSubtype2.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("NetworkConnectionInfo{networkType=");
        h.append(this.networkType);
        h.append(", mobileSubtype=");
        h.append(this.mobileSubtype);
        h.append("}");
        return h.toString();
    }

    private AutoValue_NetworkConnectionInfo(NetworkConnectionInfo.NetworkType networkType2, NetworkConnectionInfo.MobileSubtype mobileSubtype2) {
        this.networkType = networkType2;
        this.mobileSubtype = mobileSubtype2;
    }
}

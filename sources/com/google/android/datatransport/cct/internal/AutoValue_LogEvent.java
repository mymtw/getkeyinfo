package com.google.android.datatransport.cct.internal;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import com.google.android.datatransport.cct.internal.C6512i;
import java.util.Arrays;

final class AutoValue_LogEvent extends C6512i {
    private final Integer eventCode;
    private final long eventTimeMs;
    private final long eventUptimeMs;
    private final NetworkConnectionInfo networkConnectionInfo;
    private final byte[] sourceExtension;
    private final String sourceExtensionJsonProto3;
    private final long timezoneOffsetSeconds;

    public static final class Builder extends C6512i.C6513a {
        private Integer eventCode;
        private Long eventTimeMs;
        private Long eventUptimeMs;
        private NetworkConnectionInfo networkConnectionInfo;
        private byte[] sourceExtension;
        private String sourceExtensionJsonProto3;
        private Long timezoneOffsetSeconds;

        public C6512i build() {
            String str = this.eventTimeMs == null ? " eventTimeMs" : "";
            if (this.eventUptimeMs == null) {
                str = C0326j.m864i(str, " eventUptimeMs");
            }
            if (this.timezoneOffsetSeconds == null) {
                str = C0326j.m864i(str, " timezoneOffsetSeconds");
            }
            if (str.isEmpty()) {
                return new AutoValue_LogEvent(this.eventTimeMs.longValue(), this.eventCode, this.eventUptimeMs.longValue(), this.sourceExtension, this.sourceExtensionJsonProto3, this.timezoneOffsetSeconds.longValue(), this.networkConnectionInfo);
            }
            throw new IllegalStateException(C0326j.m864i("Missing required properties:", str));
        }

        public C6512i.C6513a setEventCode(Integer num) {
            this.eventCode = num;
            return this;
        }

        public C6512i.C6513a setEventTimeMs(long j) {
            this.eventTimeMs = Long.valueOf(j);
            return this;
        }

        public C6512i.C6513a setEventUptimeMs(long j) {
            this.eventUptimeMs = Long.valueOf(j);
            return this;
        }

        public C6512i.C6513a setNetworkConnectionInfo(NetworkConnectionInfo networkConnectionInfo2) {
            this.networkConnectionInfo = networkConnectionInfo2;
            return this;
        }

        public C6512i.C6513a setSourceExtension(byte[] bArr) {
            this.sourceExtension = bArr;
            return this;
        }

        public C6512i.C6513a setSourceExtensionJsonProto3(String str) {
            this.sourceExtensionJsonProto3 = str;
            return this;
        }

        public C6512i.C6513a setTimezoneOffsetSeconds(long j) {
            this.timezoneOffsetSeconds = Long.valueOf(j);
            return this;
        }
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6512i)) {
            return false;
        }
        C6512i iVar = (C6512i) obj;
        if (this.eventTimeMs == iVar.getEventTimeMs() && ((num = this.eventCode) != null ? num.equals(iVar.getEventCode()) : iVar.getEventCode() == null) && this.eventUptimeMs == iVar.getEventUptimeMs()) {
            if (Arrays.equals(this.sourceExtension, iVar instanceof AutoValue_LogEvent ? ((AutoValue_LogEvent) iVar).sourceExtension : iVar.getSourceExtension()) && ((str = this.sourceExtensionJsonProto3) != null ? str.equals(iVar.getSourceExtensionJsonProto3()) : iVar.getSourceExtensionJsonProto3() == null) && this.timezoneOffsetSeconds == iVar.getTimezoneOffsetSeconds()) {
                NetworkConnectionInfo networkConnectionInfo2 = this.networkConnectionInfo;
                if (networkConnectionInfo2 == null) {
                    if (iVar.getNetworkConnectionInfo() == null) {
                        return true;
                    }
                } else if (networkConnectionInfo2.equals(iVar.getNetworkConnectionInfo())) {
                    return true;
                }
            }
        }
        return false;
    }

    public Integer getEventCode() {
        return this.eventCode;
    }

    public long getEventTimeMs() {
        return this.eventTimeMs;
    }

    public long getEventUptimeMs() {
        return this.eventUptimeMs;
    }

    public NetworkConnectionInfo getNetworkConnectionInfo() {
        return this.networkConnectionInfo;
    }

    public byte[] getSourceExtension() {
        return this.sourceExtension;
    }

    public String getSourceExtensionJsonProto3() {
        return this.sourceExtensionJsonProto3;
    }

    public long getTimezoneOffsetSeconds() {
        return this.timezoneOffsetSeconds;
    }

    public int hashCode() {
        long j = this.eventTimeMs;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.eventCode;
        int i2 = 0;
        int hashCode = num == null ? 0 : num.hashCode();
        long j2 = this.eventUptimeMs;
        int hashCode2 = (((((i ^ hashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.sourceExtension)) * 1000003;
        String str = this.sourceExtensionJsonProto3;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j3 = this.timezoneOffsetSeconds;
        int i3 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        NetworkConnectionInfo networkConnectionInfo2 = this.networkConnectionInfo;
        if (networkConnectionInfo2 != null) {
            i2 = networkConnectionInfo2.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("LogEvent{eventTimeMs=");
        h.append(this.eventTimeMs);
        h.append(", eventCode=");
        h.append(this.eventCode);
        h.append(", eventUptimeMs=");
        h.append(this.eventUptimeMs);
        h.append(", sourceExtension=");
        h.append(Arrays.toString(this.sourceExtension));
        h.append(", sourceExtensionJsonProto3=");
        h.append(this.sourceExtensionJsonProto3);
        h.append(", timezoneOffsetSeconds=");
        h.append(this.timezoneOffsetSeconds);
        h.append(", networkConnectionInfo=");
        h.append(this.networkConnectionInfo);
        h.append("}");
        return h.toString();
    }

    private AutoValue_LogEvent(long j, Integer num, long j2, byte[] bArr, String str, long j3, NetworkConnectionInfo networkConnectionInfo2) {
        this.eventTimeMs = j;
        this.eventCode = num;
        this.eventUptimeMs = j2;
        this.sourceExtension = bArr;
        this.sourceExtensionJsonProto3 = str;
        this.timezoneOffsetSeconds = j3;
        this.networkConnectionInfo = networkConnectionInfo2;
    }
}

package com.google.android.datatransport.runtime;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import com.google.android.datatransport.runtime.C6547k;
import java.util.Map;

final class AutoValue_EventInternal extends C6547k {
    private final Map<String, String> autoMetadata;
    private final Integer code;
    private final C6546j encodedPayload;
    private final long eventMillis;
    private final String transportName;
    private final long uptimeMillis;

    public static final class Builder extends C6547k.C6548a {
        private Map<String, String> autoMetadata;
        private Integer code;
        private C6546j encodedPayload;
        private Long eventMillis;
        private String transportName;
        private Long uptimeMillis;

        public C6547k build() {
            String str = this.transportName == null ? " transportName" : "";
            if (this.encodedPayload == null) {
                str = C0326j.m864i(str, " encodedPayload");
            }
            if (this.eventMillis == null) {
                str = C0326j.m864i(str, " eventMillis");
            }
            if (this.uptimeMillis == null) {
                str = C0326j.m864i(str, " uptimeMillis");
            }
            if (this.autoMetadata == null) {
                str = C0326j.m864i(str, " autoMetadata");
            }
            if (str.isEmpty()) {
                return new AutoValue_EventInternal(this.transportName, this.code, this.encodedPayload, this.eventMillis.longValue(), this.uptimeMillis.longValue(), this.autoMetadata);
            }
            throw new IllegalStateException(C0326j.m864i("Missing required properties:", str));
        }

        public Map<String, String> getAutoMetadata() {
            Map<String, String> map = this.autoMetadata;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        public C6547k.C6548a setAutoMetadata(Map<String, String> map) {
            if (map != null) {
                this.autoMetadata = map;
                return this;
            }
            throw new NullPointerException("Null autoMetadata");
        }

        public C6547k.C6548a setCode(Integer num) {
            this.code = num;
            return this;
        }

        public C6547k.C6548a setEncodedPayload(C6546j jVar) {
            if (jVar != null) {
                this.encodedPayload = jVar;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        public C6547k.C6548a setEventMillis(long j) {
            this.eventMillis = Long.valueOf(j);
            return this;
        }

        public C6547k.C6548a setTransportName(String str) {
            if (str != null) {
                this.transportName = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        public C6547k.C6548a setUptimeMillis(long j) {
            this.uptimeMillis = Long.valueOf(j);
            return this;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r7.code;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.android.datatransport.runtime.C6547k
            r2 = 0
            if (r1 == 0) goto L_0x005b
            com.google.android.datatransport.runtime.k r8 = (com.google.android.datatransport.runtime.C6547k) r8
            java.lang.String r1 = r7.transportName
            java.lang.String r3 = r8.getTransportName()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
            java.lang.Integer r1 = r7.code
            if (r1 != 0) goto L_0x0022
            java.lang.Integer r1 = r8.getCode()
            if (r1 != 0) goto L_0x0059
            goto L_0x002c
        L_0x0022:
            java.lang.Integer r3 = r8.getCode()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
        L_0x002c:
            com.google.android.datatransport.runtime.j r1 = r7.encodedPayload
            com.google.android.datatransport.runtime.j r3 = r8.getEncodedPayload()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
            long r3 = r7.eventMillis
            long r5 = r8.getEventMillis()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0059
            long r3 = r7.uptimeMillis
            long r5 = r8.getUptimeMillis()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0059
            java.util.Map<java.lang.String, java.lang.String> r1 = r7.autoMetadata
            java.util.Map r8 = r8.getAutoMetadata()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r0 = r2
        L_0x005a:
            return r0
        L_0x005b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.AutoValue_EventInternal.equals(java.lang.Object):boolean");
    }

    public Map<String, String> getAutoMetadata() {
        return this.autoMetadata;
    }

    public Integer getCode() {
        return this.code;
    }

    public C6546j getEncodedPayload() {
        return this.encodedPayload;
    }

    public long getEventMillis() {
        return this.eventMillis;
    }

    public String getTransportName() {
        return this.transportName;
    }

    public long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public int hashCode() {
        int hashCode = (this.transportName.hashCode() ^ 1000003) * 1000003;
        Integer num = this.code;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j = this.eventMillis;
        long j2 = this.uptimeMillis;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.encodedPayload.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.autoMetadata.hashCode();
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("EventInternal{transportName=");
        h.append(this.transportName);
        h.append(", code=");
        h.append(this.code);
        h.append(", encodedPayload=");
        h.append(this.encodedPayload);
        h.append(", eventMillis=");
        h.append(this.eventMillis);
        h.append(", uptimeMillis=");
        h.append(this.uptimeMillis);
        h.append(", autoMetadata=");
        h.append(this.autoMetadata);
        h.append("}");
        return h.toString();
    }

    private AutoValue_EventInternal(String str, Integer num, C6546j jVar, long j, long j2, Map<String, String> map) {
        this.transportName = str;
        this.code = num;
        this.encodedPayload = jVar;
        this.eventMillis = j;
        this.uptimeMillis = j2;
        this.autoMetadata = map;
    }
}

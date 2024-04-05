package com.google.android.datatransport.cct.internal;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import com.google.android.datatransport.cct.internal.C6514j;
import java.util.List;

final class AutoValue_LogRequest extends C6514j {
    private final ClientInfo clientInfo;
    private final List<C6512i> logEvents;
    private final Integer logSource;
    private final String logSourceName;
    private final QosTier qosTier;
    private final long requestTimeMs;
    private final long requestUptimeMs;

    public static final class Builder extends C6514j.C6515a {
        private ClientInfo clientInfo;
        private List<C6512i> logEvents;
        private Integer logSource;
        private String logSourceName;
        private QosTier qosTier;
        private Long requestTimeMs;
        private Long requestUptimeMs;

        public C6514j build() {
            String str = this.requestTimeMs == null ? " requestTimeMs" : "";
            if (this.requestUptimeMs == null) {
                str = C0326j.m864i(str, " requestUptimeMs");
            }
            if (str.isEmpty()) {
                return new AutoValue_LogRequest(this.requestTimeMs.longValue(), this.requestUptimeMs.longValue(), this.clientInfo, this.logSource, this.logSourceName, this.logEvents, this.qosTier);
            }
            throw new IllegalStateException(C0326j.m864i("Missing required properties:", str));
        }

        public C6514j.C6515a setClientInfo(ClientInfo clientInfo2) {
            this.clientInfo = clientInfo2;
            return this;
        }

        public C6514j.C6515a setLogEvents(List<C6512i> list) {
            this.logEvents = list;
            return this;
        }

        public C6514j.C6515a setLogSource(Integer num) {
            this.logSource = num;
            return this;
        }

        public C6514j.C6515a setLogSourceName(String str) {
            this.logSourceName = str;
            return this;
        }

        public C6514j.C6515a setQosTier(QosTier qosTier2) {
            this.qosTier = qosTier2;
            return this;
        }

        public C6514j.C6515a setRequestTimeMs(long j) {
            this.requestTimeMs = Long.valueOf(j);
            return this;
        }

        public C6514j.C6515a setRequestUptimeMs(long j) {
            this.requestUptimeMs = Long.valueOf(j);
            return this;
        }
    }

    public boolean equals(Object obj) {
        ClientInfo clientInfo2;
        Integer num;
        String str;
        List<C6512i> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6514j)) {
            return false;
        }
        C6514j jVar = (C6514j) obj;
        if (this.requestTimeMs == jVar.getRequestTimeMs() && this.requestUptimeMs == jVar.getRequestUptimeMs() && ((clientInfo2 = this.clientInfo) != null ? clientInfo2.equals(jVar.getClientInfo()) : jVar.getClientInfo() == null) && ((num = this.logSource) != null ? num.equals(jVar.getLogSource()) : jVar.getLogSource() == null) && ((str = this.logSourceName) != null ? str.equals(jVar.getLogSourceName()) : jVar.getLogSourceName() == null) && ((list = this.logEvents) != null ? list.equals(jVar.getLogEvents()) : jVar.getLogEvents() == null)) {
            QosTier qosTier2 = this.qosTier;
            if (qosTier2 == null) {
                if (jVar.getQosTier() == null) {
                    return true;
                }
            } else if (qosTier2.equals(jVar.getQosTier())) {
                return true;
            }
        }
        return false;
    }

    public ClientInfo getClientInfo() {
        return this.clientInfo;
    }

    public List<C6512i> getLogEvents() {
        return this.logEvents;
    }

    public Integer getLogSource() {
        return this.logSource;
    }

    public String getLogSourceName() {
        return this.logSourceName;
    }

    public QosTier getQosTier() {
        return this.qosTier;
    }

    public long getRequestTimeMs() {
        return this.requestTimeMs;
    }

    public long getRequestUptimeMs() {
        return this.requestUptimeMs;
    }

    public int hashCode() {
        long j = this.requestTimeMs;
        long j2 = this.requestUptimeMs;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        ClientInfo clientInfo2 = this.clientInfo;
        int i2 = 0;
        int hashCode = (i ^ (clientInfo2 == null ? 0 : clientInfo2.hashCode())) * 1000003;
        Integer num = this.logSource;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.logSourceName;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<C6512i> list = this.logEvents;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        QosTier qosTier2 = this.qosTier;
        if (qosTier2 != null) {
            i2 = qosTier2.hashCode();
        }
        return hashCode4 ^ i2;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("LogRequest{requestTimeMs=");
        h.append(this.requestTimeMs);
        h.append(", requestUptimeMs=");
        h.append(this.requestUptimeMs);
        h.append(", clientInfo=");
        h.append(this.clientInfo);
        h.append(", logSource=");
        h.append(this.logSource);
        h.append(", logSourceName=");
        h.append(this.logSourceName);
        h.append(", logEvents=");
        h.append(this.logEvents);
        h.append(", qosTier=");
        h.append(this.qosTier);
        h.append("}");
        return h.toString();
    }

    private AutoValue_LogRequest(long j, long j2, ClientInfo clientInfo2, Integer num, String str, List<C6512i> list, QosTier qosTier2) {
        this.requestTimeMs = j;
        this.requestUptimeMs = j2;
        this.clientInfo = clientInfo2;
        this.logSource = num;
        this.logSourceName = str;
        this.logEvents = list;
        this.qosTier = qosTier2;
    }
}

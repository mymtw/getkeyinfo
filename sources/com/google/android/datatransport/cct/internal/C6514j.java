package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.AutoValue_LogRequest;
import com.google.auto.value.AutoValue;
import java.util.List;

@AutoValue
/* renamed from: com.google.android.datatransport.cct.internal.j */
public abstract class C6514j {

    @AutoValue.Builder
    /* renamed from: com.google.android.datatransport.cct.internal.j$a */
    public static abstract class C6515a {
        public abstract C6514j build();

        public abstract C6515a setClientInfo(ClientInfo clientInfo);

        public abstract C6515a setLogEvents(List<C6512i> list);

        public abstract C6515a setLogSource(Integer num);

        public abstract C6515a setLogSourceName(String str);

        public abstract C6515a setQosTier(QosTier qosTier);

        public abstract C6515a setRequestTimeMs(long j);

        public abstract C6515a setRequestUptimeMs(long j);

        public C6515a setSource(int i) {
            return setLogSource(Integer.valueOf(i));
        }

        public C6515a setSource(String str) {
            return setLogSourceName(str);
        }
    }

    public static C6515a builder() {
        return new AutoValue_LogRequest.Builder();
    }

    public abstract ClientInfo getClientInfo();

    public abstract List<C6512i> getLogEvents();

    public abstract Integer getLogSource();

    public abstract String getLogSourceName();

    public abstract QosTier getQosTier();

    public abstract long getRequestTimeMs();

    public abstract long getRequestUptimeMs();
}

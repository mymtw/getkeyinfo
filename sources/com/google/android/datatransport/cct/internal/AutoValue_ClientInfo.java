package com.google.android.datatransport.cct.internal;

import android.support.p013v4.media.C0072d;
import com.google.android.datatransport.cct.internal.ClientInfo;

final class AutoValue_ClientInfo extends ClientInfo {
    private final C6503a androidClientInfo;
    private final ClientInfo.ClientType clientType;

    public static final class Builder extends ClientInfo.C6501a {
        private C6503a androidClientInfo;
        private ClientInfo.ClientType clientType;

        public ClientInfo build() {
            return new AutoValue_ClientInfo(this.clientType, this.androidClientInfo);
        }

        public ClientInfo.C6501a setAndroidClientInfo(C6503a aVar) {
            this.androidClientInfo = aVar;
            return this;
        }

        public ClientInfo.C6501a setClientType(ClientInfo.ClientType clientType2) {
            this.clientType = clientType2;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientInfo)) {
            return false;
        }
        ClientInfo clientInfo = (ClientInfo) obj;
        ClientInfo.ClientType clientType2 = this.clientType;
        if (clientType2 != null ? clientType2.equals(clientInfo.getClientType()) : clientInfo.getClientType() == null) {
            C6503a aVar = this.androidClientInfo;
            if (aVar == null) {
                if (clientInfo.getAndroidClientInfo() == null) {
                    return true;
                }
            } else if (aVar.equals(clientInfo.getAndroidClientInfo())) {
                return true;
            }
        }
        return false;
    }

    public C6503a getAndroidClientInfo() {
        return this.androidClientInfo;
    }

    public ClientInfo.ClientType getClientType() {
        return this.clientType;
    }

    public int hashCode() {
        ClientInfo.ClientType clientType2 = this.clientType;
        int i = 0;
        int hashCode = ((clientType2 == null ? 0 : clientType2.hashCode()) ^ 1000003) * 1000003;
        C6503a aVar = this.androidClientInfo;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ClientInfo{clientType=");
        h.append(this.clientType);
        h.append(", androidClientInfo=");
        h.append(this.androidClientInfo);
        h.append("}");
        return h.toString();
    }

    private AutoValue_ClientInfo(ClientInfo.ClientType clientType2, C6503a aVar) {
        this.clientType = clientType2;
        this.androidClientInfo = aVar;
    }
}

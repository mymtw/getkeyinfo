package com.paypal.pyplcheckout.pojo;

import android.support.p013v4.media.C0070b;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p650pn.C18417a;

public final class TransactionSession {
    @C18417a("buttonSessionId")
    private final String buttonSessionId;
    @C18417a("ecToken")
    private final String ecToken;
    @C18417a("timestamp")
    private final long timestamp;

    public TransactionSession(long j, String str, String str2) {
        C19383o.m32797g(str, "ecToken");
        C19383o.m32797g(str2, "buttonSessionId");
        this.timestamp = j;
        this.ecToken = str;
        this.buttonSessionId = str2;
    }

    public static /* synthetic */ TransactionSession copy$default(TransactionSession transactionSession, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = transactionSession.timestamp;
        }
        if ((i & 2) != 0) {
            str = transactionSession.ecToken;
        }
        if ((i & 4) != 0) {
            str2 = transactionSession.buttonSessionId;
        }
        return transactionSession.copy(j, str, str2);
    }

    public final long component1() {
        return this.timestamp;
    }

    public final String component2() {
        return this.ecToken;
    }

    public final String component3() {
        return this.buttonSessionId;
    }

    public final TransactionSession copy(long j, String str, String str2) {
        C19383o.m32797g(str, "ecToken");
        C19383o.m32797g(str2, "buttonSessionId");
        return new TransactionSession(j, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionSession)) {
            return false;
        }
        TransactionSession transactionSession = (TransactionSession) obj;
        return this.timestamp == transactionSession.timestamp && C19383o.m32792b(this.ecToken, transactionSession.ecToken) && C19383o.m32792b(this.buttonSessionId, transactionSession.buttonSessionId);
    }

    public final String getButtonSessionId() {
        return this.buttonSessionId;
    }

    public final String getEcToken() {
        return this.ecToken;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return this.buttonSessionId.hashCode() + C0023f.m105e(this.ecToken, Long.hashCode(this.timestamp) * 31, 31);
    }

    public String toString() {
        long j = this.timestamp;
        String str = this.ecToken;
        String str2 = this.buttonSessionId;
        StringBuilder sb = new StringBuilder();
        sb.append("TransactionSession(timestamp=");
        sb.append(j);
        sb.append(", ecToken=");
        sb.append(str);
        return C0070b.m184f(sb, ", buttonSessionId=", str2, ")");
    }
}

package com.paypal.pyplcheckout.p539ab.elmo;

import kotlin.jvm.internal.C19383o;

/* renamed from: com.paypal.pyplcheckout.ab.elmo.ElmoResponse */
public final class ElmoResponse {
    private final ElmoData data;

    public ElmoResponse(ElmoData elmoData) {
        this.data = elmoData;
    }

    public static /* synthetic */ ElmoResponse copy$default(ElmoResponse elmoResponse, ElmoData elmoData, int i, Object obj) {
        if ((i & 1) != 0) {
            elmoData = elmoResponse.data;
        }
        return elmoResponse.copy(elmoData);
    }

    public final ElmoData component1() {
        return this.data;
    }

    public final ElmoResponse copy(ElmoData elmoData) {
        return new ElmoResponse(elmoData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ElmoResponse) && C19383o.m32792b(this.data, ((ElmoResponse) obj).data);
    }

    public final ElmoData getData() {
        return this.data;
    }

    public int hashCode() {
        ElmoData elmoData = this.data;
        if (elmoData == null) {
            return 0;
        }
        return elmoData.hashCode();
    }

    public String toString() {
        ElmoData elmoData = this.data;
        return "ElmoResponse(data=" + elmoData + ")";
    }
}

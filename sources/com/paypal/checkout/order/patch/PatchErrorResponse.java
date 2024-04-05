package com.paypal.checkout.order.patch;

import java.util.List;
import kotlin.jvm.internal.C19383o;

public final class PatchErrorResponse {
    private final List<PatchError> details;

    public PatchErrorResponse(List<PatchError> list) {
        C19383o.m32797g(list, "details");
        this.details = list;
    }

    public static /* synthetic */ PatchErrorResponse copy$default(PatchErrorResponse patchErrorResponse, List<PatchError> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = patchErrorResponse.details;
        }
        return patchErrorResponse.copy(list);
    }

    public final List<PatchError> component1() {
        return this.details;
    }

    public final PatchErrorResponse copy(List<PatchError> list) {
        C19383o.m32797g(list, "details");
        return new PatchErrorResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PatchErrorResponse) && C19383o.m32792b(this.details, ((PatchErrorResponse) obj).details);
    }

    public final List<PatchError> getDetails() {
        return this.details;
    }

    public int hashCode() {
        return this.details.hashCode();
    }

    public String toString() {
        List<PatchError> list = this.details;
        return "PatchErrorResponse(details=" + list + ")";
    }
}

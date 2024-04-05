package com.paypal.checkout.order.patch;

import android.support.p013v4.media.C0071c;
import androidx.compose.animation.C0388a;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;

public final class PatchRequestBody {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: op */
    private final String f37519op;
    private final String path;
    private final Object value;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<PatchRequestBody> fromPatchOrderRequest(PatchOrderRequest patchOrderRequest) {
            C19383o.m32797g(patchOrderRequest, "patchOrderRequest");
            List<OrderUpdate> orderUpdates = patchOrderRequest.getOrderUpdates();
            ArrayList arrayList = new ArrayList(C19322o.m32624F0(orderUpdates));
            for (OrderUpdate orderUpdate : orderUpdates) {
                arrayList.add(new PatchRequestBody(orderUpdate.getPatchOperation().getStringValue(), orderUpdate.getPath$pyplcheckout_externalThreedsRelease(), orderUpdate.getValue()));
            }
            return arrayList;
        }
    }

    public PatchRequestBody(String str, String str2, Object obj) {
        C19383o.m32797g(str, "op");
        C19383o.m32797g(str2, ResponseConstants.PATH);
        C19383o.m32797g(obj, "value");
        this.f37519op = str;
        this.path = str2;
        this.value = obj;
    }

    public static /* synthetic */ PatchRequestBody copy$default(PatchRequestBody patchRequestBody, String str, String str2, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = patchRequestBody.f37519op;
        }
        if ((i & 2) != 0) {
            str2 = patchRequestBody.path;
        }
        if ((i & 4) != 0) {
            obj = patchRequestBody.value;
        }
        return patchRequestBody.copy(str, str2, obj);
    }

    public final String component1() {
        return this.f37519op;
    }

    public final String component2() {
        return this.path;
    }

    public final Object component3() {
        return this.value;
    }

    public final PatchRequestBody copy(String str, String str2, Object obj) {
        C19383o.m32797g(str, "op");
        C19383o.m32797g(str2, ResponseConstants.PATH);
        C19383o.m32797g(obj, "value");
        return new PatchRequestBody(str, str2, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PatchRequestBody)) {
            return false;
        }
        PatchRequestBody patchRequestBody = (PatchRequestBody) obj;
        return C19383o.m32792b(this.f37519op, patchRequestBody.f37519op) && C19383o.m32792b(this.path, patchRequestBody.path) && C19383o.m32792b(this.value, patchRequestBody.value);
    }

    public final String getOp() {
        return this.f37519op;
    }

    public final String getPath() {
        return this.path;
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + C0023f.m105e(this.path, this.f37519op.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.f37519op;
        String str2 = this.path;
        return C0071c.m192d(C0388a.m1050f("PatchRequestBody(op=", str, ", path=", str2, ", value="), this.value, ")");
    }
}

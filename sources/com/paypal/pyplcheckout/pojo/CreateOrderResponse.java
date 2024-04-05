package com.paypal.pyplcheckout.pojo;

import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0388a;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p650pn.C18417a;

public final class CreateOrderResponse {
    @C18417a("id")

    /* renamed from: id */
    private final String f37786id;
    @C18417a("links")
    private final List<CreateOrderLinks> links;
    @C18417a("status")
    private final String status;

    public CreateOrderResponse(String str, String str2, List<CreateOrderLinks> list) {
        C19383o.m32797g(str, "id");
        C19383o.m32797g(str2, ResponseConstants.STATUS);
        C19383o.m32797g(list, "links");
        this.f37786id = str;
        this.status = str2;
        this.links = list;
    }

    public static /* synthetic */ CreateOrderResponse copy$default(CreateOrderResponse createOrderResponse, String str, String str2, List<CreateOrderLinks> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createOrderResponse.f37786id;
        }
        if ((i & 2) != 0) {
            str2 = createOrderResponse.status;
        }
        if ((i & 4) != 0) {
            list = createOrderResponse.links;
        }
        return createOrderResponse.copy(str, str2, list);
    }

    public final String component1() {
        return this.f37786id;
    }

    public final String component2() {
        return this.status;
    }

    public final List<CreateOrderLinks> component3() {
        return this.links;
    }

    public final CreateOrderResponse copy(String str, String str2, List<CreateOrderLinks> list) {
        C19383o.m32797g(str, "id");
        C19383o.m32797g(str2, ResponseConstants.STATUS);
        C19383o.m32797g(list, "links");
        return new CreateOrderResponse(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateOrderResponse)) {
            return false;
        }
        CreateOrderResponse createOrderResponse = (CreateOrderResponse) obj;
        return C19383o.m32792b(this.f37786id, createOrderResponse.f37786id) && C19383o.m32792b(this.status, createOrderResponse.status) && C19383o.m32792b(this.links, createOrderResponse.links);
    }

    public final String getId() {
        return this.f37786id;
    }

    public final List<CreateOrderLinks> getLinks() {
        return this.links;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.links.hashCode() + C0023f.m105e(this.status, this.f37786id.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.f37786id;
        String str2 = this.status;
        return C0326j.m865j(C0388a.m1050f("CreateOrderResponse(id=", str, ", status=", str2, ", links="), this.links, ")");
    }
}

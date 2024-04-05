package com.paypal.pyplcheckout.pojo;

import androidx.appcompat.widget.C0326j;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p650pn.C18417a;

public final class CreateOrderErrorResponse {
    @C18417a("details")
    private final List<CreateOrderErrorDetails> details;
    @C18417a("links")
    private final List<CreateOrderLinks> links;
    @C18417a("message")
    private final String message;

    public CreateOrderErrorResponse(List<CreateOrderErrorDetails> list, String str, List<CreateOrderLinks> list2) {
        C19383o.m32797g(list, "details");
        C19383o.m32797g(str, "message");
        C19383o.m32797g(list2, "links");
        this.details = list;
        this.message = str;
        this.links = list2;
    }

    public static /* synthetic */ CreateOrderErrorResponse copy$default(CreateOrderErrorResponse createOrderErrorResponse, List<CreateOrderErrorDetails> list, String str, List<CreateOrderLinks> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = createOrderErrorResponse.details;
        }
        if ((i & 2) != 0) {
            str = createOrderErrorResponse.message;
        }
        if ((i & 4) != 0) {
            list2 = createOrderErrorResponse.links;
        }
        return createOrderErrorResponse.copy(list, str, list2);
    }

    public final List<CreateOrderErrorDetails> component1() {
        return this.details;
    }

    public final String component2() {
        return this.message;
    }

    public final List<CreateOrderLinks> component3() {
        return this.links;
    }

    public final CreateOrderErrorResponse copy(List<CreateOrderErrorDetails> list, String str, List<CreateOrderLinks> list2) {
        C19383o.m32797g(list, "details");
        C19383o.m32797g(str, "message");
        C19383o.m32797g(list2, "links");
        return new CreateOrderErrorResponse(list, str, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateOrderErrorResponse)) {
            return false;
        }
        CreateOrderErrorResponse createOrderErrorResponse = (CreateOrderErrorResponse) obj;
        return C19383o.m32792b(this.details, createOrderErrorResponse.details) && C19383o.m32792b(this.message, createOrderErrorResponse.message) && C19383o.m32792b(this.links, createOrderErrorResponse.links);
    }

    public final List<CreateOrderErrorDetails> getDetails() {
        return this.details;
    }

    public final List<CreateOrderLinks> getLinks() {
        return this.links;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.links.hashCode() + C0023f.m105e(this.message, this.details.hashCode() * 31, 31);
    }

    public String toString() {
        List<CreateOrderErrorDetails> list = this.details;
        String str = this.message;
        List<CreateOrderLinks> list2 = this.links;
        StringBuilder sb = new StringBuilder();
        sb.append("CreateOrderErrorResponse(details=");
        sb.append(list);
        sb.append(", message=");
        sb.append(str);
        sb.append(", links=");
        return C0326j.m865j(sb, list2, ")");
    }
}

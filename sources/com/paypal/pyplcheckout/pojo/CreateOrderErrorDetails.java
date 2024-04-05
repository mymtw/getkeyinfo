package com.paypal.pyplcheckout.pojo;

import androidx.compose.animation.C0388a;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p010a9.C0048b;
import p650pn.C18417a;

public final class CreateOrderErrorDetails {
    @C18417a("description")
    private final String description;
    @C18417a("field")
    private final String field;
    @C18417a("issue")
    private final String issue;

    public CreateOrderErrorDetails(String str, String str2, String str3) {
        C0048b.m167f(str, "field", str2, "issue", str3, "description");
        this.field = str;
        this.issue = str2;
        this.description = str3;
    }

    public static /* synthetic */ CreateOrderErrorDetails copy$default(CreateOrderErrorDetails createOrderErrorDetails, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createOrderErrorDetails.field;
        }
        if ((i & 2) != 0) {
            str2 = createOrderErrorDetails.issue;
        }
        if ((i & 4) != 0) {
            str3 = createOrderErrorDetails.description;
        }
        return createOrderErrorDetails.copy(str, str2, str3);
    }

    public final String component1() {
        return this.field;
    }

    public final String component2() {
        return this.issue;
    }

    public final String component3() {
        return this.description;
    }

    public final CreateOrderErrorDetails copy(String str, String str2, String str3) {
        C19383o.m32797g(str, "field");
        C19383o.m32797g(str2, "issue");
        C19383o.m32797g(str3, "description");
        return new CreateOrderErrorDetails(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateOrderErrorDetails)) {
            return false;
        }
        CreateOrderErrorDetails createOrderErrorDetails = (CreateOrderErrorDetails) obj;
        return C19383o.m32792b(this.field, createOrderErrorDetails.field) && C19383o.m32792b(this.issue, createOrderErrorDetails.issue) && C19383o.m32792b(this.description, createOrderErrorDetails.description);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getField() {
        return this.field;
    }

    public final String getIssue() {
        return this.issue;
    }

    public int hashCode() {
        return this.description.hashCode() + C0023f.m105e(this.issue, this.field.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.field;
        String str2 = this.issue;
        return C0023f.m110k(C0388a.m1050f("CreateOrderErrorDetails(field=", str, ", issue=", str2, ", description="), this.description, ")");
    }
}

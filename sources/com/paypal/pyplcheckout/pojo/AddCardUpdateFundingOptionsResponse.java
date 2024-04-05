package com.paypal.pyplcheckout.pojo;

import androidx.appcompat.widget.C0326j;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class AddCardUpdateFundingOptionsResponse {
    @C18417a("data")
    private final AddCardUpdateFundingOptionsData data;
    @C18417a("errors")
    private final List<Error> errors;
    @C18417a("extensions")
    private final Extensions extensions;

    public AddCardUpdateFundingOptionsResponse(AddCardUpdateFundingOptionsData addCardUpdateFundingOptionsData, Extensions extensions2, List<Error> list) {
        this.data = addCardUpdateFundingOptionsData;
        this.extensions = extensions2;
        this.errors = list;
    }

    public static /* synthetic */ AddCardUpdateFundingOptionsResponse copy$default(AddCardUpdateFundingOptionsResponse addCardUpdateFundingOptionsResponse, AddCardUpdateFundingOptionsData addCardUpdateFundingOptionsData, Extensions extensions2, List<Error> list, int i, Object obj) {
        if ((i & 1) != 0) {
            addCardUpdateFundingOptionsData = addCardUpdateFundingOptionsResponse.data;
        }
        if ((i & 2) != 0) {
            extensions2 = addCardUpdateFundingOptionsResponse.extensions;
        }
        if ((i & 4) != 0) {
            list = addCardUpdateFundingOptionsResponse.errors;
        }
        return addCardUpdateFundingOptionsResponse.copy(addCardUpdateFundingOptionsData, extensions2, list);
    }

    public final AddCardUpdateFundingOptionsData component1() {
        return this.data;
    }

    public final Extensions component2() {
        return this.extensions;
    }

    public final List<Error> component3() {
        return this.errors;
    }

    public final AddCardUpdateFundingOptionsResponse copy(AddCardUpdateFundingOptionsData addCardUpdateFundingOptionsData, Extensions extensions2, List<Error> list) {
        return new AddCardUpdateFundingOptionsResponse(addCardUpdateFundingOptionsData, extensions2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddCardUpdateFundingOptionsResponse)) {
            return false;
        }
        AddCardUpdateFundingOptionsResponse addCardUpdateFundingOptionsResponse = (AddCardUpdateFundingOptionsResponse) obj;
        return C19383o.m32792b(this.data, addCardUpdateFundingOptionsResponse.data) && C19383o.m32792b(this.extensions, addCardUpdateFundingOptionsResponse.extensions) && C19383o.m32792b(this.errors, addCardUpdateFundingOptionsResponse.errors);
    }

    public final AddCardUpdateFundingOptionsData getData() {
        return this.data;
    }

    public final List<Error> getErrors() {
        return this.errors;
    }

    public final Extensions getExtensions() {
        return this.extensions;
    }

    public int hashCode() {
        AddCardUpdateFundingOptionsData addCardUpdateFundingOptionsData = this.data;
        int i = 0;
        int hashCode = (addCardUpdateFundingOptionsData == null ? 0 : addCardUpdateFundingOptionsData.hashCode()) * 31;
        Extensions extensions2 = this.extensions;
        int hashCode2 = (hashCode + (extensions2 == null ? 0 : extensions2.hashCode())) * 31;
        List<Error> list = this.errors;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        AddCardUpdateFundingOptionsData addCardUpdateFundingOptionsData = this.data;
        Extensions extensions2 = this.extensions;
        List<Error> list = this.errors;
        StringBuilder sb = new StringBuilder();
        sb.append("AddCardUpdateFundingOptionsResponse(data=");
        sb.append(addCardUpdateFundingOptionsData);
        sb.append(", extensions=");
        sb.append(extensions2);
        sb.append(", errors=");
        return C0326j.m865j(sb, list, ")");
    }
}

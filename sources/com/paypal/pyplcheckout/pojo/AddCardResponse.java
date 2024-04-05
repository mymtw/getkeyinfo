package com.paypal.pyplcheckout.pojo;

import androidx.appcompat.widget.C0326j;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class AddCardResponse {
    @C18417a("data")
    private final AddCardResponseData data;
    @C18417a("errors")
    private final List<AddCardError> errors;
    @C18417a("extensions")
    private final Extensions extensions;

    public AddCardResponse(AddCardResponseData addCardResponseData, Extensions extensions2, List<AddCardError> list) {
        this.data = addCardResponseData;
        this.extensions = extensions2;
        this.errors = list;
    }

    public static /* synthetic */ AddCardResponse copy$default(AddCardResponse addCardResponse, AddCardResponseData addCardResponseData, Extensions extensions2, List<AddCardError> list, int i, Object obj) {
        if ((i & 1) != 0) {
            addCardResponseData = addCardResponse.data;
        }
        if ((i & 2) != 0) {
            extensions2 = addCardResponse.extensions;
        }
        if ((i & 4) != 0) {
            list = addCardResponse.errors;
        }
        return addCardResponse.copy(addCardResponseData, extensions2, list);
    }

    public final AddCardResponseData component1() {
        return this.data;
    }

    public final Extensions component2() {
        return this.extensions;
    }

    public final List<AddCardError> component3() {
        return this.errors;
    }

    public final AddCardResponse copy(AddCardResponseData addCardResponseData, Extensions extensions2, List<AddCardError> list) {
        return new AddCardResponse(addCardResponseData, extensions2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddCardResponse)) {
            return false;
        }
        AddCardResponse addCardResponse = (AddCardResponse) obj;
        return C19383o.m32792b(this.data, addCardResponse.data) && C19383o.m32792b(this.extensions, addCardResponse.extensions) && C19383o.m32792b(this.errors, addCardResponse.errors);
    }

    public final AddCardResponseData getData() {
        return this.data;
    }

    public final List<AddCardError> getErrors() {
        return this.errors;
    }

    public final Extensions getExtensions() {
        return this.extensions;
    }

    public int hashCode() {
        AddCardResponseData addCardResponseData = this.data;
        int i = 0;
        int hashCode = (addCardResponseData == null ? 0 : addCardResponseData.hashCode()) * 31;
        Extensions extensions2 = this.extensions;
        int hashCode2 = (hashCode + (extensions2 == null ? 0 : extensions2.hashCode())) * 31;
        List<AddCardError> list = this.errors;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        AddCardResponseData addCardResponseData = this.data;
        Extensions extensions2 = this.extensions;
        List<AddCardError> list = this.errors;
        StringBuilder sb = new StringBuilder();
        sb.append("AddCardResponse(data=");
        sb.append(addCardResponseData);
        sb.append(", extensions=");
        sb.append(extensions2);
        sb.append(", errors=");
        return C0326j.m865j(sb, list, ")");
    }
}

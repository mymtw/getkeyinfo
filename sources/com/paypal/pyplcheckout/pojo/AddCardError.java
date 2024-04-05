package com.paypal.pyplcheckout.pojo;

import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

public final class AddCardError {
    @C18417a("contingency")
    private final Boolean contingency;
    @C18417a("data")
    private final List<AddCardErrorField> data;
    @C18417a("errorData")
    private final AddCardErrorData errorData;
    @C18417a("message")
    private final String message;
    @C18417a("path")
    private final List<String> path;
    @C18417a("statusCode")
    private final Integer statusCode;

    public AddCardError(String str, List<String> list, Integer num, Boolean bool, List<AddCardErrorField> list2, AddCardErrorData addCardErrorData) {
        this.message = str;
        this.path = list;
        this.statusCode = num;
        this.contingency = bool;
        this.data = list2;
        this.errorData = addCardErrorData;
    }

    public static /* synthetic */ AddCardError copy$default(AddCardError addCardError, String str, List<String> list, Integer num, Boolean bool, List<AddCardErrorField> list2, AddCardErrorData addCardErrorData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addCardError.message;
        }
        if ((i & 2) != 0) {
            list = addCardError.path;
        }
        List<String> list3 = list;
        if ((i & 4) != 0) {
            num = addCardError.statusCode;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            bool = addCardError.contingency;
        }
        Boolean bool2 = bool;
        if ((i & 16) != 0) {
            list2 = addCardError.data;
        }
        List<AddCardErrorField> list4 = list2;
        if ((i & 32) != 0) {
            addCardErrorData = addCardError.errorData;
        }
        return addCardError.copy(str, list3, num2, bool2, list4, addCardErrorData);
    }

    public final String component1() {
        return this.message;
    }

    public final List<String> component2() {
        return this.path;
    }

    public final Integer component3() {
        return this.statusCode;
    }

    public final Boolean component4() {
        return this.contingency;
    }

    public final List<AddCardErrorField> component5() {
        return this.data;
    }

    public final AddCardErrorData component6() {
        return this.errorData;
    }

    public final AddCardError copy(String str, List<String> list, Integer num, Boolean bool, List<AddCardErrorField> list2, AddCardErrorData addCardErrorData) {
        return new AddCardError(str, list, num, bool, list2, addCardErrorData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddCardError)) {
            return false;
        }
        AddCardError addCardError = (AddCardError) obj;
        return C19383o.m32792b(this.message, addCardError.message) && C19383o.m32792b(this.path, addCardError.path) && C19383o.m32792b(this.statusCode, addCardError.statusCode) && C19383o.m32792b(this.contingency, addCardError.contingency) && C19383o.m32792b(this.data, addCardError.data) && C19383o.m32792b(this.errorData, addCardError.errorData);
    }

    public final Boolean getContingency() {
        return this.contingency;
    }

    public final List<AddCardErrorField> getData() {
        return this.data;
    }

    public final AddCardErrorData getErrorData() {
        return this.errorData;
    }

    public final String getMessage() {
        return this.message;
    }

    public final List<String> getPath() {
        return this.path;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        String str = this.message;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.path;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.statusCode;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.contingency;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<AddCardErrorField> list2 = this.data;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        AddCardErrorData addCardErrorData = this.errorData;
        if (addCardErrorData != null) {
            i = addCardErrorData.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        String str = this.message;
        List<String> list = this.path;
        Integer num = this.statusCode;
        Boolean bool = this.contingency;
        List<AddCardErrorField> list2 = this.data;
        AddCardErrorData addCardErrorData = this.errorData;
        return "AddCardError(message=" + str + ", path=" + list + ", statusCode=" + num + ", contingency=" + bool + ", data=" + list2 + ", errorData=" + addCardErrorData + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddCardError(String str, List list, Integer num, Boolean bool, List list2, AddCardErrorData addCardErrorData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : list2, addCardErrorData);
    }
}

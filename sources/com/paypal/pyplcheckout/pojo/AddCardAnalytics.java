package com.paypal.pyplcheckout.pojo;

import androidx.compose.animation.C0388a;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p650pn.C18417a;

public final class AddCardAnalytics {
    @C18417a("fi_id")

    /* renamed from: id */
    private final String f37785id;
    @C18417a("fi_name")
    private final String name;
    @C18417a("fi_type")
    private final String type;

    public AddCardAnalytics(String str, String str2, String str3) {
        this.f37785id = str;
        this.name = str2;
        this.type = str3;
    }

    public static /* synthetic */ AddCardAnalytics copy$default(AddCardAnalytics addCardAnalytics, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addCardAnalytics.f37785id;
        }
        if ((i & 2) != 0) {
            str2 = addCardAnalytics.name;
        }
        if ((i & 4) != 0) {
            str3 = addCardAnalytics.type;
        }
        return addCardAnalytics.copy(str, str2, str3);
    }

    public final String component1() {
        return this.f37785id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.type;
    }

    public final AddCardAnalytics copy(String str, String str2, String str3) {
        return new AddCardAnalytics(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddCardAnalytics)) {
            return false;
        }
        AddCardAnalytics addCardAnalytics = (AddCardAnalytics) obj;
        return C19383o.m32792b(this.f37785id, addCardAnalytics.f37785id) && C19383o.m32792b(this.name, addCardAnalytics.name) && C19383o.m32792b(this.type, addCardAnalytics.type);
    }

    public final String getId() {
        return this.f37785id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.f37785id;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.f37785id;
        String str2 = this.name;
        return C0023f.m110k(C0388a.m1050f("AddCardAnalytics(id=", str, ", name=", str2, ", type="), this.type, ")");
    }
}

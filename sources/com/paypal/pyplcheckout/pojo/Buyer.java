package com.paypal.pyplcheckout.pojo;

import androidx.appcompat.widget.C0326j;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class Buyer {
    @C18417a("addresses")
    private final List<Address> addresses;
    @C18417a("email")
    private final Email email;
    @C18417a("name")
    private final Name name;
    @C18417a("phones")
    private final List<Phone> phones;
    @C18417a("userId")
    private final String userId;

    public Buyer(String str, Email email2, Name name2, List<Address> list, List<Phone> list2) {
        this.userId = str;
        this.email = email2;
        this.name = name2;
        this.addresses = list;
        this.phones = list2;
    }

    public static /* synthetic */ Buyer copy$default(Buyer buyer, String str, Email email2, Name name2, List<Address> list, List<Phone> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = buyer.userId;
        }
        if ((i & 2) != 0) {
            email2 = buyer.email;
        }
        Email email3 = email2;
        if ((i & 4) != 0) {
            name2 = buyer.name;
        }
        Name name3 = name2;
        if ((i & 8) != 0) {
            list = buyer.addresses;
        }
        List<Address> list3 = list;
        if ((i & 16) != 0) {
            list2 = buyer.phones;
        }
        return buyer.copy(str, email3, name3, list3, list2);
    }

    public final String component1() {
        return this.userId;
    }

    public final Email component2() {
        return this.email;
    }

    public final Name component3() {
        return this.name;
    }

    public final List<Address> component4() {
        return this.addresses;
    }

    public final List<Phone> component5() {
        return this.phones;
    }

    public final Buyer copy(String str, Email email2, Name name2, List<Address> list, List<Phone> list2) {
        return new Buyer(str, email2, name2, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Buyer)) {
            return false;
        }
        Buyer buyer = (Buyer) obj;
        return C19383o.m32792b(this.userId, buyer.userId) && C19383o.m32792b(this.email, buyer.email) && C19383o.m32792b(this.name, buyer.name) && C19383o.m32792b(this.addresses, buyer.addresses) && C19383o.m32792b(this.phones, buyer.phones);
    }

    public final List<Address> getAddresses() {
        return this.addresses;
    }

    public final Email getEmail() {
        return this.email;
    }

    public final Name getName() {
        return this.name;
    }

    public final List<Phone> getPhones() {
        return this.phones;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.userId;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Email email2 = this.email;
        int hashCode2 = (hashCode + (email2 == null ? 0 : email2.hashCode())) * 31;
        Name name2 = this.name;
        int hashCode3 = (hashCode2 + (name2 == null ? 0 : name2.hashCode())) * 31;
        List<Address> list = this.addresses;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<Phone> list2 = this.phones;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        String str = this.userId;
        Email email2 = this.email;
        Name name2 = this.name;
        List<Address> list = this.addresses;
        List<Phone> list2 = this.phones;
        StringBuilder sb = new StringBuilder();
        sb.append("Buyer(userId=");
        sb.append(str);
        sb.append(", email=");
        sb.append(email2);
        sb.append(", name=");
        sb.append(name2);
        sb.append(", addresses=");
        sb.append(list);
        sb.append(", phones=");
        return C0326j.m865j(sb, list2, ")");
    }
}

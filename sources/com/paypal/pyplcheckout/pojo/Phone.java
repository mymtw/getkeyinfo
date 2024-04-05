package com.paypal.pyplcheckout.pojo;

import kotlin.jvm.internal.C19383o;
import p010a9.C0048b;
import p650pn.C18417a;

public final class Phone {
    @C18417a("number")
    private final String number;

    public Phone(String str) {
        this.number = str;
    }

    public static /* synthetic */ Phone copy$default(Phone phone, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = phone.number;
        }
        return phone.copy(str);
    }

    public final String component1() {
        return this.number;
    }

    public final Phone copy(String str) {
        return new Phone(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Phone) && C19383o.m32792b(this.number, ((Phone) obj).number);
    }

    public final String getNumber() {
        return this.number;
    }

    public int hashCode() {
        String str = this.number;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return C0048b.m163a("Phone(number=", this.number, ")");
    }
}

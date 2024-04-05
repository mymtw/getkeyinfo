package com.google.gson;

import com.google.gson.internal.LazilyParsedNumber;
import java.io.Serializable;
import java.math.BigInteger;

/* renamed from: com.google.gson.q */
public final class C16803q extends C16800n {

    /* renamed from: b */
    public final Serializable f37124b;

    public C16803q(Boolean bool) {
        bool.getClass();
        this.f37124b = bool;
    }

    /* renamed from: m */
    public static boolean m27862m(C16803q qVar) {
        Serializable serializable = qVar.f37124b;
        if (serializable instanceof Number) {
            Number number = (Number) serializable;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final String mo59630e() {
        Serializable serializable = this.f37124b;
        return serializable instanceof Number ? mo59645l().toString() : serializable instanceof Boolean ? ((Boolean) serializable).toString() : (String) serializable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C16803q.class != obj.getClass()) {
            return false;
        }
        C16803q qVar = (C16803q) obj;
        if (this.f37124b == null) {
            return qVar.f37124b == null;
        }
        if (m27862m(this) && m27862m(qVar)) {
            return mo59645l().longValue() == qVar.mo59645l().longValue();
        }
        Serializable serializable = this.f37124b;
        if (!(serializable instanceof Number) || !(qVar.f37124b instanceof Number)) {
            return serializable.equals(qVar.f37124b);
        }
        double doubleValue = mo59645l().doubleValue();
        double doubleValue2 = qVar.mo59645l().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    /* renamed from: g */
    public final boolean mo59643g() {
        Serializable serializable = this.f37124b;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(mo59630e());
    }

    public final int hashCode() {
        long j;
        if (this.f37124b == null) {
            return 31;
        }
        if (m27862m(this)) {
            j = mo59645l().longValue();
        } else {
            Serializable serializable = this.f37124b;
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            j = Double.doubleToLongBits(mo59645l().doubleValue());
        }
        return (int) ((j >>> 32) ^ j);
    }

    /* renamed from: l */
    public final Number mo59645l() {
        Serializable serializable = this.f37124b;
        return serializable instanceof String ? new LazilyParsedNumber((String) serializable) : (Number) serializable;
    }

    public C16803q(Number number) {
        number.getClass();
        this.f37124b = number;
    }

    public C16803q(String str) {
        str.getClass();
        this.f37124b = str;
    }
}

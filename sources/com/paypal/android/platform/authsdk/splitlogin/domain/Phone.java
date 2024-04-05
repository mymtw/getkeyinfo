package com.paypal.android.platform.authsdk.splitlogin.domain;

import androidx.annotation.Keep;
import androidx.compose.animation.C0388a;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
public final class Phone {
    private final String challengeId;
    private final boolean notified;
    private final String phoneNumber;

    public Phone() {
        this((String) null, (String) null, false, 7, (DefaultConstructorMarker) null);
    }

    public Phone(String str, String str2, boolean z) {
        this.challengeId = str;
        this.phoneNumber = str2;
        this.notified = z;
    }

    public static /* synthetic */ Phone copy$default(Phone phone, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = phone.challengeId;
        }
        if ((i & 2) != 0) {
            str2 = phone.phoneNumber;
        }
        if ((i & 4) != 0) {
            z = phone.notified;
        }
        return phone.copy(str, str2, z);
    }

    public final String component1() {
        return this.challengeId;
    }

    public final String component2() {
        return this.phoneNumber;
    }

    public final boolean component3() {
        return this.notified;
    }

    public final Phone copy(String str, String str2, boolean z) {
        return new Phone(str, str2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Phone)) {
            return false;
        }
        Phone phone = (Phone) obj;
        return C19383o.m32792b(this.challengeId, phone.challengeId) && C19383o.m32792b(this.phoneNumber, phone.phoneNumber) && this.notified == phone.notified;
    }

    public final String getChallengeId() {
        return this.challengeId;
    }

    public final boolean getNotified() {
        return this.notified;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int hashCode() {
        String str = this.challengeId;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.phoneNumber;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.notified;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public String toString() {
        String str = this.challengeId;
        String str2 = this.phoneNumber;
        boolean z = this.notified;
        StringBuilder f = C0388a.m1050f("Phone(challengeId=", str, ", phoneNumber=", str2, ", notified=");
        f.append(z);
        f.append(")");
        return f.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Phone(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z);
    }
}

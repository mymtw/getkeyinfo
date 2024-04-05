package com.paypal.android.platform.authsdk.splitlogin.domain;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
public final class ChallengeData {
    private final ArrayList<Phone> phones;

    public ChallengeData() {
        this((ArrayList) null, 1, (DefaultConstructorMarker) null);
    }

    public ChallengeData(ArrayList<Phone> arrayList) {
        this.phones = arrayList;
    }

    public static /* synthetic */ ChallengeData copy$default(ChallengeData challengeData, ArrayList<Phone> arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = challengeData.phones;
        }
        return challengeData.copy(arrayList);
    }

    public final ArrayList<Phone> component1() {
        return this.phones;
    }

    public final ChallengeData copy(ArrayList<Phone> arrayList) {
        return new ChallengeData(arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChallengeData) && C19383o.m32792b(this.phones, ((ChallengeData) obj).phones);
    }

    public final ArrayList<Phone> getPhones() {
        return this.phones;
    }

    public int hashCode() {
        ArrayList<Phone> arrayList = this.phones;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.hashCode();
    }

    public String toString() {
        ArrayList<Phone> arrayList = this.phones;
        return "ChallengeData(phones=" + arrayList + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChallengeData(ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : arrayList);
    }
}

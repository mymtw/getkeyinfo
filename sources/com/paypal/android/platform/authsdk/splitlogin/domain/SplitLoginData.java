package com.paypal.android.platform.authsdk.splitlogin.domain;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
public final class SplitLoginData {
    private final ArrayList<AuthOptionChallengeData> authOptionChallenges;
    private final ArrayList<String> authOptions;

    public SplitLoginData() {
        this((ArrayList) null, (ArrayList) null, 3, (DefaultConstructorMarker) null);
    }

    public SplitLoginData(ArrayList<AuthOptionChallengeData> arrayList, ArrayList<String> arrayList2) {
        this.authOptionChallenges = arrayList;
        this.authOptions = arrayList2;
    }

    public static /* synthetic */ SplitLoginData copy$default(SplitLoginData splitLoginData, ArrayList<AuthOptionChallengeData> arrayList, ArrayList<String> arrayList2, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = splitLoginData.authOptionChallenges;
        }
        if ((i & 2) != 0) {
            arrayList2 = splitLoginData.authOptions;
        }
        return splitLoginData.copy(arrayList, arrayList2);
    }

    public final ArrayList<AuthOptionChallengeData> component1() {
        return this.authOptionChallenges;
    }

    public final ArrayList<String> component2() {
        return this.authOptions;
    }

    public final SplitLoginData copy(ArrayList<AuthOptionChallengeData> arrayList, ArrayList<String> arrayList2) {
        return new SplitLoginData(arrayList, arrayList2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitLoginData)) {
            return false;
        }
        SplitLoginData splitLoginData = (SplitLoginData) obj;
        return C19383o.m32792b(this.authOptionChallenges, splitLoginData.authOptionChallenges) && C19383o.m32792b(this.authOptions, splitLoginData.authOptions);
    }

    public final ArrayList<AuthOptionChallengeData> getAuthOptionChallenges() {
        return this.authOptionChallenges;
    }

    public final ArrayList<String> getAuthOptions() {
        return this.authOptions;
    }

    public int hashCode() {
        ArrayList<AuthOptionChallengeData> arrayList = this.authOptionChallenges;
        int i = 0;
        int hashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        ArrayList<String> arrayList2 = this.authOptions;
        if (arrayList2 != null) {
            i = arrayList2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        ArrayList<AuthOptionChallengeData> arrayList = this.authOptionChallenges;
        ArrayList<String> arrayList2 = this.authOptions;
        return "SplitLoginData(authOptionChallenges=" + arrayList + ", authOptions=" + arrayList2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SplitLoginData(ArrayList arrayList, ArrayList arrayList2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : arrayList, (i & 2) != 0 ? null : arrayList2);
    }
}

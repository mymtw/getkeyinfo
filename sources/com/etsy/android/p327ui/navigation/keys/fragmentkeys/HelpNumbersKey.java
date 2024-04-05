package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import com.etsy.android.p327ui.user.help.HelpPhoneNumbersFragment;
import kotlin.jvm.internal.C19383o;
import p343ee.C12693a;
import p343ee.C12695c;
import p363he.C12822e;
import p363he.C12824f;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.HelpNumbersKey */
public final class HelpNumbersKey implements FragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<HelpNumbersKey> CREATOR = new Creator();
    private final String referrer;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.HelpNumbersKey$Creator */
    public static final class Creator implements Parcelable.Creator<HelpNumbersKey> {
        public final HelpNumbersKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new HelpNumbersKey(parcel.readString());
        }

        public final HelpNumbersKey[] newArray(int i) {
            return new HelpNumbersKey[i];
        }
    }

    public HelpNumbersKey(String str) {
        C19383o.m32797g(str, "referrer");
        this.referrer = str;
    }

    public static /* synthetic */ HelpNumbersKey copy$default(HelpNumbersKey helpNumbersKey, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = helpNumbersKey.getReferrer();
        }
        return helpNumbersKey.copy(str);
    }

    public final String component1() {
        return getReferrer();
    }

    public final HelpNumbersKey copy(String str) {
        C19383o.m32797g(str, "referrer");
        return new HelpNumbersKey(str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HelpNumbersKey) && C19383o.m32792b(getReferrer(), ((HelpNumbersKey) obj).getReferrer());
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.FADE;
    }

    public C12693a getBackstackGenerator() {
        return new C12695c(false);
    }

    public String getClazzName() {
        String canonicalName = HelpPhoneNumbersFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName);
        return canonicalName;
    }

    public boolean getClearBackstack() {
        return false;
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        return fVar;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public Bundle getReferrerBundle() {
        return null;
    }

    public int hashCode() {
        return getReferrer().hashCode();
    }

    public boolean isDialog() {
        return false;
    }

    public boolean isForciblyAddedToCurrentStack() {
        return false;
    }

    public boolean shouldReplaceTop() {
        return false;
    }

    public int storeDataForKey(Object obj) {
        C19383o.m32797g(obj, "value");
        return C12822e.C12823a.m20464a(obj);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("HelpNumbersKey(referrer=");
        h.append(getReferrer());
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
    }
}

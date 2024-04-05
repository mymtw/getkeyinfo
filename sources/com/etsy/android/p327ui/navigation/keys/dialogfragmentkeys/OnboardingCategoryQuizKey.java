package com.etsy.android.p327ui.navigation.keys.dialogfragmentkeys;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.fragment.app.DialogFragment;
import com.etsy.android.onboarding.OnboardingCategoryQuizFragment;
import com.etsy.android.p327ui.navigation.keys.DialogFragmentNavigationKey;
import kotlin.jvm.internal.C19383o;
import p363he.C12822e;
import p363he.C12824f;

/* renamed from: com.etsy.android.ui.navigation.keys.dialogfragmentkeys.OnboardingCategoryQuizKey */
public final class OnboardingCategoryQuizKey implements DialogFragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<OnboardingCategoryQuizKey> CREATOR = new Creator();
    private final String referrer;

    /* renamed from: com.etsy.android.ui.navigation.keys.dialogfragmentkeys.OnboardingCategoryQuizKey$Creator */
    public static final class Creator implements Parcelable.Creator<OnboardingCategoryQuizKey> {
        public final OnboardingCategoryQuizKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new OnboardingCategoryQuizKey(parcel.readString());
        }

        public final OnboardingCategoryQuizKey[] newArray(int i) {
            return new OnboardingCategoryQuizKey[i];
        }
    }

    public OnboardingCategoryQuizKey(String str) {
        C19383o.m32797g(str, "referrer");
        this.referrer = str;
    }

    public static /* synthetic */ OnboardingCategoryQuizKey copy$default(OnboardingCategoryQuizKey onboardingCategoryQuizKey, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onboardingCategoryQuizKey.getReferrer();
        }
        return onboardingCategoryQuizKey.copy(str);
    }

    public final String component1() {
        return getReferrer();
    }

    public final OnboardingCategoryQuizKey copy(String str) {
        C19383o.m32797g(str, "referrer");
        return new OnboardingCategoryQuizKey(str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnboardingCategoryQuizKey) && C19383o.m32792b(getReferrer(), ((OnboardingCategoryQuizKey) obj).getReferrer());
    }

    public DialogFragment getDialogFragment() {
        return new OnboardingCategoryQuizFragment();
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        return fVar;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public int hashCode() {
        return getReferrer().hashCode();
    }

    public int storeDataForKey(Object obj) {
        C19383o.m32797g(obj, "value");
        return C12822e.C12823a.m20464a(obj);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("OnboardingCategoryQuizKey(referrer=");
        h.append(getReferrer());
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
    }
}

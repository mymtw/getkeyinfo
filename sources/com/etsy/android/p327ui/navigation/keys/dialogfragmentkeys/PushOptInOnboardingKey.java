package com.etsy.android.p327ui.navigation.keys.dialogfragmentkeys;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.fragment.app.DialogFragment;
import com.etsy.android.p327ui.navigation.keys.DialogFragmentNavigationKey;
import com.etsy.android.push.onboarding.PushOptInOnboardingDialogFragment;
import kotlin.jvm.internal.C19383o;
import p363he.C12822e;
import p363he.C12824f;

/* renamed from: com.etsy.android.ui.navigation.keys.dialogfragmentkeys.PushOptInOnboardingKey */
public final class PushOptInOnboardingKey implements DialogFragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PushOptInOnboardingKey> CREATOR = new Creator();
    private final String referrer;

    /* renamed from: com.etsy.android.ui.navigation.keys.dialogfragmentkeys.PushOptInOnboardingKey$Creator */
    public static final class Creator implements Parcelable.Creator<PushOptInOnboardingKey> {
        public final PushOptInOnboardingKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new PushOptInOnboardingKey(parcel.readString());
        }

        public final PushOptInOnboardingKey[] newArray(int i) {
            return new PushOptInOnboardingKey[i];
        }
    }

    public PushOptInOnboardingKey(String str) {
        C19383o.m32797g(str, "referrer");
        this.referrer = str;
    }

    public static /* synthetic */ PushOptInOnboardingKey copy$default(PushOptInOnboardingKey pushOptInOnboardingKey, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pushOptInOnboardingKey.getReferrer();
        }
        return pushOptInOnboardingKey.copy(str);
    }

    public final String component1() {
        return getReferrer();
    }

    public final PushOptInOnboardingKey copy(String str) {
        C19383o.m32797g(str, "referrer");
        return new PushOptInOnboardingKey(str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PushOptInOnboardingKey) && C19383o.m32792b(getReferrer(), ((PushOptInOnboardingKey) obj).getReferrer());
    }

    public DialogFragment getDialogFragment() {
        return new PushOptInOnboardingDialogFragment();
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
        StringBuilder h = C0072d.m201h("PushOptInOnboardingKey(referrer=");
        h.append(getReferrer());
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
    }
}

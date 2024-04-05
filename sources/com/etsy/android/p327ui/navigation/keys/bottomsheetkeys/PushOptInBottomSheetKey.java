package com.etsy.android.p327ui.navigation.keys.bottomsheetkeys;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.etsy.android.p327ui.cart.pushoptin.PushOptInBottomSheetFragment;
import com.etsy.android.p327ui.navigation.keys.BottomSheetNavigationKey;
import com.etsy.android.uikit.p331ui.core.TrackingBottomSheetDialogFragment;
import kotlin.jvm.internal.C19383o;
import p363he.C12822e;
import p363he.C12824f;

/* renamed from: com.etsy.android.ui.navigation.keys.bottomsheetkeys.PushOptInBottomSheetKey */
public final class PushOptInBottomSheetKey implements BottomSheetNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PushOptInBottomSheetKey> CREATOR = new Creator();
    private final String referrer;

    /* renamed from: com.etsy.android.ui.navigation.keys.bottomsheetkeys.PushOptInBottomSheetKey$Creator */
    public static final class Creator implements Parcelable.Creator<PushOptInBottomSheetKey> {
        public final PushOptInBottomSheetKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new PushOptInBottomSheetKey(parcel.readString());
        }

        public final PushOptInBottomSheetKey[] newArray(int i) {
            return new PushOptInBottomSheetKey[i];
        }
    }

    public PushOptInBottomSheetKey(String str) {
        C19383o.m32797g(str, "referrer");
        this.referrer = str;
    }

    public static /* synthetic */ PushOptInBottomSheetKey copy$default(PushOptInBottomSheetKey pushOptInBottomSheetKey, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pushOptInBottomSheetKey.getReferrer();
        }
        return pushOptInBottomSheetKey.copy(str);
    }

    public final String component1() {
        return getReferrer();
    }

    public final PushOptInBottomSheetKey copy(String str) {
        C19383o.m32797g(str, "referrer");
        return new PushOptInBottomSheetKey(str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PushOptInBottomSheetKey) && C19383o.m32792b(getReferrer(), ((PushOptInBottomSheetKey) obj).getReferrer());
    }

    public TrackingBottomSheetDialogFragment getBottomSheetFragment() {
        return new PushOptInBottomSheetFragment();
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
        StringBuilder h = C0072d.m201h("PushOptInBottomSheetKey(referrer=");
        h.append(getReferrer());
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
    }
}

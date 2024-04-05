package com.etsy.android.p327ui.navigation.keys.bottomsheetkeys;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.etsy.android.p327ui.favorites.createalist.CreateAListContainerFragment;
import com.etsy.android.p327ui.navigation.keys.BottomSheetNavigationKey;
import com.etsy.android.uikit.p331ui.core.TrackingBottomSheetDialogFragment;
import kotlin.jvm.internal.C19383o;
import p363he.C12822e;
import p363he.C12824f;

/* renamed from: com.etsy.android.ui.navigation.keys.bottomsheetkeys.CreateAListBottomSheetKey */
public final class CreateAListBottomSheetKey implements BottomSheetNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<CreateAListBottomSheetKey> CREATOR = new Creator();
    private final String referrer;

    /* renamed from: com.etsy.android.ui.navigation.keys.bottomsheetkeys.CreateAListBottomSheetKey$Creator */
    public static final class Creator implements Parcelable.Creator<CreateAListBottomSheetKey> {
        public final CreateAListBottomSheetKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new CreateAListBottomSheetKey(parcel.readString());
        }

        public final CreateAListBottomSheetKey[] newArray(int i) {
            return new CreateAListBottomSheetKey[i];
        }
    }

    public CreateAListBottomSheetKey(String str) {
        C19383o.m32797g(str, "referrer");
        this.referrer = str;
    }

    public static /* synthetic */ CreateAListBottomSheetKey copy$default(CreateAListBottomSheetKey createAListBottomSheetKey, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createAListBottomSheetKey.getReferrer();
        }
        return createAListBottomSheetKey.copy(str);
    }

    public final String component1() {
        return getReferrer();
    }

    public final CreateAListBottomSheetKey copy(String str) {
        C19383o.m32797g(str, "referrer");
        return new CreateAListBottomSheetKey(str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreateAListBottomSheetKey) && C19383o.m32792b(getReferrer(), ((CreateAListBottomSheetKey) obj).getReferrer());
    }

    public TrackingBottomSheetDialogFragment getBottomSheetFragment() {
        return new CreateAListContainerFragment();
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
        StringBuilder h = C0072d.m201h("CreateAListBottomSheetKey(referrer=");
        h.append(getReferrer());
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
    }
}

package com.etsy.android.p327ui.navigation.keys.bottomsheetkeys;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.apiv3.sdl.Page;
import com.etsy.android.p327ui.navigation.keys.BottomSheetNavigationKey;
import com.etsy.android.p327ui.sdl.SdlModalFragment;
import com.etsy.android.uikit.p331ui.core.TrackingBottomSheetDialogFragment;
import kotlin.jvm.internal.C19383o;
import p363he.C12822e;
import p363he.C12824f;

/* renamed from: com.etsy.android.ui.navigation.keys.bottomsheetkeys.SdlModalBottomSheetKey */
public final class SdlModalBottomSheetKey implements BottomSheetNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SdlModalBottomSheetKey> CREATOR = new Creator();
    private final Page modalContent;
    private final String referrer;

    /* renamed from: com.etsy.android.ui.navigation.keys.bottomsheetkeys.SdlModalBottomSheetKey$Creator */
    public static final class Creator implements Parcelable.Creator<SdlModalBottomSheetKey> {
        public final SdlModalBottomSheetKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new SdlModalBottomSheetKey(parcel.readString(), (Page) parcel.readSerializable());
        }

        public final SdlModalBottomSheetKey[] newArray(int i) {
            return new SdlModalBottomSheetKey[i];
        }
    }

    public SdlModalBottomSheetKey(String str, Page page) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(page, "modalContent");
        this.referrer = str;
        this.modalContent = page;
    }

    public static /* synthetic */ SdlModalBottomSheetKey copy$default(SdlModalBottomSheetKey sdlModalBottomSheetKey, String str, Page page, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sdlModalBottomSheetKey.getReferrer();
        }
        if ((i & 2) != 0) {
            page = sdlModalBottomSheetKey.modalContent;
        }
        return sdlModalBottomSheetKey.copy(str, page);
    }

    public final String component1() {
        return getReferrer();
    }

    public final Page component2() {
        return this.modalContent;
    }

    public final SdlModalBottomSheetKey copy(String str, Page page) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(page, "modalContent");
        return new SdlModalBottomSheetKey(str, page);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdlModalBottomSheetKey)) {
            return false;
        }
        SdlModalBottomSheetKey sdlModalBottomSheetKey = (SdlModalBottomSheetKey) obj;
        return C19383o.m32792b(getReferrer(), sdlModalBottomSheetKey.getReferrer()) && C19383o.m32792b(this.modalContent, sdlModalBottomSheetKey.modalContent);
    }

    public TrackingBottomSheetDialogFragment getBottomSheetFragment() {
        return new SdlModalFragment();
    }

    public final Page getModalContent() {
        return this.modalContent;
    }

    public C12824f getNavigationParams() {
        int storeDataForKey = storeDataForKey(this.modalContent);
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        fVar.f28304a.put("transaction-data", Integer.valueOf(storeDataForKey));
        return fVar;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public int hashCode() {
        return this.modalContent.hashCode() + (getReferrer().hashCode() * 31);
    }

    public int storeDataForKey(Object obj) {
        C19383o.m32797g(obj, "value");
        return C12822e.C12823a.m20464a(obj);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("SdlModalBottomSheetKey(referrer=");
        h.append(getReferrer());
        h.append(", modalContent=");
        h.append(this.modalContent);
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        parcel.writeSerializable(this.modalContent);
    }
}

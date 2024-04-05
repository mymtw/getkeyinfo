package com.etsy.android.p327ui.navigation.keys.bottomsheetkeys;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.p326ui.DetailsBottomSheetDialogFragment;
import com.etsy.android.p327ui.navigation.keys.BottomSheetNavigationKey;
import com.etsy.android.uikit.p331ui.core.TrackingBottomSheetDialogFragment;
import kotlin.jvm.internal.C19383o;
import p363he.C12822e;
import p363he.C12824f;

/* renamed from: com.etsy.android.ui.navigation.keys.bottomsheetkeys.DetailsBottomSheetNavigationKey */
public final class DetailsBottomSheetNavigationKey implements BottomSheetNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<DetailsBottomSheetNavigationKey> CREATOR = new Creator();
    public static final C10694a Companion = new C10694a();
    public static final String PARAM_BODY = "body";
    public static final String PARAM_TITLE = "title";
    private final String body;
    private final String referrer;
    private final String title;

    /* renamed from: com.etsy.android.ui.navigation.keys.bottomsheetkeys.DetailsBottomSheetNavigationKey$Creator */
    public static final class Creator implements Parcelable.Creator<DetailsBottomSheetNavigationKey> {
        public final DetailsBottomSheetNavigationKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new DetailsBottomSheetNavigationKey(parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final DetailsBottomSheetNavigationKey[] newArray(int i) {
            return new DetailsBottomSheetNavigationKey[i];
        }
    }

    /* renamed from: com.etsy.android.ui.navigation.keys.bottomsheetkeys.DetailsBottomSheetNavigationKey$a */
    public static final class C10694a {
    }

    public DetailsBottomSheetNavigationKey(String str, String str2, String str3) {
        C19383o.m32797g(str, "referrer");
        this.referrer = str;
        this.title = str2;
        this.body = str3;
    }

    public static /* synthetic */ DetailsBottomSheetNavigationKey copy$default(DetailsBottomSheetNavigationKey detailsBottomSheetNavigationKey, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = detailsBottomSheetNavigationKey.getReferrer();
        }
        if ((i & 2) != 0) {
            str2 = detailsBottomSheetNavigationKey.title;
        }
        if ((i & 4) != 0) {
            str3 = detailsBottomSheetNavigationKey.body;
        }
        return detailsBottomSheetNavigationKey.copy(str, str2, str3);
    }

    public final String component1() {
        return getReferrer();
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.body;
    }

    public final DetailsBottomSheetNavigationKey copy(String str, String str2, String str3) {
        C19383o.m32797g(str, "referrer");
        return new DetailsBottomSheetNavigationKey(str, str2, str3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DetailsBottomSheetNavigationKey)) {
            return false;
        }
        DetailsBottomSheetNavigationKey detailsBottomSheetNavigationKey = (DetailsBottomSheetNavigationKey) obj;
        return C19383o.m32792b(getReferrer(), detailsBottomSheetNavigationKey.getReferrer()) && C19383o.m32792b(this.title, detailsBottomSheetNavigationKey.title) && C19383o.m32792b(this.body, detailsBottomSheetNavigationKey.body);
    }

    public final String getBody() {
        return this.body;
    }

    public TrackingBottomSheetDialogFragment getBottomSheetFragment() {
        return new DetailsBottomSheetDialogFragment();
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        fVar.f28304a.put("title", this.title);
        fVar.f28304a.put(PARAM_BODY, this.body);
        return fVar;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = getReferrer().hashCode() * 31;
        String str = this.title;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.body;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public int storeDataForKey(Object obj) {
        C19383o.m32797g(obj, "value");
        return C12822e.C12823a.m20464a(obj);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("DetailsBottomSheetNavigationKey(referrer=");
        h.append(getReferrer());
        h.append(", title=");
        h.append(this.title);
        h.append(", body=");
        return C0391c.m1057c(h, this.body, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        parcel.writeString(this.title);
        parcel.writeString(this.body);
    }
}

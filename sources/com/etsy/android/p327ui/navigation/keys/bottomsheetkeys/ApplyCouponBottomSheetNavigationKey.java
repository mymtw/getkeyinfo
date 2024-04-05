package com.etsy.android.p327ui.navigation.keys.bottomsheetkeys;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.cart.bottomsheets.applycoupon.ApplyCouponBottomSheetFragment;
import com.etsy.android.p327ui.navigation.keys.BottomSheetNavigationKey;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p363he.C12822e;
import p363he.C12824f;

/* renamed from: com.etsy.android.ui.navigation.keys.bottomsheetkeys.ApplyCouponBottomSheetNavigationKey */
public final class ApplyCouponBottomSheetNavigationKey implements BottomSheetNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ApplyCouponBottomSheetNavigationKey> CREATOR = new Creator();
    public static final C10693a Companion = new C10693a();
    public static final String PARAM_APPLY_BUTTON_TEXT = "submit_button_text";
    public static final String PARAM_INPUT_HELPER_TEXT = "input_helper_text";
    public static final String PARAM_INPUT_LABEL_TEXT = "input_label_text";
    public static final String PARAM_TITLE_TEXT = "title_text";
    private final String applyButtonText;
    private final ApplyCouponBottomSheetFragment fragment = new ApplyCouponBottomSheetFragment();
    private final String inputHelperText;
    private final String inputLabelText;
    private final String referrer;
    private final String titleText;

    /* renamed from: com.etsy.android.ui.navigation.keys.bottomsheetkeys.ApplyCouponBottomSheetNavigationKey$Creator */
    public static final class Creator implements Parcelable.Creator<ApplyCouponBottomSheetNavigationKey> {
        public final ApplyCouponBottomSheetNavigationKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new ApplyCouponBottomSheetNavigationKey(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final ApplyCouponBottomSheetNavigationKey[] newArray(int i) {
            return new ApplyCouponBottomSheetNavigationKey[i];
        }
    }

    /* renamed from: com.etsy.android.ui.navigation.keys.bottomsheetkeys.ApplyCouponBottomSheetNavigationKey$a */
    public static final class C10693a {
    }

    public ApplyCouponBottomSheetNavigationKey(String str, String str2, String str3, String str4, String str5) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(str2, "titleText");
        C19383o.m32797g(str3, "inputLabelText");
        C19383o.m32797g(str4, "inputHelperText");
        C19383o.m32797g(str5, "applyButtonText");
        this.referrer = str;
        this.titleText = str2;
        this.inputLabelText = str3;
        this.inputHelperText = str4;
        this.applyButtonText = str5;
    }

    public static /* synthetic */ ApplyCouponBottomSheetNavigationKey copy$default(ApplyCouponBottomSheetNavigationKey applyCouponBottomSheetNavigationKey, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = applyCouponBottomSheetNavigationKey.getReferrer();
        }
        if ((i & 2) != 0) {
            str2 = applyCouponBottomSheetNavigationKey.titleText;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = applyCouponBottomSheetNavigationKey.inputLabelText;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = applyCouponBottomSheetNavigationKey.inputHelperText;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = applyCouponBottomSheetNavigationKey.applyButtonText;
        }
        return applyCouponBottomSheetNavigationKey.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return getReferrer();
    }

    public final String component2() {
        return this.titleText;
    }

    public final String component3() {
        return this.inputLabelText;
    }

    public final String component4() {
        return this.inputHelperText;
    }

    public final String component5() {
        return this.applyButtonText;
    }

    public final ApplyCouponBottomSheetNavigationKey copy(String str, String str2, String str3, String str4, String str5) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(str2, "titleText");
        C19383o.m32797g(str3, "inputLabelText");
        C19383o.m32797g(str4, "inputHelperText");
        C19383o.m32797g(str5, "applyButtonText");
        return new ApplyCouponBottomSheetNavigationKey(str, str2, str3, str4, str5);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplyCouponBottomSheetNavigationKey)) {
            return false;
        }
        ApplyCouponBottomSheetNavigationKey applyCouponBottomSheetNavigationKey = (ApplyCouponBottomSheetNavigationKey) obj;
        return C19383o.m32792b(getReferrer(), applyCouponBottomSheetNavigationKey.getReferrer()) && C19383o.m32792b(this.titleText, applyCouponBottomSheetNavigationKey.titleText) && C19383o.m32792b(this.inputLabelText, applyCouponBottomSheetNavigationKey.inputLabelText) && C19383o.m32792b(this.inputHelperText, applyCouponBottomSheetNavigationKey.inputHelperText) && C19383o.m32792b(this.applyButtonText, applyCouponBottomSheetNavigationKey.applyButtonText);
    }

    public final String getApplyButtonText() {
        return this.applyButtonText;
    }

    public final ApplyCouponBottomSheetFragment getFragment() {
        return this.fragment;
    }

    public final String getInputHelperText() {
        return this.inputHelperText;
    }

    public final String getInputLabelText() {
        return this.inputLabelText;
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        fVar.f28304a.put(PARAM_TITLE_TEXT, this.titleText);
        fVar.f28304a.put(PARAM_INPUT_LABEL_TEXT, this.inputLabelText);
        fVar.f28304a.put(PARAM_INPUT_HELPER_TEXT, this.inputHelperText);
        fVar.f28304a.put(PARAM_APPLY_BUTTON_TEXT, this.applyButtonText);
        return fVar;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public final String getTitleText() {
        return this.titleText;
    }

    public int hashCode() {
        return this.applyButtonText.hashCode() + C0023f.m105e(this.inputHelperText, C0023f.m105e(this.inputLabelText, C0023f.m105e(this.titleText, getReferrer().hashCode() * 31, 31), 31), 31);
    }

    public int storeDataForKey(Object obj) {
        C19383o.m32797g(obj, "value");
        return C12822e.C12823a.m20464a(obj);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ApplyCouponBottomSheetNavigationKey(referrer=");
        h.append(getReferrer());
        h.append(", titleText=");
        h.append(this.titleText);
        h.append(", inputLabelText=");
        h.append(this.inputLabelText);
        h.append(", inputHelperText=");
        h.append(this.inputHelperText);
        h.append(", applyButtonText=");
        return C0391c.m1057c(h, this.applyButtonText, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        parcel.writeString(this.titleText);
        parcel.writeString(this.inputLabelText);
        parcel.writeString(this.inputHelperText);
        parcel.writeString(this.applyButtonText);
    }

    public ApplyCouponBottomSheetFragment getBottomSheetFragment() {
        return this.fragment;
    }
}

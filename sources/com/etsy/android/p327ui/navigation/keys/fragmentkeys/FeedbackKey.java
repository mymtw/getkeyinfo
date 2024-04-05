package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.etsy.android.feedback.FeedbackFragment;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.exceptions.UnsupportedNavigationException;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;
import p343ee.C12693a;
import p363he.C12822e;
import p363he.C12824f;
import p772tq.C20203a;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.FeedbackKey */
public final class FeedbackKey implements FragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<FeedbackKey> CREATOR = new Creator();
    private final String referrer;
    private final Bundle referrerBundle;
    private final EtsyId shopId;
    private final Integer transactionDataKey;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.FeedbackKey$Creator */
    public static final class Creator implements Parcelable.Creator<FeedbackKey> {
        public final FeedbackKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new FeedbackKey(parcel.readString(), (EtsyId) parcel.readSerializable(), parcel.readBundle(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        public final FeedbackKey[] newArray(int i) {
            return new FeedbackKey[i];
        }
    }

    public FeedbackKey(String str, EtsyId etsyId, Bundle bundle, Integer num) {
        C19383o.m32797g(str, "referrer");
        this.referrer = str;
        this.shopId = etsyId;
        this.referrerBundle = bundle;
        this.transactionDataKey = num;
    }

    public static /* synthetic */ FeedbackKey copy$default(FeedbackKey feedbackKey, String str, EtsyId etsyId, Bundle bundle, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedbackKey.getReferrer();
        }
        if ((i & 2) != 0) {
            etsyId = feedbackKey.shopId;
        }
        if ((i & 4) != 0) {
            bundle = feedbackKey.getReferrerBundle();
        }
        if ((i & 8) != 0) {
            num = feedbackKey.transactionDataKey;
        }
        return feedbackKey.copy(str, etsyId, bundle, num);
    }

    public final String component1() {
        return getReferrer();
    }

    public final EtsyId component2() {
        return this.shopId;
    }

    public final Bundle component3() {
        return getReferrerBundle();
    }

    public final Integer component4() {
        return this.transactionDataKey;
    }

    public final FeedbackKey copy(String str, EtsyId etsyId, Bundle bundle, Integer num) {
        C19383o.m32797g(str, "referrer");
        return new FeedbackKey(str, etsyId, bundle, num);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedbackKey)) {
            return false;
        }
        FeedbackKey feedbackKey = (FeedbackKey) obj;
        return C19383o.m32792b(getReferrer(), feedbackKey.getReferrer()) && C19383o.m32792b(this.shopId, feedbackKey.shopId) && C19383o.m32792b(getReferrerBundle(), feedbackKey.getReferrerBundle()) && C19383o.m32792b(this.transactionDataKey, feedbackKey.transactionDataKey);
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.FADE;
    }

    public C12693a getBackstackGenerator() {
        return new C20203a();
    }

    public String getClazzName() {
        String canonicalName = FeedbackFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName);
        return canonicalName;
    }

    public boolean getClearBackstack() {
        return false;
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        EtsyId etsyId = this.shopId;
        if (etsyId != null) {
            fVar.f28304a.put("shop_id", Long.valueOf(etsyId.getIdAsLong()));
            if (getReferrerBundle() != null) {
                fVar.f28304a.put("referral_args", getReferrerBundle());
            }
            Integer num = this.transactionDataKey;
            if (num != null) {
                fVar.f28304a.put("transaction-data", num);
            }
            return fVar;
        }
        throw new UnsupportedNavigationException(this + " requires either the shop id or feedback data");
    }

    public String getReferrer() {
        return this.referrer;
    }

    public Bundle getReferrerBundle() {
        return this.referrerBundle;
    }

    public final EtsyId getShopId() {
        return this.shopId;
    }

    public final Integer getTransactionDataKey() {
        return this.transactionDataKey;
    }

    public int hashCode() {
        int hashCode = getReferrer().hashCode() * 31;
        EtsyId etsyId = this.shopId;
        int i = 0;
        int hashCode2 = (((hashCode + (etsyId == null ? 0 : etsyId.hashCode())) * 31) + (getReferrerBundle() == null ? 0 : getReferrerBundle().hashCode())) * 31;
        Integer num = this.transactionDataKey;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode2 + i;
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
        StringBuilder h = C0072d.m201h("FeedbackKey(referrer=");
        h.append(getReferrer());
        h.append(", shopId=");
        h.append(this.shopId);
        h.append(", referrerBundle=");
        h.append(getReferrerBundle());
        h.append(", transactionDataKey=");
        return C0023f.m109j(h, this.transactionDataKey, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        parcel.writeSerializable(this.shopId);
        parcel.writeBundle(this.referrerBundle);
        Integer num = this.transactionDataKey;
        if (num == null) {
            i2 = 0;
        } else {
            parcel.writeInt(1);
            i2 = num.intValue();
        }
        parcel.writeInt(i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FeedbackKey(String str, EtsyId etsyId, Bundle bundle, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : etsyId, (i & 4) != 0 ? null : bundle, (i & 8) != 0 ? null : num);
    }
}

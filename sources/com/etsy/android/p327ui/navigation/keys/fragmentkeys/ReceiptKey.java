package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.exceptions.UnsupportedNavigationException;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import com.etsy.android.p327ui.user.ReceiptFragment;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p343ee.C12693a;
import p363he.C12822e;
import p363he.C12824f;
import p514bk.C14088a;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.ReceiptKey */
public final class ReceiptKey implements FragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ReceiptKey> CREATOR = new Creator();
    private final boolean helpWithOrder;
    private final Long receiptId;
    private final String referrer;
    private final Bundle referrerBundle;
    private final Long transactionId;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.ReceiptKey$Creator */
    public static final class Creator implements Parcelable.Creator<ReceiptKey> {
        public final ReceiptKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new ReceiptKey(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0, parcel.readBundle());
        }

        public final ReceiptKey[] newArray(int i) {
            return new ReceiptKey[i];
        }
    }

    public ReceiptKey(String str, Long l, Long l2, boolean z, Bundle bundle) {
        C19383o.m32797g(str, "referrer");
        this.referrer = str;
        this.receiptId = l;
        this.transactionId = l2;
        this.helpWithOrder = z;
        this.referrerBundle = bundle;
    }

    public static /* synthetic */ ReceiptKey copy$default(ReceiptKey receiptKey, String str, Long l, Long l2, boolean z, Bundle bundle, int i, Object obj) {
        if ((i & 1) != 0) {
            str = receiptKey.getReferrer();
        }
        if ((i & 2) != 0) {
            l = receiptKey.receiptId;
        }
        Long l3 = l;
        if ((i & 4) != 0) {
            l2 = receiptKey.transactionId;
        }
        Long l4 = l2;
        if ((i & 8) != 0) {
            z = receiptKey.helpWithOrder;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            bundle = receiptKey.getReferrerBundle();
        }
        return receiptKey.copy(str, l3, l4, z2, bundle);
    }

    public final String component1() {
        return getReferrer();
    }

    public final Long component2() {
        return this.receiptId;
    }

    public final Long component3() {
        return this.transactionId;
    }

    public final boolean component4() {
        return this.helpWithOrder;
    }

    public final Bundle component5() {
        return getReferrerBundle();
    }

    public final ReceiptKey copy(String str, Long l, Long l2, boolean z, Bundle bundle) {
        C19383o.m32797g(str, "referrer");
        return new ReceiptKey(str, l, l2, z, bundle);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReceiptKey)) {
            return false;
        }
        ReceiptKey receiptKey = (ReceiptKey) obj;
        return C19383o.m32792b(getReferrer(), receiptKey.getReferrer()) && C19383o.m32792b(this.receiptId, receiptKey.receiptId) && C19383o.m32792b(this.transactionId, receiptKey.transactionId) && this.helpWithOrder == receiptKey.helpWithOrder && C19383o.m32792b(getReferrerBundle(), receiptKey.getReferrerBundle());
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.FADE;
    }

    public C12693a getBackstackGenerator() {
        return new C14088a();
    }

    public String getClazzName() {
        String canonicalName = ReceiptFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName);
        return canonicalName;
    }

    public boolean getClearBackstack() {
        return false;
    }

    public final boolean getHelpWithOrder() {
        return this.helpWithOrder;
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        Long l = this.receiptId;
        if (l != null) {
            fVar.f28304a.put(ResponseConstants.RECEIPT_ID, l);
        } else {
            Long l2 = this.transactionId;
            if (l2 != null) {
                fVar.f28304a.put("receipt_transaction_id", l2);
            } else {
                throw new UnsupportedNavigationException(this + " requires either receipt id or transaction id");
            }
        }
        boolean z = this.helpWithOrder;
        if (z) {
            fVar.f28304a.put("TO_HELP_WITH_ORDER", Boolean.valueOf(z));
            fVar.f28304a.put("bottom_nav_selected_tab_id", Integer.valueOf(R.id.menu_bottom_nav_you));
        }
        if (getReferrerBundle() != null) {
            fVar.f28304a.put("referral_args", getReferrerBundle());
        }
        return fVar;
    }

    public final Long getReceiptId() {
        return this.receiptId;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public Bundle getReferrerBundle() {
        return this.referrerBundle;
    }

    public final Long getTransactionId() {
        return this.transactionId;
    }

    public int hashCode() {
        int hashCode = getReferrer().hashCode() * 31;
        Long l = this.receiptId;
        int i = 0;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.transactionId;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        boolean z = this.helpWithOrder;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        if (getReferrerBundle() != null) {
            i = getReferrerBundle().hashCode();
        }
        return i2 + i;
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
        StringBuilder h = C0072d.m201h("ReceiptKey(referrer=");
        h.append(getReferrer());
        h.append(", receiptId=");
        h.append(this.receiptId);
        h.append(", transactionId=");
        h.append(this.transactionId);
        h.append(", helpWithOrder=");
        h.append(this.helpWithOrder);
        h.append(", referrerBundle=");
        h.append(getReferrerBundle());
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        Long l = this.receiptId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            C0069a.m180k(parcel, 1, l);
        }
        Long l2 = this.transactionId;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            C0069a.m180k(parcel, 1, l2);
        }
        parcel.writeInt(this.helpWithOrder ? 1 : 0);
        parcel.writeBundle(this.referrerBundle);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ReceiptKey(String str, Long l, Long l2, boolean z, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : bundle);
    }
}

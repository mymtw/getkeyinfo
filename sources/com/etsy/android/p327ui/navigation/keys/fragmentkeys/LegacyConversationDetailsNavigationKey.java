package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.conversation.details.ccm.ConversationDetailsFragment;
import com.etsy.android.p327ui.conversation.details.legacy.LegacyConversationDetailsFragment;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import kotlin.jvm.internal.C19383o;
import p343ee.C12693a;
import p343ee.C12695c;
import p363he.C12822e;
import p363he.C12824f;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.LegacyConversationDetailsNavigationKey */
public final class LegacyConversationDetailsNavigationKey implements FragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<LegacyConversationDetailsNavigationKey> CREATOR = new Creator();
    private final long conversationId;
    private final boolean customerCentricMessagingEnabled;
    private final String referrer;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.LegacyConversationDetailsNavigationKey$Creator */
    public static final class Creator implements Parcelable.Creator<LegacyConversationDetailsNavigationKey> {
        public final LegacyConversationDetailsNavigationKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new LegacyConversationDetailsNavigationKey(parcel.readString(), parcel.readLong(), parcel.readInt() != 0);
        }

        public final LegacyConversationDetailsNavigationKey[] newArray(int i) {
            return new LegacyConversationDetailsNavigationKey[i];
        }
    }

    public LegacyConversationDetailsNavigationKey(String str, long j, boolean z) {
        C19383o.m32797g(str, "referrer");
        this.referrer = str;
        this.conversationId = j;
        this.customerCentricMessagingEnabled = z;
    }

    public static /* synthetic */ LegacyConversationDetailsNavigationKey copy$default(LegacyConversationDetailsNavigationKey legacyConversationDetailsNavigationKey, String str, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = legacyConversationDetailsNavigationKey.getReferrer();
        }
        if ((i & 2) != 0) {
            j = legacyConversationDetailsNavigationKey.conversationId;
        }
        if ((i & 4) != 0) {
            z = legacyConversationDetailsNavigationKey.customerCentricMessagingEnabled;
        }
        return legacyConversationDetailsNavigationKey.copy(str, j, z);
    }

    public final String component1() {
        return getReferrer();
    }

    public final long component2() {
        return this.conversationId;
    }

    public final boolean component3() {
        return this.customerCentricMessagingEnabled;
    }

    public final LegacyConversationDetailsNavigationKey copy(String str, long j, boolean z) {
        C19383o.m32797g(str, "referrer");
        return new LegacyConversationDetailsNavigationKey(str, j, z);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyConversationDetailsNavigationKey)) {
            return false;
        }
        LegacyConversationDetailsNavigationKey legacyConversationDetailsNavigationKey = (LegacyConversationDetailsNavigationKey) obj;
        return C19383o.m32792b(getReferrer(), legacyConversationDetailsNavigationKey.getReferrer()) && this.conversationId == legacyConversationDetailsNavigationKey.conversationId && this.customerCentricMessagingEnabled == legacyConversationDetailsNavigationKey.customerCentricMessagingEnabled;
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.FADE;
    }

    public C12693a getBackstackGenerator() {
        return new C12695c(false);
    }

    public String getClazzName() {
        if (this.customerCentricMessagingEnabled) {
            String canonicalName = ConversationDetailsFragment.class.getCanonicalName();
            C19383o.m32794d(canonicalName);
            return canonicalName;
        }
        String canonicalName2 = LegacyConversationDetailsFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName2);
        return canonicalName2;
    }

    public boolean getClearBackstack() {
        return false;
    }

    public final long getConversationId() {
        return this.conversationId;
    }

    public final boolean getCustomerCentricMessagingEnabled() {
        return this.customerCentricMessagingEnabled;
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        fVar.f28304a.put("convo_id", Long.valueOf(this.conversationId));
        return fVar;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public Bundle getReferrerBundle() {
        return null;
    }

    public int hashCode() {
        int b = C0071c.m190b(this.conversationId, getReferrer().hashCode() * 31, 31);
        boolean z = this.customerCentricMessagingEnabled;
        if (z) {
            z = true;
        }
        return b + (z ? 1 : 0);
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
        StringBuilder h = C0072d.m201h("LegacyConversationDetailsNavigationKey(referrer=");
        h.append(getReferrer());
        h.append(", conversationId=");
        h.append(this.conversationId);
        h.append(", customerCentricMessagingEnabled=");
        return C0391c.m1058d(h, this.customerCentricMessagingEnabled, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        parcel.writeLong(this.conversationId);
        parcel.writeInt(this.customerCentricMessagingEnabled ? 1 : 0);
    }
}

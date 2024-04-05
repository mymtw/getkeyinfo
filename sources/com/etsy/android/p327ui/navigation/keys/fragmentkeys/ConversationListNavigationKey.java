package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.conversation.list.ccm.ConversationListFragment;
import com.etsy.android.p327ui.conversation.list.legacy.LegacyConversationListFragment;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p343ee.C12693a;
import p343ee.C12695c;
import p363he.C12822e;
import p363he.C12824f;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.ConversationListNavigationKey */
public final class ConversationListNavigationKey implements FragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ConversationListNavigationKey> CREATOR = new Creator();
    private final boolean customerCentricMessagingEnabled;
    private final String referrer;
    private final Bundle referrerBundle;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.ConversationListNavigationKey$Creator */
    public static final class Creator implements Parcelable.Creator<ConversationListNavigationKey> {
        public final ConversationListNavigationKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new ConversationListNavigationKey(parcel.readString(), parcel.readBundle(), parcel.readInt() != 0);
        }

        public final ConversationListNavigationKey[] newArray(int i) {
            return new ConversationListNavigationKey[i];
        }
    }

    public ConversationListNavigationKey(String str, Bundle bundle, boolean z) {
        C19383o.m32797g(str, "referrer");
        this.referrer = str;
        this.referrerBundle = bundle;
        this.customerCentricMessagingEnabled = z;
    }

    private final boolean component3() {
        return this.customerCentricMessagingEnabled;
    }

    public static /* synthetic */ ConversationListNavigationKey copy$default(ConversationListNavigationKey conversationListNavigationKey, String str, Bundle bundle, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = conversationListNavigationKey.getReferrer();
        }
        if ((i & 2) != 0) {
            bundle = conversationListNavigationKey.getReferrerBundle();
        }
        if ((i & 4) != 0) {
            z = conversationListNavigationKey.customerCentricMessagingEnabled;
        }
        return conversationListNavigationKey.copy(str, bundle, z);
    }

    public final String component1() {
        return getReferrer();
    }

    public final Bundle component2() {
        return getReferrerBundle();
    }

    public final ConversationListNavigationKey copy(String str, Bundle bundle, boolean z) {
        C19383o.m32797g(str, "referrer");
        return new ConversationListNavigationKey(str, bundle, z);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationListNavigationKey)) {
            return false;
        }
        ConversationListNavigationKey conversationListNavigationKey = (ConversationListNavigationKey) obj;
        return C19383o.m32792b(getReferrer(), conversationListNavigationKey.getReferrer()) && C19383o.m32792b(getReferrerBundle(), conversationListNavigationKey.getReferrerBundle()) && this.customerCentricMessagingEnabled == conversationListNavigationKey.customerCentricMessagingEnabled;
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.FADE;
    }

    public C12693a getBackstackGenerator() {
        return new C12695c(false);
    }

    public String getClazzName() {
        if (this.customerCentricMessagingEnabled) {
            String canonicalName = ConversationListFragment.class.getCanonicalName();
            C19383o.m32794d(canonicalName);
            return canonicalName;
        }
        String canonicalName2 = LegacyConversationListFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName2);
        return canonicalName2;
    }

    public boolean getClearBackstack() {
        return false;
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        if (getReferrerBundle() != null) {
            fVar.f28304a.put("referral_args", getReferrerBundle());
        }
        return fVar;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public Bundle getReferrerBundle() {
        return this.referrerBundle;
    }

    public int hashCode() {
        int hashCode = ((getReferrer().hashCode() * 31) + (getReferrerBundle() == null ? 0 : getReferrerBundle().hashCode())) * 31;
        boolean z = this.customerCentricMessagingEnabled;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
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
        StringBuilder h = C0072d.m201h("ConversationListNavigationKey(referrer=");
        h.append(getReferrer());
        h.append(", referrerBundle=");
        h.append(getReferrerBundle());
        h.append(", customerCentricMessagingEnabled=");
        return C0391c.m1058d(h, this.customerCentricMessagingEnabled, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        parcel.writeBundle(this.referrerBundle);
        parcel.writeInt(this.customerCentricMessagingEnabled ? 1 : 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ConversationListNavigationKey(String str, Bundle bundle, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : bundle, z);
    }
}

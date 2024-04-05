package com.etsy.android.p327ui.listing.p329ui.pushoptin;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.navigation.keys.BottomSheetNavigationKey;
import com.etsy.android.uikit.p331ui.core.TrackingBottomSheetDialogFragment;
import kotlin.jvm.internal.C19383o;
import p363he.C12822e;
import p363he.C12824f;

/* renamed from: com.etsy.android.ui.listing.ui.pushoptin.ConversationPushOptInBottomSheetKey */
public final class ConversationPushOptInBottomSheetKey implements BottomSheetNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ConversationPushOptInBottomSheetKey> CREATOR = new Creator();
    private final String fromScreen;
    private final String referrer;

    /* renamed from: com.etsy.android.ui.listing.ui.pushoptin.ConversationPushOptInBottomSheetKey$Creator */
    public static final class Creator implements Parcelable.Creator<ConversationPushOptInBottomSheetKey> {
        public final ConversationPushOptInBottomSheetKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new ConversationPushOptInBottomSheetKey(parcel.readString(), parcel.readString());
        }

        public final ConversationPushOptInBottomSheetKey[] newArray(int i) {
            return new ConversationPushOptInBottomSheetKey[i];
        }
    }

    public ConversationPushOptInBottomSheetKey(String str, String str2) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(str2, "fromScreen");
        this.referrer = str;
        this.fromScreen = str2;
    }

    public static /* synthetic */ ConversationPushOptInBottomSheetKey copy$default(ConversationPushOptInBottomSheetKey conversationPushOptInBottomSheetKey, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = conversationPushOptInBottomSheetKey.getReferrer();
        }
        if ((i & 2) != 0) {
            str2 = conversationPushOptInBottomSheetKey.fromScreen;
        }
        return conversationPushOptInBottomSheetKey.copy(str, str2);
    }

    public final String component1() {
        return getReferrer();
    }

    public final String component2() {
        return this.fromScreen;
    }

    public final ConversationPushOptInBottomSheetKey copy(String str, String str2) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(str2, "fromScreen");
        return new ConversationPushOptInBottomSheetKey(str, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationPushOptInBottomSheetKey)) {
            return false;
        }
        ConversationPushOptInBottomSheetKey conversationPushOptInBottomSheetKey = (ConversationPushOptInBottomSheetKey) obj;
        return C19383o.m32792b(getReferrer(), conversationPushOptInBottomSheetKey.getReferrer()) && C19383o.m32792b(this.fromScreen, conversationPushOptInBottomSheetKey.fromScreen);
    }

    public TrackingBottomSheetDialogFragment getBottomSheetFragment() {
        return new ConversationPushOptInBottomSheetFragment();
    }

    public final String getFromScreen() {
        return this.fromScreen;
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put("from_screen", this.fromScreen);
        fVar.f28304a.put(".ref", getReferrer());
        return fVar;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public int hashCode() {
        return this.fromScreen.hashCode() + (getReferrer().hashCode() * 31);
    }

    public int storeDataForKey(Object obj) {
        C19383o.m32797g(obj, "value");
        return C12822e.C12823a.m20464a(obj);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ConversationPushOptInBottomSheetKey(referrer=");
        h.append(getReferrer());
        h.append(", fromScreen=");
        return C0391c.m1057c(h, this.fromScreen, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        parcel.writeString(this.fromScreen);
    }
}

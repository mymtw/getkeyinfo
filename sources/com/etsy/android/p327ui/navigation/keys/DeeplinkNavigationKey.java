package com.etsy.android.p327ui.navigation.keys;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.BOEActivity;
import com.etsy.android.p327ui.navigation.ActivityAnimationMode;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p323ce.C8583b;
import p363he.C12818b;
import p363he.C12822e;
import p363he.C12824f;

/* renamed from: com.etsy.android.ui.navigation.keys.DeeplinkNavigationKey */
public final class DeeplinkNavigationKey implements C12818b, Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<DeeplinkNavigationKey> CREATOR = new Creator();
    private final ActivityAnimationMode animation;
    private final C8583b backstack;
    private final Class<BOEActivity> clazz;
    private final FragmentNavigationKey destinationKey;
    private final boolean isInternalReferrer;
    private final boolean navUpToParent;
    private final String referrer;

    /* renamed from: com.etsy.android.ui.navigation.keys.DeeplinkNavigationKey$Creator */
    public static final class Creator implements Parcelable.Creator<DeeplinkNavigationKey> {
        public final DeeplinkNavigationKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            FragmentNavigationKey fragmentNavigationKey = (FragmentNavigationKey) parcel.readParcelable(DeeplinkNavigationKey.class.getClassLoader());
            String readString = parcel.readString();
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new DeeplinkNavigationKey(fragmentNavigationKey, readString, z2, z, ActivityAnimationMode.CREATOR.createFromParcel(parcel));
        }

        public final DeeplinkNavigationKey[] newArray(int i) {
            return new DeeplinkNavigationKey[i];
        }
    }

    public DeeplinkNavigationKey(FragmentNavigationKey fragmentNavigationKey, String str, boolean z, boolean z2, ActivityAnimationMode activityAnimationMode) {
        C19383o.m32797g(fragmentNavigationKey, "destinationKey");
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(activityAnimationMode, ResponseConstants.ANIMATION);
        this.destinationKey = fragmentNavigationKey;
        this.referrer = str;
        this.isInternalReferrer = z;
        this.navUpToParent = z2;
        this.animation = activityAnimationMode;
        this.clazz = BOEActivity.class;
        this.backstack = new C8583b(fragmentNavigationKey, z);
    }

    public static /* synthetic */ DeeplinkNavigationKey copy$default(DeeplinkNavigationKey deeplinkNavigationKey, FragmentNavigationKey fragmentNavigationKey, String str, boolean z, boolean z2, ActivityAnimationMode activityAnimationMode, int i, Object obj) {
        if ((i & 1) != 0) {
            fragmentNavigationKey = deeplinkNavigationKey.destinationKey;
        }
        if ((i & 2) != 0) {
            str = deeplinkNavigationKey.getReferrer();
        }
        String str2 = str;
        if ((i & 4) != 0) {
            z = deeplinkNavigationKey.isInternalReferrer;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = deeplinkNavigationKey.navUpToParent;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            activityAnimationMode = deeplinkNavigationKey.animation;
        }
        return deeplinkNavigationKey.copy(fragmentNavigationKey, str2, z3, z4, activityAnimationMode);
    }

    public boolean clearTask() {
        return false;
    }

    public final FragmentNavigationKey component1() {
        return this.destinationKey;
    }

    public final String component2() {
        return getReferrer();
    }

    public final boolean component3() {
        return this.isInternalReferrer;
    }

    public final boolean component4() {
        return this.navUpToParent;
    }

    public final ActivityAnimationMode component5() {
        return this.animation;
    }

    public final DeeplinkNavigationKey copy(FragmentNavigationKey fragmentNavigationKey, String str, boolean z, boolean z2, ActivityAnimationMode activityAnimationMode) {
        C19383o.m32797g(fragmentNavigationKey, "destinationKey");
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(activityAnimationMode, ResponseConstants.ANIMATION);
        return new DeeplinkNavigationKey(fragmentNavigationKey, str, z, z2, activityAnimationMode);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeeplinkNavigationKey)) {
            return false;
        }
        DeeplinkNavigationKey deeplinkNavigationKey = (DeeplinkNavigationKey) obj;
        return C19383o.m32792b(this.destinationKey, deeplinkNavigationKey.destinationKey) && C19383o.m32792b(getReferrer(), deeplinkNavigationKey.getReferrer()) && this.isInternalReferrer == deeplinkNavigationKey.isInternalReferrer && this.navUpToParent == deeplinkNavigationKey.navUpToParent && this.animation == deeplinkNavigationKey.animation;
    }

    public final ActivityAnimationMode getAnimation() {
        return this.animation;
    }

    public ActivityAnimationMode getAnimationMode() {
        return this.animation;
    }

    public final C8583b getBackstack() {
        return this.backstack;
    }

    public Class<BOEActivity> getClazz() {
        return this.clazz;
    }

    public final FragmentNavigationKey getDestinationKey() {
        return this.destinationKey;
    }

    public final boolean getNavUpToParent() {
        return this.navUpToParent;
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put("NAV_UP_TO_PARENT", Boolean.valueOf(this.navUpToParent));
        fVar.f28304a.put(".ref", getReferrer());
        return fVar;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public int hashCode() {
        int hashCode = (getReferrer().hashCode() + (this.destinationKey.hashCode() * 31)) * 31;
        boolean z = this.isInternalReferrer;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.navUpToParent;
        if (!z3) {
            z2 = z3;
        }
        return this.animation.hashCode() + ((i + (z2 ? 1 : 0)) * 31);
    }

    public final boolean isInternalReferrer() {
        return this.isInternalReferrer;
    }

    public boolean isTransparent() {
        return false;
    }

    public int storeDataForKey(Object obj) {
        C19383o.m32797g(obj, "value");
        return C12822e.C12823a.m20464a(obj);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("DeeplinkNavigationKey(destinationKey=");
        h.append(this.destinationKey);
        h.append(", referrer=");
        h.append(getReferrer());
        h.append(", isInternalReferrer=");
        h.append(this.isInternalReferrer);
        h.append(", navUpToParent=");
        h.append(this.navUpToParent);
        h.append(", animation=");
        h.append(this.animation);
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeParcelable(this.destinationKey, i);
        parcel.writeString(this.referrer);
        parcel.writeInt(this.isInternalReferrer ? 1 : 0);
        parcel.writeInt(this.navUpToParent ? 1 : 0);
        this.animation.writeToParcel(parcel, i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DeeplinkNavigationKey(FragmentNavigationKey fragmentNavigationKey, String str, boolean z, boolean z2, ActivityAnimationMode activityAnimationMode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentNavigationKey, str, z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? ActivityAnimationMode.BOTTOM_NAV_FADE_IN_OUT : activityAnimationMode);
    }
}

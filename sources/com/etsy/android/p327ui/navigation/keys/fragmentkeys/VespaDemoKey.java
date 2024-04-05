package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.etsy.android.p327ui.VespaDemoFragment;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import com.google.android.play.core.appupdate.C15562d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p343ee.C12693a;
import p363he.C12822e;
import p363he.C12824f;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.VespaDemoKey */
public final class VespaDemoKey implements FragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<VespaDemoKey> CREATOR = new Creator();
    private final String mockFileName;
    private final String referrer;
    private final Bundle referrerBundle;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.VespaDemoKey$Creator */
    public static final class Creator implements Parcelable.Creator<VespaDemoKey> {
        public final VespaDemoKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new VespaDemoKey(parcel.readString(), parcel.readString(), parcel.readBundle());
        }

        public final VespaDemoKey[] newArray(int i) {
            return new VespaDemoKey[i];
        }
    }

    public VespaDemoKey(String str, String str2, Bundle bundle) {
        C19383o.m32797g(str, "referrer");
        this.referrer = str;
        this.mockFileName = str2;
        this.referrerBundle = bundle;
    }

    public static /* synthetic */ VespaDemoKey copy$default(VespaDemoKey vespaDemoKey, String str, String str2, Bundle bundle, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vespaDemoKey.getReferrer();
        }
        if ((i & 2) != 0) {
            str2 = vespaDemoKey.mockFileName;
        }
        if ((i & 4) != 0) {
            bundle = vespaDemoKey.getReferrerBundle();
        }
        return vespaDemoKey.copy(str, str2, bundle);
    }

    public final String component1() {
        return getReferrer();
    }

    public final String component2() {
        return this.mockFileName;
    }

    public final Bundle component3() {
        return getReferrerBundle();
    }

    public final VespaDemoKey copy(String str, String str2, Bundle bundle) {
        C19383o.m32797g(str, "referrer");
        return new VespaDemoKey(str, str2, bundle);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VespaDemoKey)) {
            return false;
        }
        VespaDemoKey vespaDemoKey = (VespaDemoKey) obj;
        return C19383o.m32792b(getReferrer(), vespaDemoKey.getReferrer()) && C19383o.m32792b(this.mockFileName, vespaDemoKey.mockFileName) && C19383o.m32792b(getReferrerBundle(), vespaDemoKey.getReferrerBundle());
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.FADE;
    }

    public C12693a getBackstackGenerator() {
        return new C15562d();
    }

    public String getClazzName() {
        String canonicalName = VespaDemoFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName);
        return canonicalName;
    }

    public boolean getClearBackstack() {
        return false;
    }

    public final String getMockFileName() {
        return this.mockFileName;
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        if (C18263b.m30839d0(this.mockFileName)) {
            fVar.f28304a.put("mock_file", this.mockFileName);
        }
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
        int hashCode = getReferrer().hashCode() * 31;
        String str = this.mockFileName;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        if (getReferrerBundle() != null) {
            i = getReferrerBundle().hashCode();
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
        StringBuilder h = C0072d.m201h("VespaDemoKey(referrer=");
        h.append(getReferrer());
        h.append(", mockFileName=");
        h.append(this.mockFileName);
        h.append(", referrerBundle=");
        h.append(getReferrerBundle());
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        parcel.writeString(this.mockFileName);
        parcel.writeBundle(this.referrerBundle);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VespaDemoKey(String str, String str2, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bundle);
    }
}

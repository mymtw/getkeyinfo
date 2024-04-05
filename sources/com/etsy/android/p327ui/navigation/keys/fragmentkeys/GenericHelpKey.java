package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.EtsyWebFragment;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p343ee.C12693a;
import p363he.C12822e;
import p363he.C12824f;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.GenericHelpKey */
public final class GenericHelpKey implements FragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<GenericHelpKey> CREATOR = new Creator();
    private final String referrer;
    private final String url;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.GenericHelpKey$Creator */
    public static final class Creator implements Parcelable.Creator<GenericHelpKey> {
        public final GenericHelpKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new GenericHelpKey(parcel.readString(), parcel.readString());
        }

        public final GenericHelpKey[] newArray(int i) {
            return new GenericHelpKey[i];
        }
    }

    public GenericHelpKey(String str, String str2) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(str2, "url");
        this.referrer = str;
        this.url = str2;
    }

    public static /* synthetic */ GenericHelpKey copy$default(GenericHelpKey genericHelpKey, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = genericHelpKey.getReferrer();
        }
        if ((i & 2) != 0) {
            str2 = genericHelpKey.url;
        }
        return genericHelpKey.copy(str, str2);
    }

    public final String component1() {
        return getReferrer();
    }

    public final String component2() {
        return this.url;
    }

    public final GenericHelpKey copy(String str, String str2) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(str2, "url");
        return new GenericHelpKey(str, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenericHelpKey)) {
            return false;
        }
        GenericHelpKey genericHelpKey = (GenericHelpKey) obj;
        return C19383o.m32792b(getReferrer(), genericHelpKey.getReferrer()) && C19383o.m32792b(this.url, genericHelpKey.url);
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.FADE;
    }

    public C12693a getBackstackGenerator() {
        return new C0005b();
    }

    public String getClazzName() {
        String canonicalName = EtsyWebFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName);
        return canonicalName;
    }

    public boolean getClearBackstack() {
        return false;
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        fVar.f28304a.put("type", 11);
        fVar.f28304a.put("url", this.url);
        return fVar;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public Bundle getReferrerBundle() {
        return null;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode() + (getReferrer().hashCode() * 31);
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
        StringBuilder h = C0072d.m201h("GenericHelpKey(referrer=");
        h.append(getReferrer());
        h.append(", url=");
        return C0391c.m1057c(h, this.url, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        parcel.writeString(this.url);
    }
}

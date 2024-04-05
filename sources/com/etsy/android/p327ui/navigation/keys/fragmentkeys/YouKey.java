package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.jvm.internal.C19383o;
import p343ee.C12693a;
import p363he.C12822e;
import p363he.C12824f;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.YouKey */
public final class YouKey implements FragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<YouKey> CREATOR = new Creator();
    private final String clazzName;
    private final String referrer;
    private final Bundle referrerBundle;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.YouKey$Creator */
    public static final class Creator implements Parcelable.Creator<YouKey> {
        public final YouKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new YouKey(parcel.readString(), parcel.readBundle(), parcel.readString());
        }

        public final YouKey[] newArray(int i) {
            return new YouKey[i];
        }
    }

    public YouKey(String str, Bundle bundle, String str2) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(str2, "clazzName");
        this.referrer = str;
        this.referrerBundle = bundle;
        this.clazzName = str2;
    }

    public static /* synthetic */ YouKey copy$default(YouKey youKey, String str, Bundle bundle, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = youKey.getReferrer();
        }
        if ((i & 2) != 0) {
            bundle = youKey.getReferrerBundle();
        }
        if ((i & 4) != 0) {
            str2 = youKey.getClazzName();
        }
        return youKey.copy(str, bundle, str2);
    }

    public final String component1() {
        return getReferrer();
    }

    public final Bundle component2() {
        return getReferrerBundle();
    }

    public final String component3() {
        return getClazzName();
    }

    public final YouKey copy(String str, Bundle bundle, String str2) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(str2, "clazzName");
        return new YouKey(str, bundle, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YouKey)) {
            return false;
        }
        YouKey youKey = (YouKey) obj;
        return C19383o.m32792b(getReferrer(), youKey.getReferrer()) && C19383o.m32792b(getReferrerBundle(), youKey.getReferrerBundle()) && C19383o.m32792b(getClazzName(), youKey.getClazzName());
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.FADE;
    }

    public C12693a getBackstackGenerator() {
        return new C15588c1();
    }

    public String getClazzName() {
        return this.clazzName;
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
        return getClazzName().hashCode() + (((getReferrer().hashCode() * 31) + (getReferrerBundle() == null ? 0 : getReferrerBundle().hashCode())) * 31);
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
        StringBuilder h = C0072d.m201h("YouKey(referrer=");
        h.append(getReferrer());
        h.append(", referrerBundle=");
        h.append(getReferrerBundle());
        h.append(", clazzName=");
        h.append(getClazzName());
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        parcel.writeBundle(this.referrerBundle);
        parcel.writeString(this.clazzName);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ YouKey(java.lang.String r1, android.os.Bundle r2, java.lang.String r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L_0x0005
            r2 = 0
        L_0x0005:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0012
            java.lang.Class<com.etsy.android.ui.you.YouFragment> r3 = com.etsy.android.p327ui.you.YouFragment.class
            java.lang.String r3 = r3.getCanonicalName()
            kotlin.jvm.internal.C19383o.m32794d(r3)
        L_0x0012:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.navigation.keys.fragmentkeys.YouKey.<init>(java.lang.String, android.os.Bundle, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

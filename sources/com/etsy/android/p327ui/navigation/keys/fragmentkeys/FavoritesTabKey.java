package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.activity.C0114h;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.favorites.FavoritesTabsContainerFragment;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.exceptions.UnsupportedNavigationException;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import java.util.ArrayList;
import kotlin.jvm.internal.C19383o;
import p343ee.C12693a;
import p363he.C12822e;
import p363he.C12824f;
import p568fn.C17782b;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.FavoritesTabKey */
public final class FavoritesTabKey implements FragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<FavoritesTabKey> CREATOR = new Creator();
    private final boolean otherUsersFavorites;
    private final String referrer;
    private final Bundle referrerBundle;
    private final int tabType;
    private final String userId;
    private final String username;
    private final ArrayList<Integer> validTabs;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.FavoritesTabKey$Creator */
    public static final class Creator implements Parcelable.Creator<FavoritesTabKey> {
        public final FavoritesTabKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new FavoritesTabKey(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readBundle());
        }

        public final FavoritesTabKey[] newArray(int i) {
            return new FavoritesTabKey[i];
        }
    }

    public FavoritesTabKey(String str, String str2, String str3, int i, boolean z, Bundle bundle) {
        C19383o.m32797g(str, "referrer");
        this.referrer = str;
        this.userId = str2;
        this.username = str3;
        this.tabType = i;
        this.otherUsersFavorites = z;
        this.referrerBundle = bundle;
        this.validTabs = C17782b.m29888u(0, 1, 2);
    }

    public static /* synthetic */ FavoritesTabKey copy$default(FavoritesTabKey favoritesTabKey, String str, String str2, String str3, int i, boolean z, Bundle bundle, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = favoritesTabKey.getReferrer();
        }
        if ((i2 & 2) != 0) {
            str2 = favoritesTabKey.userId;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            str3 = favoritesTabKey.username;
        }
        String str5 = str3;
        if ((i2 & 8) != 0) {
            i = favoritesTabKey.tabType;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            z = favoritesTabKey.otherUsersFavorites;
        }
        boolean z2 = z;
        if ((i2 & 32) != 0) {
            bundle = favoritesTabKey.getReferrerBundle();
        }
        return favoritesTabKey.copy(str, str4, str5, i3, z2, bundle);
    }

    public final String component1() {
        return getReferrer();
    }

    public final String component2() {
        return this.userId;
    }

    public final String component3() {
        return this.username;
    }

    public final int component4() {
        return this.tabType;
    }

    public final boolean component5() {
        return this.otherUsersFavorites;
    }

    public final Bundle component6() {
        return getReferrerBundle();
    }

    public final FavoritesTabKey copy(String str, String str2, String str3, int i, boolean z, Bundle bundle) {
        C19383o.m32797g(str, "referrer");
        return new FavoritesTabKey(str, str2, str3, i, z, bundle);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavoritesTabKey)) {
            return false;
        }
        FavoritesTabKey favoritesTabKey = (FavoritesTabKey) obj;
        return C19383o.m32792b(getReferrer(), favoritesTabKey.getReferrer()) && C19383o.m32792b(this.userId, favoritesTabKey.userId) && C19383o.m32792b(this.username, favoritesTabKey.username) && this.tabType == favoritesTabKey.tabType && this.otherUsersFavorites == favoritesTabKey.otherUsersFavorites && C19383o.m32792b(getReferrerBundle(), favoritesTabKey.getReferrerBundle());
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.FADE;
    }

    public C12693a getBackstackGenerator() {
        return new C0114h();
    }

    public String getClazzName() {
        String canonicalName = FavoritesTabsContainerFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName);
        return canonicalName;
    }

    public boolean getClearBackstack() {
        return false;
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        fVar.f28304a.put("user_id", this.userId);
        if (this.validTabs.contains(Integer.valueOf(this.tabType))) {
            fVar.f28304a.put("type", Integer.valueOf(this.tabType));
            if (C18263b.m30839d0(this.username)) {
                fVar.f28304a.put(ResponseConstants.USERNAME, this.username);
            }
            if (getReferrerBundle() != null) {
                fVar.f28304a.put("referral_args", getReferrerBundle());
            }
            return fVar;
        }
        StringBuilder h = C0072d.m201h("Invalid tabType ");
        h.append(this.tabType);
        h.append(" provided to ");
        h.append(this);
        throw new UnsupportedNavigationException(h.toString());
    }

    public final boolean getOtherUsersFavorites() {
        return this.otherUsersFavorites;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public Bundle getReferrerBundle() {
        return this.referrerBundle;
    }

    public final int getTabType() {
        return this.tabType;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int hashCode = getReferrer().hashCode() * 31;
        String str = this.userId;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.username;
        int a = C0069a.m170a(this.tabType, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        boolean z = this.otherUsersFavorites;
        if (z) {
            z = true;
        }
        int i2 = (a + (z ? 1 : 0)) * 31;
        if (getReferrerBundle() != null) {
            i = getReferrerBundle().hashCode();
        }
        return i2 + i;
    }

    public boolean isDialog() {
        return false;
    }

    public boolean isForciblyAddedToCurrentStack() {
        return this.otherUsersFavorites;
    }

    public boolean shouldReplaceTop() {
        return false;
    }

    public int storeDataForKey(Object obj) {
        C19383o.m32797g(obj, "value");
        return C12822e.C12823a.m20464a(obj);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("FavoritesTabKey(referrer=");
        h.append(getReferrer());
        h.append(", userId=");
        h.append(this.userId);
        h.append(", username=");
        h.append(this.username);
        h.append(", tabType=");
        h.append(this.tabType);
        h.append(", otherUsersFavorites=");
        h.append(this.otherUsersFavorites);
        h.append(", referrerBundle=");
        h.append(getReferrerBundle());
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        parcel.writeString(this.userId);
        parcel.writeString(this.username);
        parcel.writeInt(this.tabType);
        parcel.writeInt(this.otherUsersFavorites ? 1 : 0);
        parcel.writeBundle(this.referrerBundle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ FavoritesTabKey(java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, boolean r11, android.os.Bundle r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r6 = this;
            r0 = r13 & 2
            r1 = 0
            if (r0 == 0) goto L_0x0007
            r0 = r1
            goto L_0x0008
        L_0x0007:
            r0 = r8
        L_0x0008:
            r2 = r13 & 4
            if (r2 == 0) goto L_0x000e
            r2 = r1
            goto L_0x000f
        L_0x000e:
            r2 = r9
        L_0x000f:
            r3 = r13 & 8
            r4 = 0
            if (r3 == 0) goto L_0x0016
            r3 = r4
            goto L_0x0017
        L_0x0016:
            r3 = r10
        L_0x0017:
            r5 = r13 & 16
            if (r5 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r4 = r11
        L_0x001d:
            r5 = r13 & 32
            if (r5 == 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r1 = r12
        L_0x0023:
            r8 = r6
            r9 = r7
            r10 = r0
            r11 = r2
            r12 = r3
            r13 = r4
            r14 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.navigation.keys.fragmentkeys.FavoritesTabKey.<init>(java.lang.String, java.lang.String, java.lang.String, int, boolean, android.os.Bundle, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

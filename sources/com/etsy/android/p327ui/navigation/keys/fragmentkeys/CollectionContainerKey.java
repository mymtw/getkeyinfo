package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.UserCollection;
import com.etsy.android.lib.models.apiv3.Collection;
import com.etsy.android.p327ui.favorites.recommendations.CollectionContainerFragment;
import com.etsy.android.p327ui.favorites.recommendations.ListRecommendationsFragment;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import com.etsy.android.p327ui.navigation.specs.CollectionWithRecsSpec;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p343ee.C12693a;
import p363he.C12822e;
import p363he.C12824f;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.CollectionContainerKey */
public final class CollectionContainerKey implements FragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<CollectionContainerKey> CREATOR = new Creator();
    private final CollectionWithRecsSpec collectionWithRecsSpec;
    private final String referrer;
    private final Bundle referrerBundle;
    private final Boolean showSuggestions;
    private final String slug;
    private final UserCollection userCollection;
    private final String username;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.CollectionContainerKey$Creator */
    public static final class Creator implements Parcelable.Creator<CollectionContainerKey> {
        public final CollectionContainerKey createFromParcel(Parcel parcel) {
            Boolean bool;
            C19383o.m32797g(parcel, "parcel");
            String readString = parcel.readString();
            UserCollection createFromParcel = parcel.readInt() == 0 ? null : UserCollection.CREATOR.createFromParcel(parcel);
            CollectionWithRecsSpec createFromParcel2 = parcel.readInt() == 0 ? null : CollectionWithRecsSpec.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                bool = null;
            } else {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CollectionContainerKey(readString, createFromParcel, createFromParcel2, bool, parcel.readString(), parcel.readString(), parcel.readBundle());
        }

        public final CollectionContainerKey[] newArray(int i) {
            return new CollectionContainerKey[i];
        }
    }

    public CollectionContainerKey(String str, UserCollection userCollection2, CollectionWithRecsSpec collectionWithRecsSpec2, Boolean bool, String str2, String str3, Bundle bundle) {
        C19383o.m32797g(str, "referrer");
        this.referrer = str;
        this.userCollection = userCollection2;
        this.collectionWithRecsSpec = collectionWithRecsSpec2;
        this.showSuggestions = bool;
        this.username = str2;
        this.slug = str3;
        this.referrerBundle = bundle;
    }

    public static /* synthetic */ CollectionContainerKey copy$default(CollectionContainerKey collectionContainerKey, String str, UserCollection userCollection2, CollectionWithRecsSpec collectionWithRecsSpec2, Boolean bool, String str2, String str3, Bundle bundle, int i, Object obj) {
        if ((i & 1) != 0) {
            str = collectionContainerKey.getReferrer();
        }
        if ((i & 2) != 0) {
            userCollection2 = collectionContainerKey.userCollection;
        }
        UserCollection userCollection3 = userCollection2;
        if ((i & 4) != 0) {
            collectionWithRecsSpec2 = collectionContainerKey.collectionWithRecsSpec;
        }
        CollectionWithRecsSpec collectionWithRecsSpec3 = collectionWithRecsSpec2;
        if ((i & 8) != 0) {
            bool = collectionContainerKey.showSuggestions;
        }
        Boolean bool2 = bool;
        if ((i & 16) != 0) {
            str2 = collectionContainerKey.username;
        }
        String str4 = str2;
        if ((i & 32) != 0) {
            str3 = collectionContainerKey.slug;
        }
        String str5 = str3;
        if ((i & 64) != 0) {
            bundle = collectionContainerKey.getReferrerBundle();
        }
        return collectionContainerKey.copy(str, userCollection3, collectionWithRecsSpec3, bool2, str4, str5, bundle);
    }

    public final String component1() {
        return getReferrer();
    }

    public final UserCollection component2() {
        return this.userCollection;
    }

    public final CollectionWithRecsSpec component3() {
        return this.collectionWithRecsSpec;
    }

    public final Boolean component4() {
        return this.showSuggestions;
    }

    public final String component5() {
        return this.username;
    }

    public final String component6() {
        return this.slug;
    }

    public final Bundle component7() {
        return getReferrerBundle();
    }

    public final CollectionContainerKey copy(String str, UserCollection userCollection2, CollectionWithRecsSpec collectionWithRecsSpec2, Boolean bool, String str2, String str3, Bundle bundle) {
        C19383o.m32797g(str, "referrer");
        return new CollectionContainerKey(str, userCollection2, collectionWithRecsSpec2, bool, str2, str3, bundle);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionContainerKey)) {
            return false;
        }
        CollectionContainerKey collectionContainerKey = (CollectionContainerKey) obj;
        return C19383o.m32792b(getReferrer(), collectionContainerKey.getReferrer()) && C19383o.m32792b(this.userCollection, collectionContainerKey.userCollection) && C19383o.m32792b(this.collectionWithRecsSpec, collectionContainerKey.collectionWithRecsSpec) && C19383o.m32792b(this.showSuggestions, collectionContainerKey.showSuggestions) && C19383o.m32792b(this.username, collectionContainerKey.username) && C19383o.m32792b(this.slug, collectionContainerKey.slug) && C19383o.m32792b(getReferrerBundle(), collectionContainerKey.getReferrerBundle());
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.FADE;
    }

    public C12693a getBackstackGenerator() {
        return new C0005b();
    }

    public String getClazzName() {
        String canonicalName = CollectionContainerFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName);
        return canonicalName;
    }

    public boolean getClearBackstack() {
        return false;
    }

    public final CollectionWithRecsSpec getCollectionWithRecsSpec() {
        return this.collectionWithRecsSpec;
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        fVar.f28304a.put(CollectionContainerFragment.SHOW_SUGGESTIONS, this.showSuggestions);
        fVar.f28304a.put(Collection.TYPE_COLLECTION, this.userCollection);
        CollectionWithRecsSpec collectionWithRecsSpec2 = this.collectionWithRecsSpec;
        if (collectionWithRecsSpec2 != null) {
            fVar.f28304a.put(ListRecommendationsFragment.COLLECTION_KEY, collectionWithRecsSpec2.getCollectionKey());
            fVar.f28304a.put("user_id", Long.valueOf(this.collectionWithRecsSpec.getUserId()));
            fVar.f28304a.put(ResponseConstants.COUNT, Integer.valueOf(this.collectionWithRecsSpec.getCount()));
            fVar.f28304a.put(ResponseConstants.COLLECTION_ID, Long.valueOf(this.collectionWithRecsSpec.getCollectionId()));
            fVar.f28304a.put("slug", this.collectionWithRecsSpec.getSlug());
            fVar.f28304a.put(CollectionContainerFragment.SHOW_SUGGESTIONS_TAB_FIRST, Boolean.valueOf(this.collectionWithRecsSpec.getShowSuggestionsTabFirst()));
        }
        if (C18263b.m30839d0(this.slug)) {
            fVar.f28304a.put("slug", this.slug);
        }
        if (C18263b.m30839d0(this.username)) {
            fVar.f28304a.put(ResponseConstants.USERNAME, this.username);
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

    public final Boolean getShowSuggestions() {
        return this.showSuggestions;
    }

    public final String getSlug() {
        return this.slug;
    }

    public final UserCollection getUserCollection() {
        return this.userCollection;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int hashCode = getReferrer().hashCode() * 31;
        UserCollection userCollection2 = this.userCollection;
        int i = 0;
        int hashCode2 = (hashCode + (userCollection2 == null ? 0 : userCollection2.hashCode())) * 31;
        CollectionWithRecsSpec collectionWithRecsSpec2 = this.collectionWithRecsSpec;
        int hashCode3 = (hashCode2 + (collectionWithRecsSpec2 == null ? 0 : collectionWithRecsSpec2.hashCode())) * 31;
        Boolean bool = this.showSuggestions;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.username;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.slug;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        if (getReferrerBundle() != null) {
            i = getReferrerBundle().hashCode();
        }
        return hashCode6 + i;
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
        StringBuilder h = C0072d.m201h("CollectionContainerKey(referrer=");
        h.append(getReferrer());
        h.append(", userCollection=");
        h.append(this.userCollection);
        h.append(", collectionWithRecsSpec=");
        h.append(this.collectionWithRecsSpec);
        h.append(", showSuggestions=");
        h.append(this.showSuggestions);
        h.append(", username=");
        h.append(this.username);
        h.append(", slug=");
        h.append(this.slug);
        h.append(", referrerBundle=");
        h.append(getReferrerBundle());
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        UserCollection userCollection2 = this.userCollection;
        if (userCollection2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            userCollection2.writeToParcel(parcel, i);
        }
        CollectionWithRecsSpec collectionWithRecsSpec2 = this.collectionWithRecsSpec;
        if (collectionWithRecsSpec2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            collectionWithRecsSpec2.writeToParcel(parcel, i);
        }
        Boolean bool = this.showSuggestions;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.username);
        parcel.writeString(this.slug);
        parcel.writeBundle(this.referrerBundle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CollectionContainerKey(java.lang.String r8, com.etsy.android.lib.models.UserCollection r9, com.etsy.android.p327ui.navigation.specs.CollectionWithRecsSpec r10, java.lang.Boolean r11, java.lang.String r12, java.lang.String r13, android.os.Bundle r14, int r15, kotlin.jvm.internal.DefaultConstructorMarker r16) {
        /*
            r7 = this;
            r0 = r15 & 2
            r1 = 0
            if (r0 == 0) goto L_0x0007
            r0 = r1
            goto L_0x0008
        L_0x0007:
            r0 = r9
        L_0x0008:
            r2 = r15 & 4
            if (r2 == 0) goto L_0x000e
            r2 = r1
            goto L_0x000f
        L_0x000e:
            r2 = r10
        L_0x000f:
            r3 = r15 & 8
            if (r3 == 0) goto L_0x0016
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            goto L_0x0017
        L_0x0016:
            r3 = r11
        L_0x0017:
            r4 = r15 & 16
            if (r4 == 0) goto L_0x001d
            r4 = r1
            goto L_0x001e
        L_0x001d:
            r4 = r12
        L_0x001e:
            r5 = r15 & 32
            if (r5 == 0) goto L_0x0024
            r5 = r1
            goto L_0x0025
        L_0x0024:
            r5 = r13
        L_0x0025:
            r6 = r15 & 64
            if (r6 == 0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r1 = r14
        L_0x002b:
            r9 = r7
            r10 = r8
            r11 = r0
            r12 = r2
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.navigation.keys.fragmentkeys.CollectionContainerKey.<init>(java.lang.String, com.etsy.android.lib.models.UserCollection, com.etsy.android.ui.navigation.specs.CollectionWithRecsSpec, java.lang.Boolean, java.lang.String, java.lang.String, android.os.Bundle, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

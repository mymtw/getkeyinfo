package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.Collection;
import com.etsy.android.p327ui.favorites.recommendations.CollectionContainerFragment;
import com.etsy.android.p327ui.favorites.recommendations.ListRecommendationsFragment;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p343ee.C12693a;
import p363he.C12822e;
import p363he.C12824f;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.CollectionKey */
public final class CollectionKey implements FragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<CollectionKey> CREATOR = new Creator();
    private final Collection collection;
    private final String collectionKey;
    private final String deepLink;
    private final String referrer;
    private final Bundle referrerBundle;
    private final boolean showSuggestionsTabFirst;
    private final String slug;
    private final String username;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.CollectionKey$Creator */
    public static final class Creator implements Parcelable.Creator<CollectionKey> {
        public final CollectionKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new CollectionKey(parcel.readString(), (Collection) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readBundle());
        }

        public final CollectionKey[] newArray(int i) {
            return new CollectionKey[i];
        }
    }

    public CollectionKey(String str, Collection collection2, String str2, String str3, String str4, String str5, boolean z, Bundle bundle) {
        C19383o.m32797g(str, "referrer");
        this.referrer = str;
        this.collection = collection2;
        this.collectionKey = str2;
        this.username = str3;
        this.slug = str4;
        this.deepLink = str5;
        this.showSuggestionsTabFirst = z;
        this.referrerBundle = bundle;
    }

    public static /* synthetic */ CollectionKey copy$default(CollectionKey collectionKey2, String str, Collection collection2, String str2, String str3, String str4, String str5, boolean z, Bundle bundle, int i, Object obj) {
        CollectionKey collectionKey3 = collectionKey2;
        int i2 = i;
        return collectionKey2.copy((i2 & 1) != 0 ? collectionKey2.getReferrer() : str, (i2 & 2) != 0 ? collectionKey3.collection : collection2, (i2 & 4) != 0 ? collectionKey3.collectionKey : str2, (i2 & 8) != 0 ? collectionKey3.username : str3, (i2 & 16) != 0 ? collectionKey3.slug : str4, (i2 & 32) != 0 ? collectionKey3.deepLink : str5, (i2 & 64) != 0 ? collectionKey3.showSuggestionsTabFirst : z, (i2 & 128) != 0 ? collectionKey2.getReferrerBundle() : bundle);
    }

    public final String component1() {
        return getReferrer();
    }

    public final Collection component2() {
        return this.collection;
    }

    public final String component3() {
        return this.collectionKey;
    }

    public final String component4() {
        return this.username;
    }

    public final String component5() {
        return this.slug;
    }

    public final String component6() {
        return this.deepLink;
    }

    public final boolean component7() {
        return this.showSuggestionsTabFirst;
    }

    public final Bundle component8() {
        return getReferrerBundle();
    }

    public final CollectionKey copy(String str, Collection collection2, String str2, String str3, String str4, String str5, boolean z, Bundle bundle) {
        C19383o.m32797g(str, "referrer");
        return new CollectionKey(str, collection2, str2, str3, str4, str5, z, bundle);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionKey)) {
            return false;
        }
        CollectionKey collectionKey2 = (CollectionKey) obj;
        return C19383o.m32792b(getReferrer(), collectionKey2.getReferrer()) && C19383o.m32792b(this.collection, collectionKey2.collection) && C19383o.m32792b(this.collectionKey, collectionKey2.collectionKey) && C19383o.m32792b(this.username, collectionKey2.username) && C19383o.m32792b(this.slug, collectionKey2.slug) && C19383o.m32792b(this.deepLink, collectionKey2.deepLink) && this.showSuggestionsTabFirst == collectionKey2.showSuggestionsTabFirst && C19383o.m32792b(getReferrerBundle(), collectionKey2.getReferrerBundle());
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

    public final Collection getCollection() {
        return this.collection;
    }

    public final String getCollectionKey() {
        return this.collectionKey;
    }

    public final String getDeepLink() {
        return this.deepLink;
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        Collection collection2 = this.collection;
        if (collection2 != null) {
            fVar.f28304a.put(Collection.TYPE_COLLECTION, collection2);
        }
        if (C18263b.m30839d0(this.collectionKey)) {
            fVar.f28304a.put(ListRecommendationsFragment.COLLECTION_KEY, this.collectionKey);
        }
        if (C18263b.m30839d0(this.slug)) {
            fVar.f28304a.put("slug", this.slug);
        }
        if (C18263b.m30839d0(this.username)) {
            fVar.f28304a.put(ResponseConstants.USERNAME, this.username);
        }
        if (C18263b.m30839d0(this.deepLink)) {
            fVar.f28304a.put("deepLink", this.deepLink);
        }
        fVar.f28304a.put(CollectionContainerFragment.SHOW_SUGGESTIONS_TAB_FIRST, Boolean.valueOf(this.showSuggestionsTabFirst));
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

    public final boolean getShowSuggestionsTabFirst() {
        return this.showSuggestionsTabFirst;
    }

    public final String getSlug() {
        return this.slug;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int hashCode = getReferrer().hashCode() * 31;
        Collection collection2 = this.collection;
        int i = 0;
        int hashCode2 = (hashCode + (collection2 == null ? 0 : collection2.hashCode())) * 31;
        String str = this.collectionKey;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.username;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.slug;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.deepLink;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        boolean z = this.showSuggestionsTabFirst;
        if (z) {
            z = true;
        }
        int i2 = (hashCode6 + (z ? 1 : 0)) * 31;
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
        StringBuilder h = C0072d.m201h("CollectionKey(referrer=");
        h.append(getReferrer());
        h.append(", collection=");
        h.append(this.collection);
        h.append(", collectionKey=");
        h.append(this.collectionKey);
        h.append(", username=");
        h.append(this.username);
        h.append(", slug=");
        h.append(this.slug);
        h.append(", deepLink=");
        h.append(this.deepLink);
        h.append(", showSuggestionsTabFirst=");
        h.append(this.showSuggestionsTabFirst);
        h.append(", referrerBundle=");
        h.append(getReferrerBundle());
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        parcel.writeSerializable(this.collection);
        parcel.writeString(this.collectionKey);
        parcel.writeString(this.username);
        parcel.writeString(this.slug);
        parcel.writeString(this.deepLink);
        parcel.writeInt(this.showSuggestionsTabFirst ? 1 : 0);
        parcel.writeBundle(this.referrerBundle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CollectionKey(java.lang.String r9, com.etsy.android.lib.models.apiv3.Collection r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, boolean r15, android.os.Bundle r16, int r17, kotlin.jvm.internal.DefaultConstructorMarker r18) {
        /*
            r8 = this;
            r0 = r17
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r11
        L_0x0011:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r12
        L_0x0018:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r13
        L_0x001f:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0026
        L_0x0025:
            r6 = r14
        L_0x0026:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x002c
            r7 = 0
            goto L_0x002d
        L_0x002c:
            r7 = r15
        L_0x002d:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r2 = r16
        L_0x0034:
            r10 = r8
            r11 = r9
            r12 = r1
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r7
            r18 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.navigation.keys.fragmentkeys.CollectionKey.<init>(java.lang.String, com.etsy.android.lib.models.apiv3.Collection, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, android.os.Bundle, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

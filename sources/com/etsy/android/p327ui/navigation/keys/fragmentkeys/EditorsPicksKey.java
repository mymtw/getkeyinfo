package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p003a2.C0023f;
import p010a9.C0048b;
import p343ee.C12693a;
import p363he.C12822e;
import p363he.C12824f;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.EditorsPicksKey */
public final class EditorsPicksKey implements FragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<EditorsPicksKey> CREATOR = new Creator();
    private final String anchorListingId;
    private final String clazzName;
    private final boolean isDraft;
    private final String referrer;
    private final Bundle referrerBundle;
    private final String section;
    private final String slug;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.EditorsPicksKey$Creator */
    public static final class Creator implements Parcelable.Creator<EditorsPicksKey> {
        public final EditorsPicksKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new EditorsPicksKey(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readBundle(), parcel.readString());
        }

        public final EditorsPicksKey[] newArray(int i) {
            return new EditorsPicksKey[i];
        }
    }

    public EditorsPicksKey(String str, String str2, boolean z, String str3, String str4, Bundle bundle, String str5) {
        C0048b.m167f(str, "referrer", str2, "slug", str5, "clazzName");
        this.referrer = str;
        this.slug = str2;
        this.isDraft = z;
        this.anchorListingId = str3;
        this.section = str4;
        this.referrerBundle = bundle;
        this.clazzName = str5;
    }

    public static /* synthetic */ EditorsPicksKey copy$default(EditorsPicksKey editorsPicksKey, String str, String str2, boolean z, String str3, String str4, Bundle bundle, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = editorsPicksKey.getReferrer();
        }
        if ((i & 2) != 0) {
            str2 = editorsPicksKey.slug;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            z = editorsPicksKey.isDraft;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            str3 = editorsPicksKey.anchorListingId;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = editorsPicksKey.section;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            bundle = editorsPicksKey.getReferrerBundle();
        }
        Bundle bundle2 = bundle;
        if ((i & 64) != 0) {
            str5 = editorsPicksKey.getClazzName();
        }
        return editorsPicksKey.copy(str, str6, z2, str7, str8, bundle2, str5);
    }

    public final String component1() {
        return getReferrer();
    }

    public final String component2() {
        return this.slug;
    }

    public final boolean component3() {
        return this.isDraft;
    }

    public final String component4() {
        return this.anchorListingId;
    }

    public final String component5() {
        return this.section;
    }

    public final Bundle component6() {
        return getReferrerBundle();
    }

    public final String component7() {
        return getClazzName();
    }

    public final EditorsPicksKey copy(String str, String str2, boolean z, String str3, String str4, Bundle bundle, String str5) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(str2, "slug");
        String str6 = str5;
        C19383o.m32797g(str6, "clazzName");
        return new EditorsPicksKey(str, str2, z, str3, str4, bundle, str6);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditorsPicksKey)) {
            return false;
        }
        EditorsPicksKey editorsPicksKey = (EditorsPicksKey) obj;
        return C19383o.m32792b(getReferrer(), editorsPicksKey.getReferrer()) && C19383o.m32792b(this.slug, editorsPicksKey.slug) && this.isDraft == editorsPicksKey.isDraft && C19383o.m32792b(this.anchorListingId, editorsPicksKey.anchorListingId) && C19383o.m32792b(this.section, editorsPicksKey.section) && C19383o.m32792b(getReferrerBundle(), editorsPicksKey.getReferrerBundle()) && C19383o.m32792b(getClazzName(), editorsPicksKey.getClazzName());
    }

    public final String getAnchorListingId() {
        return this.anchorListingId;
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.FADE;
    }

    public C12693a getBackstackGenerator() {
        return new C0005b();
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
        fVar.f28304a.put("finds_slug", this.slug);
        fVar.f28304a.put("finds_is_draft", Boolean.valueOf(this.isDraft));
        if (C18263b.m30839d0(this.anchorListingId)) {
            fVar.f28304a.put("ANCHOR_LISTING_ID", this.anchorListingId);
        }
        if (C18263b.m30839d0(this.section)) {
            fVar.f28304a.put("FINDS_ANCHOR_TAG", this.section);
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

    public final String getSection() {
        return this.section;
    }

    public final String getSlug() {
        return this.slug;
    }

    public int hashCode() {
        int e = C0023f.m105e(this.slug, getReferrer().hashCode() * 31, 31);
        boolean z = this.isDraft;
        if (z) {
            z = true;
        }
        int i = (e + (z ? 1 : 0)) * 31;
        String str = this.anchorListingId;
        int i2 = 0;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.section;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        if (getReferrerBundle() != null) {
            i2 = getReferrerBundle().hashCode();
        }
        return getClazzName().hashCode() + ((hashCode2 + i2) * 31);
    }

    public boolean isDialog() {
        return false;
    }

    public final boolean isDraft() {
        return this.isDraft;
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
        StringBuilder h = C0072d.m201h("EditorsPicksKey(referrer=");
        h.append(getReferrer());
        h.append(", slug=");
        h.append(this.slug);
        h.append(", isDraft=");
        h.append(this.isDraft);
        h.append(", anchorListingId=");
        h.append(this.anchorListingId);
        h.append(", section=");
        h.append(this.section);
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
        parcel.writeString(this.slug);
        parcel.writeInt(this.isDraft ? 1 : 0);
        parcel.writeString(this.anchorListingId);
        parcel.writeString(this.section);
        parcel.writeBundle(this.referrerBundle);
        parcel.writeString(this.clazzName);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ EditorsPicksKey(java.lang.String r10, java.lang.String r11, boolean r12, java.lang.String r13, java.lang.String r14, android.os.Bundle r15, java.lang.String r16, int r17, kotlin.jvm.internal.DefaultConstructorMarker r18) {
        /*
            r9 = this;
            r0 = r17 & 4
            if (r0 == 0) goto L_0x0007
            r0 = 0
            r4 = r0
            goto L_0x0008
        L_0x0007:
            r4 = r12
        L_0x0008:
            r0 = r17 & 8
            r1 = 0
            if (r0 == 0) goto L_0x000f
            r5 = r1
            goto L_0x0010
        L_0x000f:
            r5 = r13
        L_0x0010:
            r0 = r17 & 16
            if (r0 == 0) goto L_0x0016
            r6 = r1
            goto L_0x0017
        L_0x0016:
            r6 = r14
        L_0x0017:
            r0 = r17 & 32
            if (r0 == 0) goto L_0x001d
            r7 = r1
            goto L_0x001e
        L_0x001d:
            r7 = r15
        L_0x001e:
            r0 = r17 & 64
            if (r0 == 0) goto L_0x002d
            java.lang.Class<com.etsy.android.ui.home.editorspicks.EditorsPicksFragment> r0 = com.etsy.android.p327ui.home.editorspicks.EditorsPicksFragment.class
            java.lang.String r0 = r0.getCanonicalName()
            kotlin.jvm.internal.C19383o.m32794d(r0)
            r8 = r0
            goto L_0x002f
        L_0x002d:
            r8 = r16
        L_0x002f:
            r1 = r9
            r2 = r10
            r3 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.navigation.keys.fragmentkeys.EditorsPicksKey.<init>(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, android.os.Bundle, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

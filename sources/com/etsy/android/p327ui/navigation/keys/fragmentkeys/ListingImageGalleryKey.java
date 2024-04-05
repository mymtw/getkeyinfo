package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.core.listinggallery.ListingImageGalleryFragment;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import com.etsy.android.uikit.adapter.ListingVideoPosition;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p343ee.C12693a;
import p363he.C12822e;
import p363he.C12824f;
import p504ai.C13983i;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.ListingImageGalleryKey */
public final class ListingImageGalleryKey implements FragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ListingImageGalleryKey> CREATOR = new Creator();
    private final String clazzName;
    private final int position;
    private final String referrer;
    private final boolean showBuyItNowButton;
    private final boolean showVisuallySimilarButton;
    private final Integer transactionDataKey;
    private final ListingVideoPosition videoPosition;
    private final String visuallySimilarApiPath;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.ListingImageGalleryKey$Creator */
    public static final class Creator implements Parcelable.Creator<ListingImageGalleryKey> {
        public final ListingImageGalleryKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            String readString2 = parcel.readString();
            ListingVideoPosition createFromParcel = parcel.readInt() == 0 ? null : ListingVideoPosition.CREATOR.createFromParcel(parcel);
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new ListingImageGalleryKey(readString, readInt, readString2, createFromParcel, z2, valueOf, z);
        }

        public final ListingImageGalleryKey[] newArray(int i) {
            return new ListingImageGalleryKey[i];
        }
    }

    public ListingImageGalleryKey(String str, int i, String str2, ListingVideoPosition listingVideoPosition, boolean z, Integer num, boolean z2) {
        C19383o.m32797g(str, "referrer");
        this.referrer = str;
        this.position = i;
        this.visuallySimilarApiPath = str2;
        this.videoPosition = listingVideoPosition;
        this.showBuyItNowButton = z;
        this.transactionDataKey = num;
        this.showVisuallySimilarButton = z2;
        String canonicalName = ListingImageGalleryFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName);
        this.clazzName = canonicalName;
    }

    public static /* synthetic */ ListingImageGalleryKey copy$default(ListingImageGalleryKey listingImageGalleryKey, String str, int i, String str2, ListingVideoPosition listingVideoPosition, boolean z, Integer num, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = listingImageGalleryKey.getReferrer();
        }
        if ((i2 & 2) != 0) {
            i = listingImageGalleryKey.position;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str2 = listingImageGalleryKey.visuallySimilarApiPath;
        }
        String str3 = str2;
        if ((i2 & 8) != 0) {
            listingVideoPosition = listingImageGalleryKey.videoPosition;
        }
        ListingVideoPosition listingVideoPosition2 = listingVideoPosition;
        if ((i2 & 16) != 0) {
            z = listingImageGalleryKey.showBuyItNowButton;
        }
        boolean z3 = z;
        if ((i2 & 32) != 0) {
            num = listingImageGalleryKey.transactionDataKey;
        }
        Integer num2 = num;
        if ((i2 & 64) != 0) {
            z2 = listingImageGalleryKey.showVisuallySimilarButton;
        }
        return listingImageGalleryKey.copy(str, i3, str3, listingVideoPosition2, z3, num2, z2);
    }

    public final String component1() {
        return getReferrer();
    }

    public final int component2() {
        return this.position;
    }

    public final String component3() {
        return this.visuallySimilarApiPath;
    }

    public final ListingVideoPosition component4() {
        return this.videoPosition;
    }

    public final boolean component5() {
        return this.showBuyItNowButton;
    }

    public final Integer component6() {
        return this.transactionDataKey;
    }

    public final boolean component7() {
        return this.showVisuallySimilarButton;
    }

    public final ListingImageGalleryKey copy(String str, int i, String str2, ListingVideoPosition listingVideoPosition, boolean z, Integer num, boolean z2) {
        C19383o.m32797g(str, "referrer");
        return new ListingImageGalleryKey(str, i, str2, listingVideoPosition, z, num, z2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListingImageGalleryKey)) {
            return false;
        }
        ListingImageGalleryKey listingImageGalleryKey = (ListingImageGalleryKey) obj;
        return C19383o.m32792b(getReferrer(), listingImageGalleryKey.getReferrer()) && this.position == listingImageGalleryKey.position && C19383o.m32792b(this.visuallySimilarApiPath, listingImageGalleryKey.visuallySimilarApiPath) && C19383o.m32792b(this.videoPosition, listingImageGalleryKey.videoPosition) && this.showBuyItNowButton == listingImageGalleryKey.showBuyItNowButton && C19383o.m32792b(this.transactionDataKey, listingImageGalleryKey.transactionDataKey) && this.showVisuallySimilarButton == listingImageGalleryKey.showVisuallySimilarButton;
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.ZOOM_IN_OUT;
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
        fVar.f28304a.put("position", Integer.valueOf(this.position));
        fVar.f28304a.put(ListingImageGalleryFragment.ENABLE_SHOW_BUY_IT_NOW_BUTTON, Boolean.valueOf(this.showBuyItNowButton));
        fVar.f28304a.put(ListingImageGalleryFragment.SHOW_VISUALLY_SIMILAR_ITEMS_BUTTON, Boolean.valueOf(this.showVisuallySimilarButton));
        ListingVideoPosition listingVideoPosition = this.videoPosition;
        if (listingVideoPosition != null) {
            fVar.f28304a.put(ListingImageGalleryFragment.LISTING_VIDEO_POSITION, listingVideoPosition);
        }
        if (C18263b.m30839d0(this.visuallySimilarApiPath)) {
            fVar.f28304a.put("visuallySimilarApiPath", this.visuallySimilarApiPath);
        }
        Integer num = this.transactionDataKey;
        if (num != null) {
            fVar.f28304a.put("transaction-data", num);
        }
        return fVar;
    }

    public final int getPosition() {
        return this.position;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public Bundle getReferrerBundle() {
        return null;
    }

    public final boolean getShowBuyItNowButton() {
        return this.showBuyItNowButton;
    }

    public final boolean getShowVisuallySimilarButton() {
        return this.showVisuallySimilarButton;
    }

    public final Integer getTransactionDataKey() {
        return this.transactionDataKey;
    }

    public final ListingVideoPosition getVideoPosition() {
        return this.videoPosition;
    }

    public final String getVisuallySimilarApiPath() {
        return this.visuallySimilarApiPath;
    }

    public int hashCode() {
        int a = C0069a.m170a(this.position, getReferrer().hashCode() * 31, 31);
        String str = this.visuallySimilarApiPath;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        ListingVideoPosition listingVideoPosition = this.videoPosition;
        int hashCode2 = (hashCode + (listingVideoPosition == null ? 0 : listingVideoPosition.hashCode())) * 31;
        boolean z = this.showBuyItNowButton;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        Integer num = this.transactionDataKey;
        if (num != null) {
            i = num.hashCode();
        }
        int i3 = (i2 + i) * 31;
        boolean z3 = this.showVisuallySimilarButton;
        if (!z3) {
            z2 = z3;
        }
        return i3 + (z2 ? 1 : 0);
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
        StringBuilder h = C0072d.m201h("ListingImageGalleryKey(referrer=");
        h.append(getReferrer());
        h.append(", position=");
        h.append(this.position);
        h.append(", visuallySimilarApiPath=");
        h.append(this.visuallySimilarApiPath);
        h.append(", videoPosition=");
        h.append(this.videoPosition);
        h.append(", showBuyItNowButton=");
        h.append(this.showBuyItNowButton);
        h.append(", transactionDataKey=");
        h.append(this.transactionDataKey);
        h.append(", showVisuallySimilarButton=");
        return C0391c.m1058d(h, this.showVisuallySimilarButton, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        parcel.writeInt(this.position);
        parcel.writeString(this.visuallySimilarApiPath);
        ListingVideoPosition listingVideoPosition = this.videoPosition;
        if (listingVideoPosition == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            listingVideoPosition.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.showBuyItNowButton ? 1 : 0);
        Integer num = this.transactionDataKey;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            C13983i.m21499r(parcel, 1, num);
        }
        parcel.writeInt(this.showVisuallySimilarButton ? 1 : 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ListingImageGalleryKey(java.lang.String r7, int r8, java.lang.String r9, com.etsy.android.uikit.adapter.ListingVideoPosition r10, boolean r11, java.lang.Integer r12, boolean r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r6 = this;
            r0 = r14 & 2
            r1 = 0
            if (r0 == 0) goto L_0x0007
            r0 = r1
            goto L_0x0008
        L_0x0007:
            r0 = r8
        L_0x0008:
            r2 = r14 & 4
            r3 = 0
            if (r2 == 0) goto L_0x000f
            r2 = r3
            goto L_0x0010
        L_0x000f:
            r2 = r9
        L_0x0010:
            r4 = r14 & 8
            if (r4 == 0) goto L_0x0016
            r4 = r3
            goto L_0x0017
        L_0x0016:
            r4 = r10
        L_0x0017:
            r5 = r14 & 16
            if (r5 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r1 = r11
        L_0x001d:
            r5 = r14 & 32
            if (r5 == 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r3 = r12
        L_0x0023:
            r5 = r14 & 64
            if (r5 == 0) goto L_0x0029
            r5 = 1
            goto L_0x002a
        L_0x0029:
            r5 = r13
        L_0x002a:
            r8 = r6
            r9 = r7
            r10 = r0
            r11 = r2
            r12 = r4
            r13 = r1
            r14 = r3
            r15 = r5
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.navigation.keys.fragmentkeys.ListingImageGalleryKey.<init>(java.lang.String, int, java.lang.String, com.etsy.android.uikit.adapter.ListingVideoPosition, boolean, java.lang.Integer, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

package com.etsy.android.p327ui.navigation.keys.bottomsheetkeys;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.p327ui.cart.ListingSelectQuantityDialogFragment;
import com.etsy.android.p327ui.navigation.keys.BottomSheetNavigationKey;
import com.etsy.android.uikit.p331ui.core.TrackingBottomSheetDialogFragment;
import com.etsy.android.vespa.PositionList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.C19387r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.C19410j;
import p363he.C12822e;
import p363he.C12824f;
import p759nq.C19919a;

/* renamed from: com.etsy.android.ui.navigation.keys.bottomsheetkeys.ListingSelectQuantityBottomSheetKey */
public final class ListingSelectQuantityBottomSheetKey implements BottomSheetNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ListingSelectQuantityBottomSheetKey> CREATOR = new Creator();
    private final ServerDrivenAction action;
    private final PositionList positionList;
    private final String referrer;
    private final int selectedQuantity;
    private final int totalQuantity;

    /* renamed from: com.etsy.android.ui.navigation.keys.bottomsheetkeys.ListingSelectQuantityBottomSheetKey$Creator */
    public static final class Creator implements Parcelable.Creator<ListingSelectQuantityBottomSheetKey> {
        public final ListingSelectQuantityBottomSheetKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new ListingSelectQuantityBottomSheetKey(parcel.readString(), (ServerDrivenAction) parcel.readSerializable(), (PositionList) parcel.readSerializable(), parcel.readInt(), parcel.readInt());
        }

        public final ListingSelectQuantityBottomSheetKey[] newArray(int i) {
            return new ListingSelectQuantityBottomSheetKey[i];
        }
    }

    /* renamed from: com.etsy.android.ui.navigation.keys.bottomsheetkeys.ListingSelectQuantityBottomSheetKey$a */
    public static final class C10695a {

        /* renamed from: f */
        public static final /* synthetic */ C19410j<Object>[] f23584f;

        /* renamed from: a */
        public String f23585a;

        /* renamed from: b */
        public ServerDrivenAction f23586b;

        /* renamed from: c */
        public final C19919a f23587c = new C19919a();

        /* renamed from: d */
        public final C19919a f23588d = new C19919a();

        /* renamed from: e */
        public PositionList f23589e;

        static {
            Class<C10695a> cls = C10695a.class;
            MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(cls, "selectedQuantity", "getSelectedQuantity()I", 0);
            C19387r rVar = C19386q.f43269a;
            rVar.getClass();
            MutablePropertyReference1Impl mutablePropertyReference1Impl2 = new MutablePropertyReference1Impl(cls, "totalQuantity", "getTotalQuantity()I", 0);
            rVar.getClass();
            f23584f = new C19410j[]{mutablePropertyReference1Impl, mutablePropertyReference1Impl2};
        }
    }

    public ListingSelectQuantityBottomSheetKey(String str, ServerDrivenAction serverDrivenAction, PositionList positionList2, int i, int i2) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(serverDrivenAction, ResponseConstants.ACTION);
        this.referrer = str;
        this.action = serverDrivenAction;
        this.positionList = positionList2;
        this.selectedQuantity = i;
        this.totalQuantity = i2;
    }

    public static /* synthetic */ ListingSelectQuantityBottomSheetKey copy$default(ListingSelectQuantityBottomSheetKey listingSelectQuantityBottomSheetKey, String str, ServerDrivenAction serverDrivenAction, PositionList positionList2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = listingSelectQuantityBottomSheetKey.getReferrer();
        }
        if ((i3 & 2) != 0) {
            serverDrivenAction = listingSelectQuantityBottomSheetKey.action;
        }
        ServerDrivenAction serverDrivenAction2 = serverDrivenAction;
        if ((i3 & 4) != 0) {
            positionList2 = listingSelectQuantityBottomSheetKey.positionList;
        }
        PositionList positionList3 = positionList2;
        if ((i3 & 8) != 0) {
            i = listingSelectQuantityBottomSheetKey.selectedQuantity;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = listingSelectQuantityBottomSheetKey.totalQuantity;
        }
        return listingSelectQuantityBottomSheetKey.copy(str, serverDrivenAction2, positionList3, i4, i2);
    }

    public final String component1() {
        return getReferrer();
    }

    public final ServerDrivenAction component2() {
        return this.action;
    }

    public final PositionList component3() {
        return this.positionList;
    }

    public final int component4() {
        return this.selectedQuantity;
    }

    public final int component5() {
        return this.totalQuantity;
    }

    public final ListingSelectQuantityBottomSheetKey copy(String str, ServerDrivenAction serverDrivenAction, PositionList positionList2, int i, int i2) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(serverDrivenAction, ResponseConstants.ACTION);
        return new ListingSelectQuantityBottomSheetKey(str, serverDrivenAction, positionList2, i, i2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListingSelectQuantityBottomSheetKey)) {
            return false;
        }
        ListingSelectQuantityBottomSheetKey listingSelectQuantityBottomSheetKey = (ListingSelectQuantityBottomSheetKey) obj;
        return C19383o.m32792b(getReferrer(), listingSelectQuantityBottomSheetKey.getReferrer()) && C19383o.m32792b(this.action, listingSelectQuantityBottomSheetKey.action) && C19383o.m32792b(this.positionList, listingSelectQuantityBottomSheetKey.positionList) && this.selectedQuantity == listingSelectQuantityBottomSheetKey.selectedQuantity && this.totalQuantity == listingSelectQuantityBottomSheetKey.totalQuantity;
    }

    public final ServerDrivenAction getAction() {
        return this.action;
    }

    public TrackingBottomSheetDialogFragment getBottomSheetFragment() {
        return new ListingSelectQuantityDialogFragment();
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        fVar.f28304a.put("cart_update_quantity_selected_quantity", Integer.valueOf(this.selectedQuantity));
        fVar.f28304a.put("cart_update_quantity_total_quantity", Integer.valueOf(this.totalQuantity));
        fVar.f28304a.put("cart_action", this.action);
        PositionList positionList2 = this.positionList;
        if (positionList2 != null) {
            fVar.f28304a.put("cart_action_position", Integer.valueOf(positionList2.getParentPosition()));
        }
        return fVar;
    }

    public final PositionList getPositionList() {
        return this.positionList;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public final int getSelectedQuantity() {
        return this.selectedQuantity;
    }

    public final int getTotalQuantity() {
        return this.totalQuantity;
    }

    public int hashCode() {
        int hashCode = (this.action.hashCode() + (getReferrer().hashCode() * 31)) * 31;
        PositionList positionList2 = this.positionList;
        return Integer.hashCode(this.totalQuantity) + C0069a.m170a(this.selectedQuantity, (hashCode + (positionList2 == null ? 0 : positionList2.hashCode())) * 31, 31);
    }

    public int storeDataForKey(Object obj) {
        C19383o.m32797g(obj, "value");
        return C12822e.C12823a.m20464a(obj);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ListingSelectQuantityBottomSheetKey(referrer=");
        h.append(getReferrer());
        h.append(", action=");
        h.append(this.action);
        h.append(", positionList=");
        h.append(this.positionList);
        h.append(", selectedQuantity=");
        h.append(this.selectedQuantity);
        h.append(", totalQuantity=");
        return C0073e.m208h(h, this.totalQuantity, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        parcel.writeSerializable(this.action);
        parcel.writeSerializable(this.positionList);
        parcel.writeInt(this.selectedQuantity);
        parcel.writeInt(this.totalQuantity);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ListingSelectQuantityBottomSheetKey(String str, ServerDrivenAction serverDrivenAction, PositionList positionList2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, serverDrivenAction, (i3 & 4) != 0 ? null : positionList2, i, i2);
    }
}

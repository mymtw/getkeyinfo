package com.etsy.android.p327ui.navigation.keys.bottomsheetkeys;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.apiv3.Collection;
import com.etsy.android.p327ui.favorites.editlist.EditCollectionBottomSheetFragment;
import com.etsy.android.p327ui.navigation.keys.BottomSheetNavigationKey;
import com.etsy.android.uikit.nav.transactions.C11869a;
import com.etsy.android.uikit.p331ui.core.TrackingBottomSheetDialogFragment;
import kotlin.jvm.internal.C19383o;
import p363he.C12822e;
import p363he.C12824f;

/* renamed from: com.etsy.android.ui.navigation.keys.bottomsheetkeys.EditCollectionBottomSheetKey */
public final class EditCollectionBottomSheetKey implements BottomSheetNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<EditCollectionBottomSheetKey> CREATOR = new Creator();
    private final Collection collection;
    private final String referrer;

    /* renamed from: com.etsy.android.ui.navigation.keys.bottomsheetkeys.EditCollectionBottomSheetKey$Creator */
    public static final class Creator implements Parcelable.Creator<EditCollectionBottomSheetKey> {
        public final EditCollectionBottomSheetKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new EditCollectionBottomSheetKey(parcel.readString(), (Collection) parcel.readSerializable());
        }

        public final EditCollectionBottomSheetKey[] newArray(int i) {
            return new EditCollectionBottomSheetKey[i];
        }
    }

    public EditCollectionBottomSheetKey(String str, Collection collection2) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(collection2, Collection.TYPE_COLLECTION);
        this.referrer = str;
        this.collection = collection2;
    }

    public static /* synthetic */ EditCollectionBottomSheetKey copy$default(EditCollectionBottomSheetKey editCollectionBottomSheetKey, String str, Collection collection2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = editCollectionBottomSheetKey.getReferrer();
        }
        if ((i & 2) != 0) {
            collection2 = editCollectionBottomSheetKey.collection;
        }
        return editCollectionBottomSheetKey.copy(str, collection2);
    }

    public final String component1() {
        return getReferrer();
    }

    public final Collection component2() {
        return this.collection;
    }

    public final EditCollectionBottomSheetKey copy(String str, Collection collection2) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(collection2, Collection.TYPE_COLLECTION);
        return new EditCollectionBottomSheetKey(str, collection2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditCollectionBottomSheetKey)) {
            return false;
        }
        EditCollectionBottomSheetKey editCollectionBottomSheetKey = (EditCollectionBottomSheetKey) obj;
        return C19383o.m32792b(getReferrer(), editCollectionBottomSheetKey.getReferrer()) && C19383o.m32792b(this.collection, editCollectionBottomSheetKey.collection);
    }

    public TrackingBottomSheetDialogFragment getBottomSheetFragment() {
        return new EditCollectionBottomSheetFragment();
    }

    public final Collection getCollection() {
        return this.collection;
    }

    public C12824f getNavigationParams() {
        C11869a aVar = new C11869a();
        aVar.mo38349f(Collection.TYPE_COLLECTION, this.collection);
        int storeDataForKey = storeDataForKey(aVar);
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        fVar.f28304a.put("transaction-data", Integer.valueOf(storeDataForKey));
        return fVar;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public int hashCode() {
        return this.collection.hashCode() + (getReferrer().hashCode() * 31);
    }

    public int storeDataForKey(Object obj) {
        C19383o.m32797g(obj, "value");
        return C12822e.C12823a.m20464a(obj);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("EditCollectionBottomSheetKey(referrer=");
        h.append(getReferrer());
        h.append(", collection=");
        h.append(this.collection);
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        parcel.writeSerializable(this.collection);
    }
}

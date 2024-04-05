package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

@SafeParcelable.Class(creator = "CartCreator")
@SafeParcelable.Reserved({1})
public final class Cart extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Cart> CREATOR = new zzg();
    @SafeParcelable.Field(mo49213id = 2)
    public String zzao;
    @SafeParcelable.Field(mo49213id = 3)
    public String zzap;
    @SafeParcelable.Field(defaultValueUnchecked = "new java.util.ArrayList<LineItem>()", mo49213id = 4)
    public ArrayList<LineItem> zzaq;

    /* renamed from: com.google.android.gms.wallet.Cart$a */
    public final class C15149a {
    }

    @SafeParcelable.Constructor
    public Cart(@SafeParcelable.Param(mo49216id = 2) String str, @SafeParcelable.Param(mo49216id = 3) String str2, @SafeParcelable.Param(mo49216id = 4) ArrayList<LineItem> arrayList) {
        this.zzao = str;
        this.zzap = str2;
        this.zzaq = arrayList;
    }

    public static C15149a newBuilder() {
        new Cart();
        return new C15149a();
    }

    public final String getCurrencyCode() {
        return this.zzap;
    }

    public final ArrayList<LineItem> getLineItems() {
        return this.zzaq;
    }

    public final String getTotalPrice() {
        return this.zzao;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzao, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzap, false);
        SafeParcelWriter.writeTypedList(parcel, 4, this.zzaq, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public Cart() {
        this.zzaq = new ArrayList<>();
    }
}

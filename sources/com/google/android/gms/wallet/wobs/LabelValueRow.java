package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.ArrayUtils;
import java.util.ArrayList;

@SafeParcelable.Class(creator = "LabelValueRowCreator")
@SafeParcelable.Reserved({1})
public final class LabelValueRow extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LabelValueRow> CREATOR = new zze();
    @SafeParcelable.Field(mo49213id = 2)
    @Deprecated
    public String zzgp;
    @SafeParcelable.Field(mo49213id = 3)
    @Deprecated
    public String zzgq;
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", mo49213id = 4)
    public ArrayList<LabelValue> zzgr;

    /* renamed from: com.google.android.gms.wallet.wobs.LabelValueRow$a */
    public final class C15174a {
    }

    @SafeParcelable.Constructor
    public LabelValueRow(@SafeParcelable.Param(mo49216id = 2) String str, @SafeParcelable.Param(mo49216id = 3) String str2, @SafeParcelable.Param(mo49216id = 4) ArrayList<LabelValue> arrayList) {
        this.zzgp = str;
        this.zzgq = str2;
        this.zzgr = arrayList;
    }

    public static C15174a newBuilder() {
        new LabelValueRow();
        return new C15174a();
    }

    public final ArrayList<LabelValue> getColumns() {
        return this.zzgr;
    }

    @Deprecated
    public final String getHexBackgroundColor() {
        return this.zzgq;
    }

    @Deprecated
    public final String getHexFontColor() {
        return this.zzgp;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzgp, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzgq, false);
        SafeParcelWriter.writeTypedList(parcel, 4, this.zzgr, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public LabelValueRow() {
        this.zzgr = ArrayUtils.newArrayList();
    }
}

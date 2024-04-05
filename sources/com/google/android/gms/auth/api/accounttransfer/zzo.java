package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p193o.C7494b;

@SafeParcelable.Class(creator = "AccountTransferProgressCreator")
public class zzo extends zzaz {
    public static final Parcelable.Creator<zzo> CREATOR = new zzp();
    private static final C7494b<String, FastJsonResponse.Field<?, ?>> zzbe;
    @SafeParcelable.Field(getter = "getRegisteredAccountTypes", mo49213id = 2)
    private List<String> zzbf;
    @SafeParcelable.Field(getter = "getInProgressAccountTypes", mo49213id = 3)
    private List<String> zzbg;
    @SafeParcelable.Field(getter = "getSuccessAccountTypes", mo49213id = 4)
    private List<String> zzbh;
    @SafeParcelable.Field(getter = "getFailedAccountTypes", mo49213id = 5)
    private List<String> zzbi;
    @SafeParcelable.Field(getter = "getEscrowedAccountTypes", mo49213id = 6)
    private List<String> zzbj;
    @SafeParcelable.VersionField(mo49219id = 1)
    private final int zzv;

    static {
        C7494b<String, FastJsonResponse.Field<?, ?>> bVar = new C7494b<>();
        zzbe = bVar;
        bVar.put("registered", FastJsonResponse.Field.forStrings("registered", 2));
        bVar.put("in_progress", FastJsonResponse.Field.forStrings("in_progress", 3));
        bVar.put("success", FastJsonResponse.Field.forStrings("success", 4));
        bVar.put("failed", FastJsonResponse.Field.forStrings("failed", 5));
        bVar.put("escrowed", FastJsonResponse.Field.forStrings("escrowed", 6));
    }

    public zzo() {
        this.zzv = 1;
    }

    public Map<String, FastJsonResponse.Field<?, ?>> getFieldMappings() {
        return zzbe;
    }

    public Object getFieldValue(FastJsonResponse.Field field) {
        switch (field.getSafeParcelableFieldId()) {
            case 1:
                return Integer.valueOf(this.zzv);
            case 2:
                return this.zzbf;
            case 3:
                return this.zzbg;
            case 4:
                return this.zzbh;
            case 5:
                return this.zzbi;
            case 6:
                return this.zzbj;
            default:
                throw new IllegalStateException(C0072d.m200g(37, "Unknown SafeParcelable id=", field.getSafeParcelableFieldId()));
        }
    }

    public boolean isFieldSet(FastJsonResponse.Field field) {
        return true;
    }

    public void setStringsInternal(FastJsonResponse.Field<?, ?> field, String str, ArrayList<String> arrayList) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 2) {
            this.zzbf = arrayList;
        } else if (safeParcelableFieldId == 3) {
            this.zzbg = arrayList;
        } else if (safeParcelableFieldId == 4) {
            this.zzbh = arrayList;
        } else if (safeParcelableFieldId == 5) {
            this.zzbi = arrayList;
        } else if (safeParcelableFieldId == 6) {
            this.zzbj = arrayList;
        } else {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", new Object[]{Integer.valueOf(safeParcelableFieldId)}));
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzv);
        SafeParcelWriter.writeStringList(parcel, 2, this.zzbf, false);
        SafeParcelWriter.writeStringList(parcel, 3, this.zzbg, false);
        SafeParcelWriter.writeStringList(parcel, 4, this.zzbh, false);
        SafeParcelWriter.writeStringList(parcel, 5, this.zzbi, false);
        SafeParcelWriter.writeStringList(parcel, 6, this.zzbj, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzo(@SafeParcelable.Param(mo49216id = 1) int i, @SafeParcelable.Param(mo49216id = 2) List<String> list, @SafeParcelable.Param(mo49216id = 3) List<String> list2, @SafeParcelable.Param(mo49216id = 4) List<String> list3, @SafeParcelable.Param(mo49216id = 5) List<String> list4, @SafeParcelable.Param(mo49216id = 6) List<String> list5) {
        this.zzv = i;
        this.zzbf = list;
        this.zzbg = list2;
        this.zzbh = list3;
        this.zzbi = list4;
        this.zzbj = list5;
    }
}

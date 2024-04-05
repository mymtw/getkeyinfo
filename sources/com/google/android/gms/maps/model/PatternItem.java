package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;
import p003a2.C0023f;

@SafeParcelable.Class(creator = "PatternItemCreator")
@SafeParcelable.Reserved({1})
public class PatternItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PatternItem> CREATOR = new zzi();
    private static final String TAG = "PatternItem";
    @SafeParcelable.Field(getter = "getType", mo49213id = 2)
    private final int type;
    @SafeParcelable.Field(getter = "getLength", mo49213id = 3)
    private final Float zzdv;

    static {
        Class<PatternItem> cls = PatternItem.class;
    }

    @SafeParcelable.Constructor
    public PatternItem(@SafeParcelable.Param(mo49216id = 2) int i, @SafeParcelable.Param(mo49216id = 3) Float f) {
        boolean z = true;
        if (i != 1 && (f == null || f.floatValue() < 0.0f)) {
            z = false;
        }
        String valueOf = String.valueOf(f);
        StringBuilder sb = new StringBuilder(valueOf.length() + 45);
        sb.append("Invalid PatternItem: type=");
        sb.append(i);
        sb.append(" length=");
        sb.append(valueOf);
        Preconditions.checkArgument(z, sb.toString());
        this.type = i;
        this.zzdv = f;
    }

    public static List<PatternItem> zza(List<PatternItem> list) {
        PatternItem patternItem;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (PatternItem next : list) {
            if (next == null) {
                next = null;
            } else {
                int i = next.type;
                if (i == 0) {
                    patternItem = new Dash(next.zzdv.floatValue());
                } else if (i == 1) {
                    next = new Dot();
                } else if (i != 2) {
                    C0023f.m112m(37, "Unknown PatternItem type: ", i, TAG);
                } else {
                    patternItem = new Gap(next.zzdv.floatValue());
                }
                next = patternItem;
            }
            arrayList.add(next);
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PatternItem)) {
            return false;
        }
        PatternItem patternItem = (PatternItem) obj;
        return this.type == patternItem.type && Objects.equal(this.zzdv, patternItem.zzdv);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.type), this.zzdv);
    }

    public String toString() {
        int i = this.type;
        String valueOf = String.valueOf(this.zzdv);
        StringBuilder sb = new StringBuilder(valueOf.length() + 39);
        sb.append("[PatternItem: type=");
        sb.append(i);
        sb.append(" length=");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.type);
        SafeParcelWriter.writeFloatObject(parcel, 3, this.zzdv, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

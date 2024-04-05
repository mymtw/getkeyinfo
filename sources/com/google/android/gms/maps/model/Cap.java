package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p003a2.C0023f;
import p549dk.C17571a;

@SafeParcelable.Class(creator = "CapCreator")
@SafeParcelable.Reserved({1})
public class Cap extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Cap> CREATOR = new zzb();
    private static final String TAG = "Cap";
    @SafeParcelable.Field(getter = "getWrappedBitmapDescriptorImplBinder", mo49213id = 3, type = "android.os.IBinder")
    private final C17571a bitmapDescriptor;
    @SafeParcelable.Field(getter = "getType", mo49213id = 2)
    private final int type;
    @SafeParcelable.Field(getter = "getBitmapRefWidth", mo49213id = 4)
    private final Float zzcn;

    static {
        Class<Cap> cls = Cap.class;
    }

    private Cap(int i, C17571a aVar, Float f) {
        Preconditions.checkArgument(i != 3 || (aVar != null && (f != null && (f.floatValue() > 0.0f ? 1 : (f.floatValue() == 0.0f ? 0 : -1)) > 0)), String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", new Object[]{Integer.valueOf(i), aVar, f}));
        this.type = i;
        this.bitmapDescriptor = aVar;
        this.zzcn = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cap)) {
            return false;
        }
        Cap cap = (Cap) obj;
        return this.type == cap.type && Objects.equal(this.bitmapDescriptor, cap.bitmapDescriptor) && Objects.equal(this.zzcn, cap.zzcn);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.type), this.bitmapDescriptor, this.zzcn);
    }

    public String toString() {
        int i = this.type;
        StringBuilder sb = new StringBuilder(23);
        sb.append("[Cap: type=");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.type);
        C17571a aVar = this.bitmapDescriptor;
        SafeParcelWriter.writeIBinder(parcel, 3, aVar == null ? null : aVar.f38442a.asBinder(), false);
        SafeParcelWriter.writeFloatObject(parcel, 4, this.zzcn, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final Cap zzh() {
        int i = this.type;
        if (i == 0) {
            return new ButtCap();
        }
        if (i == 1) {
            return new SquareCap();
        }
        if (i == 2) {
            return new RoundCap();
        }
        if (i == 3) {
            return new CustomCap(this.bitmapDescriptor, this.zzcn.floatValue());
        }
        C0023f.m112m(29, "Unknown Cap type: ", i, TAG);
        return this;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Cap(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo49216id = 2) int r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo49216id = 3) android.os.IBinder r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo49216id = 4) java.lang.Float r4) {
        /*
            r1 = this;
            if (r3 != 0) goto L_0x0004
            r3 = 0
            goto L_0x000e
        L_0x0004:
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r3)
            dk.a r0 = new dk.a
            r0.<init>(r3)
            r3 = r0
        L_0x000e:
            r1.<init>((int) r2, (p549dk.C17571a) r3, (java.lang.Float) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.Cap.<init>(int, android.os.IBinder, java.lang.Float):void");
    }

    public Cap(C17571a aVar, float f) {
        this(3, aVar, Float.valueOf(f));
    }

    public Cap(int i) {
        this(i, (C17571a) null, (Float) null);
    }
}

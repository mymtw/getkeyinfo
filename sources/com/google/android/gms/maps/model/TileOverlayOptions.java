package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.maps.zzaf;
import com.google.android.gms.internal.maps.zzag;
import p549dk.C17572b;
import p549dk.C17573c;
import p549dk.C17574d;

@SafeParcelable.Class(creator = "TileOverlayOptionsCreator")
@SafeParcelable.Reserved({1})
public final class TileOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TileOverlayOptions> CREATOR = new zzu();
    @SafeParcelable.Field(getter = "getZIndex", mo49213id = 4)
    private float zzcs;
    @SafeParcelable.Field(getter = "isVisible", mo49213id = 3)
    private boolean zzct = true;
    @SafeParcelable.Field(getter = "getTransparency", mo49213id = 6)
    private float zzda = 0.0f;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getTileProviderDelegate", mo49213id = 2, type = "android.os.IBinder")
    public zzaf zzei;
    private C17572b zzej;
    @SafeParcelable.Field(defaultValue = "true", getter = "getFadeIn", mo49213id = 5)
    private boolean zzek = true;

    public TileOverlayOptions() {
    }

    public final TileOverlayOptions fadeIn(boolean z) {
        this.zzek = z;
        return this;
    }

    public final boolean getFadeIn() {
        return this.zzek;
    }

    public final C17572b getTileProvider() {
        return this.zzej;
    }

    public final float getTransparency() {
        return this.zzda;
    }

    public final float getZIndex() {
        return this.zzcs;
    }

    public final boolean isVisible() {
        return this.zzct;
    }

    public final TileOverlayOptions tileProvider(C17572b bVar) {
        this.zzej = bVar;
        this.zzei = bVar == null ? null : new C17574d(bVar);
        return this;
    }

    public final TileOverlayOptions transparency(float f) {
        Preconditions.checkArgument(f >= 0.0f && f <= 1.0f, "Transparency must be in the range [0..1]");
        this.zzda = f;
        return this;
    }

    public final TileOverlayOptions visible(boolean z) {
        this.zzct = z;
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 2, this.zzei.asBinder(), false);
        SafeParcelWriter.writeBoolean(parcel, 3, isVisible());
        SafeParcelWriter.writeFloat(parcel, 4, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 5, getFadeIn());
        SafeParcelWriter.writeFloat(parcel, 6, getTransparency());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final TileOverlayOptions zIndex(float f) {
        this.zzcs = f;
        return this;
    }

    @SafeParcelable.Constructor
    public TileOverlayOptions(@SafeParcelable.Param(mo49216id = 2) IBinder iBinder, @SafeParcelable.Param(mo49216id = 3) boolean z, @SafeParcelable.Param(mo49216id = 4) float f, @SafeParcelable.Param(mo49216id = 5) boolean z2, @SafeParcelable.Param(mo49216id = 6) float f2) {
        C17573c cVar;
        zzaf zzk = zzag.zzk(iBinder);
        this.zzei = zzk;
        if (zzk == null) {
            cVar = null;
        } else {
            cVar = new C17573c(this);
        }
        this.zzej = cVar;
        this.zzct = z;
        this.zzcs = f;
        this.zzek = z2;
        this.zzda = f2;
    }
}

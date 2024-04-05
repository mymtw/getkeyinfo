package com.google.android.gms.wallet.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.etsy.android.R;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.play.core.appupdate.C15562d;

@SafeParcelable.Class(creator = "WalletFragmentStyleCreator")
@SafeParcelable.Reserved({1})
public final class WalletFragmentStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WalletFragmentStyle> CREATOR = new zzg();
    @SafeParcelable.Field(mo49213id = 2)
    private Bundle zzgd;
    @SafeParcelable.Field(mo49213id = 3)
    private int zzge;

    public WalletFragmentStyle() {
        Bundle bundle = new Bundle();
        this.zzgd = bundle;
        bundle.putInt("buyButtonAppearanceDefault", 4);
        this.zzgd.putInt("maskedWalletDetailsLogoImageTypeDefault", 3);
    }

    private final void zzb(TypedArray typedArray, int i, String str) {
        TypedValue peekValue;
        if (!this.zzgd.containsKey(str) && (peekValue = typedArray.peekValue(i)) != null) {
            this.zzgd.putInt(str, peekValue.data);
        }
    }

    private static long zzc(int i, int i2) {
        return (((long) i2) & UnsignedInteger.INT_MASK) | (((long) i) << 32);
    }

    public final WalletFragmentStyle setBuyButtonAppearance(int i) {
        this.zzgd.putInt("buyButtonAppearance", i);
        return this;
    }

    public final WalletFragmentStyle setBuyButtonHeight(int i) {
        this.zzgd.putLong("buyButtonHeight", zza(i));
        return this;
    }

    public final WalletFragmentStyle setBuyButtonText(int i) {
        this.zzgd.putInt("buyButtonText", i);
        return this;
    }

    public final WalletFragmentStyle setBuyButtonWidth(int i) {
        this.zzgd.putLong("buyButtonWidth", zza(i));
        return this;
    }

    public final WalletFragmentStyle setMaskedWalletDetailsBackgroundColor(int i) {
        this.zzgd.remove("maskedWalletDetailsBackgroundResource");
        this.zzgd.putInt("maskedWalletDetailsBackgroundColor", i);
        return this;
    }

    public final WalletFragmentStyle setMaskedWalletDetailsBackgroundResource(int i) {
        this.zzgd.remove("maskedWalletDetailsBackgroundColor");
        this.zzgd.putInt("maskedWalletDetailsBackgroundResource", i);
        return this;
    }

    public final WalletFragmentStyle setMaskedWalletDetailsButtonBackgroundColor(int i) {
        this.zzgd.remove("maskedWalletDetailsButtonBackgroundResource");
        this.zzgd.putInt("maskedWalletDetailsButtonBackgroundColor", i);
        return this;
    }

    public final WalletFragmentStyle setMaskedWalletDetailsButtonBackgroundResource(int i) {
        this.zzgd.remove("maskedWalletDetailsButtonBackgroundColor");
        this.zzgd.putInt("maskedWalletDetailsButtonBackgroundResource", i);
        return this;
    }

    public final WalletFragmentStyle setMaskedWalletDetailsButtonTextAppearance(int i) {
        this.zzgd.putInt("maskedWalletDetailsButtonTextAppearance", i);
        return this;
    }

    public final WalletFragmentStyle setMaskedWalletDetailsHeaderTextAppearance(int i) {
        this.zzgd.putInt("maskedWalletDetailsHeaderTextAppearance", i);
        return this;
    }

    public final WalletFragmentStyle setMaskedWalletDetailsLogoImageType(int i) {
        this.zzgd.putInt("maskedWalletDetailsLogoImageType", i);
        return this;
    }

    @Deprecated
    public final WalletFragmentStyle setMaskedWalletDetailsLogoTextColor(int i) {
        this.zzgd.putInt("maskedWalletDetailsLogoTextColor", i);
        return this;
    }

    public final WalletFragmentStyle setMaskedWalletDetailsTextAppearance(int i) {
        this.zzgd.putInt("maskedWalletDetailsTextAppearance", i);
        return this;
    }

    public final WalletFragmentStyle setStyleResourceId(int i) {
        this.zzge = i;
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, this.zzgd, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzge);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza(String str, DisplayMetrics displayMetrics, int i) {
        if (!this.zzgd.containsKey(str)) {
            return i;
        }
        long j = this.zzgd.getLong(str);
        int i2 = (int) (j >>> 32);
        int i3 = (int) j;
        int i4 = 5;
        if (i2 == 0) {
            i4 = 0;
        } else if (i2 == 1) {
            i4 = 1;
        } else if (i2 == 2) {
            i4 = 2;
        } else if (i2 == 3) {
            i4 = 3;
        } else if (i2 == 4) {
            i4 = 4;
        } else if (i2 != 5) {
            if (i2 == 128) {
                return TypedValue.complexToDimensionPixelSize(i3, displayMetrics);
            }
            if (i2 == 129) {
                return i3;
            }
            throw new IllegalStateException(C0072d.m200g(36, "Unexpected unit or type: ", i2));
        }
        return Math.round(TypedValue.applyDimension(i4, Float.intBitsToFloat(i3), displayMetrics));
    }

    public final WalletFragmentStyle setBuyButtonHeight(int i, float f) {
        this.zzgd.putLong("buyButtonHeight", zza(i, f));
        return this;
    }

    public final WalletFragmentStyle setBuyButtonWidth(int i, float f) {
        this.zzgd.putLong("buyButtonWidth", zza(i, f));
        return this;
    }

    @SafeParcelable.Constructor
    public WalletFragmentStyle(@SafeParcelable.Param(mo49216id = 2) Bundle bundle, @SafeParcelable.Param(mo49216id = 3) int i) {
        this.zzgd = bundle;
        this.zzge = i;
    }

    private static long zza(int i, float f) {
        if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5) {
            return zzc(i, Float.floatToIntBits(f));
        }
        throw new IllegalArgumentException(C0072d.m200g(30, "Unrecognized unit: ", i));
    }

    private static long zza(int i) {
        if (i >= 0) {
            return zza(0, (float) i);
        }
        if (i == -1 || i == -2) {
            return zzc(129, i);
        }
        throw new IllegalArgumentException(C0072d.m200g(39, "Unexpected dimension value: ", i));
    }

    public final void zza(Context context) {
        int i = this.zzge;
        if (i <= 0) {
            i = R.style.WalletFragmentDefaultStyle;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C15562d.f35024i);
        zza(obtainStyledAttributes, 3, "buyButtonWidth");
        zza(obtainStyledAttributes, 1, "buyButtonHeight");
        zzb(obtainStyledAttributes, 2, "buyButtonText");
        zzb(obtainStyledAttributes, 0, "buyButtonAppearance");
        zzb(obtainStyledAttributes, 10, "maskedWalletDetailsTextAppearance");
        zzb(obtainStyledAttributes, 7, "maskedWalletDetailsHeaderTextAppearance");
        zza(obtainStyledAttributes, 4, "maskedWalletDetailsBackgroundColor", "maskedWalletDetailsBackgroundResource");
        zzb(obtainStyledAttributes, 6, "maskedWalletDetailsButtonTextAppearance");
        zza(obtainStyledAttributes, 5, "maskedWalletDetailsButtonBackgroundColor", "maskedWalletDetailsButtonBackgroundResource");
        zzb(obtainStyledAttributes, 9, "maskedWalletDetailsLogoTextColor");
        zzb(obtainStyledAttributes, 8, "maskedWalletDetailsLogoImageType");
        obtainStyledAttributes.recycle();
    }

    private final void zza(TypedArray typedArray, int i, String str) {
        TypedValue peekValue;
        long j;
        if (!this.zzgd.containsKey(str) && (peekValue = typedArray.peekValue(i)) != null) {
            Bundle bundle = this.zzgd;
            int i2 = peekValue.type;
            if (i2 == 5) {
                j = zzc(128, peekValue.data);
            } else if (i2 == 16) {
                j = zza(peekValue.data);
            } else {
                throw new IllegalArgumentException(C0072d.m200g(38, "Unexpected dimension type: ", peekValue.type));
            }
            bundle.putLong(str, j);
        }
    }

    private final void zza(TypedArray typedArray, int i, String str, String str2) {
        TypedValue peekValue;
        if (!this.zzgd.containsKey(str) && !this.zzgd.containsKey(str2) && (peekValue = typedArray.peekValue(i)) != null) {
            int i2 = peekValue.type;
            if (i2 < 28 || i2 > 31) {
                this.zzgd.putInt(str2, peekValue.resourceId);
            } else {
                this.zzgd.putInt(str, peekValue.data);
            }
        }
    }
}

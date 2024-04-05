package com.google.android.gms.wallet.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.play.core.appupdate.C15562d;

@SafeParcelable.Class(creator = "WalletFragmentOptionsCreator")
@SafeParcelable.Reserved({1})
public final class WalletFragmentOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<WalletFragmentOptions> CREATOR = new zzf();
    /* access modifiers changed from: private */
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.wallet.WalletConstants.ENVIRONMENT_PRODUCTION", getter = "getEnvironment", mo49213id = 2)
    public int environment;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.wallet.fragment.WalletFragmentMode.BUY_BUTTON", getter = "getMode", mo49213id = 5)
    public int mode;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.wallet.WalletConstants.THEME_DARK", getter = "getTheme", mo49213id = 3)
    public int theme;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getFragmentStyle", mo49213id = 4)
    public WalletFragmentStyle zzgb;

    /* renamed from: com.google.android.gms.wallet.fragment.WalletFragmentOptions$a */
    public final class C15172a {
    }

    private WalletFragmentOptions() {
        this.environment = 3;
        this.zzgb = new WalletFragmentStyle();
    }

    public static C15172a newBuilder() {
        new WalletFragmentOptions();
        return new C15172a();
    }

    public final int getEnvironment() {
        return this.environment;
    }

    public final WalletFragmentStyle getFragmentStyle() {
        return this.zzgb;
    }

    public final int getMode() {
        return this.mode;
    }

    public final int getTheme() {
        return this.theme;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, getEnvironment());
        SafeParcelWriter.writeInt(parcel, 3, getTheme());
        SafeParcelWriter.writeParcelable(parcel, 4, getFragmentStyle(), i, false);
        SafeParcelWriter.writeInt(parcel, 5, getMode());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final void zza(Context context) {
        WalletFragmentStyle walletFragmentStyle = this.zzgb;
        if (walletFragmentStyle != null) {
            walletFragmentStyle.zza(context);
        }
    }

    public static WalletFragmentOptions zza(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15562d.f35023h);
        int i = obtainStyledAttributes.getInt(0, 0);
        int i2 = obtainStyledAttributes.getInt(1, 1);
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        int i3 = obtainStyledAttributes.getInt(2, 1);
        obtainStyledAttributes.recycle();
        WalletFragmentOptions walletFragmentOptions = new WalletFragmentOptions();
        walletFragmentOptions.theme = i;
        walletFragmentOptions.environment = i2;
        WalletFragmentStyle styleResourceId = new WalletFragmentStyle().setStyleResourceId(resourceId);
        walletFragmentOptions.zzgb = styleResourceId;
        styleResourceId.zza(context);
        walletFragmentOptions.mode = i3;
        return walletFragmentOptions;
    }

    @SafeParcelable.Constructor
    public WalletFragmentOptions(@SafeParcelable.Param(mo49216id = 2) int i, @SafeParcelable.Param(mo49216id = 3) int i2, @SafeParcelable.Param(mo49216id = 4) WalletFragmentStyle walletFragmentStyle, @SafeParcelable.Param(mo49216id = 5) int i3) {
        this.environment = i;
        this.theme = i2;
        this.zzgb = walletFragmentStyle;
        this.mode = i3;
    }
}

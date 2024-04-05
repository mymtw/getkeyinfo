package com.etsy.android.config.flags;

import android.content.DialogInterface;
import com.etsy.android.stylekit.views.CollageTextInput;

/* renamed from: com.etsy.android.config.flags.b */
public final /* synthetic */ class C6344b implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ ConfigFlagsFragment f14136b;

    /* renamed from: c */
    public final /* synthetic */ String f14137c;

    /* renamed from: d */
    public final /* synthetic */ CollageTextInput f14138d;

    public /* synthetic */ C6344b(ConfigFlagsFragment configFlagsFragment, String str, CollageTextInput collageTextInput) {
        this.f14136b = configFlagsFragment;
        this.f14137c = str;
        this.f14138d = collageTextInput;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ConfigFlagsFragment.m34860showTextInputDialog$lambda2(this.f14136b, this.f14137c, this.f14138d, dialogInterface, i);
    }
}

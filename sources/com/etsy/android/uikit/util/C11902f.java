package com.etsy.android.uikit.util;

import android.content.Context;
import android.content.DialogInterface;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.uikit.util.f */
public final /* synthetic */ class C11902f implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ Context f26458b;

    /* renamed from: c */
    public final /* synthetic */ String f26459c;

    public /* synthetic */ C11902f(Context context, String str) {
        this.f26458b = context;
        this.f26459c = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context = this.f26458b;
        String str = this.f26459c;
        C19383o.m32797g(context, "$context");
        C19383o.m32797g(str, "$url");
        EtsyLinkify.m19618l(context, str);
    }
}

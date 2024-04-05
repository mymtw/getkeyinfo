package com.etsy.android.p327ui;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import kotlin.jvm.internal.C19383o;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.h0 */
public final /* synthetic */ class C9919h0 implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ UpiIntentHelper f21872b;

    /* renamed from: c */
    public final /* synthetic */ Context f21873c;

    /* renamed from: d */
    public final /* synthetic */ Uri f21874d;

    /* renamed from: e */
    public final /* synthetic */ C19846a f21875e;

    public /* synthetic */ C9919h0(UpiIntentHelper upiIntentHelper, Context context, Uri uri, C19846a aVar) {
        this.f21872b = upiIntentHelper;
        this.f21873c = context;
        this.f21874d = uri;
        this.f21875e = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        UpiIntentHelper upiIntentHelper = this.f21872b;
        Context context = this.f21873c;
        Uri uri = this.f21874d;
        C19846a aVar = this.f21875e;
        C19383o.m32797g(upiIntentHelper, "this$0");
        C19383o.m32797g(context, "$context");
        C19383o.m32797g(uri, "$uri");
        C19383o.m32797g(aVar, "$exitCheckoutCallback");
        upiIntentHelper.mo31279a(context, uri, aVar);
    }
}

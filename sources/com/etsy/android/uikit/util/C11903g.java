package com.etsy.android.uikit.util;

import android.content.DialogInterface;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: com.etsy.android.uikit.util.g */
public final /* synthetic */ class C11903g implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C19857l f26460b;

    /* renamed from: c */
    public final /* synthetic */ String f26461c;

    public /* synthetic */ C11903g(C19857l lVar, String str) {
        this.f26460b = lVar;
        this.f26461c = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C19857l lVar = this.f26460b;
        String str = this.f26461c;
        C19383o.m32797g(lVar, "$onOpenClicked");
        C19383o.m32797g(str, "$url");
        lVar.invoke(str);
    }
}

package com.usebutton.merchant;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: com.usebutton.merchant.g0 */
public final class C17487g0 {

    /* renamed from: a */
    public final Context f38247a;

    /* renamed from: b */
    public final C17499n f38248b;

    /* renamed from: com.usebutton.merchant.g0$a */
    public static class C17488a {
    }

    public C17487g0(Context context, C17502q qVar, C17488a aVar) {
        this.f38247a = context;
        this.f38248b = qVar;
    }

    /* renamed from: a */
    public final void mo68660a(String str) {
        mo68661b(new Uri.Builder().scheme("button-brand-test").authority("action-response").appendPath(str).appendQueryParameter("btn_ref", this.f38248b.mo68677b()).build());
    }

    /* renamed from: b */
    public final boolean mo68661b(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setPackage("com.usebutton.brandtest");
        intent.setFlags(536870912);
        try {
            this.f38247a.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }
}

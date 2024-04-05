package com.usebutton.merchant;

import android.content.Intent;
import android.net.Uri;
import com.braze.C5380a;
import com.usebutton.merchant.C17481e0;
import com.usebutton.merchant.C17484f0;

/* renamed from: com.usebutton.merchant.j */
public final class C17493j implements C17484f0.C17485a<C17481e0> {

    /* renamed from: a */
    public final /* synthetic */ C5380a f38254a;

    /* renamed from: b */
    public final /* synthetic */ String f38255b;

    /* renamed from: c */
    public final /* synthetic */ C17499n f38256c;

    /* renamed from: d */
    public final /* synthetic */ C17494k f38257d;

    public C17493j(C17494k kVar, C5380a aVar, String str, C17502q qVar) {
        this.f38257d = kVar;
        this.f38254a = aVar;
        this.f38255b = str;
        this.f38256c = qVar;
    }

    /* renamed from: a */
    public final void mo68657a(Exception exc) {
        this.f38257d.f38260b.execute(new C17492i(this, exc));
    }

    /* renamed from: b */
    public final void mo68658b(Object obj) {
        C17481e0 e0Var = (C17481e0) obj;
        if (this.f38257d.f38261c.get()) {
            this.f38257d.f38260b.execute(new C17483f(this));
        } else if (e0Var == null || !e0Var.f38239a || e0Var.f38240b == null) {
            this.f38257d.f38260b.execute(new C17489h(this));
        } else {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(e0Var.f38240b));
            intent.setPackage(this.f38255b);
            C17481e0.C17482a aVar = e0Var.f38241c;
            if (aVar != null) {
                this.f38257d.mo68664a(this.f38256c, aVar.f38242a);
            }
            this.f38257d.f38260b.execute(new C17486g(this, intent));
        }
    }
}

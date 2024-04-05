package p096e9;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.p013v4.media.C0072d;
import com.appboy.Constants;
import com.etsy.android.BOEApplication;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.core.EtsyApplication;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.google.android.play.core.assetpacks.C15631n0;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p291y3.C8371b;
import p291y3.C8382g;
import p350fe.C12741o;
import p478x9.C13858f;

/* renamed from: e9.a */
public final class C6758a implements C8371b.C8372a {

    /* renamed from: a */
    public final /* synthetic */ C6759b f14885a;

    public C6758a(C6759b bVar) {
        this.f14885a = bVar;
    }

    /* renamed from: a */
    public final void mo18908a(C8382g gVar) {
        C8694h hVar = this.f14885a.f14888c;
        StringBuilder h = C0072d.m201h("Bitly.Callback onResponse() ");
        h.append(gVar.f18375a);
        h.append(' ');
        h.append(gVar.f18376b);
        h.append(" App link: ");
        h.append(gVar.f18379e);
        h.append(", URL: ");
        h.append(gVar.f18378d);
        h.append(", Bitlink: ");
        h.append(gVar.f18377c);
        hVar.mo21310e(h.toString());
        int i = gVar.f18375a;
        boolean z = true;
        if (!(200 <= i && i < 300)) {
            this.f14885a.f14889d.mo45449a("Bitly error " + i + ' ' + gVar.f18376b + " for Bitlink " + gVar.f18377c);
            C6759b bVar = this.f14885a;
            String str = gVar.f18376b;
            C19383o.m32796f(str, "response.statusText");
            C6759b.m13154a(bVar, i, str, gVar.f18377c);
            return;
        }
        Context applicationContext = EtsyApplication.get().getApplicationContext();
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri parse = Uri.parse(gVar.f18378d);
        intent.setData(parse);
        intent.setFlags(268435456);
        C13858f a = C13858f.m21391a(parse);
        if (this.f14885a.f14891f.f28043a.mo21132b(C8592b.C8599g.f18883c)) {
            C12741o oVar = this.f14885a.f14890e;
            C19383o.m32796f(applicationContext, "applicationContext");
            C19383o.m32796f(parse, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
            z = oVar.mo45508a(applicationContext, parse);
        } else if (a == null) {
            z = false;
        }
        if (z) {
            intent.setClass(applicationContext, EtsyApplication.get().getDeepLinkRoutingActivity());
        }
        applicationContext.startActivity(intent);
        C6759b bVar2 = this.f14885a;
        String str2 = gVar.f18378d;
        C19383o.m32796f(str2, "response.url");
        Application application = bVar2.f14886a;
        C19383o.m32795e(application, "null cannot be cast to non-null type com.etsy.android.BOEApplication");
        ((BOEApplication) application).getAnalyticsTracker().mo21333d("opened_bitlink", C19421p.m32931U(new Pair(PredefinedAnalyticsProperty.ETSY_URL, str2)));
    }

    /* renamed from: b */
    public final void mo18909b(C15631n0 n0Var) {
        C8694h hVar = this.f14885a.f14888c;
        StringBuilder h = C0072d.m201h("Bitly.Callback onError() ");
        h.append((String) n0Var.f35248c);
        hVar.mo21306a(h.toString());
        this.f14885a.f14889d.mo45449a("Bitly error " + ((String) n0Var.f35248c) + " for " + ((String) n0Var.f35251f));
        C6759b bVar = this.f14885a;
        String str = (String) n0Var.f35248c;
        C19383o.m32796f(str, "error.errorMessage");
        C6759b.m13154a(bVar, 0, str, (String) n0Var.f35251f);
    }
}

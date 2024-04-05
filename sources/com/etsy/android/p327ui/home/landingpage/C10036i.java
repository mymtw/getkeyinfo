package com.etsy.android.p327ui.home.landingpage;

import android.net.Uri;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.homescreen.LandingPageLink;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.LandingPageKey;
import java.net.URLDecoder;
import kotlin.jvm.internal.C19383o;
import p350fe.C12729e;
import p350fe.C12730f;
import p350fe.C12731g;
import p350fe.C12741o;

/* renamed from: com.etsy.android.ui.home.landingpage.i */
public final class C10036i implements C12729e {

    /* renamed from: a */
    public final C12741o f22092a;

    public C10036i(C12741o oVar) {
        C19383o.m32797g(oVar, "routeInspector");
        this.f22092a = oVar;
    }

    /* renamed from: a */
    public final C12731g mo30554a(C12730f fVar) {
        C12741o oVar = this.f22092a;
        Uri uri = fVar.f28049b;
        oVar.getClass();
        String d = C12741o.m20404d(uri, ResponseConstants.API_PATH);
        C12741o oVar2 = this.f22092a;
        Uri uri2 = fVar.f28049b;
        oVar2.getClass();
        String d2 = C12741o.m20404d(uri2, "title");
        C12741o oVar3 = this.f22092a;
        Uri uri3 = fVar.f28049b;
        oVar3.getClass();
        String d3 = C12741o.m20404d(uri3, ResponseConstants.EVENT_NAME);
        C12741o oVar4 = this.f22092a;
        Uri uri4 = fVar.f28049b;
        oVar4.getClass();
        String d4 = C12741o.m20404d(uri4, ResponseConstants.PAGE_TYPE);
        boolean z = false;
        if (!(d == null || d.length() == 0)) {
            if (!(d2 == null || d2.length() == 0)) {
                if (!(d3 == null || d3.length() == 0)) {
                    if (d4 == null || d4.length() == 0) {
                        z = true;
                    }
                    if (!z) {
                        try {
                            return new C12731g.C12733b(new LandingPageKey(fVar.f28050c, LandingPageLink.Companion.from(URLDecoder.decode(d2, "UTF-8"), URLDecoder.decode(d, "UTF-8"), URLDecoder.decode(d4, "UTF-8"), URLDecoder.decode(d3, "UTF-8")), fVar.f28051d));
                        } catch (Exception e) {
                            return new C12731g.C12732a("Couldn't decode parameters " + fVar + ".uri " + e.getMessage());
                        }
                    }
                }
            }
        }
        return new C12731g.C12732a("Missing parameter " + fVar + ".uri");
    }
}

package com.etsy.android.p327ui.listing.fetch;

import android.support.p013v4.media.C0073e;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.network.Connectivity;
import com.etsy.android.lib.util.CrashUtil;
import com.google.android.play.core.assetpacks.C15588c1;
import com.squareup.moshi.JsonDataException;
import kotlin.jvm.internal.C19383o;
import p340ea.C12673n;
import p346fa.C12703a;
import p466vc.C13558a;
import p466vc.C13574d;

/* renamed from: com.etsy.android.ui.listing.fetch.k */
public final class C10149k {

    /* renamed from: a */
    public final C12673n f22321a;

    /* renamed from: b */
    public final C8694h f22322b;

    /* renamed from: c */
    public final Connectivity f22323c;

    /* renamed from: d */
    public final C12703a f22324d;

    /* renamed from: e */
    public final C8618c f22325e;

    public C10149k(C12673n nVar, C8694h hVar, Connectivity connectivity, C12703a aVar, C8618c cVar) {
        C19383o.m32797g(nVar, "elkLogger");
        C19383o.m32797g(hVar, "logCat");
        C19383o.m32797g(connectivity, "connectivity");
        C19383o.m32797g(aVar, "grafana");
        C19383o.m32797g(cVar, "configMap");
        this.f22321a = nVar;
        this.f22322b = hVar;
        this.f22323c = connectivity;
        this.f22324d = aVar;
        this.f22325e = cVar;
    }

    /* renamed from: a */
    public final C13574d.C13575a mo33535a(C13558a.C13567i iVar) {
        C19383o.m32797g(iVar, "event");
        String str = "Error loading API v3 Listing " + iVar.f29655a;
        Throwable th = iVar.f29656b;
        if ((th != null ? th.getMessage() : null) != null) {
            StringBuilder k = C0073e.m211k(str, " - ");
            k.append(iVar.f29656b.getMessage());
            str = k.toString();
        }
        if (iVar.f29656b instanceof JsonDataException) {
            this.f22321a.mo45449a(str);
        }
        C15588c1.m25314Y(new LogListingFetchErrorHandler$handle$1(this), 10);
        if (this.f22325e.mo21132b(C8592b.f18790f1)) {
            CrashUtil a = CrashUtil.m17307a();
            Throwable th2 = iVar.f29656b;
            if (th2 == null) {
                th2 = new GenericListingFetchError(str);
            }
            a.mo30457b(th2);
        }
        this.f22322b.mo21309d(str, iVar.f29656b);
        return C13574d.C13575a.f29662a;
    }
}

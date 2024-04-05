package com.etsy.android.lib.dagger;

import com.etsy.android.lib.logger.elk.uploading.C8684e;
import com.etsy.android.lib.logger.elk.uploading.C8688i;
import com.etsy.android.lib.network.C8727d;
import com.etsy.android.lib.network.oauth2.C8747b0;
import com.etsy.android.lib.network.oauth2.C8748c;
import com.etsy.android.lib.network.oauth2.C8750d;
import com.etsy.android.p327ui.home.editorspicks.C9924a;
import com.etsy.android.p327ui.home.editorspicks.EditorPicksRepository;
import com.etsy.android.p327ui.listing.C10156h;
import com.etsy.android.p327ui.listing.handlers.C10170j;
import com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.handlers.C10235e;
import com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel.handlers.C10507b;
import com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers.translations.C10545b;
import com.etsy.android.p327ui.listing.p329ui.sellerinfo.C10634a;
import com.etsy.android.p327ui.shop.C11199s;
import com.etsy.android.p327ui.shop.C11201t;
import com.etsy.android.p327ui.user.auth.C11480h;
import com.etsy.android.p327ui.user.auth.C11484j;
import com.etsy.android.p327ui.user.language.C11595b;
import com.etsy.android.p327ui.user.language.C11603e;
import com.etsy.android.p327ui.util.C11786n;
import com.etsy.android.uikit.nav.transactions.TransactionDataRepository;
import dagger.internal.C17555d;
import java.util.Map;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;
import p040c9.C4479c;
import p346fa.C12703a;
import p466vc.C13573c;
import p488yb.C13901c;
import p568fn.C17782b;
import p740eq.C19011a;

/* renamed from: com.etsy.android.lib.dagger.b */
public final class C8642b implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f19000a;

    /* renamed from: b */
    public final Object f19001b;

    public /* synthetic */ C8642b(Object obj, int i) {
        this.f19000a = i;
        this.f19001b = obj;
    }

    public final Object get() {
        switch (this.f19000a) {
            case 0:
                C8727d dVar = (C8727d) ((C19011a) this.f19001b).get();
                C19383o.m32797g(dVar, "retrofit");
                Object b = dVar.f19172a.mo74387b(C8747b0.class);
                C19383o.m32796f(b, "retrofit.moshiOAuth2Retr…angeEndpoint::class.java)");
                return (C8747b0) b;
            case 1:
                return new C8656o((Map) ((C19011a) this.f19001b).get());
            case 2:
                return new C8684e((C8688i) ((C19011a) this.f19001b).get());
            case 3:
                return new C8750d((C8748c) ((C19011a) this.f19001b).get());
            case 4:
                return new C13901c((C11786n) ((C19011a) this.f19001b).get());
            case 5:
                return new EditorPicksRepository((C9924a) ((C19011a) this.f19001b).get());
            case 6:
                return new C10170j((C12703a) ((C19011a) this.f19001b).get());
            case 7:
                return new C10235e((C13573c) ((C19011a) this.f19001b).get());
            case 8:
                return new C10507b((C10156h) ((C19011a) this.f19001b).get());
            case 9:
                return new C10545b((C13573c) ((C19011a) this.f19001b).get());
            case 10:
                return new C10634a((C13573c) ((C19011a) this.f19001b).get());
            case 11:
                return new C11201t((C11199s) ((C19011a) this.f19001b).get());
            case 12:
                return new C11480h((C11484j) ((C19011a) this.f19001b).get());
            case 13:
                return new C11603e((C11595b) ((C19011a) this.f19001b).get());
            default:
                ((C4479c) this.f19001b).getClass();
                C19285c<TransactionDataRepository> cVar = TransactionDataRepository.f26402b;
                TransactionDataRepository a = TransactionDataRepository.C11867a.m19552a();
                C17782b.m29841G(a);
                return a;
        }
    }
}

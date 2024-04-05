package p084d9;

import android.content.Context;
import com.etsy.android.lib.config.C8623e;
import com.etsy.android.lib.network.C8808s;
import com.etsy.android.p327ui.core.C9620h;
import com.etsy.android.p327ui.core.C9622j;
import com.etsy.android.p327ui.core.C9700n;
import com.etsy.android.p327ui.favorites.C9851f;
import com.etsy.android.p327ui.favorites.C9852g;
import com.etsy.android.p327ui.listing.C10156h;
import com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.handlers.C10231a;
import com.etsy.android.p327ui.listing.p329ui.buybox.personalization.optional.handlers.PersonalizationOptionalToggledHandler;
import com.etsy.android.p327ui.listing.p329ui.panels.faqs.handlers.C10478b;
import com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers.C10535g;
import com.etsy.android.p327ui.user.auth.C11475c;
import com.etsy.android.p327ui.user.auth.C11484j;
import dagger.internal.C17555d;
import p458uc.C13467b;
import p458uc.C13468c;
import p459ud.C13486i;
import p459ud.C13490k;
import p466vc.C13573c;
import p496za.C13943a;
import p740eq.C19011a;

/* renamed from: d9.b */
public final class C6672b implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f14725a;

    /* renamed from: b */
    public final C19011a f14726b;

    public /* synthetic */ C6672b(C19011a aVar, int i) {
        this.f14725a = i;
        this.f14726b = aVar;
    }

    public final Object get() {
        switch (this.f14725a) {
            case 0:
                return new C6671a((Context) this.f14726b.get());
            case 1:
                return new C8808s((C13943a) this.f14726b.get());
            case 2:
                return new C9620h((C9622j) this.f14726b.get());
            case 3:
                return new C9852g((C9851f) this.f14726b.get());
            case 4:
                return new C13468c((C13467b) this.f14726b.get());
            case 5:
                return new C10156h((C8623e) this.f14726b.get());
            case 6:
                return new C10231a((C9700n) this.f14726b.get());
            case 7:
                return new PersonalizationOptionalToggledHandler((C13573c) this.f14726b.get());
            case 8:
                return new C10478b((C13573c) this.f14726b.get());
            case 9:
                return new C10535g((C13573c) this.f14726b.get());
            case 10:
                return new C13490k((C13486i) this.f14726b.get());
            default:
                return new C11475c((C11484j) this.f14726b.get());
        }
    }
}

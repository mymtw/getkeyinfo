package p425q9;

import androidx.compose.animation.C0391c;
import androidx.compose.animation.C0472h;
import androidx.lifecycle.C2895z;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.lib.models.GiftCardDesigns;
import com.etsy.android.lib.models.apiv3.inappnotifications.IANTooltips;
import com.etsy.android.p327ui.C10677n;
import com.etsy.android.p327ui.core.listinggallery.buyitnow.C9649b;
import com.etsy.android.p327ui.core.listinggallery.buyitnow.C9655c;
import com.etsy.android.p327ui.core.listinggallery.buyitnow.C9666g;
import com.etsy.android.p327ui.giftcards.GiftCardCreateFragment;
import com.etsy.android.p327ui.search.listingresults.SearchResultsListingsFragment;
import com.etsy.android.p327ui.search.p330v2.SearchOptions;
import com.etsy.android.p327ui.shop.C11307x0;
import com.etsy.android.p327ui.user.addresses.AddressDetailViewModel;
import com.etsy.android.p327ui.user.addresses.C11463z;
import com.etsy.android.p327ui.user.privacy.C11622b;
import com.etsy.android.util.C12059p;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.functions.Consumer;
import p145io.reactivex.internal.functions.Functions;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.C19211l;
import p248tp.C8071s;
import p402n9.C13089i;
import p418pa.C13198d;
import p418pa.C13203e;
import p470w9.C13793a;
import p499zd.C13950a;
import p499zd.C13957e;
import retrofit2.C20145v;

/* renamed from: q9.n */
public final /* synthetic */ class C13263n implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ int f29131b;

    /* renamed from: c */
    public final /* synthetic */ Object f29132c;

    public /* synthetic */ C13263n(Object obj, int i) {
        this.f29131b = i;
        this.f29132c = obj;
    }

    public final void accept(Object obj) {
        switch (this.f29131b) {
            case 0:
                C8694h hVar = ((C13265p) this.f29132c).f29145k;
                hVar.mo21312f("Facebook.setAutoLogAppEventsEnabled: " + ((Boolean) obj));
                return;
            case 1:
                C10677n nVar = (C10677n) this.f29132c;
                Long l = (Long) obj;
                C19383o.m32797g(nVar, "this$0");
                C8071s<C20145v<IANTooltips>> a = nVar.f23520j.f25902a.mo31306a();
                C11307x0 x0Var = new C11307x0(1);
                a.getClass();
                nVar.f23530t.mo19403b(C0391c.m1056b(nVar.f23515e, C0472h.m1243e(nVar.f23515e, new C19211l(new C19208j(a, x0Var), new C13793a(4)))).mo20658g(new C13089i(nVar, 3), Functions.f28541e));
                return;
            case 2:
                C9666g gVar = (C9666g) this.f29132c;
                Throwable th = (Throwable) obj;
                C19383o.m32797g(gVar, "this$0");
                gVar.f21411d.setValue(C9649b.C9650a.f21369a);
                gVar.f21413f.setValue(new C12059p(new C9655c.C9658c()));
                return;
            case 3:
                GiftCardCreateFragment.m34987requestGiftCardDesigns$lambda2((GiftCardCreateFragment) this.f29132c, (GiftCardDesigns) obj);
                return;
            case 4:
                C13957e eVar = (C13957e) this.f29132c;
                Throwable th2 = (Throwable) obj;
                C19383o.m32797g(eVar, "this$0");
                C2895z<C13950a> zVar = eVar.f30689n;
                C19383o.m32796f(th2, "it");
                zVar.postValue(new C13950a.C13951a(eVar.mo46777b(th2)));
                LogCatKt.m17045a().mo21309d("Error during sign in.", th2);
                return;
            case 5:
                SearchResultsListingsFragment.m35043onCreateView$lambda2((SearchResultsListingsFragment) this.f29132c, (SearchOptions) obj);
                return;
            case 6:
                AddressDetailViewModel addressDetailViewModel = (AddressDetailViewModel) this.f29132c;
                C11463z zVar2 = (C11463z) obj;
                C19383o.m32797g(addressDetailViewModel, "this$0");
                addressDetailViewModel.f25054f.postValue(AddressDetailViewModel.C11361a.C11363b.f25062a);
                return;
            default:
                C11622b bVar = (C11622b) this.f29132c;
                C13198d.C13199a aVar = (C13198d.C13199a) obj;
                C19383o.m32797g(bVar, "this$0");
                if (C19383o.m32792b(aVar, C13198d.C13199a.C13202c.f29038a)) {
                    return;
                }
                if (C19383o.m32792b(aVar, C13198d.C13199a.C13201b.f29037a)) {
                    bVar.f25728f.setValue(C13203e.C13205b.f29040a);
                    return;
                } else if (C19383o.m32792b(aVar, C13198d.C13199a.C13200a.f29036a)) {
                    bVar.f25728f.setValue(C13203e.C13204a.f29039a);
                    return;
                } else {
                    return;
                }
        }
    }
}

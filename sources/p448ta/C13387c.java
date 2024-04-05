package p448ta;

import androidx.lifecycle.C2895z;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.lib.models.GiftCardAmounts;
import com.etsy.android.lib.models.apiv3.CountryToRegionMap;
import com.etsy.android.p327ui.C10677n;
import com.etsy.android.p327ui.cart.saved.C9336a;
import com.etsy.android.p327ui.cart.saved.C9343d;
import com.etsy.android.p327ui.giftcards.GiftCardCreateFragment;
import com.etsy.android.p327ui.navigation.bottom.C10682d;
import com.etsy.android.p327ui.shop.C11127a0;
import com.etsy.android.util.C12060q;
import com.etsy.android.vespa.VespaBaseFragment;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.functions.Consumer;
import p499zd.C13950a;
import p499zd.C13957e;

/* renamed from: ta.c */
public final /* synthetic */ class C13387c implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ int f29318b;

    /* renamed from: c */
    public final /* synthetic */ Object f29319c;

    public /* synthetic */ C13387c(Object obj, int i) {
        this.f29318b = i;
        this.f29319c = obj;
    }

    public final void accept(Object obj) {
        switch (this.f29318b) {
            case 0:
                C13388d dVar = (C13388d) this.f29319c;
                C19383o.m32797g(dVar, "this$0");
                dVar.f29321b = (CountryToRegionMap) obj;
                return;
            case 1:
                C10677n nVar = (C10677n) this.f29319c;
                C10682d dVar2 = (C10682d) obj;
                C19383o.m32797g(nVar, "this$0");
                C19383o.m32797g(dVar2, "badgeState");
                nVar.f23525o.postValue(dVar2);
                return;
            case 2:
                C9336a aVar = (C9336a) this.f29319c;
                C9343d.C9345b bVar = (C9343d.C9345b) obj;
                C19383o.m32797g(aVar, "this$0");
                C19383o.m32796f(bVar, "result");
                if (bVar instanceof C9343d.C9345b.C9347b) {
                    C12060q.m19870a(aVar.f20618g, new C9336a.C9337a.C9339b(((C9343d.C9345b.C9347b) bVar).f20629a));
                    return;
                } else if (bVar instanceof C9343d.C9345b.C9346a) {
                    C12060q.m19870a(aVar.f20618g, C9336a.C9337a.C9338a.f20620a);
                    return;
                } else {
                    return;
                }
            case 3:
                GiftCardCreateFragment.m34985requestGiftCardAmounts$lambda4((GiftCardCreateFragment) this.f29319c, (GiftCardAmounts) obj);
                return;
            case 4:
                C13957e eVar = (C13957e) this.f29319c;
                Throwable th = (Throwable) obj;
                C19383o.m32797g(eVar, "this$0");
                C2895z<C13950a> zVar = eVar.f30689n;
                C19383o.m32796f(th, "it");
                zVar.postValue(new C13950a.C13951a(eVar.mo46777b(th)));
                LogCatKt.m17045a().mo21309d("Error during sign in.", th);
                return;
            case 5:
                C11127a0 a0Var = (C11127a0) this.f29319c;
                Object obj2 = C11127a0.f24612m;
                a0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    a0Var.notifyDataSetChanged();
                    return;
                }
                return;
            default:
                ((VespaBaseFragment) this.f29319c).lambda$onLoadContent$3((Throwable) obj);
                return;
        }
    }
}

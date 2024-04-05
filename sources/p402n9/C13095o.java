package p402n9;

import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.p327ui.cart.MultiShopCartFragment;
import com.etsy.android.p327ui.home.home.C10001h;
import com.etsy.android.p327ui.home.home.C9998g;
import com.etsy.android.p327ui.home.home.HomeViewModel;
import com.etsy.android.p327ui.search.filters.C10767e;
import com.etsy.android.p327ui.user.C11766y;
import com.etsy.android.p327ui.user.ReceiptFragment;
import com.etsy.android.p327ui.user.auth.C11481i;
import com.etsy.android.uikit.p331ui.favorites.HeartMonitor;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.flow.StateFlowImpl;
import p145io.reactivex.functions.Consumer;
import p400mf.C13074b;
import p400mf.C13078c;

/* renamed from: n9.o */
public final /* synthetic */ class C13095o implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ int f28791b;

    /* renamed from: c */
    public final /* synthetic */ Object f28792c;

    public /* synthetic */ C13095o(Object obj, int i) {
        this.f28791b = i;
        this.f28792c = obj;
    }

    public final void accept(Object obj) {
        Object value;
        switch (this.f28791b) {
            case 0:
                ((C13097q) this.f28792c).f28795b.mo45474a("braze.changeuser_exception");
                LogCatKt.m17045a().error((Throwable) obj);
                return;
            case 1:
                MultiShopCartFragment.m34920performActionWithToast$lambda20((MultiShopCartFragment) this.f28792c, (Throwable) obj);
                return;
            case 2:
                HomeViewModel homeViewModel = (HomeViewModel) this.f28792c;
                C11481i iVar = (C11481i) obj;
                homeViewModel.getClass();
                if ((iVar instanceof C11481i.C11483b) && (!homeViewModel.f21985j.mo45960e())) {
                    StateFlowImpl stateFlowImpl = homeViewModel.f21986k;
                    C9998g.C9999a aVar = new C9998g.C9999a(((C11481i.C11483b) iVar).f25333a);
                    do {
                        value = stateFlowImpl.getValue();
                    } while (!stateFlowImpl.mo72337i(value, ((C10001h) value).mo33234a(aVar)));
                    return;
                }
                return;
            case 3:
                ((C10767e) this.f28792c).mo35746j((Throwable) obj);
                return;
            case 4:
                ((ReceiptFragment) this.f28792c).onGetReceiptPostExecute((C11766y) obj);
                return;
            default:
                HeartMonitor heartMonitor = (HeartMonitor) this.f28792c;
                C13074b bVar = (C13074b) obj;
                C19383o.m32797g(heartMonitor, "this$0");
                C13078c cVar = heartMonitor.f26448b;
                C19383o.m32796f(bVar, "heartUpdate");
                cVar.mo31411a(bVar);
                return;
        }
    }
}

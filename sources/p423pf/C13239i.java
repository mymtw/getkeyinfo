package p423pf;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.logger.referrers.Referrer;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.lib.models.apiv3.vespa.UserAction;
import com.etsy.android.p327ui.cart.C9333r;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p415of.C13171a;
import p415of.C13182k;
import p423pf.C13236g;
import p753kq.C19846a;

/* renamed from: pf.i */
public final class C13239i extends C13171a<UserAction> {

    /* renamed from: d */
    public final View f29084d;

    /* renamed from: e */
    public final C13182k f29085e;

    /* renamed from: f */
    public final C19846a<C19394m> f29086f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13239i(Fragment fragment, View view, C8703p pVar, C9333r rVar, C19846a aVar) {
        super(fragment, pVar);
        C19383o.m32797g(pVar, "viewTracker");
        C19383o.m32797g(rVar, "actionDelegate");
        this.f29084d = view;
        this.f29085e = rVar;
        this.f29086f = aVar;
    }

    /* renamed from: d */
    public final Map<AnalyticsProperty, Object> mo45938d() {
        return mo45889a() != null ? C19421p.m32931U(new Pair(PredefinedAnalyticsProperty.REFERRER, new Referrer("cart/kebab menu").toString())) : C19294b0.m32559p0();
    }

    /* renamed from: e */
    public final void mo31328c(UserAction userAction) {
        C19383o.m32797g(userAction, "data");
        Fragment a = mo45889a();
        C8703p pVar = this.f28980b;
        C13182k kVar = this.f29085e;
        C19383o.m32797g(pVar, "viewTracker");
        new WeakReference(a);
        View view = this.f29084d;
        if (view != null) {
            ServerDrivenAction serverDrivenAction = (ServerDrivenAction) userAction;
            if (kVar != null) {
                kVar.performAction(C13236g.C13237a.m20892a(view), serverDrivenAction);
            }
        }
        String type = userAction.getType();
        int hashCode = type.hashCode();
        if (hashCode != -682110792) {
            if (hashCode == 1277887413 && type.equals(UserAction.TYPE_CONTACT_SHOP)) {
                this.f28980b.mo21333d("contact_shop_clicked", (Map<? extends AnalyticsProperty, Object>) null);
            }
        } else if (type.equals(UserAction.TYPE_SINGLE_SHOP_CHECKOUT)) {
            this.f28980b.mo21333d("single_shop_checkout_clicked", mo45938d());
        }
    }
}

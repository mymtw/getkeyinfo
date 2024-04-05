package p114g4;

import android.view.View;
import com.braze.models.inappmessage.C5485c;
import com.braze.p044ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener;
import com.braze.support.BrazeLogger;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.p327ui.cart.clicklisteners.C9282g;
import com.etsy.android.p327ui.cart.viewholders.C9388j;
import com.etsy.android.p327ui.search.filters.refactor.SearchFiltersFragment;
import com.etsy.android.p327ui.search.savedsearch.SavedSearchEmailPromptFragment;
import com.etsy.android.stylekit.views.CollageRadioButton;
import com.etsy.android.stylekit.views.ratings.CollageRatingButtons;
import com.paypal.android.platform.authsdk.otplogin.p533ui.login.OtpLoginFragment;
import kotlin.jvm.internal.C19383o;

/* renamed from: g4.e */
public final /* synthetic */ class C6865e implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f15188b;

    /* renamed from: c */
    public final /* synthetic */ Object f15189c;

    public /* synthetic */ C6865e(Object obj, int i) {
        this.f15188b = i;
        this.f15189c = obj;
    }

    public final void onClick(View view) {
        switch (this.f15188b) {
            case 0:
                C6869i iVar = (C6869i) this.f15189c;
                C5485c cVar = (C5485c) iVar.f15197b;
                if (cVar.mo16017X().isEmpty()) {
                    BrazeLogger.m11285g(C6869i.f15195o, "Cannot create button click listener since this in-app message does not have message buttons.");
                    return;
                }
                for (int i = 0; i < iVar.f15206k.size(); i++) {
                    if (view.getId() == iVar.f15206k.get(i).getId()) {
                        ((DefaultInAppMessageViewLifecycleListener) iVar.f15198c).mo16322f(iVar.f15202g, cVar.mo16017X().get(i), cVar);
                        return;
                    }
                }
                return;
            case 1:
                CollageRadioButton.m34893setOnCheckListener$lambda1((CollageRadioButton) this.f15189c, view);
                return;
            case 2:
                CollageRatingButtons.m34910_init_$lambda4((CollageRatingButtons) this.f15189c, view);
                return;
            case 3:
                C9388j jVar = (C9388j) this.f15189c;
                int i2 = C9388j.f20789f;
                C19383o.m32797g(jVar, "this$0");
                Object tag = jVar.f20791d.getTag(R.id.tag_alert_dismiss);
                ServerDrivenAction serverDrivenAction = tag instanceof ServerDrivenAction ? (ServerDrivenAction) tag : null;
                if (serverDrivenAction != null) {
                    C9282g gVar = jVar.f20790c;
                    View view2 = jVar.itemView;
                    C19383o.m32796f(view2, "itemView");
                    gVar.mo45936d(view2, serverDrivenAction);
                    return;
                }
                return;
            case 4:
                SearchFiltersFragment.m35036onViewCreated$lambda2((SearchFiltersFragment) this.f15189c, view);
                return;
            case 5:
                SavedSearchEmailPromptFragment.m35047onCreateView$lambda1((SavedSearchEmailPromptFragment) this.f15189c, view);
                return;
            default:
                OtpLoginFragment.m35133onViewCreated$lambda7((OtpLoginFragment) this.f15189c, view);
                return;
        }
    }
}

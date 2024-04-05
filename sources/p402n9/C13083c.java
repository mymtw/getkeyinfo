package p402n9;

import android.support.p013v4.media.C0072d;
import com.etsy.android.R;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.apiv3.OfferingOption;
import com.etsy.android.lib.models.apiv3.OfferingSelect;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.lib.network.oauth2.C8752e;
import com.etsy.android.lib.network.oauth2.OAuth2AuthenticationException;
import com.etsy.android.lib.util.CrashUtil;
import com.etsy.android.p327ui.cart.C9311i;
import com.etsy.android.p327ui.cart.C9326n;
import com.etsy.android.p327ui.cart.MultiShopCartFragment;
import com.etsy.android.p327ui.cart.bottomsheets.SelectVariationWorkflow;
import com.etsy.android.p327ui.user.ReceiptFragment;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.functions.Consumer;
import p340ea.C12673n;

/* renamed from: n9.c */
public final /* synthetic */ class C13083c implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ int f28761b;

    /* renamed from: c */
    public final /* synthetic */ Object f28762c;

    public /* synthetic */ C13083c(Object obj, int i) {
        this.f28761b = i;
        this.f28762c = obj;
    }

    public final void accept(Object obj) {
        switch (this.f28761b) {
            case 0:
                Throwable th = (Throwable) obj;
                ((C13084d) this.f28762c).f28764b.mo45474a("braze.fcmtoken_exception");
                CrashUtil.m17307a().mo30458c(new Throwable("Problem with Braze and FCM token", th), C8592b.C8595c.f18857a);
                LogCatKt.m17045a().error(th);
                return;
            case 1:
                C8752e eVar = (C8752e) this.f28762c;
                C19383o.m32797g(eVar, "this$0");
                OAuth2AuthenticationException oAuth2AuthenticationException = new OAuth2AuthenticationException("Error while exchanging auth code for access token.", (Throwable) obj);
                LogCatKt.m17045a().error(oAuth2AuthenticationException);
                CrashUtil.m17307a().mo30457b(oAuth2AuthenticationException);
                eVar.f19237d.mo45474a("oauth2_android_error.auth_code_exchange_failed");
                return;
            case 2:
                MultiShopCartFragment.m34914loadCartPage$lambda8((MultiShopCartFragment) this.f28762c, (C9326n) obj);
                return;
            case 3:
                SelectVariationWorkflow selectVariationWorkflow = (SelectVariationWorkflow) this.f28762c;
                C9311i iVar = (C9311i) obj;
                C19383o.m32797g(selectVariationWorkflow, "this$0");
                C19383o.m32797g(iVar, "result");
                if (iVar instanceof C9311i.C9313b) {
                    CartGroupItem cartGroupItem = ((C9311i.C9313b) iVar).f20581a;
                    if (cartGroupItem != null) {
                        BaseModel data = cartGroupItem.getData();
                        C19383o.m32795e(data, "null cannot be cast to non-null type com.etsy.android.lib.models.apiv3.OfferingSelect");
                        OfferingSelect offeringSelect = (OfferingSelect) data;
                        String prompt = offeringSelect.getPrompt();
                        C19383o.m32796f(prompt, "offeringSelect.prompt");
                        SelectVariationWorkflow.C9248b bVar = selectVariationWorkflow.f20425g;
                        if (bVar instanceof SelectVariationWorkflow.C9248b.C9251c) {
                            List<OfferingOption> options = offeringSelect.getOptions();
                            C19383o.m32796f(options, "offeringSelect.options");
                            selectVariationWorkflow.f20425g = new SelectVariationWorkflow.C9248b.C9249a(prompt, options, cartGroupItem);
                            List<OfferingOption> options2 = offeringSelect.getOptions();
                            C19383o.m32796f(options2, "offeringSelect.options");
                            selectVariationWorkflow.mo31557e(prompt, options2);
                            return;
                        } else if (bVar instanceof SelectVariationWorkflow.C9248b.C9252d) {
                            List<OfferingOption> options3 = offeringSelect.getOptions();
                            C19383o.m32796f(options3, "offeringSelect.options");
                            selectVariationWorkflow.f20425g = new SelectVariationWorkflow.C9248b.C9253e(prompt, options3, cartGroupItem);
                            List<OfferingOption> options4 = offeringSelect.getOptions();
                            C19383o.m32796f(options4, "offeringSelect.options");
                            selectVariationWorkflow.mo31557e(prompt, options4);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        selectVariationWorkflow.mo31556d(R.string.variations_none_found);
                        return;
                    }
                } else if (iVar instanceof C9311i.C9312a) {
                    C12673n nVar = selectVariationWorkflow.f20422d;
                    StringBuilder h = C0072d.m201h("Select variation failed with error: ");
                    C9311i.C9312a aVar = (C9311i.C9312a) iVar;
                    Throwable th2 = aVar.f20579a;
                    h.append(th2 != null ? th2.getMessage() : null);
                    h.append(" and message: ");
                    h.append(aVar.f20580b);
                    nVar.mo45449a(h.toString());
                    selectVariationWorkflow.mo31556d(R.string.whoops_somethings_wrong);
                    return;
                } else {
                    return;
                }
            default:
                ((ReceiptFragment) this.f28762c).lambda$getReceipt$5((Throwable) obj);
                return;
        }
    }
}

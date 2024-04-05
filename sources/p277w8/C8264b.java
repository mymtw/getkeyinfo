package p277w8;

import com.etsy.android.R;
import com.etsy.android.feedback.FeedbackViewModel;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.useraction.UserActionBus;
import com.etsy.android.p327ui.cart.MultiShopCartFragment;
import com.etsy.android.p327ui.cart.bottomsheets.SelectVariationWorkflow;
import com.etsy.android.p327ui.feedback.AppFeedbackView;
import com.etsy.android.p327ui.user.AddToCartResponse;
import com.etsy.android.p327ui.user.ReceiptFragment;
import com.etsy.android.util.C12043f;
import com.etsy.android.vespa.VespaBaseFragment;
import com.jakewharton.rxbinding2.widget.C17025m;
import java.util.Locale;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.functions.Consumer;
import p359ha.C12799a;

/* renamed from: w8.b */
public final /* synthetic */ class C8264b implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ int f18102b;

    /* renamed from: c */
    public final /* synthetic */ Object f18103c;

    public /* synthetic */ C8264b(Object obj, int i) {
        this.f18102b = i;
        this.f18103c = obj;
    }

    public final void accept(Object obj) {
        switch (this.f18102b) {
            case 0:
                C8267e eVar = (C8267e) this.f18103c;
                C19383o.m32797g(eVar, "this$0");
                eVar.f18108a.error((Throwable) obj);
                return;
            case 1:
                FeedbackViewModel feedbackViewModel = (FeedbackViewModel) this.f18103c;
                Throwable th = (Throwable) obj;
                C19383o.m32797g(feedbackViewModel, "this$0");
                feedbackViewModel.f14275m.postValue(FeedbackViewModel.C6440b.C6441a.f14291a);
                return;
            case 2:
                ((C8694h) this.f18103c).error((Throwable) obj);
                return;
            case 3:
                C12799a aVar = (C12799a) this.f18103c;
                C19383o.m32797g(aVar, "this$0");
                Locale forLanguageTag = Locale.forLanguageTag((String) obj);
                C19383o.m32796f(forLanguageTag, "forLanguageTag(it)");
                aVar.f28272a.mo58990a("detected_region", forLanguageTag.getCountry());
                return;
            case 4:
                UserActionBus userActionBus = (UserActionBus) this.f18103c;
                Throwable th2 = (Throwable) obj;
                byte[] bArr = UserActionBus.f19585f;
                C19383o.m32797g(userActionBus, "this$0");
                userActionBus.f19590e.mo45474a("user_action.convert_db_model_to_json_body_error");
                return;
            case 5:
                MultiShopCartFragment.m34915loadCartPage$lambda9((MultiShopCartFragment) this.f18103c, (Throwable) obj);
                return;
            case 6:
                SelectVariationWorkflow selectVariationWorkflow = (SelectVariationWorkflow) this.f18103c;
                Throwable th3 = (Throwable) obj;
                C19383o.m32797g(selectVariationWorkflow, "this$0");
                selectVariationWorkflow.mo31556d(R.string.whoops_somethings_wrong);
                return;
            case 7:
                AppFeedbackView.m34982focus$lambda0((AppFeedbackView) this.f18103c, (C17025m) obj);
                return;
            case 8:
                ((ReceiptFragment) this.f18103c).lambda$onBuyThisAgainClick$2((AddToCartResponse) obj);
                return;
            case 9:
                C12043f fVar = (C12043f) this.f18103c;
                C19383o.m32797g(fVar, "this$0");
                fVar.f26844b.mo45474a("appsflyer.privacy_error");
                fVar.f26843a.error((Throwable) obj);
                return;
            default:
                ((VespaBaseFragment) this.f18103c).lambda$performAction$5((Throwable) obj);
                return;
        }
    }
}

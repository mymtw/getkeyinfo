package p306z8;

import androidx.lifecycle.C2895z;
import com.etsy.android.config.ConfigPreferencesHelper;
import com.etsy.android.lib.config.C8591a;
import com.etsy.android.lib.network.Connectivity;
import com.etsy.android.lib.network.Connectivity$networkCallback$1;
import com.etsy.android.p327ui.conversation.details.C9477c;
import com.etsy.android.p327ui.conversation.details.ccm.C9510o;
import com.etsy.android.p327ui.conversation.details.models.ConversationResponse;
import com.etsy.android.p327ui.conversation.details.models.Message;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.NativeBuyItNowCheckoutContainerFragment;
import com.etsy.android.p327ui.shop.ShopHomeFragment;
import com.etsy.android.p327ui.user.privacy.C11622b;
import com.etsy.android.util.C12043f;
import com.etsy.android.util.C12059p;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.functions.Consumer;
import p348fc.C12715a;
import p354gc.C12764c;
import p418pa.C13203e;

/* renamed from: z8.g */
public final /* synthetic */ class C8480g implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ int f18506b;

    /* renamed from: c */
    public final /* synthetic */ Object f18507c;

    public /* synthetic */ C8480g(Object obj, int i) {
        this.f18506b = i;
        this.f18507c = obj;
    }

    public final void accept(Object obj) {
        switch (this.f18506b) {
            case 0:
                ConfigPreferencesHelper.m34850setUpWipeLogsPreference$lambda10$lambda9((ConfigPreferencesHelper) this.f18507c, (Integer) obj);
                return;
            case 1:
                List<String> list = C8591a.f18700r;
                ((C8591a) this.f18507c).getClass();
                C8591a.m16994g((Throwable) obj);
                return;
            case 2:
                Connectivity$networkCallback$1.m34866onAvailable$lambda1$lambda0((Connectivity) this.f18507c, (Long) obj);
                return;
            case 3:
                C9510o oVar = (C9510o) this.f18507c;
                ConversationResponse conversationResponse = (ConversationResponse) obj;
                C19383o.m32797g(oVar, "this$0");
                C9477c cVar = oVar.f21087b;
                C19383o.m32796f(conversationResponse, "conversation");
                C12715a b = C12764c.m20411b(conversationResponse);
                List<Message> list2 = conversationResponse.f21174c.f21212c;
                ArrayList arrayList = new ArrayList(C19322o.m32624F0(list2));
                for (Message c : list2) {
                    arrayList.add(C12764c.m20412c(c));
                }
                cVar.mo31977i(b, arrayList);
                return;
            case 4:
                NativeBuyItNowCheckoutContainerFragment.m35009onViewCreated$lambda1((NativeBuyItNowCheckoutContainerFragment) this.f18507c, (C12059p) obj);
                return;
            case 5:
                ((ShopHomeFragment) this.f18507c).lambda$onNewListingsResponse$6((List) obj);
                return;
            case 6:
                C11622b bVar = (C11622b) this.f18507c;
                List list3 = (List) obj;
                C19383o.m32797g(bVar, "this$0");
                C2895z<C13203e> zVar = bVar.f25728f;
                C19383o.m32796f(list3, "it");
                zVar.setValue(new C13203e.C13206c(list3));
                return;
            default:
                C12043f fVar = (C12043f) this.f18507c;
                C19383o.m32797g(fVar, "this$0");
                fVar.f26843a.error((Throwable) obj);
                fVar.f26844b.mo45474a("appsflyer.post_fail");
                return;
        }
    }
}

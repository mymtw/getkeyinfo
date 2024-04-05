package p423pf;

import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.etsy.android.lib.core.EtsyApplication;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.homescreen.MessageCard;
import kotlin.jvm.internal.C19383o;
import p415of.C13171a;
import p628nj.C18263b;

/* renamed from: pf.f */
public final class C13235f extends C13171a<MessageCard> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13235f(Fragment fragment, C8703p pVar) {
        super(fragment, pVar);
        C19383o.m32797g(pVar, "viewTracker");
    }

    /* renamed from: c */
    public final void mo31328c(Object obj) {
        MessageCard messageCard = (MessageCard) obj;
        Fragment a = mo45889a();
        if (messageCard != null && a != null && C18263b.m30837c0(messageCard.getDeepLinkUrl())) {
            Intent intent = new Intent(a.requireActivity(), EtsyApplication.get().getDeepLinkRoutingActivity());
            intent.setData(Uri.parse(messageCard.getDeepLinkUrl()));
            a.requireActivity().startActivity(intent);
        }
    }
}

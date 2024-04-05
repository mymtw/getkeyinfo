package p361hc;

import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.models.MoshiModelFactory;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.cart.SingleListingCart;
import com.etsy.android.lib.models.apiv3.sdl.FormattedListingCard;
import com.etsy.android.lib.models.apiv3.sdl.ListSection;
import com.etsy.android.uikit.viewholder.ListingCardUiModel;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.C19928a0;
import p287xp.C8339g;
import p342ed.C12683b;
import p459ud.C13487j;
import retrofit2.C20145v;

/* renamed from: hc.b */
public final /* synthetic */ class C12810b implements C8339g {

    /* renamed from: b */
    public final /* synthetic */ int f28295b;

    public /* synthetic */ C12810b(int i) {
        this.f28295b = i;
    }

    public final Object apply(Object obj) {
        T t;
        switch (this.f28295b) {
            case 0:
                C20145v vVar = (C20145v) obj;
                C19383o.m32797g(vVar, "it");
                C19928a0 a0Var = (C19928a0) vVar.f44615b;
                return (SingleListingCart) (a0Var != null ? MoshiModelFactory.createFromByteArray(a0Var.mo72841a(), SingleListingCart.class) : null);
            case 1:
                C20145v vVar2 = (C20145v) obj;
                C19383o.m32797g(vVar2, ResponseConstants.RESPONSE);
                return (!vVar2.mo74384a() || (t = vVar2.f44615b) == null) ? new C12683b.C12690c.C12691a() : new C12683b.C12690c.C12692b((List) t);
            case 2:
                C13487j jVar = (C13487j) obj;
                C19383o.m32797g(jVar, "result");
                if (jVar instanceof C13487j.C13489b) {
                    for (ListSection formattedListingCards : ((C13487j.C13489b) jVar).f29518a.getList()) {
                        List<FormattedListingCard> formattedListingCards2 = formattedListingCards.getFormattedListingCards();
                        if (formattedListingCards2 != null) {
                            for (FormattedListingCard formattedListingCard : formattedListingCards2) {
                                formattedListingCard.setCard(new ListingCardUiModel(formattedListingCard.getCard(), true, false, false, 8, (DefaultConstructorMarker) null));
                            }
                        }
                    }
                }
                return jVar;
            default:
                C8618c cVar = (C8618c) obj;
                C19383o.m32797g(cVar, "configMap");
                return Boolean.valueOf(cVar.mo21132b(C8592b.f18786e0));
        }
    }
}

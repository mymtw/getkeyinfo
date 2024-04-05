package p472wb;

import android.os.Bundle;
import com.etsy.android.lib.deeplinks.EtsyAction;
import com.etsy.android.lib.models.apiv3.ShopCard;
import p400mf.C13074b;
import p400mf.C13078c;
import p415of.C13186o;
import p568fn.C17782b;

/* renamed from: wb.e */
public final /* synthetic */ class C13807e implements C13078c {

    /* renamed from: a */
    public final /* synthetic */ C13808f f30418a;

    public /* synthetic */ C13807e(C13808f fVar) {
        this.f30418a = fVar;
    }

    /* renamed from: a */
    public final void mo31411a(C13074b bVar) {
        C13808f fVar = this.f30418a;
        fVar.getClass();
        Bundle M = C17782b.m29847M(bVar);
        if (bVar instanceof C13074b.C13077c) {
            String string = M.getString("id");
            if (string != null) {
                if (fVar.f30420j.size() == 0) {
                    for (int i = 0; i < fVar.mItems.size(); i++) {
                        C13186o oVar = (C13186o) fVar.mItems.get(i);
                        if (oVar != null && (oVar instanceof ShopCard)) {
                            ShopCard shopCard = (ShopCard) oVar;
                            fVar.f30420j.put(shopCard.getUserId().toString(), Integer.valueOf(i));
                            if (shopCard.getUserId().getId().equals(string)) {
                                shopCard.setIsFavorite(M.getBoolean(EtsyAction.STATE_FAVORITE));
                                fVar.notifyItemChanged(i);
                            }
                        }
                    }
                } else if (fVar.f30420j.containsKey(string)) {
                    int intValue = fVar.f30420j.get(string).intValue();
                    ShopCard shopCard2 = (ShopCard) fVar.mItems.get(intValue);
                    boolean z = M.getBoolean(EtsyAction.STATE_FAVORITE);
                    if (shopCard2 != null) {
                        shopCard2.setIsFavorite(z);
                        fVar.notifyItemChanged(intValue);
                    }
                }
            }
        } else if (bVar instanceof C13074b.C13076b) {
            fVar.mo46661q(M);
        } else if (bVar instanceof C13074b.C13075a) {
            fVar.mo46661q(M);
        }
    }
}

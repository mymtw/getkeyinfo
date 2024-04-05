package p338df;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.fragment.app.Fragment;
import com.etsy.android.lib.currency.EtsyMoney;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.apiv3.listing.LightWeightListingLike;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.apiv3.vespa.UserAction;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.navigation.keys.bottomsheetkeys.AddToListBottomSheetKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ReportListingKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ShopHomeKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.SimilarListingsKey;
import com.etsy.android.p327ui.shop.ShopHomeConfig;
import com.etsy.android.p327ui.util.C11786n;
import com.etsy.android.vespa.VespaBottomSheetDialog;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p001a0.C0005b;
import p356ge.C12790b;
import p415of.C13171a;
import p472wb.C13810g;

/* renamed from: df.c */
public final class C12652c extends C13171a<UserAction> {

    /* renamed from: d */
    public final /* synthetic */ Fragment f27900d;

    /* renamed from: e */
    public final /* synthetic */ C12653d f27901e;

    /* renamed from: f */
    public final /* synthetic */ C12654e f27902f;

    /* renamed from: g */
    public final /* synthetic */ VespaBottomSheetDialog f27903g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12652c(Fragment fragment, C8703p pVar, C12653d dVar, C12654e eVar, VespaBottomSheetDialog vespaBottomSheetDialog) {
        super(fragment, pVar);
        this.f27900d = fragment;
        this.f27901e = dVar;
        this.f27902f = eVar;
        this.f27903g = vespaBottomSheetDialog;
    }

    /* renamed from: c */
    public final void mo31328c(Object obj) {
        UserAction userAction = (UserAction) obj;
        C19383o.m32797g(userAction, "data");
        C12650a aVar = this.f27901e.f27907b;
        String type = userAction.getType();
        C19383o.m32796f(type, "data.type");
        Fragment fragment = this.f27900d;
        C12654e eVar = this.f27902f;
        aVar.getClass();
        C19383o.m32797g(fragment, "fragment");
        C19383o.m32797g(eVar, "listingUiModel");
        switch (type.hashCode()) {
            case -871352833:
                if (type.equals(UserAction.TYPE_SEE_SIMILAR)) {
                    aVar.f27897a.mo21333d("listing_card_action_see_similar", C0005b.m37e0(eVar));
                    C12790b.m20430b(fragment, new SimilarListingsKey(C12790b.m20432d(fragment), C13810g.m21365a(new C13810g(), fragment.getResources(), (C11786n) null, String.valueOf(eVar.f27908a), 10), (Bundle) null, (String) null, 12, (DefaultConstructorMarker) null));
                    break;
                }
                break;
            case 109400031:
                if (type.equals(UserAction.TYPE_SHARE)) {
                    aVar.f27897a.mo21333d("listing_card_action_share", C0005b.m37e0(eVar));
                    Context context = fragment.getContext();
                    if (context != null) {
                        C1993m.m4365Z(context, eVar.f27911d);
                        break;
                    }
                }
                break;
            case 164437572:
                if (type.equals(UserAction.TYPE_ADD_TO_LIST)) {
                    aVar.f27897a.mo21333d("listing_card_action_add_to_list", C0005b.m37e0(eVar));
                    C12790b.m20430b(fragment, new AddToListBottomSheetKey(C12790b.m20432d(fragment), new LightWeightListingLike(new EtsyId(eVar.f27908a), (String) null, (EtsyMoney) null, eVar.f27911d, (ListingImage) null, (String) null, new EtsyId(eVar.f27909b), eVar.f27912e, eVar.f27913f), false, 4, (DefaultConstructorMarker) null));
                    break;
                }
                break;
            case 712393337:
                if (type.equals(UserAction.TYPE_REPORT_LISTING)) {
                    aVar.f27897a.mo21333d("context_menu_report_listing_tapped", C0005b.m37e0(eVar));
                    C12790b.m20430b(fragment, new ReportListingKey(C12790b.m20432d(fragment), String.valueOf(eVar.f27908a), eVar.f27911d));
                    break;
                }
                break;
            case 1834514514:
                if (type.equals(UserAction.TYPE_GOTO_SHOP)) {
                    aVar.f27897a.mo21333d("listing_card_action_goto_shop", C0005b.m37e0(eVar));
                    C12790b.m20430b(fragment, new ShopHomeKey(C12790b.m20432d(fragment), new EtsyId(eVar.f27909b), (ShopHomeConfig) null, (Map) null, (String) null, (String) null, (EtsyId) null, false, (String) null, (Bundle) null, 1020, (DefaultConstructorMarker) null));
                    break;
                }
                break;
        }
        this.f27903g.dismiss();
    }
}

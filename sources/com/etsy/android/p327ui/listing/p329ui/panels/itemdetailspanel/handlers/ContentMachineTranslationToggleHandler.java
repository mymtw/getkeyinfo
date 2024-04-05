package com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel.handlers;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.p327ui.listing.C10156h;
import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.listing.p329ui.C10409f;
import com.etsy.android.p327ui.listing.p329ui.buybox.title.C10313d;
import com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel.ItemDetailsPanel;
import kotlin.jvm.internal.C19383o;
import p466vc.C13574d;

/* renamed from: com.etsy.android.ui.listing.ui.panels.itemdetailspanel.handlers.ContentMachineTranslationToggleHandler */
public final class ContentMachineTranslationToggleHandler {

    /* renamed from: a */
    public final C10156h f23048a;

    public ContentMachineTranslationToggleHandler(C10156h hVar) {
        C19383o.m32797g(hVar, "listingViewEligibility");
        this.f23048a = hVar;
    }

    /* renamed from: a */
    public final C13574d.C13594c mo34065a(ListingViewState.C10092d dVar) {
        C10409f fVar = dVar.f22238f;
        C10313d dVar2 = fVar.f22802e.f22816a;
        String str = dVar2.f22659b;
        if (str == null) {
            str = "";
        }
        String str2 = dVar2.f22658a;
        ItemDetailsPanel itemDetailsPanel = fVar.f22803f.f22848f;
        return C0761x.m1709a1(dVar, new ContentMachineTranslationToggleHandler$handle$1(dVar, this, str, str2, itemDetailsPanel.f23021m, itemDetailsPanel.f23020l, itemDetailsPanel.f23016h, itemDetailsPanel.f23012d, itemDetailsPanel.f23013e, !itemDetailsPanel.mo34050b()));
    }
}

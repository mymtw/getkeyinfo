package com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.C0114h;
import androidx.compose.foundation.layout.C0761x;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.util.C8923u;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.C10424k;
import com.etsy.android.p327ui.listing.p329ui.MachineTranslationViewState;
import com.etsy.android.stylekit.views.CollageContentToggle;
import com.etsy.android.uikit.util.EtsyLinkify;
import com.etsy.android.uikit.view.MachineTranslationOneClickView;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19459m;
import p466vc.C13573c;
import p466vc.C13597g;
import p628nj.C18263b;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.panels.itemdetailspanel.ItemDetailsPanelViewHolder */
public final class ItemDetailsPanelViewHolder extends C10424k {

    /* renamed from: b */
    public final C8923u f23024b;

    /* renamed from: c */
    public final C13573c f23025c;

    /* renamed from: d */
    public final CollageContentToggle f23026d;

    /* renamed from: e */
    public final TextView f23027e;

    /* renamed from: f */
    public final TextView f23028f;

    /* renamed from: g */
    public final View f23029g;

    /* renamed from: h */
    public final MachineTranslationOneClickView f23030h;

    /* renamed from: i */
    public final TextView f23031i;

    /* renamed from: j */
    public final TextView f23032j;

    /* renamed from: k */
    public final TextView f23033k;

    /* renamed from: l */
    public final View f23034l;

    /* renamed from: com.etsy.android.ui.listing.ui.panels.itemdetailspanel.ItemDetailsPanelViewHolder$a */
    public /* synthetic */ class C10486a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23035a;

        static {
            int[] iArr = new int[MachineTranslationViewState.values().length];
            iArr[MachineTranslationViewState.VISIBLE.ordinal()] = 1;
            iArr[MachineTranslationViewState.GONE.ordinal()] = 2;
            iArr[MachineTranslationViewState.LOADING.ordinal()] = 3;
            iArr[MachineTranslationViewState.ERROR.ordinal()] = 4;
            f23035a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ItemDetailsPanelViewHolder(ViewGroup viewGroup, C8923u uVar, C13573c cVar) {
        super(C0114h.m305j0(viewGroup, R.layout.list_item_listing_item_details_panel, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(uVar, "translationHelper");
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f23024b = uVar;
        this.f23025c = cVar;
        View findViewById = this.itemView.findViewById(R.id.item_details_panel);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.item_details_panel)");
        CollageContentToggle collageContentToggle = (CollageContentToggle) findViewById;
        this.f23026d = collageContentToggle;
        ConstraintLayout constraintLayout = (ConstraintLayout) C0114h.m305j0(collageContentToggle, R.layout.list_item_listing_item_details_panel_content, true);
        C0761x.m1669H(new C19857l<Boolean, C19394m>(this) {
            public final /* synthetic */ ItemDetailsPanelViewHolder this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return C19394m.f43287a;
            }

            public final void invoke(boolean z) {
                this.this$0.f23025c.mo38043a(new C13597g.C13712q1(z));
            }
        }, collageContentToggle);
        View findViewById2 = collageContentToggle.findViewById(R.id.text_seller_discount_description);
        C19383o.m32796f(findViewById2, "panel.findViewById(R.id.…ler_discount_description)");
        this.f23027e = (TextView) findViewById2;
        View findViewById3 = collageContentToggle.findViewById(R.id.text_seller_free_shipping_description);
        C19383o.m32796f(findViewById3, "panel.findViewById(R.id.…ree_shipping_description)");
        this.f23028f = (TextView) findViewById3;
        View findViewById4 = collageContentToggle.findViewById(R.id.divider_seller_promotion_description);
        C19383o.m32796f(findViewById4, "panel.findViewById(R.id.…er_promotion_description)");
        this.f23029g = findViewById4;
        View findViewById5 = collageContentToggle.findViewById(R.id.machine_translation_one_click);
        C19383o.m32796f(findViewById5, "panel.findViewById(R.id.…ne_translation_one_click)");
        MachineTranslationOneClickView machineTranslationOneClickView = (MachineTranslationOneClickView) findViewById5;
        this.f23030h = machineTranslationOneClickView;
        View findViewById6 = collageContentToggle.findViewById(R.id.text_description);
        C19383o.m32796f(findViewById6, "panel.findViewById(R.id.text_description)");
        this.f23031i = (TextView) findViewById6;
        View findViewById7 = collageContentToggle.findViewById(R.id.group_human_scale);
        C19383o.m32796f(findViewById7, "panel.findViewById(R.id.group_human_scale)");
        this.f23034l = findViewById7;
        View findViewById8 = collageContentToggle.findViewById(R.id.human_scale_manufacturers);
        C19383o.m32796f(findViewById8, "panel.findViewById(R.id.human_scale_manufacturers)");
        this.f23032j = (TextView) findViewById8;
        View findViewById9 = machineTranslationOneClickView.findViewById(R.id.translate_button);
        C19383o.m32796f(findViewById9, "machineTranslationOneCli…Id(R.id.translate_button)");
        this.f23033k = (TextView) findViewById9;
    }

    /* renamed from: b */
    public final void mo33629b() {
        EtsyLinkify.m19614h(this.f23031i);
    }

    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        C19394m mVar;
        C19394m mVar2;
        if (jVar instanceof ItemDetailsPanel) {
            ItemDetailsPanel itemDetailsPanel = (ItemDetailsPanel) jVar;
            CharSequence charSequence = itemDetailsPanel.f23009a;
            C19394m mVar3 = null;
            if (charSequence != null) {
                this.f23027e.setText(charSequence);
                ViewExtensions.m12869m(this.f23027e);
                ViewExtensions.m12869m(this.f23029g);
                mVar = C19394m.f43287a;
            } else {
                mVar = null;
            }
            if (mVar == null) {
                ViewExtensions.m12860d(this.f23027e);
                ViewExtensions.m12860d(this.f23029g);
            }
            CharSequence charSequence2 = itemDetailsPanel.f23010b;
            if (charSequence2 != null) {
                this.f23028f.setText(charSequence2);
                ViewExtensions.m12869m(this.f23028f);
                ViewExtensions.m12869m(this.f23029g);
                mVar2 = C19394m.f43287a;
            } else {
                mVar2 = null;
            }
            if (mVar2 == null) {
                ViewExtensions.m12860d(this.f23028f);
                ViewExtensions.m12860d(this.f23029g);
            }
            int i = C10486a.f23035a[itemDetailsPanel.f23022n.ordinal()];
            if (i == 1) {
                MachineTranslationOneClickView machineTranslationOneClickView = this.f23030h;
                machineTranslationOneClickView.setListingTranslationState(itemDetailsPanel.mo34050b(), itemDetailsPanel.f23021m, this.f23024b);
                machineTranslationOneClickView.showDisclaimer();
                machineTranslationOneClickView.hideSpinner();
                machineTranslationOneClickView.hideErrorMessage();
                ViewExtensions.m12869m(machineTranslationOneClickView);
                ViewExtensions.m12869m(this.f23033k);
                ViewExtensions.m12866j(this.f23033k, new ItemDetailsPanelViewHolder$bind$6(this));
            } else if (i == 2) {
                ViewExtensions.m12860d(this.f23030h);
            } else if (i == 3) {
                this.f23030h.showSpinner();
            } else if (i == 4) {
                this.f23030h.showErrorMessage();
            }
            String str = itemDetailsPanel.f23012d;
            if (str != null) {
                this.f23031i.setText(str);
                Context context = this.itemView.getContext();
                C19383o.m32796f(context, "itemView.context");
                EtsyLinkify.m19612f(context, this.f23031i, false, (C19846a) null, 28);
                ViewExtensions.m12869m(this.f23031i);
                mVar3 = C19394m.f43287a;
            }
            if (mVar3 == null) {
                ViewExtensions.m12860d(this.f23031i);
            }
            if (C18263b.m30839d0(itemDetailsPanel.f23017i)) {
                StringBuilder sb = new StringBuilder();
                String string = this.itemView.getResources().getString(R.string.listing_human_scale);
                C19383o.m32796f(string, "itemView.resources.getSt…ring.listing_human_scale)");
                sb.append(C19459m.m33035H1(string).toString());
                sb.append(' ');
                sb.append(itemDetailsPanel.f23017i);
                this.f23032j.setText(sb.toString());
                ViewExtensions.m12869m(this.f23034l);
            } else {
                ViewExtensions.m12860d(this.f23034l);
            }
            this.f23026d.setExpanded(itemDetailsPanel.f23023o);
            return;
        }
        throw new IllegalArgumentException();
    }
}

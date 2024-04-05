package com.etsy.android.p327ui.shop.homesection;

import android.view.ViewGroup;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.config.C8623e;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.apiv3.StructuredShopPrivacy;
import com.etsy.android.lib.util.C8885d0;
import com.etsy.android.lib.util.C8923u;
import com.etsy.android.p327ui.shop.C11192q0;
import com.etsy.android.uikit.view.MachineTranslationOneClickView;
import com.etsy.android.uikit.view.shop.policies.StructuredShopPrivacyView;
import com.etsy.android.vespa.viewholders.C12086e;
import p409o9.C13131k;
import p438re.C13356b;
import p460ue.C13497g;

/* renamed from: com.etsy.android.ui.shop.homesection.n */
public final class C11164n extends C12086e<C13497g> {

    /* renamed from: c */
    public final MachineTranslationOneClickView f24683c = ((MachineTranslationOneClickView) mo38986f(R.id.machine_translation_one_click));

    /* renamed from: d */
    public final C13356b f24684d;

    /* renamed from: e */
    public final C8923u f24685e;

    /* renamed from: f */
    public final C8618c f24686f;

    /* renamed from: g */
    public StructuredShopPrivacyView f24687g = ((StructuredShopPrivacyView) mo38986f(R.id.structured_privacy));

    /* renamed from: h */
    public C8672b f24688h;

    public C11164n(ViewGroup viewGroup, C13356b bVar, C8703p pVar, C8923u uVar, C8623e eVar) {
        super(C0326j.m859c(viewGroup, R.layout.structured_policies_section_privacy, viewGroup, false));
        this.f24684d = bVar;
        this.f24688h = pVar;
        this.f24685e = uVar;
        this.f24686f = eVar;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        C13497g gVar = (C13497g) obj;
        StructuredShopPrivacy privacy = gVar.f29532e.getPrivacy();
        if (privacy != null) {
            this.f24687g.setStructuredShopPrivacy(privacy, this.f24684d, this.f24688h);
            C11192q0 q0Var = gVar.f29531d;
            MachineTranslationOneClickView machineTranslationOneClickView = this.f24683c;
            int i = 0;
            if (!(this.f24686f.mo21132b(C13131k.f28869b) && privacy.getOther().isEnabled() && this.f24685e.mo30498a(privacy.getOther().getLabel(), privacy.getOther().getLanguage()))) {
                i = 8;
            }
            machineTranslationOneClickView.setVisibility(i);
            String translatedOtherText = gVar.f29532e.getPrivacy() != null ? gVar.f29532e.getPrivacy().getTranslatedOtherText() : null;
            this.f24683c.configureForStateAndMessage(gVar.mo46160c(), translatedOtherText);
            if (!C8885d0.m17323g(translatedOtherText)) {
                this.f24683c.setOnClickListener(new C11163m(this, gVar, q0Var));
            }
        }
    }
}

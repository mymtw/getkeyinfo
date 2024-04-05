package com.etsy.android.p327ui.conversation.details;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.util.C8923u;
import com.etsy.android.stylekit.views.CollageAccessibilityGroup;
import com.etsy.android.uikit.view.MachineTranslationOneClickView;
import kotlin.jvm.internal.C19383o;
import p354gc.C12767e;
import p354gc.C12778k;
import p354gc.C12783l;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.conversation.details.OtherUserMessageViewHolder */
public final class OtherUserMessageViewHolder extends MessageViewHolder {

    /* renamed from: l */
    public final C9568s f20990l;

    /* renamed from: m */
    public final C8923u f20991m;

    /* renamed from: n */
    public final C9475a f20992n;

    /* renamed from: o */
    public final ImageView f20993o;

    /* renamed from: p */
    public final MachineTranslationOneClickView f20994p;

    /* renamed from: q */
    public final CollageAccessibilityGroup f20995q;

    /* renamed from: r */
    public final Space f20996r;

    /* renamed from: s */
    public final Space f20997s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OtherUserMessageViewHolder(ViewGroup viewGroup, C9558n nVar, C9564q qVar, C9568s sVar, C8923u uVar, C9475a aVar) {
        super(viewGroup, R.layout.list_item_other_user_message, nVar, qVar);
        C19383o.m32797g(viewGroup, "parentView");
        C19383o.m32797g(nVar, "imageClickListener");
        C19383o.m32797g(qVar, "linkCardClickListener");
        C19383o.m32797g(sVar, "translationClickListener");
        C19383o.m32797g(uVar, "translationHelper");
        C19383o.m32797g(aVar, "avatarClickedListener");
        this.f20990l = sVar;
        this.f20991m = uVar;
        this.f20992n = aVar;
        View findViewById = this.itemView.findViewById(R.id.avatar);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.avatar)");
        this.f20993o = (ImageView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.machine_translation_one_click);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.…ne_translation_one_click)");
        this.f20994p = (MachineTranslationOneClickView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.avatar_message_text_accessibility_group);
        C19383o.m32796f(findViewById3, "itemView.findViewById(R.…text_accessibility_group)");
        this.f20995q = (CollageAccessibilityGroup) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.bottom_space);
        C19383o.m32796f(findViewById4, "itemView.findViewById(R.id.bottom_space)");
        this.f20996r = (Space) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.order_card_background_space);
        C19383o.m32796f(findViewById5, "itemView.findViewById(R.…er_card_background_space)");
        this.f20997s = (Space) findViewById5;
    }

    /* renamed from: f */
    public final int mo31959f() {
        return R.drawable.ripple_message_link_card_background_other_user;
    }

    /* renamed from: g */
    public final void mo31960g(C12767e eVar) {
        C19383o.m32797g(eVar, "groupedMessageItem");
        int dimensionPixelSize = this.itemView.getResources().getDimensionPixelSize(R.dimen.clg_space_8);
        int dimensionPixelSize2 = this.itemView.getResources().getDimensionPixelSize(R.dimen.conversation_grouped_message_padding);
        if (eVar instanceof C12767e.C12771d) {
            this.itemView.setPadding(dimensionPixelSize, dimensionPixelSize, 0, dimensionPixelSize2);
            this.f20978d.setBackgroundResource(R.drawable.bg_chat_message_other_user_top);
            CollageAccessibilityGroup collageAccessibilityGroup = this.f20995q;
            collageAccessibilityGroup.setContentDescription(this.itemView.getResources().getString(R.string.convo_other_user_first_message, new Object[]{this.f20993o.getContentDescription()}) + ", " + this.f20979e.getText());
        } else if (eVar instanceof C12767e.C12770c) {
            this.itemView.setPadding(dimensionPixelSize, dimensionPixelSize2, 0, dimensionPixelSize2);
            this.f20978d.setBackgroundResource(R.drawable.bg_chat_message_other_user_middle);
        } else if (eVar instanceof C12767e.C12768a) {
            this.itemView.setPadding(dimensionPixelSize, dimensionPixelSize2, 0, dimensionPixelSize);
            this.f20978d.setBackgroundResource(R.drawable.bg_chat_message_other_user_bottom);
            CollageAccessibilityGroup collageAccessibilityGroup2 = this.f20995q;
            collageAccessibilityGroup2.setContentDescription(this.itemView.getResources().getString(R.string.convo_other_user_last_message, new Object[]{this.f20993o.getContentDescription()}) + ", " + this.f20979e.getText());
        } else if (eVar instanceof C12767e.C12769b) {
            this.itemView.setPadding(dimensionPixelSize, dimensionPixelSize, 0, dimensionPixelSize);
            this.f20978d.setBackgroundResource(R.drawable.bg_chat_message_other_user);
        }
    }

    /* renamed from: h */
    public final void mo31964h(C12778k.C12781c cVar) {
        int i;
        C19383o.m32797g(cVar, "item");
        mo31958e(cVar.f28239b, cVar.f28240c);
        C0114h.m272C0(this.itemView).load(cVar.f28241d).mo46137e0().mo16816M(this.f20993o);
        this.f20993o.setContentDescription(cVar.f28242e);
        ViewExtensions.m12866j(this.f20993o, new OtherUserMessageViewHolder$bind$1(this, cVar));
        MachineTranslationOneClickView machineTranslationOneClickView = this.f20994p;
        C12783l a = cVar.f28239b.mo45523a();
        if (this.f20991m.mo30498a(a.f28244a, a.f28251h)) {
            ViewExtensions.m12869m(machineTranslationOneClickView);
            machineTranslationOneClickView.hideSpinner();
            if (C18263b.m30837c0(a.f28253j)) {
                machineTranslationOneClickView.hideSpinner();
                machineTranslationOneClickView.hideErrorMessage();
                machineTranslationOneClickView.setTranslatedStateWithString(a.f28253j);
            } else {
                machineTranslationOneClickView.setUntranslatedState();
                ViewExtensions.m12866j(machineTranslationOneClickView, new OtherUserMessageViewHolder$bindMachineTranslationView$1(machineTranslationOneClickView, this, a));
                if (a.f28254k) {
                    machineTranslationOneClickView.hideSpinner();
                    machineTranslationOneClickView.showErrorMessage();
                }
            }
        } else {
            ViewExtensions.m12860d(machineTranslationOneClickView);
        }
        ViewGroup.LayoutParams layoutParams = this.f20996r.getLayoutParams();
        boolean z = true;
        if (this.f20994p.getVisibility() == 0) {
            if (!(this.f20980f.getVisibility() == 0)) {
                if (this.f20981g.getVisibility() != 0) {
                    z = false;
                }
                if (!z) {
                    ViewExtensions.m12860d(this.f20997s);
                    i = this.itemView.getResources().getDimensionPixelSize(R.dimen.clg_space_4);
                    layoutParams.height = i;
                }
            }
        }
        ViewExtensions.m12869m(this.f20997s);
        i = this.itemView.getResources().getDimensionPixelSize(R.dimen.clg_space_16);
        layoutParams.height = i;
    }
}

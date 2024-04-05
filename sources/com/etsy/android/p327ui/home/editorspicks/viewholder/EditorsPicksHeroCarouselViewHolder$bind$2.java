package com.etsy.android.p327ui.home.editorspicks.viewholder;

import android.view.View;
import android.widget.TextView;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.home.editorspicks.viewholder.EditorsPicksHeroCarouselViewHolder$bind$2 */
final class EditorsPicksHeroCarouselViewHolder$bind$2 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ C9950i $data;
    public final /* synthetic */ C9948g this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditorsPicksHeroCarouselViewHolder$bind$2(C9948g gVar, C9950i iVar) {
        super(1);
        this.this$0 = gVar;
        this.$data = iVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        TextView textView;
        C9948g gVar = this.this$0;
        C9950i iVar = this.$data;
        String str = iVar.f21938b;
        String str2 = iVar.f21939c;
        if (!(str == null || (textView = gVar.f21932j) == null)) {
            textView.setText(str);
        }
        TextView textView2 = gVar.f21933k;
        if (textView2 != null) {
            textView2.setText(str2);
        }
        gVar.f21931i.show();
    }
}

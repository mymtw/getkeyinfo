package com.etsy.android.p327ui.conversation.details;

import android.view.View;
import com.etsy.android.uikit.view.MachineTranslationOneClickView;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p354gc.C12783l;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.conversation.details.OtherUserMessageViewHolder$bindMachineTranslationView$1 */
final class OtherUserMessageViewHolder$bindMachineTranslationView$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ C12783l $message;
    public final /* synthetic */ MachineTranslationOneClickView $translationView;
    public final /* synthetic */ OtherUserMessageViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OtherUserMessageViewHolder$bindMachineTranslationView$1(MachineTranslationOneClickView machineTranslationOneClickView, OtherUserMessageViewHolder otherUserMessageViewHolder, C12783l lVar) {
        super(1);
        this.$translationView = machineTranslationOneClickView;
        this.this$0 = otherUserMessageViewHolder;
        this.$message = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.$translationView.showSpinner();
        OtherUserMessageViewHolder otherUserMessageViewHolder = this.this$0;
        otherUserMessageViewHolder.f20990l.mo31996a(otherUserMessageViewHolder.getAdapterPosition(), this.$message);
    }
}

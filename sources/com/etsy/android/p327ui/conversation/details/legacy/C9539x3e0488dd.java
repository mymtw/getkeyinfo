package com.etsy.android.p327ui.conversation.details.legacy;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p354gc.C12783l;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.conversation.details.legacy.LegacyConversationDetailsPresenter$translateClickedListener$1$onTranslateClicked$1 */
public final class C9539x3e0488dd extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ int $adapterPosition;
    public final /* synthetic */ C12783l $messageObject;
    public final /* synthetic */ LegacyConversationDetailsPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9539x3e0488dd(C12783l lVar, LegacyConversationDetailsPresenter legacyConversationDetailsPresenter, int i) {
        super(1);
        this.$messageObject = lVar;
        this.this$0 = legacyConversationDetailsPresenter;
        this.$adapterPosition = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "it");
        this.$messageObject.f28254k = true;
        this.this$0.f21120b.notifyItemChanged(this.$adapterPosition);
    }
}

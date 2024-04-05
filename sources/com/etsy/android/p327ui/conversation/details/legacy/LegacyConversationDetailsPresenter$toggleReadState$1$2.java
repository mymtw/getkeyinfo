package com.etsy.android.p327ui.conversation.details.legacy;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.Alert;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p354gc.C12763b;
import p354gc.C12766d;
import p354gc.C12776j;
import p354gc.C12783l;
import p354gc.C12784m;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.conversation.details.legacy.LegacyConversationDetailsPresenter$toggleReadState$1$2 */
public final class LegacyConversationDetailsPresenter$toggleReadState$1$2 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ boolean $isRead;
    public final /* synthetic */ boolean $shouldGoBack;
    public final /* synthetic */ LegacyConversationDetailsPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LegacyConversationDetailsPresenter$toggleReadState$1$2(LegacyConversationDetailsPresenter legacyConversationDetailsPresenter, boolean z, boolean z2) {
        super(0);
        this.this$0 = legacyConversationDetailsPresenter;
        this.$isRead = z;
        this.$shouldGoBack = z2;
    }

    public final void invoke() {
        C12766d dVar;
        LegacyConversationDetailsPresenter legacyConversationDetailsPresenter = this.this$0;
        C12766d dVar2 = legacyConversationDetailsPresenter.f21137s;
        if (dVar2 != null) {
            C19383o.m32794d(dVar2);
            C12763b bVar = dVar2.f28216a;
            long j = bVar.f28207a;
            C12784m mVar = bVar.f28208b;
            long j2 = bVar.f28209c;
            CharSequence charSequence = bVar.f28210d;
            String str = bVar.f28211e;
            Alert alert = bVar.f28213g;
            C12776j jVar = bVar.f28214h;
            bVar.getClass();
            C19383o.m32797g(mVar, "otherUser");
            C19383o.m32797g(charSequence, "formattedLastUpdatedTime");
            C19383o.m32797g(str, "lastMessage");
            C12763b bVar2 = new C12763b(j, mVar, j2, charSequence, str, !this.$isRead, alert, jVar);
            List<C12783l> list = dVar2.f28217b;
            C19383o.m32797g(list, ResponseConstants.MESSAGES);
            dVar = new C12766d(bVar2, list);
        } else {
            dVar = null;
        }
        legacyConversationDetailsPresenter.f21137s = dVar;
        this.this$0.f21120b.onStatusChanged();
        if (this.$shouldGoBack) {
            this.this$0.f21120b.goBack();
        } else {
            this.this$0.f21120b.reloadOptionsMenu();
        }
    }
}

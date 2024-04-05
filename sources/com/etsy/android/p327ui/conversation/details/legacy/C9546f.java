package com.etsy.android.p327ui.conversation.details.legacy;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.etsy.android.p327ui.conversation.details.C9564q;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.conversation.details.legacy.f */
public final class C9546f implements C9564q {

    /* renamed from: a */
    public final /* synthetic */ LegacyConversationDetailsPresenter f21165a;

    public C9546f(LegacyConversationDetailsPresenter legacyConversationDetailsPresenter) {
        this.f21165a = legacyConversationDetailsPresenter;
    }

    /* renamed from: a */
    public final void mo31995a(String str) {
        C19383o.m32797g(str, "url");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        Context context = this.f21165a.f21120b.getContext();
        if (context != null) {
            context.startActivity(intent);
        }
    }
}

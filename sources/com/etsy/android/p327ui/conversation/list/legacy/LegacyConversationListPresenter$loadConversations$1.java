package com.etsy.android.p327ui.conversation.list.legacy;

import androidx.appcompat.widget.C0326j;
import com.etsy.android.lib.config.BuildTarget;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.conversation.list.legacy.LegacyConversationListPresenter$loadConversations$1 */
public final class LegacyConversationListPresenter$loadConversations$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public static final LegacyConversationListPresenter$loadConversations$1 INSTANCE = new LegacyConversationListPresenter$loadConversations$1();

    public LegacyConversationListPresenter$loadConversations$1() {
        super(1);
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "it");
        if (C0326j.m869n(BuildTarget.Companion)) {
            throw th;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }
}

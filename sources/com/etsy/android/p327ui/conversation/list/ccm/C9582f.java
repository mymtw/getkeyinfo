package com.etsy.android.p327ui.conversation.list.ccm;

import com.etsy.android.p327ui.conversation.details.C9477c;
import com.etsy.android.p327ui.user.UserBadgeCountManager;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.conversation.list.ccm.f */
public final class C9582f {

    /* renamed from: a */
    public final C9477c f21249a;

    /* renamed from: b */
    public final C9578b f21250b;

    /* renamed from: c */
    public final UserBadgeCountManager f21251c;

    public C9582f(C9477c cVar, C9578b bVar, UserBadgeCountManager userBadgeCountManager) {
        C19383o.m32797g(cVar, "conversationDao");
        C19383o.m32797g(bVar, "conversationListEndpoint");
        C19383o.m32797g(userBadgeCountManager, "userBadgeCountManager");
        this.f21249a = cVar;
        this.f21250b = bVar;
        this.f21251c = userBadgeCountManager;
    }
}

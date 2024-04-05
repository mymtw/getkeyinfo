package com.etsy.android.p327ui.conversation.list.legacy;

import com.etsy.android.lib.network.C8731g;
import com.etsy.android.p327ui.conversation.details.C9477c;
import com.etsy.android.p327ui.user.UserBadgeCountManager;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.internal.operators.single.C19208j;
import p738dq.C18990a;

/* renamed from: com.etsy.android.ui.conversation.list.legacy.g */
public final class C9599g {

    /* renamed from: a */
    public final C9477c f21285a;

    /* renamed from: b */
    public final C8731g f21286b;

    /* renamed from: c */
    public final UserBadgeCountManager f21287c;

    public C9599g(C9477c cVar, C8731g gVar, UserBadgeCountManager userBadgeCountManager) {
        C19383o.m32797g(cVar, "conversationDao");
        C19383o.m32797g(gVar, "moshiRetrofit");
        C19383o.m32797g(userBadgeCountManager, "userBadgeCountManager");
        this.f21285a = cVar;
        this.f21286b = gVar;
        this.f21287c = userBadgeCountManager;
    }

    /* renamed from: a */
    public final C19208j mo32230a(C9593a aVar) {
        Object b = this.f21286b.f19177a.mo74387b(C9594b.class);
        C19383o.m32796f(b, "moshiRetrofit.v3moshiRet…ListEndpoint::class.java)");
        return new C19208j(((C9594b) b).mo32228a(aVar.f21275b, aVar.f21274a, true).mo20660i(C18990a.f42333b), new C9597e(this, aVar));
    }
}

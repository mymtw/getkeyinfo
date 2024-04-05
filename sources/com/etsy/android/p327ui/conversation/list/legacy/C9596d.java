package com.etsy.android.p327ui.conversation.list.legacy;

import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.p327ui.conversation.details.C9532l;
import dagger.internal.C17555d;
import p456ua.C13461f;
import p456ua.C13462g;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.conversation.list.legacy.d */
public final class C9596d implements C17555d<LegacyConversationListPresenter> {

    /* renamed from: a */
    public final C19011a<C9599g> f21279a;

    /* renamed from: b */
    public final C19011a<C13461f> f21280b;

    /* renamed from: c */
    public final C19011a<C9532l> f21281c;

    /* renamed from: d */
    public final C19011a<C8694h> f21282d;

    public C9596d(C19011a aVar, C19011a aVar2, C19011a aVar3) {
        C13462g gVar = C13462g.C13463a.f29482a;
        this.f21279a = aVar;
        this.f21280b = gVar;
        this.f21281c = aVar2;
        this.f21282d = aVar3;
    }

    public final Object get() {
        return new LegacyConversationListPresenter(this.f21279a.get(), this.f21280b.get(), this.f21281c.get(), this.f21282d.get());
    }
}

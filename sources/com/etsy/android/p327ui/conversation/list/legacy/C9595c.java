package com.etsy.android.p327ui.conversation.list.legacy;

import com.etsy.android.qualtrics.C8951c;
import dagger.internal.C17555d;
import p486y9.C13888d;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.conversation.list.legacy.c */
public final class C9595c implements C17555d<LegacyConversationListFragment> {

    /* renamed from: a */
    public final C19011a<LegacyConversationListPresenter> f21276a;

    /* renamed from: b */
    public final C19011a<C8951c> f21277b;

    /* renamed from: c */
    public final C19011a<C13888d> f21278c;

    public C9595c(C19011a<LegacyConversationListPresenter> aVar, C19011a<C8951c> aVar2, C19011a<C13888d> aVar3) {
        this.f21276a = aVar;
        this.f21277b = aVar2;
        this.f21278c = aVar3;
    }

    public final Object get() {
        return new LegacyConversationListFragment(this.f21276a.get(), this.f21277b.get(), this.f21278c.get());
    }
}

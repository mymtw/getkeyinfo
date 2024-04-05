package com.etsy.android.p327ui.conversation.details.legacy;

import com.etsy.android.p327ui.conversation.details.legacy.C9551k;
import kotlin.jvm.internal.C19383o;
import p287xp.C8333a;

/* renamed from: com.etsy.android.ui.conversation.details.legacy.j */
public final /* synthetic */ class C9550j implements C8333a {

    /* renamed from: a */
    public final /* synthetic */ C9551k f21167a;

    /* renamed from: b */
    public final /* synthetic */ LegacyConversationRepository f21168b;

    public /* synthetic */ C9550j(C9551k kVar, LegacyConversationRepository legacyConversationRepository) {
        this.f21167a = kVar;
        this.f21168b = legacyConversationRepository;
    }

    public final void run() {
        C9551k kVar = this.f21167a;
        LegacyConversationRepository legacyConversationRepository = this.f21168b;
        C19383o.m32797g(kVar, "$spec");
        C19383o.m32797g(legacyConversationRepository, "this$0");
        if (kVar instanceof C9551k.C9552a) {
            legacyConversationRepository.f21149d.mo31969a(kVar.f21170b.getIdAsLongDeprecated(), true);
        } else if (kVar instanceof C9551k.C9555d) {
            legacyConversationRepository.f21149d.mo31969a(kVar.f21170b.getIdAsLongDeprecated(), false);
        }
    }
}

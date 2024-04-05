package p040c9;

import com.etsy.android.lib.models.ConversationUserModel;
import com.etsy.android.lib.network.C8730f;
import com.etsy.android.lib.network.C8731g;
import com.etsy.android.p327ui.conversation.details.C9532l;
import com.etsy.android.p327ui.conversation.details.ccm.C9492a;
import com.etsy.android.p327ui.conversation.details.legacy.C9548h;
import com.etsy.android.p327ui.conversation.details.legacy.C9549i;
import com.etsy.android.p327ui.conversation.details.legacy.LegacyConversationDetailsFragment;
import com.etsy.android.p327ui.conversation.details.legacy.LegacyConversationDetailsPresenter;
import com.etsy.android.p327ui.conversation.details.legacy.LegacyConversationRepository;
import dagger.android.C17550a;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;
import p425q9.C13265p;
import p456ua.C13461f;
import p514bk.C14088a;

/* renamed from: c9.z7 */
public final class C4797z7 implements C17550a {

    /* renamed from: b */
    public final C19543e0 f10789b;

    /* renamed from: c */
    public final C14088a f10790c;

    /* renamed from: d */
    public final LegacyConversationDetailsFragment f10791d;

    /* renamed from: e */
    public final C4579j1 f10792e;

    public C4797z7(C4579j1 j1Var, C14088a aVar, C19543e0 e0Var, LegacyConversationDetailsFragment legacyConversationDetailsFragment) {
        this.f10792e = j1Var;
        this.f10789b = e0Var;
        this.f10790c = aVar;
        this.f10791d = legacyConversationDetailsFragment;
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        LegacyConversationDetailsFragment legacyConversationDetailsFragment = (LegacyConversationDetailsFragment) obj;
        legacyConversationDetailsFragment.session = (C13265p) this.f10792e.f10101F0.get();
        C19543e0 e0Var = this.f10789b;
        C8731g gVar = (C8731g) this.f10792e.f10091D0.get();
        e0Var.getClass();
        C19383o.m32797g(gVar, "retrofit");
        Object b = gVar.f19177a.mo74387b(C9548h.class);
        C19383o.m32796f(b, "retrofit.v3moshiRetrofit…tionEndpoint::class.java)");
        C19543e0 e0Var2 = this.f10789b;
        C8730f fVar = this.f10792e.f10109G3.get();
        e0Var2.getClass();
        C19383o.m32797g(fVar, "retrofit");
        Object b2 = fVar.f19176a.mo74387b(C9549i.class);
        C19383o.m32796f(b2, "retrofit.v3MoshiMultipar…intMultipart::class.java)");
        C19543e0 e0Var3 = this.f10789b;
        C8731g gVar2 = (C8731g) this.f10792e.f10091D0.get();
        e0Var3.getClass();
        C19383o.m32797g(gVar2, "retrofit");
        Object b3 = gVar2.f19177a.mo74387b(C9492a.class);
        C19383o.m32796f(b3, "retrofit.v3moshiRetrofit…ailsEndpoint::class.java)");
        LegacyConversationRepository legacyConversationRepository = new LegacyConversationRepository((C9548h) b, (C9549i) b2, (C9492a) b3, this.f10792e.f10156Q0.get(), this.f10792e.f10109G3.get());
        C14088a aVar = this.f10790c;
        LegacyConversationDetailsFragment legacyConversationDetailsFragment2 = this.f10791d;
        aVar.getClass();
        C19383o.m32797g(legacyConversationDetailsFragment2, "view");
        C13461f fVar2 = new C13461f();
        C14088a aVar2 = this.f10790c;
        C13265p pVar = (C13265p) this.f10792e.f10101F0.get();
        aVar2.getClass();
        C19383o.m32797g(pVar, "session");
        ConversationUserModel conversationUserModel = new ConversationUserModel();
        conversationUserModel.setUserId(pVar.mo45958c());
        LegacyConversationRepository legacyConversationRepository2 = legacyConversationRepository;
        legacyConversationDetailsFragment.presenter = new LegacyConversationDetailsPresenter(legacyConversationRepository2, legacyConversationDetailsFragment2, fVar2, conversationUserModel, this.f10792e.f10291o3.get(), new C9532l(this.f10792e.f10178U2.get()), this.f10792e.f10296p3.get(), this.f10792e.f10141N0.get(), this.f10792e.f10209a3.get(), this.f10792e.f10086C0.get(), (C13265p) this.f10792e.f10101F0.get());
        legacyConversationDetailsFragment.logCat = this.f10792e.f10212b0.get();
        legacyConversationDetailsFragment.translationHelper = C4579j1.m10254e(this.f10792e);
        legacyConversationDetailsFragment.customerCentricMessagingEligibility = this.f10792e.f10196Y0.get();
    }
}

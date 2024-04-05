package p040c9;

import com.etsy.android.feedback.C6473r;
import com.etsy.android.lib.network.C8731g;
import com.etsy.android.lib.requests.apiv3.UserEndpoint;
import com.etsy.android.p327ui.conversation.compose.C9452a;
import com.etsy.android.p327ui.conversation.compose.ConversationComposeFragment;
import com.google.android.play.core.assetpacks.C15588c1;
import dagger.android.C17550a;
import kotlin.jvm.internal.C19383o;
import p341ec.C12681d;
import p425q9.C13265p;
import p456ua.C13461f;
import p514bk.C14088a;

/* renamed from: c9.q5 */
public final class C4678q5 implements C17550a {

    /* renamed from: b */
    public final C14088a f10504b;

    /* renamed from: c */
    public final C15588c1 f10505c;

    /* renamed from: d */
    public final C4579j1 f10506d;

    /* renamed from: e */
    public final C4690r4 f10507e;

    public C4678q5(C4579j1 j1Var, C4690r4 r4Var, C14088a aVar, C15588c1 c1Var) {
        this.f10506d = j1Var;
        this.f10507e = r4Var;
        this.f10504b = aVar;
        this.f10505c = c1Var;
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        ConversationComposeFragment conversationComposeFragment = (ConversationComposeFragment) obj;
        C14088a aVar = this.f10504b;
        C8731g gVar = (C8731g) this.f10506d.f10091D0.get();
        aVar.getClass();
        C19383o.m32797g(gVar, "configuredRetrofit");
        Object b = gVar.f19177a.mo74387b(UserEndpoint.class);
        C19383o.m32796f(b, "configuredRetrofit.v3mos…UserEndpoint::class.java)");
        C15588c1 c1Var = this.f10505c;
        C8731g gVar2 = (C8731g) this.f10506d.f10091D0.get();
        c1Var.getClass();
        C19383o.m32797g(gVar2, "configuredV3MoshiRetrofit");
        Object b2 = gVar2.f19177a.mo74387b(C12681d.class);
        C19383o.m32796f(b2, "configuredV3MoshiRetrofi…tionEndpoint::class.java)");
        conversationComposeFragment.conversationRepository = new C9452a((UserEndpoint) b, (C12681d) b2, this.f10506d.f10146O0.get());
        conversationComposeFragment.schedulers = new C13461f();
        conversationComposeFragment.connectivity = this.f10506d.f10086C0.get();
        conversationComposeFragment.session = (C13265p) this.f10506d.f10101F0.get();
        conversationComposeFragment.notificationRepo = this.f10506d.f10178U2.get();
        conversationComposeFragment.customerCentricMessagingEligibility = this.f10506d.f10196Y0.get();
        conversationComposeFragment.reviewsEligibility = new C6473r(C4690r4.m10336a(this.f10507e));
    }
}

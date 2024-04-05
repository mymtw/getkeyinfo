package p040c9;

import com.etsy.android.lib.network.C8731g;
import com.etsy.android.p327ui.feedback.AppFeedbackFragment;
import com.etsy.android.p327ui.feedback.C9903a;
import dagger.android.C17550a;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p314ba.C8543b;
import p314ba.C8544c;
import p456ua.C13461f;

/* renamed from: c9.l1 */
public final class C4607l1 implements C17550a {

    /* renamed from: b */
    public final C0005b f10400b;

    /* renamed from: c */
    public final C4579j1 f10401c;

    public C4607l1(C4579j1 j1Var, C0005b bVar) {
        this.f10401c = j1Var;
        this.f10400b = bVar;
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        C0005b bVar = this.f10400b;
        C8731g gVar = (C8731g) this.f10401c.f10091D0.get();
        bVar.getClass();
        C19383o.m32797g(gVar, "configuredV3MoshiRetrofit");
        Object b = gVar.f19177a.mo74387b(C8544c.class);
        C19383o.m32796f(b, "configuredV3MoshiRetrofi…uestEndpoint::class.java)");
        C9903a aVar = new C9903a(new C8543b((C8544c) b, this.f10401c.f10146O0.get()));
        aVar.f21847b = new C13461f();
        ((AppFeedbackFragment) obj).presenter = aVar;
    }
}

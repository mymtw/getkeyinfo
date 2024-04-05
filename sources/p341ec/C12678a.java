package p341ec;

import android.os.Bundle;
import com.etsy.android.lib.deeplinks.DeepLinkEntity;
import com.etsy.android.lib.session.C8855a;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ConversationComposeNavigationKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ConversationDetailsNavigationKey;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19456j;
import p350fe.C12729e;
import p350fe.C12730f;
import p350fe.C12731g;
import p350fe.C12741o;
import p425q9.C13265p;

/* renamed from: ec.a */
public final class C12678a implements C12729e {

    /* renamed from: a */
    public final C12741o f27954a;

    /* renamed from: b */
    public final C13265p f27955b;

    /* renamed from: c */
    public final C8855a f27956c;

    public C12678a(C12741o oVar, C13265p pVar, C8855a aVar) {
        C19383o.m32797g(oVar, "routeInspector");
        C19383o.m32797g(pVar, "session");
        C19383o.m32797g(aVar, "customerCentricMessagingEligibility");
        this.f27954a = oVar;
        this.f27955b = pVar;
        this.f27956c = aVar;
    }

    /* renamed from: a */
    public final C12731g mo30554a(C12730f fVar) {
        C12730f fVar2 = fVar;
        String e = this.f27954a.mo45510e(fVar2.f28049b, DeepLinkEntity.CONVERSATION_COMPOSE.getEntityName());
        Long l = null;
        if (this.f27956c.mo30407a()) {
            String str = fVar2.f28050c;
            Bundle bundle = fVar2.f28051d;
            if (e != null) {
                l = C19456j.m33017U0(e);
            }
            return new C12731g.C12733b(new ConversationDetailsNavigationKey(str, bundle, l, (String) null, (String) null, (Long) null, false, true, (String) null, false, 888, (DefaultConstructorMarker) null));
        }
        String str2 = fVar2.f28050c;
        Bundle bundle2 = fVar2.f28051d;
        if (e != null) {
            l = C19456j.m33017U0(e);
        }
        return new C12731g.C12733b(new ConversationComposeNavigationKey(str2, this.f27955b.mo45960e(), (String) null, (String) null, l, (String) null, (String) null, false, bundle2, 236, (DefaultConstructorMarker) null));
    }
}

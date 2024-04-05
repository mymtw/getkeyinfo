package com.etsy.android.push;

import com.etsy.android.lib.currency.C8629a;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.util.sharedprefs.UserIdStream;
import com.etsy.android.p327ui.conversation.details.C9532l;
import com.etsy.android.p327ui.conversation.list.legacy.C9599g;
import com.etsy.android.p327ui.user.UserBadgeCountManager;
import com.etsy.android.p327ui.you.YouViewModel;
import dagger.internal.C17553b;
import dagger.internal.C17555d;
import kotlin.jvm.internal.C19383o;
import p425q9.C13265p;
import p456ua.C13461f;
import p456ua.C13462g;
import p568fn.C17782b;
import p740eq.C19011a;

/* renamed from: com.etsy.android.push.b */
public final class C8939b implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f19722a = 0;

    /* renamed from: b */
    public final C19011a f19723b;

    /* renamed from: c */
    public final C19011a f19724c;

    /* renamed from: d */
    public final C19011a f19725d;

    /* renamed from: e */
    public final C19011a f19726e;

    /* renamed from: f */
    public final Object f19727f;

    public C8939b(C19011a aVar, C19011a aVar2, C19011a aVar3, C19011a aVar4) {
        C13462g gVar = C13462g.C13463a.f29482a;
        this.f19723b = aVar;
        this.f19724c = gVar;
        this.f19725d = aVar2;
        this.f19726e = aVar3;
        this.f19727f = aVar4;
    }

    public final Object get() {
        switch (this.f19722a) {
            case 0:
                return new C8938a((UserIdStream) this.f19723b.get(), (C13461f) this.f19724c.get(), (C8694h) this.f19725d.get(), (C9532l) this.f19726e.get(), (C9599g) ((C19011a) this.f19727f).get());
            default:
                UserBadgeCountManager userBadgeCountManager = (UserBadgeCountManager) this.f19723b.get();
                C13265p pVar = (C13265p) this.f19724c.get();
                C8630b bVar = (C8630b) this.f19725d.get();
                C8629a aVar = (C8629a) this.f19726e.get();
                ((C17782b) this.f19727f).getClass();
                C19383o.m32797g(userBadgeCountManager, "userBadgeCountManager");
                C19383o.m32797g(pVar, "session");
                C19383o.m32797g(bVar, "etsyMoneyFactory");
                C19383o.m32797g(aVar, "appCurrency");
                return new YouViewModel(userBadgeCountManager, pVar, bVar, aVar);
        }
    }

    public C8939b(C17782b bVar, C19011a aVar, C17553b bVar2, C19011a aVar2, C19011a aVar3) {
        this.f19727f = bVar;
        this.f19723b = aVar;
        this.f19724c = bVar2;
        this.f19725d = aVar2;
        this.f19726e = aVar3;
    }
}

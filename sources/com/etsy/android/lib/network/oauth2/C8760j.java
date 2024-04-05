package com.etsy.android.lib.network.oauth2;

import com.etsy.android.lib.config.EtsyConfigKey;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.network.C8731g;
import com.etsy.android.lib.util.C8890e0;
import com.etsy.android.p327ui.conversation.details.C9477c;
import com.etsy.android.p327ui.conversation.list.legacy.C9599g;
import com.etsy.android.p327ui.home.recentlyviewedpage.C10043d;
import com.etsy.android.p327ui.home.recentlyviewedpage.C10045f;
import com.etsy.android.p327ui.home.tabs.C10068n;
import com.etsy.android.p327ui.user.UserBadgeCountManager;
import com.etsy.android.push.PushOptInFatigue;
import dagger.internal.C17555d;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.operators.observable.C19172m;
import p145io.reactivex.internal.operators.observable.C19179q;
import p402n9.C13086f;
import p456ua.C13461f;
import p486y9.C13886b;
import p496za.C13943a;
import p740eq.C19011a;

/* renamed from: com.etsy.android.lib.network.oauth2.j */
public final class C8760j implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f19260a;

    /* renamed from: b */
    public final C19011a f19261b;

    /* renamed from: c */
    public final C19011a f19262c;

    /* renamed from: d */
    public final C19011a f19263d;

    public /* synthetic */ C8760j(C19011a aVar, C19011a aVar2, C19011a aVar3, int i) {
        this.f19260a = i;
        this.f19261b = aVar;
        this.f19262c = aVar2;
        this.f19263d = aVar3;
    }

    public final Object get() {
        switch (this.f19260a) {
            case 0:
                return new C8759i((C8756g) this.f19261b.get(), (C8750d) this.f19262c.get(), (C8795v) this.f19263d.get());
            case 1:
                return new PushOptInFatigue((C8672b) this.f19261b.get(), (C13943a) this.f19262c.get(), (C8890e0) this.f19263d.get());
            case 2:
                return new C9599g((C9477c) this.f19261b.get(), (C8731g) this.f19262c.get(), (UserBadgeCountManager) this.f19263d.get());
            case 3:
                return new C10045f((C10043d) this.f19261b.get(), (C13461f) this.f19262c.get(), (C7091a) this.f19263d.get());
            default:
                EtsyConfigKey etsyConfigKey = (EtsyConfigKey) this.f19261b.get();
                C13886b bVar = (C13886b) this.f19262c.get();
                C19383o.m32797g(etsyConfigKey, "brazeKillSwitchFlag");
                C19383o.m32797g(bVar, "config");
                C19383o.m32797g((C13461f) this.f19263d.get(), "schedulers");
                return new C19172m(new C19179q(new C19179q(bVar.mo46713a(), new C13086f(5)), new C10068n(etsyConfigKey, 1)).mo20635e(C13461f.m21236c()));
        }
    }
}

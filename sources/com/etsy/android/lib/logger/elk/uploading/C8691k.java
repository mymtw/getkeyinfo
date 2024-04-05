package com.etsy.android.lib.logger.elk.uploading;

import com.etsy.android.lib.config.C8618c;
import com.etsy.android.p327ui.conversation.details.C9477c;
import com.etsy.android.p327ui.conversation.list.ccm.C9578b;
import com.etsy.android.p327ui.conversation.list.ccm.C9582f;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.C10330d;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.C10331e;
import com.etsy.android.p327ui.user.UserBadgeCountManager;
import com.etsy.android.push.C8941d;
import com.etsy.android.push.PushOptInFatigue;
import dagger.internal.C17555d;
import p336dc.C12645c;
import p336dc.C12646d;
import p366ia.C12920a;
import p369id.C12932a;
import p466vc.C13573c;
import p740eq.C19011a;

/* renamed from: com.etsy.android.lib.logger.elk.uploading.k */
public final class C8691k implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f19092a;

    /* renamed from: b */
    public final C19011a f19093b;

    /* renamed from: c */
    public final C19011a f19094c;

    /* renamed from: d */
    public final C19011a f19095d;

    public /* synthetic */ C8691k(C19011a aVar, C19011a aVar2, C19011a aVar3, int i) {
        this.f19092a = i;
        this.f19093b = aVar;
        this.f19094c = aVar2;
        this.f19095d = aVar3;
    }

    public final Object get() {
        switch (this.f19092a) {
            case 0:
                return new C8689j((C8687h) this.f19093b.get(), (C12920a) this.f19094c.get(), (C8618c) this.f19095d.get());
            case 1:
                return new C12646d((C8941d) this.f19093b.get(), (C12645c) this.f19094c.get(), (PushOptInFatigue) this.f19095d.get());
            case 2:
                return new C9582f((C9477c) this.f19093b.get(), (C9578b) this.f19094c.get(), (UserBadgeCountManager) this.f19095d.get());
            default:
                return new C10330d((C13573c) this.f19093b.get(), (C12932a) this.f19094c.get(), (C10331e) this.f19095d.get());
        }
    }
}

package com.etsy.android.p327ui.user;

import com.etsy.android.lib.config.bucketing.C8617e;
import com.etsy.android.p327ui.homescreen.C10074a;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.HomePagerKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ReceiptKey;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19456j;
import p350fe.C12729e;
import p350fe.C12730f;
import p350fe.C12731g;
import p428qc.C13294e;

/* renamed from: com.etsy.android.ui.user.t */
public final class C11761t implements C12729e {

    /* renamed from: a */
    public final C13294e f26205a;

    public C11761t(C13294e eVar) {
        C19383o.m32797g(eVar, "homescreenEventManager");
        this.f26205a = eVar;
    }

    /* renamed from: a */
    public final C12731g mo30554a(C12730f fVar) {
        String lastPathSegment = fVar.f28049b.getLastPathSegment();
        if ((lastPathSegment != null ? C19456j.m33017U0(lastPathSegment) : null) == null) {
            return new C12731g.C12732a("Invalid receipt id " + fVar + ".uri");
        } else if (fVar.f28048a.mo21331a(C8617e.f18935d).f18927b) {
            this.f26205a.mo45971a(new C10074a((Long) null, Long.parseLong(lastPathSegment)));
            return new C12731g.C12733b(new HomePagerKey(fVar.f28050c, fVar.f28051d, true));
        } else {
            return new C12731g.C12733b(new ReceiptKey(fVar.f28050c, C19456j.m33017U0(lastPathSegment), (Long) null, false, fVar.f28051d, 12, (DefaultConstructorMarker) null));
        }
    }
}

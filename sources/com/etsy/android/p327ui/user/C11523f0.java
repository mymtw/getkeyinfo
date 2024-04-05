package com.etsy.android.p327ui.user;

import android.net.Uri;
import android.os.Bundle;
import android.support.p013v4.media.C0073e;
import com.etsy.android.lib.deeplinks.DeepLinkEntity;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ReceiptKey;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19456j;
import p350fe.C12729e;
import p350fe.C12730f;
import p350fe.C12731g;
import p350fe.C12741o;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.user.f0 */
public final class C11523f0 implements C12729e {

    /* renamed from: a */
    public final C12741o f25420a;

    public C11523f0(C12741o oVar) {
        C19383o.m32797g(oVar, "routeInspector");
        this.f25420a = oVar;
    }

    /* renamed from: a */
    public final C12731g mo30554a(C12730f fVar) {
        Uri uri = fVar.f28049b;
        String str = fVar.f28050c;
        Bundle bundle = fVar.f28051d;
        String e = this.f25420a.mo45510e(uri, DeepLinkEntity.TRANSACTION.getEntityName());
        return C18263b.m30839d0(e) ? new C12731g.C12733b(new ReceiptKey(str, (Long) null, C19456j.m33017U0(e), false, bundle, 10, (DefaultConstructorMarker) null)) : new C12731g.C12732a(C0073e.m206f("Invalid Transaction ID ", uri));
    }
}

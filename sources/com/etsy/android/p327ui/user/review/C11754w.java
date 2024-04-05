package com.etsy.android.p327ui.user.review;

import android.net.Uri;
import android.os.Bundle;
import android.support.p013v4.media.C0073e;
import com.etsy.android.lib.deeplinks.DeepLinkEntity;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.navigation.deeplinks.DeepLinkHandlerException;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p350fe.C12729e;
import p350fe.C12730f;
import p350fe.C12731g;
import p350fe.C12741o;
import p370ie.C12942b;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.user.review.w */
public final class C11754w implements C12729e {

    /* renamed from: a */
    public final C12741o f26192a;

    public C11754w(C12741o oVar) {
        C19383o.m32797g(oVar, "routeInspector");
        this.f26192a = oVar;
    }

    /* renamed from: a */
    public final C12731g mo30554a(C12730f fVar) {
        Uri uri = fVar.f28049b;
        C12741o oVar = this.f26192a;
        DeepLinkEntity deepLinkEntity = DeepLinkEntity.COMPOSE_REVIEW;
        if (!oVar.mo45509b(uri, deepLinkEntity.getEntityName())) {
            C12741o oVar2 = this.f26192a;
            deepLinkEntity = DeepLinkEntity.CREATE_REVIEW;
            if (!oVar2.mo45509b(uri, deepLinkEntity.getEntityName())) {
                C12741o oVar3 = this.f26192a;
                deepLinkEntity = DeepLinkEntity.REVIEW;
                if (!oVar3.mo45509b(uri, deepLinkEntity.getEntityName())) {
                    throw new DeepLinkHandlerException(C0073e.m206f("invalid deep link entity ", uri));
                }
            }
        }
        String e = this.f26192a.mo45510e(fVar.f28049b, deepLinkEntity.getEntityName());
        if (C18263b.m30839d0(e)) {
            String str = fVar.f28050c;
            Bundle bundle = fVar.f28051d;
            Uri uri2 = fVar.f28049b;
            this.f26192a.getClass();
            return new C12731g.C12733b(new C12942b(str, new EtsyId(e), (List) null, deepLinkEntity == DeepLinkEntity.CREATE_REVIEW ? ReviewTrackingSource.PUSH_NOTIFICATION : C19383o.m32792b(C12741o.m20404d(uri2, "utm_medium"), "email") ? ReviewTrackingSource.EMAIL : ReviewTrackingSource.MISC_EXTERNAL_LINK, (Integer) null, bundle, 20));
        }
        return new C12731g.C12732a("Invalid transaction id " + fVar + ".uri");
    }
}

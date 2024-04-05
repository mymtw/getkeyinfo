package com.etsy.android.p327ui.home.editorspicks;

import android.net.Uri;
import android.support.p013v4.media.C0073e;
import com.etsy.android.lib.deeplinks.DeepLinkEntity;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.EditorsPicksKey;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p350fe.C12729e;
import p350fe.C12730f;
import p350fe.C12731g;
import p350fe.C12741o;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.home.editorspicks.i */
public final class C9941i implements C12729e {

    /* renamed from: a */
    public final C12741o f21909a;

    public C9941i(C12741o oVar) {
        C19383o.m32797g(oVar, "routeInspector");
        this.f21909a = oVar;
    }

    /* renamed from: a */
    public final C12731g mo30554a(C12730f fVar) {
        Uri uri = fVar.f28049b;
        String e = this.f21909a.mo45510e(uri, DeepLinkEntity.FEATURED.getEntityName());
        this.f21909a.getClass();
        String queryParameter = uri.getQueryParameter(ResponseConstants.ANCHOR_LISTING_ID);
        this.f21909a.getClass();
        boolean parseBoolean = Boolean.parseBoolean(uri.getQueryParameter("view_draft_content"));
        if (!C18263b.m30839d0(e)) {
            return new C12731g.C12732a(C0073e.m206f("Missing slug ", uri));
        }
        return new C12731g.C12733b(new EditorsPicksKey(fVar.f28050c, e, parseBoolean, queryParameter, uri.getFragment(), fVar.f28051d, (String) null, 64, (DefaultConstructorMarker) null));
    }
}

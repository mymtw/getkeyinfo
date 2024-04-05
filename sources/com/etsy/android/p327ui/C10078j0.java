package com.etsy.android.p327ui;

import android.net.Uri;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.lib.config.BuildTarget;
import com.etsy.android.lib.deeplinks.DeepLinkEntity;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.VespaArbitraryEndpointKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.VespaDemoKey;
import kotlin.jvm.internal.C19383o;
import p350fe.C12729e;
import p350fe.C12730f;
import p350fe.C12731g;
import p350fe.C12741o;

/* renamed from: com.etsy.android.ui.j0 */
public final class C10078j0 implements C12729e {

    /* renamed from: a */
    public final C12741o f22212a;

    public C10078j0(C12741o oVar) {
        C19383o.m32797g(oVar, "routeInspector");
        this.f22212a = oVar;
    }

    /* renamed from: a */
    public final C12731g mo30554a(C12730f fVar) {
        C12741o oVar = this.f22212a;
        Uri uri = fVar.f28049b;
        DeepLinkEntity deepLinkEntity = DeepLinkEntity.VESPA_DEMO_PAGE;
        boolean b = oVar.mo45509b(uri, deepLinkEntity.getEntityName());
        if (!C0326j.m869n(BuildTarget.Companion)) {
            return new C12731g.C12732a("Invalid deep link usage " + fVar + ".uri");
        } else if (!b) {
            return new C12731g.C12733b(new VespaArbitraryEndpointKey(fVar.f28050c, fVar.f28051d));
        } else {
            return new C12731g.C12733b(new VespaDemoKey(fVar.f28050c, this.f22212a.mo45510e(fVar.f28049b, deepLinkEntity.getEntityName()), fVar.f28051d));
        }
    }
}

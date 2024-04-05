package com.etsy.android.p327ui.home.etsylens;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.home.etsylens.C9974e;
import com.etsy.android.util.C12060q;
import java.io.File;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.home.etsylens.EtsyLensPresenter$handleEtsyLensEvent$8 */
final class EtsyLensPresenter$handleEtsyLensEvent$8 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ C9974e.C9975a $event;
    public final /* synthetic */ EtsyLensPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EtsyLensPresenter$handleEtsyLensEvent$8(EtsyLensPresenter etsyLensPresenter, C9974e.C9975a aVar) {
        super(0);
        this.this$0 = etsyLensPresenter;
        this.$event = aVar;
    }

    public final void invoke() {
        C9974e eVar = this.this$0.f21944c;
        File file = ((C9974e.C9975a.C9980e) this.$event).f21968a;
        eVar.getClass();
        C19383o.m32797g(file, ResponseConstants.FILE);
        C12060q.m19871b(eVar.f21962d, new C9974e.C9975a.C9977b(file));
    }
}

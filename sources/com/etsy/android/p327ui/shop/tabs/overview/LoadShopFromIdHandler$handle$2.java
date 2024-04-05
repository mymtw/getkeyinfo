package com.etsy.android.p327ui.shop.tabs.overview;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.shop.BaseShopHomePageRepository;
import com.etsy.android.p327ui.shop.C11167i;
import com.etsy.android.p327ui.shop.C11172k0;
import com.etsy.android.p327ui.shop.ShopHomeInitialLoadConfiguration;
import com.etsy.android.p327ui.shop.tabs.C11209a;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.etsy.android.ui.shop.tabs.overview.LoadShopFromIdHandler$handle$2", mo70541f = "LoadShopFromIdHandler.kt", mo70542l = {41}, mo70543m = "invokeSuspend")
/* renamed from: com.etsy.android.ui.shop.tabs.overview.LoadShopFromIdHandler$handle$2 */
final class LoadShopFromIdHandler$handle$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C11209a.C11211b $event;
    public int label;
    public final /* synthetic */ C11233b this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoadShopFromIdHandler$handle$2(C11209a.C11211b bVar, C11233b bVar2, C19340c<? super LoadShopFromIdHandler$handle$2> cVar) {
        super(2, cVar);
        this.$event = bVar;
        this.this$0 = bVar2;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new LoadShopFromIdHandler$handle$2(this.$event, this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((LoadShopFromIdHandler$handle$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            EtsyId etsyId = new EtsyId(this.$event.f24784a);
            C11209a.C11211b bVar = this.$event;
            C11167i iVar = new C11167i(etsyId, "", true, (ShopHomeInitialLoadConfiguration) null, bVar.f24785b, bVar.f24786c, this.this$0.f24819d.f24633a.mo21132b(C8592b.C8595c.f18865i));
            BaseShopHomePageRepository baseShopHomePageRepository = this.this$0.f24818c;
            this.label = 1;
            obj = baseShopHomePageRepository.mo36761a(iVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C11172k0 k0Var = (C11172k0) obj;
        if (k0Var instanceof C11172k0.C11174b) {
            this.this$0.f24817b.mo38013a(new C11209a.C11213d(((C11172k0.C11174b) k0Var).f24714a));
        } else if (k0Var instanceof C11172k0.C11173a) {
            C11172k0.C11173a aVar = (C11172k0.C11173a) k0Var;
            this.this$0.f24817b.mo38013a(new C11209a.C11210a(aVar.f24713b, aVar.f24712a));
        }
        return C19394m.f43287a;
    }
}

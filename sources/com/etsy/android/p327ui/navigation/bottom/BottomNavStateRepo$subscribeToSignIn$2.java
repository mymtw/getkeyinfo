package com.etsy.android.p327ui.navigation.bottom;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.navigation.bottom.BottomNavStateRepo$subscribeToSignIn$2 */
public final class BottomNavStateRepo$subscribeToSignIn$2 extends Lambda implements C19857l<Boolean, C19394m> {
    public final /* synthetic */ BottomNavStateRepo this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomNavStateRepo$subscribeToSignIn$2(BottomNavStateRepo bottomNavStateRepo) {
        super(1);
        this.this$0 = bottomNavStateRepo;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Boolean) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Boolean bool) {
        if (!bool.booleanValue()) {
            BottomNavStateRepo bottomNavStateRepo = this.this$0;
            bottomNavStateRepo.f23544k.onNext(bottomNavStateRepo.f23543j);
        }
        this.this$0.mo34416c();
    }
}

package com.etsy.android.p327ui.home.home;

import com.etsy.android.lib.models.homescreen.HomeTab;
import com.etsy.android.p327ui.home.home.C10002i;
import com.etsy.android.p327ui.home.home.C9995f;
import com.etsy.android.p327ui.home.home.C9998g;
import java.util.ArrayList;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.StateFlowImpl;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.home.home.HomeViewModel$loadHome$6 */
public final class HomeViewModel$loadHome$6 extends Lambda implements C19857l<C9995f, C19394m> {
    public final /* synthetic */ boolean $scrollToTop;
    public final /* synthetic */ HomeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeViewModel$loadHome$6(HomeViewModel homeViewModel, boolean z) {
        super(1);
        this.this$0 = homeViewModel;
        this.$scrollToTop = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C9995f) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C9995f fVar) {
        Object value;
        C9995f.C9997b bVar;
        C9995f fVar2 = fVar;
        if (fVar2 instanceof C9995f.C9997b) {
            HomeViewModel homeViewModel = this.this$0;
            StateFlowImpl stateFlowImpl = homeViewModel.f21986k;
            boolean z = this.$scrollToTop;
            do {
                value = stateFlowImpl.getValue();
                bVar = (C9995f.C9997b) fVar2;
            } while (!stateFlowImpl.mo72337i(value, C10001h.m18179b(((C10001h) value).mo33234a(new C9998g.C10000b(bVar.f22000a, homeViewModel.mo33215d(bVar.f22001b), z)), (String) null, (ArrayList) null, (String) null, (HomeTab) null, false, false, bVar.f22000a.getTitle(), C10002i.C10006d.f22018a, homeViewModel.mo33215d(bVar.f22001b), 63)));
            this.this$0.f21982g.f18117j.clear();
        } else if (fVar2 instanceof C9995f.C9996a) {
            HomeViewModel.m18172b(this.this$0, ((C9995f.C9996a) fVar2).f21998a);
        }
    }
}

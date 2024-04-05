package com.etsy.android.p327ui.cart.saveforlater;

import androidx.compose.foundation.layout.C0761x;
import androidx.lifecycle.C2866i0;
import com.etsy.android.p327ui.util.C11786n;
import kotlin.C19394m;
import kotlin.collections.EmptyList;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.StateFlowImpl;
import p308ac.C8498b;
import p488yb.C13901c;
import p744gq.C19060c;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.cart.saveforlater.SaveForLaterViewModel */
public final class SaveForLaterViewModel extends C2866i0 {

    /* renamed from: b */
    public final SaveForLaterRepository f20635b;

    /* renamed from: c */
    public final C13901c f20636c;

    /* renamed from: d */
    public final StateFlowImpl f20637d;

    /* renamed from: e */
    public final StateFlowImpl f20638e;

    @C19060c(mo70540c = "com.etsy.android.ui.cart.saveforlater.SaveForLaterViewModel$1", mo70541f = "SaveForLaterViewModel.kt", mo70542l = {27}, mo70543m = "invokeSuspend")
    /* renamed from: com.etsy.android.ui.cart.saveforlater.SaveForLaterViewModel$1 */
    public static final class C93501 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
        public int label;
        public final /* synthetic */ SaveForLaterViewModel this$0;

        {
            this.this$0 = r1;
        }

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C93501(this.this$0, cVar);
        }

        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C93501) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                SaveForLaterViewModel saveForLaterViewModel = this.this$0;
                this.label = 1;
                if (SaveForLaterViewModel.m17713b(saveForLaterViewModel, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                C0761x.m1684O0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C19394m.f43287a;
        }
    }

    public SaveForLaterViewModel(SaveForLaterRepository saveForLaterRepository, C13901c cVar, C11786n nVar) {
        C19383o.m32797g(saveForLaterRepository, "repository");
        C19383o.m32797g(cVar, "viewStateMapper");
        C19383o.m32797g(nVar, "resourceProvider");
        this.f20635b = saveForLaterRepository;
        this.f20636c = cVar;
        StateFlowImpl g = C19388s.m32862g(new C9360e(C8498b.C8500b.f18522a, EmptyList.INSTANCE));
        this.f20637d = g;
        this.f20638e = g;
        C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new C93501(this, (C19340c<? super C93501>) null), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00dc A[LOOP:1: B:19:0x0068->B:33:0x00dc, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m17713b(com.etsy.android.p327ui.cart.saveforlater.SaveForLaterViewModel r17, kotlin.coroutines.C19340c r18) {
        /*
            r0 = r17
            r1 = r18
            r17.getClass()
            boolean r2 = r1 instanceof com.etsy.android.p327ui.cart.saveforlater.SaveForLaterViewModel$getSaveForLater$1
            if (r2 == 0) goto L_0x001a
            r2 = r1
            com.etsy.android.ui.cart.saveforlater.SaveForLaterViewModel$getSaveForLater$1 r2 = (com.etsy.android.p327ui.cart.saveforlater.SaveForLaterViewModel$getSaveForLater$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001a
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001f
        L_0x001a:
            com.etsy.android.ui.cart.saveforlater.SaveForLaterViewModel$getSaveForLater$1 r2 = new com.etsy.android.ui.cart.saveforlater.SaveForLaterViewModel$getSaveForLater$1
            r2.<init>(r0, r1)
        L_0x001f:
            java.lang.Object r1 = r2.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r2.label
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L_0x003d
            if (r4 != r6) goto L_0x0035
            java.lang.Object r0 = r2.L$0
            com.etsy.android.ui.cart.saveforlater.SaveForLaterViewModel r0 = (com.etsy.android.p327ui.cart.saveforlater.SaveForLaterViewModel) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r1)
        L_0x0033:
            r4 = r0
            goto L_0x0063
        L_0x0035:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003d:
            androidx.compose.foundation.layout.C0761x.m1684O0(r1)
            kotlinx.coroutines.flow.StateFlowImpl r1 = r0.f20637d
        L_0x0042:
            java.lang.Object r4 = r1.getValue()
            r8 = r4
            com.etsy.android.ui.cart.saveforlater.e r8 = (com.etsy.android.p327ui.cart.saveforlater.C9360e) r8
            ac.b$c r9 = p308ac.C8498b.C8501c.f18523a
            com.etsy.android.ui.cart.saveforlater.e r8 = com.etsy.android.p327ui.cart.saveforlater.C9360e.m17717a(r8, r9, r7, r5)
            boolean r4 = r1.mo72337i(r4, r8)
            if (r4 == 0) goto L_0x0042
            com.etsy.android.ui.cart.saveforlater.SaveForLaterRepository r1 = r0.f20635b
            r2.L$0 = r0
            r2.label = r6
            java.lang.Object r1 = r1.mo31768a(r2)
            if (r1 != r3) goto L_0x0033
            goto L_0x00db
        L_0x0063:
            r8 = r1
            com.etsy.android.ui.cart.saveforlater.c r8 = (com.etsy.android.p327ui.cart.saveforlater.C9355c) r8
            kotlinx.coroutines.flow.StateFlowImpl r9 = r4.f20637d
        L_0x0068:
            java.lang.Object r0 = r9.getValue()
            r1 = r0
            com.etsy.android.ui.cart.saveforlater.e r1 = (com.etsy.android.p327ui.cart.saveforlater.C9360e) r1
            yb.c r2 = r4.f20636c
            r2.getClass()
            java.lang.String r3 = "result"
            kotlin.jvm.internal.C19383o.m32797g(r8, r3)
            boolean r3 = r8 instanceof com.etsy.android.p327ui.cart.saveforlater.C9355c.C9357b
            if (r3 == 0) goto L_0x00cd
            r3 = r8
            com.etsy.android.ui.cart.saveforlater.c$b r3 = (com.etsy.android.p327ui.cart.saveforlater.C9355c.C9357b) r3
            zb.a r3 = r3.f20642a
            java.util.List<zb.b> r10 = r3.f30663a
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L_0x008d
            ac.b$d r2 = p308ac.C8498b.C8502d.f18524a
            goto L_0x00cf
        L_0x008d:
            java.util.List<zb.b> r3 = r3.f30663a
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = kotlin.collections.C19322o.m32624F0(r3)
            r10.<init>(r11)
            java.util.Iterator r3 = r3.iterator()
        L_0x009c:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto L_0x00c7
            java.lang.Object r11 = r3.next()
            zb.b r11 = (p497zb.C13945b) r11
            com.etsy.android.ui.cart.saveforlater.models.ui.card.a r12 = new com.etsy.android.ui.cart.saveforlater.models.ui.card.a
            java.lang.String r13 = r11.f30664a
            com.etsy.android.ui.util.n r14 = r2.f30564a
            java.lang.Object[] r15 = new java.lang.Object[r6]
            r16 = 0
            java.lang.String r6 = r11.f30665b
            r15[r16] = r6
            r6 = 2131952289(0x7f1302a1, float:1.9541017E38)
            java.lang.String r6 = r14.mo38059c(r6, r15)
            boolean r11 = r11.f30666c
            r12.<init>(r13, r6, r11)
            r10.add(r12)
            r6 = 1
            goto L_0x009c
        L_0x00c7:
            ac.b$e r2 = new ac.b$e
            r2.<init>(r10)
            goto L_0x00cf
        L_0x00cd:
            ac.b$a r2 = p308ac.C8498b.C8499a.f18521a
        L_0x00cf:
            com.etsy.android.ui.cart.saveforlater.e r1 = com.etsy.android.p327ui.cart.saveforlater.C9360e.m17717a(r1, r2, r7, r5)
            boolean r0 = r9.mo72337i(r0, r1)
            if (r0 == 0) goto L_0x00dc
            kotlin.m r3 = kotlin.C19394m.f43287a
        L_0x00db:
            return r3
        L_0x00dc:
            r6 = 1
            goto L_0x0068
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.cart.saveforlater.SaveForLaterViewModel.m17713b(com.etsy.android.ui.cart.saveforlater.SaveForLaterViewModel, kotlin.coroutines.c):java.lang.Object");
    }
}

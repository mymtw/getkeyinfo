package com.etsy.android.p327ui.shop.tabs;

import androidx.compose.foundation.layout.C0761x;
import androidx.lifecycle.C2866i0;
import com.etsy.android.p327ui.shop.tabs.C11224i;
import com.etsy.android.util.C12065v;
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
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C19600e;
import kotlinx.coroutines.flow.C19662p1;
import kotlinx.coroutines.flow.C19671s1;
import kotlinx.coroutines.flow.StateFlowImpl;
import p634np.C18289a;
import p744gq.C19060c;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.shop.tabs.ShopViewModel */
public final class ShopViewModel extends C2866i0 {

    /* renamed from: b */
    public final C18289a<C11217d> f24770b;

    /* renamed from: c */
    public final C11216c f24771c = new C11216c(C19388s.m32866i0(this));

    /* renamed from: d */
    public final StateFlowImpl f24772d;

    /* renamed from: e */
    public final C19662p1 f24773e;

    /* renamed from: f */
    public final C19662p1 f24774f;

    /* renamed from: g */
    public Long f24775g;

    /* renamed from: h */
    public String f24776h;

    /* renamed from: i */
    public String f24777i;

    /* renamed from: j */
    public String f24778j;

    @C19060c(mo70540c = "com.etsy.android.ui.shop.tabs.ShopViewModel$1", mo70541f = "ShopViewModel.kt", mo70542l = {44}, mo70543m = "invokeSuspend")
    /* renamed from: com.etsy.android.ui.shop.tabs.ShopViewModel$1 */
    public static final class C112071 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
        public int label;
        public final /* synthetic */ ShopViewModel this$0;

        {
            this.this$0 = r1;
        }

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C112071(this.this$0, cVar);
        }

        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C112071) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                final ShopViewModel shopViewModel = this.this$0;
                C19671s1 s1Var = shopViewModel.f24771c.f26218b;
                C112081 r3 = new C19600e<C11215b>() {
                    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
                    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
                    /* renamed from: b */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final java.lang.Object emit(com.etsy.android.p327ui.shop.tabs.C11215b r12, kotlin.coroutines.C19340c<? super kotlin.C19394m> r13) {
                        /*
                            r11 = this;
                            boolean r0 = r13 instanceof com.etsy.android.p327ui.shop.tabs.ShopViewModel$1$1$emit$1
                            if (r0 == 0) goto L_0x0013
                            r0 = r13
                            com.etsy.android.ui.shop.tabs.ShopViewModel$1$1$emit$1 r0 = (com.etsy.android.p327ui.shop.tabs.ShopViewModel$1$1$emit$1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L_0x0013
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L_0x0018
                        L_0x0013:
                            com.etsy.android.ui.shop.tabs.ShopViewModel$1$1$emit$1 r0 = new com.etsy.android.ui.shop.tabs.ShopViewModel$1$1$emit$1
                            r0.<init>(r11, r13)
                        L_0x0018:
                            java.lang.Object r13 = r0.result
                            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L_0x0034
                            if (r2 != r3) goto L_0x002c
                            java.lang.Object r12 = r0.L$0
                            com.etsy.android.ui.shop.tabs.ShopViewModel$1$1 r12 = (com.etsy.android.p327ui.shop.tabs.ShopViewModel.C112071.C112081) r12
                            androidx.compose.foundation.layout.C0761x.m1684O0(r13)
                            goto L_0x01e3
                        L_0x002c:
                            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                            r12.<init>(r13)
                            throw r12
                        L_0x0034:
                            androidx.compose.foundation.layout.C0761x.m1684O0(r13)
                            boolean r13 = r12 instanceof com.etsy.android.p327ui.shop.tabs.C11219f
                            java.lang.String r2 = "event"
                            r4 = 0
                            if (r13 == 0) goto L_0x0064
                            com.etsy.android.ui.shop.tabs.ShopViewModel r13 = r5
                            kotlinx.coroutines.flow.StateFlowImpl r13 = r13.f24772d
                        L_0x0042:
                            java.lang.Object r0 = r13.getValue()
                            r1 = r0
                            com.etsy.android.ui.shop.tabs.g r1 = (com.etsy.android.p327ui.shop.tabs.C11221g) r1
                            r5 = r12
                            com.etsy.android.ui.shop.tabs.f r5 = (com.etsy.android.p327ui.shop.tabs.C11219f) r5
                            r1.getClass()
                            kotlin.jvm.internal.C19383o.m32797g(r5, r2)
                            java.util.List<com.etsy.android.ui.shop.tabs.f> r6 = r1.f24803b
                            java.util.ArrayList r5 = kotlin.collections.C19327t.m32651g1(r6, r5)
                            com.etsy.android.ui.shop.tabs.g r1 = com.etsy.android.p327ui.shop.tabs.C11221g.m19147a(r1, r4, r5, r3)
                            boolean r0 = r13.mo72337i(r0, r1)
                            if (r0 == 0) goto L_0x0042
                            goto L_0x01f6
                        L_0x0064:
                            com.etsy.android.ui.shop.tabs.ShopViewModel r13 = r5
                            np.a<com.etsy.android.ui.shop.tabs.d> r13 = r13.f24770b
                            java.lang.Object r13 = r13.get()
                            com.etsy.android.ui.shop.tabs.d r13 = (com.etsy.android.p327ui.shop.tabs.C11217d) r13
                            com.etsy.android.ui.shop.tabs.ShopViewModel r5 = r5
                            kotlinx.coroutines.d0 r5 = kotlin.jvm.internal.C19388s.m32866i0(r5)
                            com.etsy.android.ui.shop.tabs.ShopViewModel r6 = r5
                            kotlinx.coroutines.flow.StateFlowImpl r6 = r6.f24772d
                            java.lang.Object r6 = r6.getValue()
                            com.etsy.android.ui.shop.tabs.g r6 = (com.etsy.android.p327ui.shop.tabs.C11221g) r6
                            r0.L$0 = r11
                            r0.label = r3
                            r13.getClass()
                            boolean r0 = r12 instanceof com.etsy.android.p327ui.shop.tabs.C11222h
                            r7 = 2
                            r8 = 0
                            if (r0 == 0) goto L_0x00fd
                            com.etsy.android.ui.shop.tabs.i r0 = r6.f24802a
                            boolean r0 = r0 instanceof com.etsy.android.p327ui.shop.tabs.C11224i.C11230f
                            if (r0 == 0) goto L_0x00fd
                            com.etsy.android.ui.shop.tabs.h r12 = (com.etsy.android.p327ui.shop.tabs.C11222h) r12
                            boolean r0 = r12 instanceof com.etsy.android.p327ui.shop.tabs.C11222h.C11223a
                            if (r0 == 0) goto L_0x00f7
                            com.etsy.android.ui.shop.tabs.overview.g r13 = r13.f24791a
                            com.etsy.android.ui.shop.tabs.h$a r12 = (com.etsy.android.p327ui.shop.tabs.C11222h.C11223a) r12
                            r13.getClass()
                            kotlin.jvm.internal.C19383o.m32797g(r12, r2)
                            com.etsy.android.ui.shop.tabs.i r13 = r6.f24802a
                            java.lang.String r0 = "null cannot be cast to non-null type com.etsy.android.ui.shop.tabs.ShopUi.ShowShop"
                            kotlin.jvm.internal.C19383o.m32795e(r13, r0)
                            com.etsy.android.ui.shop.tabs.i$f r13 = (com.etsy.android.p327ui.shop.tabs.C11224i.C11230f) r13
                            java.util.List<com.etsy.android.ui.shop.tabs.Tab> r0 = r13.f24812b
                            java.util.ArrayList r2 = new java.util.ArrayList
                            int r5 = kotlin.collections.C19322o.m32624F0(r0)
                            r2.<init>(r5)
                            java.util.Iterator r0 = r0.iterator()
                        L_0x00b9:
                            boolean r5 = r0.hasNext()
                            if (r5 == 0) goto L_0x00e4
                            java.lang.Object r5 = r0.next()
                            com.etsy.android.ui.shop.tabs.Tab r5 = (com.etsy.android.p327ui.shop.tabs.Tab) r5
                            com.etsy.android.ui.shop.tabs.Tab r9 = r12.f24804a
                            com.etsy.android.ui.shop.tabs.Tab$Type r9 = r9.f24780a
                            com.etsy.android.ui.shop.tabs.Tab$Type r5 = r5.f24780a
                            java.lang.String r10 = "tabType"
                            if (r9 != r5) goto L_0x00d8
                            kotlin.jvm.internal.C19383o.m32797g(r5, r10)
                            com.etsy.android.ui.shop.tabs.Tab r9 = new com.etsy.android.ui.shop.tabs.Tab
                            r9.<init>(r5, r3)
                            goto L_0x00e0
                        L_0x00d8:
                            kotlin.jvm.internal.C19383o.m32797g(r5, r10)
                            com.etsy.android.ui.shop.tabs.Tab r9 = new com.etsy.android.ui.shop.tabs.Tab
                            r9.<init>(r5, r8)
                        L_0x00e0:
                            r2.add(r9)
                            goto L_0x00b9
                        L_0x00e4:
                            java.lang.String r12 = r13.f24811a
                            java.lang.String r13 = "title"
                            kotlin.jvm.internal.C19383o.m32797g(r12, r13)
                            com.etsy.android.ui.shop.tabs.i$f r13 = new com.etsy.android.ui.shop.tabs.i$f
                            r13.<init>(r12, r2)
                            com.etsy.android.ui.shop.tabs.g r12 = com.etsy.android.p327ui.shop.tabs.C11221g.m19147a(r6, r13, r4, r7)
                            r13 = r12
                            goto L_0x01df
                        L_0x00f7:
                            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
                            r12.<init>()
                            throw r12
                        L_0x00fd:
                            boolean r0 = r12 instanceof com.etsy.android.p327ui.shop.tabs.C11209a
                            if (r0 == 0) goto L_0x01de
                            com.etsy.android.ui.shop.tabs.a r12 = (com.etsy.android.p327ui.shop.tabs.C11209a) r12
                            boolean r0 = r12 instanceof com.etsy.android.p327ui.shop.tabs.C11209a.C11211b
                            if (r0 == 0) goto L_0x0110
                            com.etsy.android.ui.shop.tabs.overview.b r13 = r13.f24792b
                            com.etsy.android.ui.shop.tabs.a$b r12 = (com.etsy.android.p327ui.shop.tabs.C11209a.C11211b) r12
                            r13.mo36944a(r5, r12, r6)
                            goto L_0x01de
                        L_0x0110:
                            boolean r0 = r12 instanceof com.etsy.android.p327ui.shop.tabs.C11209a.C11212c
                            if (r0 == 0) goto L_0x0116
                            goto L_0x01de
                        L_0x0116:
                            boolean r0 = r12 instanceof com.etsy.android.p327ui.shop.tabs.C11209a.C11213d
                            java.lang.String r5 = "state"
                            if (r0 == 0) goto L_0x0173
                            com.etsy.android.ui.shop.tabs.overview.c r13 = r13.f24793c
                            com.etsy.android.ui.shop.tabs.a$d r12 = (com.etsy.android.p327ui.shop.tabs.C11209a.C11213d) r12
                            r13.getClass()
                            kotlin.jvm.internal.C19383o.m32797g(r12, r2)
                            kotlin.jvm.internal.C19383o.m32797g(r6, r5)
                            r13 = 3
                            com.etsy.android.ui.shop.tabs.Tab[] r13 = new com.etsy.android.p327ui.shop.tabs.Tab[r13]
                            com.etsy.android.ui.shop.tabs.Tab r0 = new com.etsy.android.ui.shop.tabs.Tab
                            com.etsy.android.ui.shop.tabs.Tab$Type r2 = com.etsy.android.p327ui.shop.tabs.Tab.Type.ITEMS
                            r0.<init>(r2, r3)
                            r13[r8] = r0
                            com.etsy.android.ui.shop.tabs.Tab r0 = new com.etsy.android.ui.shop.tabs.Tab
                            com.etsy.android.ui.shop.tabs.Tab$Type r2 = com.etsy.android.p327ui.shop.tabs.Tab.Type.REVIEWS
                            r0.<init>(r2, r8)
                            r13[r3] = r0
                            com.etsy.android.ui.shop.tabs.Tab r0 = new com.etsy.android.ui.shop.tabs.Tab
                            com.etsy.android.ui.shop.tabs.Tab$Type r2 = com.etsy.android.p327ui.shop.tabs.Tab.Type.ABOUT
                            r0.<init>(r2, r8)
                            r13[r7] = r0
                            java.util.List r13 = p568fn.C17782b.m29865e0(r13)
                            com.etsy.android.ui.shop.tabs.f$a r0 = new com.etsy.android.ui.shop.tabs.f$a
                            r0.<init>()
                            com.etsy.android.ui.shop.tabs.i$f r2 = new com.etsy.android.ui.shop.tabs.i$f
                            com.etsy.android.lib.models.apiv3.ShopHomePage r12 = r12.f24788a
                            com.etsy.android.lib.models.apiv3.ShopV3 r12 = r12.getShop()
                            java.lang.String r12 = r12.getShopName()
                            java.lang.String r5 = "event.page.shop.shopName"
                            kotlin.jvm.internal.C19383o.m32796f(r12, r5)
                            r2.<init>(r12, r13)
                            java.util.List<com.etsy.android.ui.shop.tabs.f> r12 = r6.f24803b
                            java.util.ArrayList r12 = kotlin.collections.C19327t.m32651g1(r12, r0)
                            com.etsy.android.ui.shop.tabs.g r12 = com.etsy.android.p327ui.shop.tabs.C11221g.m19147a(r6, r4, r12, r3)
                            com.etsy.android.ui.shop.tabs.g r6 = com.etsy.android.p327ui.shop.tabs.C11221g.m19147a(r12, r2, r4, r7)
                            goto L_0x01de
                        L_0x0173:
                            boolean r0 = r12 instanceof com.etsy.android.p327ui.shop.tabs.C11209a.C11214e
                            if (r0 == 0) goto L_0x0186
                            com.etsy.android.ui.shop.tabs.overview.e r12 = r13.f24794d
                            r12.getClass()
                            kotlin.jvm.internal.C19383o.m32797g(r6, r5)
                            com.etsy.android.ui.shop.tabs.i$e r12 = com.etsy.android.p327ui.shop.tabs.C11224i.C11229e.f24810a
                            com.etsy.android.ui.shop.tabs.g r6 = com.etsy.android.p327ui.shop.tabs.C11221g.m19147a(r6, r12, r4, r7)
                            goto L_0x01de
                        L_0x0186:
                            boolean r0 = r12 instanceof com.etsy.android.p327ui.shop.tabs.C11209a.C11210a
                            if (r0 == 0) goto L_0x01d8
                            com.etsy.android.ui.shop.tabs.overview.a r13 = r13.f24795e
                            com.etsy.android.ui.shop.tabs.a$a r12 = (com.etsy.android.p327ui.shop.tabs.C11209a.C11210a) r12
                            r13.getClass()
                            kotlin.jvm.internal.C19383o.m32797g(r12, r2)
                            kotlin.jvm.internal.C19383o.m32797g(r6, r5)
                            java.lang.Throwable r0 = r12.f24782a
                            boolean r2 = r0 instanceof retrofit2.HttpException
                            if (r2 == 0) goto L_0x01b8
                            retrofit2.HttpException r0 = (retrofit2.HttpException) r0
                            int r0 = r0.code()
                            r2 = 404(0x194, float:5.66E-43)
                            if (r0 != r2) goto L_0x01b8
                            com.etsy.android.ui.util.n r12 = r13.f24815a
                            r13 = 2131953672(0x7f130808, float:1.9543822E38)
                            java.lang.Object[] r0 = new java.lang.Object[r8]
                            java.lang.String r12 = r12.mo38059c(r13, r0)
                            com.etsy.android.ui.shop.tabs.i$c r13 = new com.etsy.android.ui.shop.tabs.i$c
                            r13.<init>(r12)
                            goto L_0x01d3
                        L_0x01b8:
                            java.lang.String r0 = r12.f24783b
                            boolean r0 = p628nj.C18263b.m30839d0(r0)
                            if (r0 == 0) goto L_0x01c3
                            java.lang.String r12 = r12.f24783b
                            goto L_0x01ce
                        L_0x01c3:
                            com.etsy.android.ui.util.n r12 = r13.f24815a
                            r13 = 2131953736(0x7f130848, float:1.9543951E38)
                            java.lang.Object[] r0 = new java.lang.Object[r8]
                            java.lang.String r12 = r12.mo38059c(r13, r0)
                        L_0x01ce:
                            com.etsy.android.ui.shop.tabs.i$d r13 = new com.etsy.android.ui.shop.tabs.i$d
                            r13.<init>(r12)
                        L_0x01d3:
                            com.etsy.android.ui.shop.tabs.g r6 = com.etsy.android.p327ui.shop.tabs.C11221g.m19147a(r6, r13, r4, r7)
                            goto L_0x01de
                        L_0x01d8:
                            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
                            r12.<init>()
                            throw r12
                        L_0x01de:
                            r13 = r6
                        L_0x01df:
                            if (r13 != r1) goto L_0x01e2
                            return r1
                        L_0x01e2:
                            r12 = r11
                        L_0x01e3:
                            com.etsy.android.ui.shop.tabs.g r13 = (com.etsy.android.p327ui.shop.tabs.C11221g) r13
                            com.etsy.android.ui.shop.tabs.ShopViewModel r12 = r5
                            kotlinx.coroutines.flow.StateFlowImpl r12 = r12.f24772d
                        L_0x01e9:
                            java.lang.Object r0 = r12.getValue()
                            r1 = r0
                            com.etsy.android.ui.shop.tabs.g r1 = (com.etsy.android.p327ui.shop.tabs.C11221g) r1
                            boolean r0 = r12.mo72337i(r0, r13)
                            if (r0 == 0) goto L_0x01e9
                        L_0x01f6:
                            kotlin.m r12 = kotlin.C19394m.f43287a
                            return r12
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.shop.tabs.ShopViewModel.C112071.C112081.emit(com.etsy.android.ui.shop.tabs.b, kotlin.coroutines.c):java.lang.Object");
                    }
                };
                this.label = 1;
                if (s1Var.collect(r3, this) == coroutineSingletons) {
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

    public ShopViewModel(CoroutineDispatcher coroutineDispatcher, C18289a<C11217d> aVar) {
        C19383o.m32797g(coroutineDispatcher, "defaultDispatcher");
        C19383o.m32797g(aVar, "lazyRouter");
        this.f24770b = aVar;
        StateFlowImpl g = C19388s.m32862g(new C11221g(C11224i.C11225a.f24805a, EmptyList.INSTANCE));
        this.f24772d = g;
        C0761x.m1750w(g);
        this.f24773e = C12065v.m19874b(g, C19388s.m32866i0(this), ShopViewModel$shopUi$1.INSTANCE);
        this.f24774f = C12065v.m19874b(g, C19388s.m32866i0(this), ShopViewModel$sideEffects$1.INSTANCE);
        C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new C112071(this, (C19340c<? super C112071>) null), 3);
    }

    /* renamed from: b */
    public final void mo36882b(C11215b bVar) {
        C19383o.m32797g(bVar, "event");
        C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new ShopViewModel$dispatch$1(this, bVar, (C19340c<? super ShopViewModel$dispatch$1>) null), 3);
    }

    public final void onCleared() {
    }
}

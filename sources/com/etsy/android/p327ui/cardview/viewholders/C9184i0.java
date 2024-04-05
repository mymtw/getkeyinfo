package com.etsy.android.p327ui.cardview.viewholders;

import android.graphics.Rect;
import androidx.fragment.app.Fragment;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.p327ui.sdl.C10715a;
import com.etsy.android.vespa.viewholders.C12100o;
import kotlin.jvm.internal.C19383o;
import p415of.C13172b;
import p415of.C13173c;
import p415of.C13182k;
import p415of.C13183l;
import p472wb.C13808f;

/* renamed from: com.etsy.android.ui.cardview.viewholders.i0 */
public final class C9184i0 extends C12100o {

    /* renamed from: l */
    public C9172e0 f20221l;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9184i0(com.etsy.android.p327ui.cardview.viewholders.C9187j0 r30) {
        /*
            r29 = this;
            r9 = r29
            r10 = r30
            androidx.fragment.app.Fragment r1 = r10.f20227a
            android.view.ViewGroup r2 = r10.f20228b
            com.etsy.android.lib.logger.p r3 = r10.f20229c
            boolean r4 = r10.f20239m
            wb.b r5 = r10.f20230d
            androidx.recyclerview.widget.RecyclerView$o r6 = r10.f20241o
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$n> r7 = r10.f20242p
            boolean r8 = r10.f20244r
            r0 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            ua.f r0 = r10.f20232f
            r16 = r0
            com.etsy.android.ui.util.h r15 = r10.f20231e
            androidx.fragment.app.Fragment r6 = r10.f20227a
            r12 = r6
            com.etsy.android.lib.logger.p r3 = r10.f20229c
            r14 = r3
            wb.b r7 = r10.f20230d
            of.k r0 = r10.f20238l
            r22 = r0
            com.etsy.android.ui.sdl.a r8 = r10.f20240n
            java.lang.ref.WeakReference<java.util.Queue<android.view.View>> r0 = r10.f20243q
            r27 = r0
            w8.e r5 = r10.f20233g
            r17 = r5
            fe.a r0 = r10.f20234h
            r18 = r0
            fe.o r0 = r10.f20235i
            r19 = r0
            x9.a r0 = r10.f20236j
            r20 = r0
            com.etsy.android.ui.search.h r0 = r10.f20237k
            r21 = r0
            of.c r0 = r9.f26990f
            r13 = r0
            of.b r0 = r0.f28991c
            wb.b r1 = new wb.b
            com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions r2 = r7.f30398k
            r23 = r2
            wb.a r2 = new wb.a
            r11 = r2
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 28672(0x7000, float:4.0178E-41)
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r1.<init>(r2)
            r0.mo45890a(r1)
            com.etsy.android.ui.cardview.clickhandlers.j r10 = new com.etsy.android.ui.cardview.clickhandlers.j
            of.c r2 = r9.f26990f
            r4 = 0
            r0 = r10
            r1 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            of.c r0 = r9.f26990f
            r1 = 2131430481(0x7f0b0c51, float:1.8482664E38)
            r0.mo45897p(r1, r10)
            of.c r0 = r9.f26990f
            r1 = 2131430454(0x7f0b0c36, float:1.848261E38)
            r0.mo45897p(r1, r10)
            r0 = 2131430516(0x7f0b0c74, float:1.8482735E38)
            of.a r1 = r7.mo45891c(r0)
            boolean r2 = r1 instanceof com.etsy.android.p327ui.cardview.clickhandlers.SavedCartClickHandler
            if (r2 == 0) goto L_0x008c
            com.etsy.android.ui.cardview.clickhandlers.SavedCartClickHandler r1 = (com.etsy.android.p327ui.cardview.clickhandlers.SavedCartClickHandler) r1
            goto L_0x008d
        L_0x008c:
            r1 = 0
        L_0x008d:
            if (r1 == 0) goto L_0x00a9
            of.c r2 = r9.f26990f
            com.etsy.android.ui.cardview.clickhandlers.SavedCartClickHandler r3 = new com.etsy.android.ui.cardview.clickhandlers.SavedCartClickHandler
            androidx.fragment.app.Fragment r11 = r1.mo45889a()
            com.etsy.android.lib.logger.p r12 = r1.f28980b
            com.etsy.android.ui.cart.l r14 = r1.f20036e
            ib.d r15 = r1.f20038g
            ua.f r1 = r1.f20041j
            r10 = r3
            r13 = r2
            r16 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r2.mo45897p(r0, r3)
        L_0x00a9:
            androidx.lifecycle.s r0 = r6.getViewLifecycleOwner()
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            java.lang.String r1 = "fragment.viewLifecycleOwner.lifecycle"
            kotlin.jvm.internal.C19383o.m32796f(r0, r1)
            com.etsy.android.ui.cardview.viewholders.ViewHolderLifecycleObserver r1 = new com.etsy.android.ui.cardview.viewholders.ViewHolderLifecycleObserver
            com.etsy.android.ui.cardview.viewholders.f0 r2 = new com.etsy.android.ui.cardview.viewholders.f0
            r2.<init>(r9)
            r1.<init>(r0, r2)
            com.etsy.android.uikit.ui.favorites.HeartMonitor r1 = new com.etsy.android.uikit.ui.favorites.HeartMonitor
            com.etsy.android.ui.cardview.viewholders.h0 r2 = new com.etsy.android.ui.cardview.viewholders.h0
            r2.<init>(r9)
            r1.<init>(r0, r2)
            if (r8 == 0) goto L_0x00f3
            androidx.recyclerview.widget.RecyclerView r0 = r9.f26987c
            java.lang.String r1 = "recyclerView"
            kotlin.jvm.internal.C19383o.m32796f(r0, r1)
            com.etsy.android.ui.cardview.viewholders.g0 r1 = new com.etsy.android.ui.cardview.viewholders.g0
            r1.<init>(r0, r9, r8)
            androidx.core.view.OneShotPreDrawListener r0 = androidx.core.view.OneShotPreDrawListener.add(r0, r1)
            java.lang.String r1 = "View.doOnPreDraw(\n    crossinline action: (view: View) -> Unit\n): OneShotPreDrawListener = OneShotPreDrawListener.add(this) { action(this) }"
            kotlin.jvm.internal.C19383o.m32796f(r0, r1)
            com.etsy.android.ui.cardview.viewholders.e0 r0 = new com.etsy.android.ui.cardview.viewholders.e0
            r0.<init>(r9, r8)
            r9.f20221l = r0
            androidx.recyclerview.widget.RecyclerView r0 = r9.f26987c
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            com.etsy.android.ui.cardview.viewholders.e0 r1 = r9.f20221l
            r0.addOnScrollChangedListener(r1)
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.cardview.viewholders.C9184i0.<init>(com.etsy.android.ui.cardview.viewholders.j0):void");
    }

    /* renamed from: g */
    public final void mo19450a(C13183l lVar) {
        C19383o.m32797g(lVar, "listSection");
        super.mo19450a(lVar);
    }

    /* renamed from: h */
    public final C13173c mo31381h(Fragment fragment, C8703p pVar, C13172b bVar) {
        C19383o.m32797g(fragment, "fragment");
        C19383o.m32797g(pVar, "viewTracker");
        C19383o.m32797g(bVar, "viewHolderFactory");
        return new C13808f(fragment, pVar, (C13182k) null);
    }

    /* renamed from: i */
    public final void mo31415i(C10715a aVar) {
        int childCount = this.f26987c.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (this.f26987c.getChildAt(i).getLocalVisibleRect(new Rect()) && i < this.f26990f.getItemCount()) {
                Object item = this.f26990f.getItem(i);
                C19383o.m32796f(item, "adapter.getItem(i)");
                aVar.mo35629a(i, item);
            }
        }
    }
}

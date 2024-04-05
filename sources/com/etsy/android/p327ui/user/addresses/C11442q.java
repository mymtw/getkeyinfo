package com.etsy.android.p327ui.user.addresses;

import android.content.DialogInterface;

/* renamed from: com.etsy.android.ui.user.addresses.q */
public final /* synthetic */ class C11442q implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f25261b;

    /* renamed from: c */
    public final /* synthetic */ Object f25262c;

    /* renamed from: d */
    public final /* synthetic */ Object f25263d;

    public /* synthetic */ C11442q(int i, Object obj, Object obj2) {
        this.f25261b = i;
        this.f25262c = obj;
        this.f25263d = obj2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r7, int r8) {
        /*
            r6 = this;
            int r0 = r6.f25261b
            switch(r0) {
                case 0: goto L_0x0007;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x0096
        L_0x0007:
            java.lang.Object r8 = r6.f25262c
            com.etsy.android.ui.user.addresses.AddressListFragment r8 = (com.etsy.android.p327ui.user.addresses.AddressListFragment) r8
            java.lang.Object r0 = r6.f25263d
            androidx.recyclerview.widget.RecyclerView$b0 r0 = (androidx.recyclerview.widget.RecyclerView.C3084b0) r0
            java.lang.String r1 = "this$0"
            kotlin.jvm.internal.C19383o.m32797g(r8, r1)
            java.lang.String r1 = "$viewHolder"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            com.etsy.android.ui.user.addresses.o r1 = r8.addressesAdapter
            if (r1 == 0) goto L_0x0036
            int r2 = r0.getAdapterPosition()
            androidx.recyclerview.widget.e<T> r3 = r1.f7450b
            java.util.List<T> r3 = r3.f7220f
            java.lang.String r4 = "currentList"
            kotlin.jvm.internal.C19383o.m32796f(r3, r4)
            java.util.ArrayList r3 = kotlin.collections.C19327t.m32661q1(r3)
            r3.remove(r2)
            r1.mo11950j(r3)
        L_0x0036:
            com.etsy.android.ui.user.addresses.w r1 = r8.getViewModel()
            com.etsy.android.ui.user.addresses.o r8 = r8.addressesAdapter
            r2 = 0
            if (r8 == 0) goto L_0x0058
            int r0 = r0.getAdapterPosition()
            r3 = 0
            if (r0 < 0) goto L_0x004f
            int r4 = r8.getItemCount()
            if (r0 >= r4) goto L_0x004f
            r3 = 1
        L_0x004f:
            if (r3 == 0) goto L_0x0058
            java.lang.Object r8 = r8.getItem(r0)
            com.etsy.android.ui.user.addresses.AddressItemUI r8 = (com.etsy.android.p327ui.user.addresses.AddressItemUI) r8
            goto L_0x0059
        L_0x0058:
            r8 = r2
        L_0x0059:
            com.etsy.android.ui.user.addresses.c0 r0 = r1.f25291c
            com.etsy.android.ui.user.addresses.a0$a r3 = new com.etsy.android.ui.user.addresses.a0$a
            if (r8 == 0) goto L_0x0067
            long r4 = r8.getUserAddressId()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
        L_0x0067:
            r3.<init>(r2)
            io.reactivex.internal.operators.single.j r8 = r0.mo37264a(r3)
            ua.f r0 = r1.f25290b
            io.reactivex.internal.operators.single.SingleSubscribeOn r8 = androidx.appcompat.widget.C0326j.m860e(r0, r8)
            ua.f r0 = r1.f25290b
            io.reactivex.internal.operators.single.SingleObserveOn r8 = androidx.compose.animation.C0391c.m1056b(r0, r8)
            com.etsy.android.ui.user.addresses.AddressListViewModel$deleteAddress$1 r0 = new com.etsy.android.ui.user.addresses.AddressListViewModel$deleteAddress$1
            r0.<init>(r1)
            com.etsy.android.ui.user.addresses.AddressListViewModel$deleteAddress$2 r2 = new com.etsy.android.ui.user.addresses.AddressListViewModel$deleteAddress$2
            r2.<init>(r1)
            io.reactivex.internal.observers.ConsumerSingleObserver r8 = p145io.reactivex.rxkotlin.SubscribersKt.m32500e(r8, r0, r2)
            io.reactivex.disposables.a r0 = r1.f25294f
            java.lang.String r1 = "compositeDisposable"
            kotlin.jvm.internal.C19383o.m32798h(r0, r1)
            r0.mo19403b(r8)
            r7.dismiss()
            return
        L_0x0096:
            java.lang.Object r0 = r6.f25262c
            com.etsy.android.ui.user.review.CreateReviewActivity r0 = (com.etsy.android.p327ui.user.review.CreateReviewActivity) r0
            java.lang.Object r1 = r6.f25263d
            com.etsy.android.ui.user.review.r$r r1 = (com.etsy.android.p327ui.user.review.C11719r.C11737r) r1
            com.etsy.android.p327ui.user.review.CreateReviewActivity.m35084showSubmitWarningPopup$lambda51(r0, r1, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.user.addresses.C11442q.onClick(android.content.DialogInterface, int):void");
    }
}

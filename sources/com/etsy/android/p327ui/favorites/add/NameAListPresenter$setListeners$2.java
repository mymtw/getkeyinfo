package com.etsy.android.p327ui.favorites.add;

import android.view.View;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.add.NameAListPresenter$setListeners$2 */
final class NameAListPresenter$setListeners$2 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ NameAListPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NameAListPresenter$setListeners$2(NameAListPresenter nameAListPresenter) {
        super(1);
        this.this$0 = nameAListPresenter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        r0 = (com.etsy.android.stylekit.views.CollageTextInput) r2.findViewById(com.etsy.android.R.id.name_input);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(android.view.View r8) {
        /*
            r7 = this;
            com.etsy.android.ui.favorites.add.NameAListPresenter r8 = r7.this$0
            com.etsy.android.ui.favorites.add.NameAListFragment r8 = r8.f21568a
            android.view.View r8 = r8.getView()
            r0 = 2131429049(0x7f0b06b9, float:1.847976E38)
            if (r8 == 0) goto L_0x0018
            android.view.View r8 = r8.findViewById(r0)
            com.etsy.android.stylekit.views.CollageTextInput r8 = (com.etsy.android.stylekit.views.CollageTextInput) r8
            if (r8 == 0) goto L_0x0018
            com.google.android.play.core.assetpacks.C15588c1.m25340p0(r8)
        L_0x0018:
            com.etsy.android.ui.favorites.add.NameAListPresenter r8 = r7.this$0
            com.etsy.android.ui.favorites.add.NameAListFragment r8 = r8.f21568a
            android.view.View r8 = r8.getView()
            r1 = 0
            if (r8 == 0) goto L_0x002e
            android.view.View r8 = r8.findViewById(r0)
            com.etsy.android.stylekit.views.CollageTextInput r8 = (com.etsy.android.stylekit.views.CollageTextInput) r8
            if (r8 == 0) goto L_0x002e
            r8.setErrorText(r1)
        L_0x002e:
            com.etsy.android.ui.favorites.add.NameAListPresenter r8 = r7.this$0
            r2 = 0
            r8.mo32741a(r2)
            com.etsy.android.ui.favorites.add.NameAListPresenter r8 = r7.this$0
            com.etsy.android.ui.favorites.add.NameAListFragment r2 = r8.f21568a
            android.view.View r2 = r2.getView()
            if (r2 == 0) goto L_0x004b
            android.view.View r0 = r2.findViewById(r0)
            com.etsy.android.stylekit.views.CollageTextInput r0 = (com.etsy.android.stylekit.views.CollageTextInput) r0
            if (r0 == 0) goto L_0x004b
            java.lang.String r0 = r0.getText()
            goto L_0x004c
        L_0x004b:
            r0 = r1
        L_0x004c:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r2 = p628nj.C18263b.m30837c0(r0)
            if (r2 != 0) goto L_0x0069
            com.etsy.android.ui.favorites.add.NameAListFragment r0 = r8.f21568a
            r1 = 2131952047(0x7f1301af, float:1.9540526E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = "fragment.getString(R.str…_collection_missing_name)"
            kotlin.jvm.internal.C19383o.m32796f(r0, r1)
            r8.mo32742b(r0)
            goto L_0x010e
        L_0x0069:
            com.etsy.android.ui.favorites.add.r r2 = new com.etsy.android.ui.favorites.add.r
            com.etsy.android.lib.models.interfaces.ListingLike r3 = r8.f21571d
            java.lang.String r4 = "listing"
            if (r3 == 0) goto L_0x0113
            com.etsy.android.lib.models.datatypes.EtsyId r3 = r3.getListingId()
            long r5 = r3.getIdAsLongDeprecated()
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            java.util.List r3 = p568fn.C17782b.m29864d0(r3)
            com.etsy.android.lib.models.interfaces.ListingLike r5 = r8.f21571d
            if (r5 == 0) goto L_0x010f
            java.util.List r1 = p568fn.C17782b.m29864d0(r5)
            com.etsy.android.lib.models.apiv3.CollectionPrivacyLevel r4 = r8.f21574g
            r2.<init>(r0, r3, r1, r4)
            io.reactivex.disposables.a r0 = r8.f21573f
            r0.mo19405d()
            io.reactivex.disposables.a r0 = new io.reactivex.disposables.a
            r0.<init>()
            r8.f21573f = r0
            com.etsy.android.ui.favorites.add.b0 r0 = r8.f21569b
            r0.getClass()
            io.reactivex.subjects.a<com.etsy.android.ui.favorites.add.q> r1 = r0.f21585e
            com.etsy.android.ui.favorites.add.q$c r3 = com.etsy.android.p327ui.favorites.add.C9779q.C9782c.f21624a
            r1.onNext(r3)
            com.etsy.android.ui.favorites.add.FavoriteAndCollectionRepository r1 = r0.f21582b
            io.reactivex.internal.operators.single.j r1 = r1.mo32720a(r2)
            ua.f r2 = r0.f21583c
            io.reactivex.internal.operators.single.SingleSubscribeOn r1 = androidx.appcompat.widget.C0326j.m860e(r2, r1)
            ua.f r2 = r0.f21583c
            r2.getClass()
            tp.r r2 = p456ua.C13461f.m21235b()
            io.reactivex.internal.operators.single.SingleObserveOn r1 = r1.mo20657f(r2)
            com.etsy.android.ui.favorites.add.NameAListViewModel$createList$1 r2 = new com.etsy.android.ui.favorites.add.NameAListViewModel$createList$1
            r2.<init>(r0)
            com.etsy.android.ui.favorites.add.NameAListViewModel$createList$2 r3 = new com.etsy.android.ui.favorites.add.NameAListViewModel$createList$2
            r3.<init>(r0)
            io.reactivex.internal.observers.ConsumerSingleObserver r1 = p145io.reactivex.rxkotlin.SubscribersKt.m32500e(r1, r2, r3)
            io.reactivex.disposables.a r2 = r0.f21584d
            java.lang.String r3 = "compositeDisposable"
            kotlin.jvm.internal.C19383o.m32798h(r2, r3)
            r2.mo19403b(r1)
            io.reactivex.subjects.a<com.etsy.android.ui.favorites.add.q> r0 = r0.f21585e
            io.reactivex.internal.operators.observable.m r0 = androidx.compose.animation.C0472h.m1241b(r0, r0)
            ua.f r1 = r8.f21570c
            r1.getClass()
            tp.r r1 = p456ua.C13461f.m21235b()
            io.reactivex.internal.operators.observable.ObservableSubscribeOn r0 = r0.mo20639i(r1)
            ua.f r1 = r8.f21570c
            r1.getClass()
            tp.r r1 = p456ua.C13461f.m21236c()
            io.reactivex.internal.operators.observable.ObservableObserveOn r0 = r0.mo20635e(r1)
            com.etsy.android.ui.favorites.add.NameAListPresenter$createThatList$1 r1 = new com.etsy.android.ui.favorites.add.NameAListPresenter$createThatList$1
            r1.<init>(r8)
            com.etsy.android.ui.favorites.add.NameAListPresenter$createThatList$2 r2 = new com.etsy.android.ui.favorites.add.NameAListPresenter$createThatList$2
            r2.<init>(r8)
            r4 = 2
            io.reactivex.internal.observers.LambdaObserver r0 = p145io.reactivex.rxkotlin.SubscribersKt.m32501f(r0, r1, r2, r4)
            io.reactivex.disposables.a r8 = r8.f21573f
            kotlin.jvm.internal.C19383o.m32798h(r8, r3)
            r8.mo19403b(r0)
        L_0x010e:
            return
        L_0x010f:
            kotlin.jvm.internal.C19383o.m32805o(r4)
            throw r1
        L_0x0113:
            kotlin.jvm.internal.C19383o.m32805o(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.favorites.add.NameAListPresenter$setListeners$2.invoke(android.view.View):void");
    }
}

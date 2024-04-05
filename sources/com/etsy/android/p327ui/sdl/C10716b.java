package com.etsy.android.p327ui.sdl;

import android.graphics.Rect;
import android.support.p013v4.media.C0072d;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.config.C8623e;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.logger.C8696j;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.util.C8923u;
import com.etsy.android.p327ui.sdl.ServerDrivenActionDelegate;
import com.etsy.android.p327ui.search.C10865h;
import com.etsy.android.p327ui.util.C11780h;
import com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import kotlin.collections.C19331x;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19543e0;
import p277w8.C8267e;
import p350fe.C12724a;
import p350fe.C12741o;
import p357gf.C12796e;
import p415of.C13173c;
import p415of.C13182k;
import p415of.C13184m;
import p415of.C13186o;
import p439rf.C13364c;
import p456ua.C13461f;
import p472wb.C13799a;
import p472wb.C13801b;
import p478x9.C13851a;
import p487ya.C13895a;
import p568fn.C17782b;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.sdl.b */
public final class C10716b {

    /* renamed from: a */
    public final C8703p f23633a;

    /* renamed from: b */
    public final C13173c f23634b;

    /* renamed from: c */
    public final C13364c f23635c = new C13364c();

    /* renamed from: com.etsy.android.ui.sdl.b$a */
    public static final class C10717a extends RecyclerView.C3108s {

        /* renamed from: b */
        public final /* synthetic */ C10716b f23636b;

        /* renamed from: c */
        public final /* synthetic */ C13364c.C13365a<C8698l> f23637c;

        public C10717a(C10716b bVar, C10719c cVar) {
            this.f23636b = bVar;
            this.f23637c = cVar;
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            C19383o.m32797g(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            this.f23636b.f23635c.f29296c = i;
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int i3;
            C19383o.m32797g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            C13364c cVar = this.f23636b.f23635c;
            C13364c.C13365a<C8698l> aVar = this.f23637c;
            cVar.getClass();
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            C13173c cVar2 = adapter instanceof C13173c ? (C13173c) adapter : null;
            if (cVar2 != null) {
                Iterator<View> it = C19543e0.m33298O(recyclerView).iterator();
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i3 = -1;
                        break;
                    }
                    int i6 = i5 + 1;
                    if (i5 >= 0) {
                        C19331x xVar = new C19331x(i5, it.next());
                        Rect rect = new Rect();
                        ((View) xVar.f43191b).getGlobalVisibleRect(rect);
                        if (((View) xVar.f43191b).getGlobalVisibleRect(rect)) {
                            i3 = xVar.f43190a;
                            break;
                        }
                        i5 = i6;
                    } else {
                        C17782b.m29877o0();
                        throw null;
                    }
                }
                Iterator<View> it2 = C19543e0.m33298O(recyclerView).iterator();
                int i7 = 0;
                int i8 = -1;
                while (it2.hasNext()) {
                    int i9 = i7 + 1;
                    if (i7 >= 0) {
                        C19331x xVar2 = new C19331x(i7, it2.next());
                        Rect rect2 = new Rect();
                        ((View) xVar2.f43191b).getGlobalVisibleRect(rect2);
                        if (((View) xVar2.f43191b).getGlobalVisibleRect(rect2)) {
                            i8 = xVar2.f43190a;
                        }
                        i7 = i9;
                    } else {
                        C17782b.m29877o0();
                        throw null;
                    }
                }
                List items = cVar2.getItems();
                C19383o.m32796f(items, "adapter.items");
                int Y = C17782b.m29859Y(items);
                if (i3 != -1 && i8 != -1 && Y != -1) {
                    int i10 = cVar.f29294a;
                    if ((i10 == -1) || i10 > Y || !(cVar2.getItem(i10) instanceof C8698l)) {
                        cVar.f29294a = -1;
                        cVar.f29295b = false;
                    } else {
                        i4 = i3;
                    }
                    if (cVar.f29294a != Y && i4 <= i8) {
                        while (true) {
                            C13186o oVar = (C13186o) cVar2.getItem(i4);
                            if ((oVar instanceof C8698l) && i4 > cVar.f29294a) {
                                aVar.mo33210a(oVar);
                                cVar.f29294a = i4;
                            }
                            if (i4 == Y) {
                                cVar.f29295b = true;
                            }
                            if (i4 != i8) {
                                i4++;
                            } else {
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.etsy.android.ui.sdl.b$b */
    public static final class C10718b {

        /* renamed from: a */
        public final ServerDrivenActionDelegate.C10714a f23638a;

        /* renamed from: b */
        public final C8267e f23639b;

        /* renamed from: c */
        public final C12724a f23640c;

        /* renamed from: d */
        public final C12741o f23641d;

        /* renamed from: e */
        public final C13851a f23642e;

        /* renamed from: f */
        public final C10865h f23643f;

        public C10718b(ServerDrivenActionDelegate.C10714a aVar, C8267e eVar, C12724a aVar2, C12741o oVar, C13851a aVar3, C10865h hVar) {
            C19383o.m32797g(aVar, "serverDrivenActionDelegateFactory");
            C19383o.m32797g(eVar, "adImpressionRepository");
            C19383o.m32797g(aVar2, "deepLinkEligibility");
            C19383o.m32797g(oVar, "routeInspector");
            C19383o.m32797g(aVar3, "deepLinkEntityChecker");
            C19383o.m32797g(hVar, "searchUriParser");
            this.f23638a = aVar;
            this.f23639b = eVar;
            this.f23640c = aVar2;
            this.f23641d = oVar;
            this.f23642e = aVar3;
            this.f23643f = hVar;
        }

        /* renamed from: a */
        public final C10716b mo35631a(Fragment fragment, C8703p pVar, RecyclerView recyclerView, C11780h hVar, C13461f fVar, C10715a aVar, WeakReference<Queue<View>> weakReference) {
            Fragment fragment2 = fragment;
            C19383o.m32797g(fragment2, "fragment");
            C11780h hVar2 = hVar;
            C19383o.m32797g(hVar2, "favoriteRepository");
            C13461f fVar2 = fVar;
            C19383o.m32797g(fVar2, "rxSchedulers");
            ServerDrivenActionDelegate.C10714a aVar2 = this.f23638a;
            aVar2.getClass();
            return new C10716b(fragment2, pVar, recyclerView, hVar2, fVar2, this.f23639b, this.f23640c, this.f23641d, this.f23642e, this.f23643f, aVar, new ServerDrivenActionDelegate(aVar2.f23631a, aVar2.f23632b, fragment2), weakReference);
        }
    }

    /* renamed from: com.etsy.android.ui.sdl.b$c */
    public static final class C10719c implements C13364c.C13365a<C8698l> {

        /* renamed from: a */
        public final /* synthetic */ C10716b f23644a;

        public C10719c(C10716b bVar) {
            this.f23644a = bVar;
        }

        /* renamed from: a */
        public final void mo33210a(C13186o oVar) {
            C8698l lVar = (C8698l) oVar;
            C19383o.m32797g(lVar, "item");
            if (C18263b.m30839d0(C19388s.m32863g0(lVar))) {
                C8703p pVar = this.f23644a.f23633a;
                StringBuilder h = C0072d.m201h("scrolled_past_");
                h.append(C19388s.m32863g0(lVar));
                pVar.mo21333d(h.toString(), C19388s.m32882r0(lVar));
            }
            List<C8696j> f0 = C19388s.m32861f0(lVar);
            C10716b bVar = this.f23644a;
            for (C8696j jVar : f0) {
                bVar.f23633a.mo21333d(jVar.f19098a, jVar.f19099b);
            }
        }
    }

    public C10716b(Fragment fragment, C8703p pVar, RecyclerView recyclerView, C11780h hVar, C13461f fVar, C8267e eVar, C12724a aVar, C12741o oVar, C13851a aVar2, C10865h hVar2, C10715a aVar3, ServerDrivenActionDelegate serverDrivenActionDelegate, WeakReference<Queue<View>> weakReference) {
        C8703p pVar2 = pVar;
        RecyclerView recyclerView2 = recyclerView;
        C19383o.m32797g(fragment, "fragment");
        C19383o.m32797g(hVar, "favoriteRepository");
        C19383o.m32797g(fVar, "rxSchedulers");
        C19383o.m32797g(eVar, "adImpressionRepository");
        C19383o.m32797g(aVar, "deepLinkEligibility");
        C19383o.m32797g(oVar, "routeInspector");
        C19383o.m32797g(aVar2, "deepLinkEntityChecker");
        C19383o.m32797g(hVar2, "searchUriParser");
        this.f23633a = pVar2;
        C13173c cVar = r29;
        C13173c cVar2 = new C13173c(fragment, pVar, (C13182k) null, (C13895a) null, (C8923u) null, (C12796e) null);
        this.f23634b = cVar2;
        fragment.requireActivity();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(cVar2.f28991c.f28990i);
        int dimensionPixelSize = fragment.getResources().getDimensionPixelSize(R.dimen.clg_space_8);
        GridLayoutManager gridLayoutManager2 = gridLayoutManager;
        ListingCardViewHolderOptions.C11971e eVar2 = r15;
        C8623e eVar3 = pVar2.f19116n;
        C19383o.m32796f(eVar3, "analyticsTracker.configMap");
        ListingCardViewHolderOptions.C11971e eVar4 = new ListingCardViewHolderOptions.C11971e(dimensionPixelSize, eVar3);
        RecyclerView recyclerView3 = recyclerView;
        Fragment fragment2 = fragment;
        C13801b bVar = new C13801b(new C13799a(fragment2, cVar, pVar, hVar, fVar, eVar, aVar, oVar, aVar2, hVar2, serverDrivenActionDelegate, eVar2, aVar3, (C12796e) null, (C8630b) null, weakReference, 24576));
        RecyclerView recyclerView4 = recyclerView;
        C13173c cVar3 = cVar2;
        recyclerView4.setAdapter(cVar3);
        GridLayoutManager gridLayoutManager3 = gridLayoutManager2;
        recyclerView4.setLayoutManager(gridLayoutManager3);
        gridLayoutManager3.f7008K = cVar3.f28996h;
        cVar3.f28991c.mo45890a(bVar);
        recyclerView4.addOnScrollListener(new C10717a(this, new C10719c(this)));
    }

    /* renamed from: a */
    public final void mo35630a(List<? extends C13184m> list) {
        C19383o.m32797g(list, "listSections");
        this.f23634b.clear();
        for (C13184m j : list) {
            this.f23634b.mo45895j(j);
        }
    }
}

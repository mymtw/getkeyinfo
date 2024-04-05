package com.etsy.android.p327ui.cardview.viewholders;

import android.support.p013v4.media.C0072d;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.animation.C0391c;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.sdl.C10715a;
import com.etsy.android.p327ui.search.C10865h;
import com.etsy.android.p327ui.util.C11780h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Queue;
import kotlin.jvm.internal.C19383o;
import p277w8.C8267e;
import p350fe.C12724a;
import p350fe.C12741o;
import p415of.C13182k;
import p456ua.C13461f;
import p472wb.C13801b;
import p478x9.C13851a;

/* renamed from: com.etsy.android.ui.cardview.viewholders.j0 */
public final class C9187j0 {

    /* renamed from: a */
    public final Fragment f20227a;

    /* renamed from: b */
    public final ViewGroup f20228b;

    /* renamed from: c */
    public final C8703p f20229c;

    /* renamed from: d */
    public final C13801b f20230d;

    /* renamed from: e */
    public final C11780h f20231e;

    /* renamed from: f */
    public final C13461f f20232f;

    /* renamed from: g */
    public final C8267e f20233g;

    /* renamed from: h */
    public final C12724a f20234h;

    /* renamed from: i */
    public final C12741o f20235i;

    /* renamed from: j */
    public final C13851a f20236j;

    /* renamed from: k */
    public final C10865h f20237k;

    /* renamed from: l */
    public final C13182k f20238l;

    /* renamed from: m */
    public final boolean f20239m;

    /* renamed from: n */
    public final C10715a f20240n;

    /* renamed from: o */
    public final RecyclerView.C3100o f20241o;

    /* renamed from: p */
    public final ArrayList<RecyclerView.C3099n> f20242p;

    /* renamed from: q */
    public final WeakReference<Queue<View>> f20243q;

    /* renamed from: r */
    public final boolean f20244r;

    /* renamed from: com.etsy.android.ui.cardview.viewholders.j0$a */
    public static final class C9188a {

        /* renamed from: a */
        public Fragment f20245a;

        /* renamed from: b */
        public ViewGroup f20246b;

        /* renamed from: c */
        public C8703p f20247c;

        /* renamed from: d */
        public C13801b f20248d;

        /* renamed from: e */
        public C11780h f20249e;

        /* renamed from: f */
        public C13461f f20250f;

        /* renamed from: g */
        public C8267e f20251g;

        /* renamed from: h */
        public C12724a f20252h;

        /* renamed from: i */
        public C12741o f20253i;

        /* renamed from: j */
        public C13851a f20254j;

        /* renamed from: k */
        public C10865h f20255k;

        /* renamed from: l */
        public C13182k f20256l;

        /* renamed from: m */
        public boolean f20257m;

        /* renamed from: n */
        public C10715a f20258n;

        /* renamed from: o */
        public RecyclerView.C3100o f20259o;

        /* renamed from: p */
        public ArrayList<RecyclerView.C3099n> f20260p;

        /* renamed from: q */
        public WeakReference<Queue<View>> f20261q;

        /* renamed from: r */
        public boolean f20262r;

        /* renamed from: a */
        public final void mo31420a(C8267e eVar) {
            C19383o.m32797g(eVar, "value");
            this.f20251g = eVar;
        }

        /* renamed from: b */
        public final void mo31421b(RecyclerView.C3099n nVar) {
            if (this.f20260p == null) {
                this.f20260p = new ArrayList<>();
            }
            ArrayList<RecyclerView.C3099n> arrayList = this.f20260p;
            C19383o.m32794d(arrayList);
            arrayList.add(nVar);
        }

        /* renamed from: c */
        public final C9187j0 mo31422c() {
            Fragment fragment = this.f20245a;
            if (fragment != null) {
                ViewGroup viewGroup = this.f20246b;
                if (viewGroup != null) {
                    C8703p pVar = this.f20247c;
                    if (pVar != null) {
                        C11780h hVar = this.f20249e;
                        if (hVar != null) {
                            C13182k kVar = this.f20256l;
                            boolean z = this.f20257m;
                            C10715a aVar = this.f20258n;
                            RecyclerView.C3100o oVar = this.f20259o;
                            C13801b bVar = this.f20248d;
                            if (bVar != null) {
                                C13461f fVar = this.f20250f;
                                if (fVar != null) {
                                    ArrayList<RecyclerView.C3099n> arrayList = this.f20260p;
                                    WeakReference<Queue<View>> weakReference = this.f20261q;
                                    boolean z2 = this.f20262r;
                                    C8267e eVar = this.f20251g;
                                    if (eVar != null) {
                                        boolean z3 = z2;
                                        C12724a aVar2 = this.f20252h;
                                        if (aVar2 != null) {
                                            WeakReference<Queue<View>> weakReference2 = weakReference;
                                            C12741o oVar2 = this.f20253i;
                                            if (oVar2 != null) {
                                                ArrayList<RecyclerView.C3099n> arrayList2 = arrayList;
                                                C13851a aVar3 = this.f20254j;
                                                if (aVar3 != null) {
                                                    RecyclerView.C3100o oVar3 = oVar;
                                                    C10865h hVar2 = this.f20255k;
                                                    if (hVar2 != null) {
                                                        boolean z4 = z3;
                                                        return new C9187j0(fragment, viewGroup, pVar, bVar, hVar, fVar, eVar, aVar2, oVar2, aVar3, hVar2, kVar, z, aVar, oVar3, arrayList2, weakReference2, z4);
                                                    }
                                                    C19383o.m32805o("searchUriParser");
                                                    throw null;
                                                }
                                                C19383o.m32805o("deepLinkEntityChecker");
                                                throw null;
                                            }
                                            C19383o.m32805o("routeInspector");
                                            throw null;
                                        }
                                        C19383o.m32805o("deepLinkEligibility");
                                        throw null;
                                    }
                                    C19383o.m32805o("adImpressionRepository");
                                    throw null;
                                }
                                C19383o.m32805o("rxSchedulers");
                                throw null;
                            }
                            C19383o.m32805o("viewHolderFactory");
                            throw null;
                        }
                        C19383o.m32805o("favoriteRepository");
                        throw null;
                    }
                    C19383o.m32805o("viewTracker");
                    throw null;
                }
                C19383o.m32805o(ResponseConstants.PARENT);
                throw null;
            }
            C19383o.m32805o("fragment");
            throw null;
        }

        /* renamed from: d */
        public final void mo31423d(C12724a aVar) {
            C19383o.m32797g(aVar, "value");
            this.f20252h = aVar;
        }

        /* renamed from: e */
        public final void mo31424e(C13851a aVar) {
            C19383o.m32797g(aVar, "value");
            this.f20254j = aVar;
        }

        /* renamed from: f */
        public final void mo31425f(C11780h hVar) {
            C19383o.m32797g(hVar, "value");
            this.f20249e = hVar;
        }

        /* renamed from: g */
        public final void mo31426g(C12741o oVar) {
            C19383o.m32797g(oVar, "value");
            this.f20253i = oVar;
        }

        /* renamed from: h */
        public final void mo31427h(C13461f fVar) {
            C19383o.m32797g(fVar, "value");
            this.f20250f = fVar;
        }

        /* renamed from: i */
        public final void mo31428i(C10865h hVar) {
            C19383o.m32797g(hVar, "value");
            this.f20255k = hVar;
        }

        /* renamed from: j */
        public final void mo31429j(C8703p pVar) {
            C19383o.m32797g(pVar, "value");
            this.f20247c = pVar;
        }
    }

    public C9187j0(Fragment fragment, ViewGroup viewGroup, C8703p pVar, C13801b bVar, C11780h hVar, C13461f fVar, C8267e eVar, C12724a aVar, C12741o oVar, C13851a aVar2, C10865h hVar2, C13182k kVar, boolean z, C10715a aVar3, RecyclerView.C3100o oVar2, ArrayList<RecyclerView.C3099n> arrayList, WeakReference<Queue<View>> weakReference, boolean z2) {
        this.f20227a = fragment;
        this.f20228b = viewGroup;
        this.f20229c = pVar;
        this.f20230d = bVar;
        this.f20231e = hVar;
        this.f20232f = fVar;
        this.f20233g = eVar;
        this.f20234h = aVar;
        this.f20235i = oVar;
        this.f20236j = aVar2;
        this.f20237k = hVar2;
        this.f20238l = kVar;
        this.f20239m = z;
        this.f20240n = aVar3;
        this.f20241o = oVar2;
        this.f20242p = arrayList;
        this.f20243q = weakReference;
        this.f20244r = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9187j0)) {
            return false;
        }
        C9187j0 j0Var = (C9187j0) obj;
        return C19383o.m32792b(this.f20227a, j0Var.f20227a) && C19383o.m32792b(this.f20228b, j0Var.f20228b) && C19383o.m32792b(this.f20229c, j0Var.f20229c) && C19383o.m32792b(this.f20230d, j0Var.f20230d) && C19383o.m32792b(this.f20231e, j0Var.f20231e) && C19383o.m32792b(this.f20232f, j0Var.f20232f) && C19383o.m32792b(this.f20233g, j0Var.f20233g) && C19383o.m32792b(this.f20234h, j0Var.f20234h) && C19383o.m32792b(this.f20235i, j0Var.f20235i) && C19383o.m32792b(this.f20236j, j0Var.f20236j) && C19383o.m32792b(this.f20237k, j0Var.f20237k) && C19383o.m32792b(this.f20238l, j0Var.f20238l) && this.f20239m == j0Var.f20239m && C19383o.m32792b(this.f20240n, j0Var.f20240n) && C19383o.m32792b(this.f20241o, j0Var.f20241o) && C19383o.m32792b(this.f20242p, j0Var.f20242p) && C19383o.m32792b(this.f20243q, j0Var.f20243q) && this.f20244r == j0Var.f20244r;
    }

    public final int hashCode() {
        int hashCode = this.f20228b.hashCode();
        int hashCode2 = this.f20229c.hashCode();
        int hashCode3 = this.f20230d.hashCode();
        int hashCode4 = this.f20231e.hashCode();
        int hashCode5 = (this.f20237k.hashCode() + ((this.f20236j.hashCode() + ((this.f20235i.hashCode() + ((this.f20234h.hashCode() + ((this.f20233g.hashCode() + ((this.f20232f.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.f20227a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        C13182k kVar = this.f20238l;
        int i = 0;
        int hashCode6 = (hashCode5 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        boolean z = this.f20239m;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode6 + (z ? 1 : 0)) * 31;
        C10715a aVar = this.f20240n;
        int hashCode7 = (i2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        RecyclerView.C3100o oVar = this.f20241o;
        int hashCode8 = (hashCode7 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        ArrayList<RecyclerView.C3099n> arrayList = this.f20242p;
        int hashCode9 = (hashCode8 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        WeakReference<Queue<View>> weakReference = this.f20243q;
        if (weakReference != null) {
            i = weakReference.hashCode();
        }
        int i3 = (hashCode9 + i) * 31;
        boolean z3 = this.f20244r;
        if (!z3) {
            z2 = z3;
        }
        return i3 + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("HorizontalListDependencies(fragment=");
        h.append(this.f20227a);
        h.append(", parent=");
        h.append(this.f20228b);
        h.append(", viewTracker=");
        h.append(this.f20229c);
        h.append(", viewHolderFactory=");
        h.append(this.f20230d);
        h.append(", favoriteRepository=");
        h.append(this.f20231e);
        h.append(", rxSchedulers=");
        h.append(this.f20232f);
        h.append(", adImpressionRepository=");
        h.append(this.f20233g);
        h.append(", deepLinkEligibility=");
        h.append(this.f20234h);
        h.append(", routeInspector=");
        h.append(this.f20235i);
        h.append(", deepLinkEntityChecker=");
        h.append(this.f20236j);
        h.append(", searchUriParser=");
        h.append(this.f20237k);
        h.append(", serverDrivenActionDelegate=");
        h.append(this.f20238l);
        h.append(", shouldEnableChangeAnimations=");
        h.append(this.f20239m);
        h.append(", onCarouselScrollListener=");
        h.append(this.f20240n);
        h.append(", layoutManager=");
        h.append(this.f20241o);
        h.append(", itemDecorations=");
        h.append(this.f20242p);
        h.append(", listingCardViewCache=");
        h.append(this.f20243q);
        h.append(", trackListItemViewedEvents=");
        return C0391c.m1058d(h, this.f20244r, ')');
    }
}

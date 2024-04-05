package p472wb;

import android.net.Uri;
import android.support.p013v4.media.C0070b;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.C2740a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.etsy.android.R;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.deeplinks.DeepLinkEntity;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.apiv3.Button;
import com.etsy.android.lib.models.apiv3.SearchCategoryRedirectPageParcelable;
import com.etsy.android.p327ui.cardview.clickhandlers.C9116a;
import com.etsy.android.p327ui.cardview.clickhandlers.C9117b;
import com.etsy.android.p327ui.cardview.clickhandlers.C9118c;
import com.etsy.android.p327ui.cardview.clickhandlers.C9119d;
import com.etsy.android.p327ui.cardview.clickhandlers.C9120e;
import com.etsy.android.p327ui.cardview.clickhandlers.C9121f;
import com.etsy.android.p327ui.cardview.clickhandlers.C9125j;
import com.etsy.android.p327ui.cardview.clickhandlers.C9126k;
import com.etsy.android.p327ui.cardview.clickhandlers.C9129l;
import com.etsy.android.p327ui.cardview.clickhandlers.C9133n;
import com.etsy.android.p327ui.cardview.clickhandlers.C9134o;
import com.etsy.android.p327ui.cardview.clickhandlers.C9135p;
import com.etsy.android.p327ui.cardview.clickhandlers.C9142w;
import com.etsy.android.p327ui.cardview.clickhandlers.C9144y;
import com.etsy.android.p327ui.cardview.clickhandlers.C9145z;
import com.etsy.android.p327ui.cardview.clickhandlers.SavableSearchQueryClickHandler;
import com.etsy.android.p327ui.cardview.clickhandlers.ShopCardClickHandler;
import com.etsy.android.p327ui.cardview.viewholders.C9194l0;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.SearchTaxonomyCategoryKey;
import com.etsy.android.p327ui.sdl.C10715a;
import com.etsy.android.p327ui.search.C10865h;
import com.etsy.android.p327ui.search.container.SearchContainerFragment;
import com.etsy.android.p327ui.user.review.ReviewTrackingSource;
import com.etsy.android.p327ui.util.C11780h;
import com.etsy.android.uikit.viewholder.C12008t;
import com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions;
import java.lang.ref.WeakReference;
import java.util.Queue;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p277w8.C8267e;
import p350fe.C12724a;
import p350fe.C12741o;
import p356ge.C12790b;
import p357gf.C12796e;
import p363he.C12821d;
import p415of.C13172b;
import p423pf.C13231b;
import p423pf.C13232c;
import p423pf.C13233d;
import p423pf.C13236g;
import p456ua.C13461f;
import p478x9.C13851a;

/* renamed from: wb.b */
public class C13801b extends C13172b {

    /* renamed from: A */
    public C11780h f30389A;

    /* renamed from: B */
    public C13461f f30390B;

    /* renamed from: C */
    public WeakReference<Queue<View>> f30391C;

    /* renamed from: D */
    public final C8267e f30392D;

    /* renamed from: E */
    public final C12724a f30393E;

    /* renamed from: F */
    public final C12741o f30394F;

    /* renamed from: G */
    public final C13851a f30395G;

    /* renamed from: H */
    public final C10865h f30396H;

    /* renamed from: j */
    public boolean f30397j = false;

    /* renamed from: k */
    public ListingCardViewHolderOptions f30398k;

    /* renamed from: l */
    public C12796e f30399l;

    /* renamed from: m */
    public C8630b f30400m;

    /* renamed from: n */
    public int f30401n;

    /* renamed from: o */
    public int f30402o;

    /* renamed from: p */
    public int f30403p;

    /* renamed from: q */
    public int f30404q;

    /* renamed from: r */
    public int f30405r;

    /* renamed from: s */
    public int f30406s;

    /* renamed from: t */
    public int f30407t;

    /* renamed from: u */
    public int f30408u;

    /* renamed from: v */
    public int f30409v;

    /* renamed from: w */
    public int f30410w;

    /* renamed from: x */
    public int f30411x;

    /* renamed from: y */
    public C12008t f30412y;

    /* renamed from: z */
    public C10715a f30413z;

    /* renamed from: wb.b$a */
    public class C13802a extends C13231b {
        public C13802a(Fragment fragment, C8703p pVar) {
            super(fragment, pVar);
        }

        /* renamed from: c */
        public final void mo31328c(Object obj) {
            Button button = (Button) obj;
            if (button != null) {
                C12790b.m20430b(mo45889a(), new C12821d(button.getLink()));
            }
        }
    }

    /* renamed from: wb.b$b */
    public class C13803b extends C13232c {
        public C13803b(Fragment fragment, C8703p pVar) {
            super(fragment, pVar);
        }

        /* renamed from: c */
        public final void mo31328c(Object obj) {
            String str = (String) obj;
            if (!TextUtils.isEmpty(str)) {
                C12790b.m20430b(mo45889a(), new C12821d(str));
            }
        }
    }

    /* renamed from: wb.b$c */
    public class C13804c extends C13233d {
        public C13804c(Fragment fragment, C8703p pVar) {
            super(fragment, pVar);
        }

        /* renamed from: c */
        public final void mo31328c(Object obj) {
            String str = (String) obj;
            Uri parse = Uri.parse(str);
            if (C13801b.this.f30395G.mo46683a(parse) == DeepLinkEntity.TAXONOMY_CATEGORY) {
                C13801b.this.f30396H.getClass();
                SearchTaxonomyCategoryKey searchTaxonomyCategoryKey = new SearchTaxonomyCategoryKey(C12790b.m20432d(mo45889a()), (String) null, (Long) null, (String) null, C10865h.m18884b(parse), (SearchCategoryRedirectPageParcelable) null, 32, (DefaultConstructorMarker) null);
                SearchContainerFragment searchContainerFragment = (SearchContainerFragment) mo45889a();
                if (searchContainerFragment != null) {
                    Fragment fragment = searchTaxonomyCategoryKey.getFragment();
                    fragment.setArguments(searchTaxonomyCategoryKey.getNavigationParams().mo45608a());
                    String str2 = fragment.getClass().getSimpleName() + searchContainerFragment.hashCode();
                    FragmentManager childFragmentManager = searchContainerFragment.getChildFragmentManager();
                    C2740a c = C0070b.m182c(childFragmentManager, childFragmentManager);
                    C12790b.m20429a(c, searchTaxonomyCategoryKey.getAnimationType());
                    c.mo10485g(R.id.nav_content_frame, fragment, str2, 1);
                    c.mo10487k();
                    return;
                }
                return;
            }
            C12790b.m20430b(mo45889a(), new C12821d(str));
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C13801b(p472wb.C13799a r8) {
        /*
            r7 = this;
            androidx.fragment.app.Fragment r0 = r8.f30361a
            java.lang.String r1 = "value"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            of.i r2 = r8.f30362b
            com.etsy.android.lib.logger.p r3 = r8.f30363c
            kotlin.jvm.internal.C19383o.m32797g(r3, r1)
            of.k r1 = r8.f30371k
            of.h r4 = new of.h
            r4.<init>(r0, r3, r2, r1)
            r7.<init>(r4)
            r0 = 0
            r7.f30397j = r0
            com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions r0 = r8.f30372l
            r7.f30398k = r0
            com.etsy.android.ui.sdl.a r0 = r8.f30373m
            r7.f30413z = r0
            gf.e r0 = r8.f30374n
            r7.f30399l = r0
            com.etsy.android.lib.currency.b r0 = r8.f30375o
            r7.f30400m = r0
            com.etsy.android.ui.util.h r0 = r8.f30364d
            r7.f30389A = r0
            ua.f r0 = r8.f30365e
            r7.f30390B = r0
            java.lang.ref.WeakReference<java.util.Queue<android.view.View>> r0 = r8.f30376p
            r7.f30391C = r0
            w8.e r0 = r8.f30366f
            r7.f30392D = r0
            fe.a r0 = r8.f30367g
            r7.f30393E = r0
            fe.o r0 = r8.f30368h
            r7.f30394F = r0
            x9.a r0 = r8.f30369i
            r7.f30395G = r0
            com.etsy.android.ui.search.h r0 = r8.f30370j
            r7.f30396H = r0
            r7.mo36728j()
            androidx.fragment.app.Fragment r0 = r8.f30361a
            android.content.res.Resources r0 = r0.getResources()
            androidx.fragment.app.Fragment r8 = r8.f30361a
            androidx.fragment.app.FragmentActivity r2 = r8.requireActivity()
            r8 = 2131492969(0x7f0c0069, float:1.8609405E38)
            int r8 = r0.getInteger(r8)
            r7.f30403p = r8
            r8 = 2131492968(0x7f0c0068, float:1.8609403E38)
            int r8 = r0.getInteger(r8)
            r7.f30402o = r8
            r8 = 2131492955(0x7f0c005b, float:1.8609377E38)
            int r8 = r0.getInteger(r8)
            r7.f30404q = r8
            r8 = 2131492956(0x7f0c005c, float:1.8609379E38)
            int r8 = r0.getInteger(r8)
            r7.f30405r = r8
            r8 = 2131492957(0x7f0c005d, float:1.860938E38)
            int r8 = r0.getInteger(r8)
            r7.f30406s = r8
            r8 = 2131492961(0x7f0c0061, float:1.8609389E38)
            r0.getInteger(r8)
            r8 = 2131492958(0x7f0c005e, float:1.8609383E38)
            int r8 = r0.getInteger(r8)
            r7.f30407t = r8
            r8 = 2131492959(0x7f0c005f, float:1.8609385E38)
            int r8 = r0.getInteger(r8)
            r7.f30408u = r8
            r8 = 2131492970(0x7f0c006a, float:1.8609407E38)
            int r8 = r0.getInteger(r8)
            r7.f30409v = r8
            r8 = 2131492964(0x7f0c0064, float:1.8609395E38)
            int r8 = r0.getInteger(r8)
            r7.f30410w = r8
            r8 = 2131492967(0x7f0c0067, float:1.86094E38)
            int r8 = r0.getInteger(r8)
            r7.f30401n = r8
            r8 = 2131165667(0x7f0701e3, float:1.7945558E38)
            int r8 = r0.getDimensionPixelSize(r8)
            r7.f30411x = r8
            com.etsy.android.uikit.viewholder.t r8 = new com.etsy.android.uikit.viewholder.t
            com.etsy.android.lib.logger.p r3 = r7.f28983b
            com.etsy.android.lib.config.e r4 = r3.f19116n
            q9.p r5 = p628nj.C18263b.f40057V
            gf.e r6 = r7.f30399l
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r7.f30412y = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p472wb.C13801b.<init>(wb.a):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.etsy.android.ui.cardview.viewholders.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.etsy.android.uikit.viewholder.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.etsy.android.vespa.viewholders.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.etsy.android.ui.cardview.viewholders.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: com.etsy.android.ui.cardview.viewholders.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: com.etsy.android.vespa.viewholders.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: com.etsy.android.vespa.viewholders.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: com.etsy.android.ui.cardview.viewholders.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: com.etsy.android.ui.cardview.viewholders.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: com.etsy.android.ui.cardview.viewholders.u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: com.etsy.android.ui.cardview.viewholders.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v35, resolved type: com.etsy.android.ui.cardview.viewholders.x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v37, resolved type: com.etsy.android.ui.search.v2.relatedcategories.FeaturedCategoryViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v38, resolved type: com.etsy.android.ui.cardview.viewholders.z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v42, resolved type: com.etsy.android.ui.cardview.viewholders.s0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v51, resolved type: com.etsy.android.vespa.viewholders.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v52, resolved type: com.etsy.android.ui.cardview.viewholders.n0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v55, resolved type: com.etsy.android.uikit.viewholder.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v56, resolved type: com.etsy.android.ui.cardview.viewholders.ListingCollectionViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v57, resolved type: com.etsy.android.ui.cardview.viewholders.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v58, resolved type: com.etsy.android.ui.cardview.viewholders.SavedForLaterCarouselCartListingCardViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v62, resolved type: com.etsy.android.ui.cardview.viewholders.c1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v63, resolved type: com.etsy.android.ui.cardview.viewholders.p0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v65, resolved type: com.etsy.android.ui.cardview.viewholders.OrderShippingStatusViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v66, resolved type: com.etsy.android.ui.cardview.viewholders.RelatedLinkTagsViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v67, resolved type: com.etsy.android.ui.cardview.viewholders.t0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v71, resolved type: com.etsy.android.ui.cardview.viewholders.u0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v72, resolved type: com.etsy.android.ui.cardview.viewholders.z0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v77, resolved type: com.etsy.android.ui.cardview.viewholders.g1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v78, resolved type: com.etsy.android.uikit.viewholder.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v80, resolved type: com.etsy.android.ui.cardview.viewholders.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v81, resolved type: com.etsy.android.vespa.viewholders.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v82, resolved type: com.etsy.android.ui.cardview.viewholders.l1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v90, resolved type: com.etsy.android.ui.cardview.viewholders.n1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v91, resolved type: com.etsy.android.uikit.viewholder.ListingCardViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v92, resolved type: com.etsy.android.uikit.viewholder.ListingCardViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v93, resolved type: com.etsy.android.uikit.viewholder.ListingCardViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v94, resolved type: com.etsy.android.uikit.viewholder.ListingCardViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v95, resolved type: com.etsy.android.uikit.viewholder.ListingCardViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v96, resolved type: com.etsy.android.uikit.viewholder.ListingCardViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v97, resolved type: com.etsy.android.uikit.viewholder.ListingCardViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: com.etsy.android.uikit.viewholder.ListingCardViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v84, resolved type: com.etsy.android.uikit.viewholder.ListingCardViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: com.etsy.android.uikit.viewholder.ListingCardViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v98, resolved type: com.etsy.android.uikit.viewholder.ListingCardViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v99, resolved type: com.etsy.android.uikit.viewholder.ListingCardViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v100, resolved type: com.etsy.android.uikit.viewholder.ListingCardViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v101, resolved type: com.etsy.android.uikit.viewholder.ListingCardViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v102, resolved type: com.etsy.android.uikit.viewholder.ListingCardViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v103, resolved type: com.etsy.android.uikit.viewholder.ListingCardViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v104, resolved type: com.etsy.android.uikit.viewholder.ListingCardViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v105, resolved type: com.etsy.android.uikit.viewholder.ListingCardViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v106, resolved type: com.etsy.android.uikit.viewholder.ListingCardViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v107, resolved type: com.etsy.android.uikit.viewholder.ListingCardViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v108, resolved type: com.etsy.android.uikit.viewholder.ListingCardViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v109, resolved type: com.etsy.android.uikit.viewholder.ListingCardViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v110, resolved type: com.etsy.android.uikit.viewholder.ListingCardViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v111, resolved type: com.etsy.android.uikit.viewholder.ListingCardViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v112, resolved type: com.etsy.android.uikit.viewholder.ListingCardViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v113, resolved type: com.etsy.android.uikit.viewholder.ListingCardViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v114, resolved type: com.etsy.android.uikit.viewholder.ListingCardViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v115, resolved type: com.etsy.android.uikit.viewholder.ListingCardViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v116, resolved type: com.etsy.android.uikit.viewholder.ListingCardViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v117, resolved type: com.etsy.android.uikit.viewholder.ListingCardViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v118, resolved type: com.etsy.android.uikit.viewholder.ListingCardViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v119, resolved type: com.etsy.android.uikit.viewholder.ListingCardViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v120, resolved type: com.etsy.android.uikit.viewholder.ListingCardViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v121, resolved type: com.etsy.android.uikit.viewholder.ListingCardViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v122, resolved type: com.etsy.android.uikit.viewholder.ListingCardViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v123, resolved type: com.etsy.android.uikit.viewholder.ListingCardViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v124, resolved type: com.etsy.android.uikit.viewholder.ListingCardViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v125, resolved type: com.etsy.android.uikit.viewholder.ListingCardViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v126, resolved type: com.etsy.android.uikit.viewholder.ListingCardViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v127, resolved type: com.etsy.android.uikit.viewholder.ListingCardViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v128, resolved type: com.etsy.android.uikit.viewholder.ListingCardViewHolder} */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r5 = ((androidx.recyclerview.widget.RecyclerView) r2).getLayoutManager();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.etsy.android.vespa.viewholders.C12086e mo31854b(android.view.ViewGroup r21, int r22) {
        /*
            r20 = this;
            r0 = r20
            r2 = r21
            r1 = r22
            boolean r3 = r2 instanceof androidx.recyclerview.widget.RecyclerView
            r4 = 0
            if (r3 == 0) goto L_0x001a
            r5 = r2
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            androidx.recyclerview.widget.RecyclerView$o r5 = r5.getLayoutManager()
            if (r5 == 0) goto L_0x001a
            boolean r5 = r5.mo11297f()
            r8 = r5
            goto L_0x001b
        L_0x001a:
            r8 = r4
        L_0x001b:
            r5 = 2131165386(0x7f0700ca, float:1.7944988E38)
            r6 = 2131430546(0x7f0b0c92, float:1.8482796E38)
            r7 = 2
            r9 = 2131165387(0x7f0700cb, float:1.794499E38)
            r10 = 2131165398(0x7f0700d6, float:1.7945012E38)
            java.lang.String r11 = "value"
            r12 = 0
            r13 = 1
            switch(r1) {
                case 2131430413: goto L_0x08f2;
                case 2131430414: goto L_0x08e4;
                case 2131430419: goto L_0x08d3;
                case 2131430421: goto L_0x08c5;
                case 2131430424: goto L_0x08b7;
                case 2131430427: goto L_0x08a9;
                case 2131430428: goto L_0x0899;
                case 2131430431: goto L_0x080a;
                case 2131430432: goto L_0x0803;
                case 2131430437: goto L_0x07f4;
                case 2131430438: goto L_0x07ed;
                case 2131430441: goto L_0x07de;
                case 2131430442: goto L_0x07cf;
                case 2131430444: goto L_0x07c2;
                case 2131430445: goto L_0x07bb;
                case 2131430454: goto L_0x0766;
                case 2131430455: goto L_0x0757;
                case 2131430456: goto L_0x0746;
                case 2131430457: goto L_0x06ca;
                case 2131430458: goto L_0x06bb;
                case 2131430459: goto L_0x06ac;
                case 2131430460: goto L_0x068d;
                case 2131430465: goto L_0x0608;
                case 2131430466: goto L_0x05b5;
                case 2131430467: goto L_0x0586;
                case 2131430468: goto L_0x0515;
                case 2131430469: goto L_0x04a5;
                case 2131430470: goto L_0x0436;
                case 2131430473: goto L_0x042e;
                case 2131430474: goto L_0x041d;
                case 2131430475: goto L_0x0416;
                case 2131430476: goto L_0x040f;
                case 2131430477: goto L_0x03fe;
                case 2131430478: goto L_0x03ad;
                case 2131430479: goto L_0x0333;
                case 2131430480: goto L_0x0333;
                case 2131430481: goto L_0x080a;
                case 2131430482: goto L_0x0320;
                case 2131430485: goto L_0x0311;
                case 2131430486: goto L_0x030a;
                case 2131430505: goto L_0x02fb;
                case 2131430516: goto L_0x02ec;
                case 2131430517: goto L_0x0280;
                case 2131430518: goto L_0x0271;
                case 2131430522: goto L_0x0260;
                case 2131430523: goto L_0x0251;
                case 2131430524: goto L_0x0240;
                case 2131430528: goto L_0x0231;
                case 2131430529: goto L_0x0222;
                case 2131430530: goto L_0x01b6;
                case 2131430531: goto L_0x01a7;
                case 2131430532: goto L_0x0198;
                case 2131430533: goto L_0x0184;
                case 2131430535: goto L_0x017b;
                case 2131430536: goto L_0x0172;
                case 2131430537: goto L_0x0169;
                case 2131430541: goto L_0x0162;
                case 2131430545: goto L_0x0152;
                case 2131430546: goto L_0x0129;
                case 2131430547: goto L_0x011a;
                case 2131430548: goto L_0x0108;
                case 2131430550: goto L_0x0101;
                case 2131430551: goto L_0x00f2;
                case 2131430552: goto L_0x00df;
                case 2131430553: goto L_0x00d0;
                case 2131430612: goto L_0x00c9;
                case 2131430619: goto L_0x004d;
                case 2131430621: goto L_0x003e;
                case 2131430625: goto L_0x0031;
                default: goto L_0x002f;
            }
        L_0x002f:
            goto L_0x0900
        L_0x0031:
            com.etsy.android.ui.cardview.viewholders.q1 r12 = new com.etsy.android.ui.cardview.viewholders.q1
            of.a r1 = r0.mo45891c(r1)
            com.etsy.android.ui.cardview.clickhandlers.ShopCardClickHandler r1 = (com.etsy.android.p327ui.cardview.clickhandlers.ShopCardClickHandler) r1
            r12.<init>(r2, r1)
            goto L_0x0900
        L_0x003e:
            com.etsy.android.ui.cardview.viewholders.n1 r3 = new com.etsy.android.ui.cardview.viewholders.n1
            o.j<of.a> r4 = r0.f28982a
            java.lang.Object r1 = r4.mo19993f(r1, r12)
            of.a r1 = (p415of.C13171a) r1
            r3.<init>(r2, r1)
            goto L_0x08ff
        L_0x004d:
            androidx.fragment.app.Fragment r4 = r20.mo45892d()
            if (r4 == 0) goto L_0x0900
            if (r3 == 0) goto L_0x0062
            r3 = r2
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            androidx.recyclerview.widget.RecyclerView$t r3 = r3.getRecycledViewPool()
            r5 = 2131430619(0x7f0b0cdb, float:1.8482944E38)
            r3.mo11691b(r5)
        L_0x0062:
            com.etsy.android.ui.cardview.viewholders.i0 r7 = new com.etsy.android.ui.cardview.viewholders.i0
            com.etsy.android.ui.cardview.viewholders.j0$a r3 = new com.etsy.android.ui.cardview.viewholders.j0$a
            r3.<init>()
            r3.f20245a = r4
            kotlin.jvm.internal.C19383o.m32797g(r2, r11)
            r3.f20246b = r2
            com.etsy.android.ui.util.h r4 = r0.f30389A
            r3.mo31425f(r4)
            com.etsy.android.lib.logger.p r4 = r0.f28983b
            r3.mo31429j(r4)
            r3.f20257m = r13
            of.k r4 = r0.f28985d
            r3.f20256l = r4
            com.etsy.android.ui.sdl.a r4 = r0.f30413z
            r3.f20258n = r4
            r3.f20248d = r0
            ua.f r4 = r0.f30390B
            r3.mo31427h(r4)
            w8.e r4 = r0.f30392D
            r3.mo31420a(r4)
            fe.a r4 = r0.f30393E
            r3.mo31423d(r4)
            fe.o r4 = r0.f30394F
            r3.mo31426g(r4)
            x9.a r4 = r0.f30395G
            r3.mo31424e(r4)
            com.etsy.android.ui.search.h r4 = r0.f30396H
            r3.mo31428i(r4)
            com.etsy.android.ui.cardview.viewholders.j0 r3 = r3.mo31422c()
            r7.<init>(r3)
            ve.c r9 = new ve.c
            r4 = 0
            o.j<of.a> r3 = r0.f28982a
            java.lang.Object r1 = r3.mo19993f(r1, r12)
            r5 = r1
            com.etsy.android.ui.cardview.clickhandlers.y r5 = (com.etsy.android.p327ui.cardview.clickhandlers.C9144y) r5
            ve.a r6 = new ve.a
            r6.<init>(r2)
            com.etsy.android.lib.logger.p r10 = r0.f28983b
            r1 = r9
            r2 = r21
            r3 = r8
            r8 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r12 = r9
            goto L_0x0900
        L_0x00c9:
            com.etsy.android.vespa.viewholders.f0 r12 = new com.etsy.android.vespa.viewholders.f0
            r12.<init>(r2)
            goto L_0x0900
        L_0x00d0:
            com.etsy.android.ui.cardview.viewholders.l1 r3 = new com.etsy.android.ui.cardview.viewholders.l1
            o.j<of.a> r4 = r0.f28982a
            java.lang.Object r1 = r4.mo19993f(r1, r12)
            com.etsy.android.ui.cardview.clickhandlers.ShopCardClickHandler r1 = (com.etsy.android.p327ui.cardview.clickhandlers.ShopCardClickHandler) r1
            r3.<init>(r2, r1, r8)
            goto L_0x08ff
        L_0x00df:
            com.etsy.android.vespa.viewholders.h r3 = new com.etsy.android.vespa.viewholders.h
            o.j<of.a> r4 = r0.f28982a
            java.lang.Object r1 = r4.mo19993f(r1, r12)
            of.a r1 = (p415of.C13171a) r1
            com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions r4 = r0.f30398k
            boolean r4 = r4 instanceof com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions.C11969c
            r3.<init>(r2, r1, r4)
            goto L_0x08ff
        L_0x00f2:
            com.etsy.android.ui.cardview.viewholders.d0 r3 = new com.etsy.android.ui.cardview.viewholders.d0
            o.j<of.a> r4 = r0.f28982a
            java.lang.Object r1 = r4.mo19993f(r1, r12)
            com.etsy.android.ui.cardview.clickhandlers.f r1 = (com.etsy.android.p327ui.cardview.clickhandlers.C9121f) r1
            r3.<init>(r2, r1)
            goto L_0x08ff
        L_0x0101:
            com.etsy.android.ui.cardview.viewholders.c0 r12 = new com.etsy.android.ui.cardview.viewholders.c0
            r12.<init>(r2)
            goto L_0x0900
        L_0x0108:
            com.etsy.android.vespa.viewholders.b0 r12 = new com.etsy.android.vespa.viewholders.b0
            com.etsy.android.ui.cardview.clickhandlers.x r1 = new com.etsy.android.ui.cardview.clickhandlers.x
            androidx.fragment.app.Fragment r3 = r20.mo45892d()
            com.etsy.android.lib.logger.p r4 = r0.f28983b
            r1.<init>(r3, r4)
            r12.<init>(r2, r1)
            goto L_0x0900
        L_0x011a:
            com.etsy.android.uikit.viewholder.o r3 = new com.etsy.android.uikit.viewholder.o
            o.j<of.a> r4 = r0.f28982a
            java.lang.Object r1 = r4.mo19993f(r1, r12)
            of.a r1 = (p415of.C13171a) r1
            r3.<init>(r2, r1)
            goto L_0x08ff
        L_0x0129:
            r1 = r8 ^ 1
            com.etsy.android.ui.cardview.viewholders.g1 r3 = new com.etsy.android.ui.cardview.viewholders.g1
            o.j<of.a> r5 = r0.f28982a
            java.lang.Object r5 = r5.mo19993f(r6, r12)
            of.a r5 = (p415of.C13171a) r5
            r3.<init>(r2, r5, r1)
            androidx.fragment.app.Fragment r1 = r20.mo45892d()
            if (r8 == 0) goto L_0x08ff
            if (r1 == 0) goto L_0x08ff
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131165394(0x7f0700d2, float:1.7945004E38)
            int r1 = r1.getDimensionPixelSize(r2)
            android.view.View r2 = r3.itemView
            r2.setPadding(r4, r4, r4, r1)
            goto L_0x08ff
        L_0x0152:
            com.etsy.android.ui.cardview.viewholders.i1 r1 = new com.etsy.android.ui.cardview.viewholders.i1
            o.j<of.a> r3 = r0.f28982a
            java.lang.Object r3 = r3.mo19993f(r6, r12)
            of.a r3 = (p415of.C13171a) r3
            r1.<init>(r2, r3)
            r12 = r1
            goto L_0x0900
        L_0x0162:
            com.etsy.android.ui.cardview.viewholders.f1 r12 = new com.etsy.android.ui.cardview.viewholders.f1
            r12.<init>(r2)
            goto L_0x0900
        L_0x0169:
            com.etsy.android.ui.favorites.search.f r12 = new com.etsy.android.ui.favorites.search.f
            com.etsy.android.lib.logger.p r1 = r0.f28983b
            r12.<init>(r2, r1)
            goto L_0x0900
        L_0x0172:
            com.etsy.android.ui.favorites.search.c r12 = new com.etsy.android.ui.favorites.search.c
            com.etsy.android.lib.logger.p r1 = r0.f28983b
            r12.<init>(r2, r1)
            goto L_0x0900
        L_0x017b:
            j9.c r12 = new j9.c
            com.etsy.android.lib.logger.p r1 = r0.f28983b
            r12.<init>(r2, r1)
            goto L_0x0900
        L_0x0184:
            androidx.fragment.app.Fragment r1 = r20.mo45892d()
            if (r1 == 0) goto L_0x0900
            com.etsy.android.lib.logger.p r1 = r0.f28983b
            java.lang.String r3 = "parent"
            kotlin.jvm.internal.C19383o.m32797g(r2, r3)
            java.lang.String r2 = "tracker"
            kotlin.jvm.internal.C19383o.m32797g(r1, r2)
            goto L_0x0900
        L_0x0198:
            com.etsy.android.ui.cardview.viewholders.z0 r3 = new com.etsy.android.ui.cardview.viewholders.z0
            o.j<of.a> r4 = r0.f28982a
            java.lang.Object r1 = r4.mo19993f(r1, r12)
            com.etsy.android.ui.cardview.clickhandlers.SavedCartClickHandler r1 = (com.etsy.android.p327ui.cardview.clickhandlers.SavedCartClickHandler) r1
            r3.<init>(r2, r1)
            goto L_0x08ff
        L_0x01a7:
            com.etsy.android.ui.cardview.viewholders.u0 r3 = new com.etsy.android.ui.cardview.viewholders.u0
            o.j<of.a> r4 = r0.f28982a
            java.lang.Object r1 = r4.mo19993f(r1, r12)
            com.etsy.android.ui.cardview.clickhandlers.SavableSearchQueryClickHandler r1 = (com.etsy.android.p327ui.cardview.clickhandlers.SavableSearchQueryClickHandler) r1
            r3.<init>(r2, r1)
            goto L_0x08ff
        L_0x01b6:
            androidx.fragment.app.Fragment r1 = r20.mo45892d()
            if (r1 == 0) goto L_0x0900
            android.content.res.Resources r3 = r1.getResources()
            int r18 = r3.getDimensionPixelOffset(r10)
            android.content.res.Resources r3 = r1.getResources()
            int r19 = r3.getDimensionPixelOffset(r5)
            qf.b r3 = new qf.b
            r14 = r3
            r15 = r18
            r16 = r18
            r17 = r18
            r14.<init>(r15, r16, r17, r18, r19)
            com.etsy.android.ui.cardview.viewholders.i0 r12 = new com.etsy.android.ui.cardview.viewholders.i0
            com.etsy.android.ui.cardview.viewholders.j0$a r4 = new com.etsy.android.ui.cardview.viewholders.j0$a
            r4.<init>()
            r4.f20245a = r1
            kotlin.jvm.internal.C19383o.m32797g(r2, r11)
            r4.f20246b = r2
            com.etsy.android.ui.util.h r1 = r0.f30389A
            r4.mo31425f(r1)
            com.etsy.android.lib.logger.p r1 = r0.f28983b
            r4.mo31429j(r1)
            r4.f20257m = r13
            of.k r1 = r0.f28985d
            r4.f20256l = r1
            r4.f20248d = r0
            ua.f r1 = r0.f30390B
            r4.mo31427h(r1)
            r4.mo31421b(r3)
            w8.e r1 = r0.f30392D
            r4.mo31420a(r1)
            fe.a r1 = r0.f30393E
            r4.mo31423d(r1)
            fe.o r1 = r0.f30394F
            r4.mo31426g(r1)
            x9.a r1 = r0.f30395G
            r4.mo31424e(r1)
            com.etsy.android.ui.search.h r1 = r0.f30396H
            r4.mo31428i(r1)
            com.etsy.android.ui.cardview.viewholders.j0 r1 = r4.mo31422c()
            r12.<init>(r1)
            goto L_0x0900
        L_0x0222:
            com.etsy.android.ui.cardview.viewholders.t0 r3 = new com.etsy.android.ui.cardview.viewholders.t0
            o.j<of.a> r4 = r0.f28982a
            java.lang.Object r1 = r4.mo19993f(r1, r12)
            com.etsy.android.ui.cardview.clickhandlers.p r1 = (com.etsy.android.p327ui.cardview.clickhandlers.C9135p) r1
            r3.<init>(r2, r1)
            goto L_0x08ff
        L_0x0231:
            com.etsy.android.ui.cardview.viewholders.RelatedLinkTagsViewHolder r3 = new com.etsy.android.ui.cardview.viewholders.RelatedLinkTagsViewHolder
            o.j<of.a> r4 = r0.f28982a
            java.lang.Object r1 = r4.mo19993f(r1, r12)
            of.a r1 = (p415of.C13171a) r1
            r3.<init>(r2, r1)
            goto L_0x08ff
        L_0x0240:
            com.etsy.android.ui.cardview.viewholders.OrderShippingStatusViewHolder r3 = new com.etsy.android.ui.cardview.viewholders.OrderShippingStatusViewHolder
            com.etsy.android.lib.logger.p r4 = r0.f28983b
            o.j<of.a> r5 = r0.f28982a
            java.lang.Object r1 = r5.mo19993f(r1, r12)
            com.etsy.android.ui.cardview.clickhandlers.n r1 = (com.etsy.android.p327ui.cardview.clickhandlers.C9133n) r1
            r3.<init>(r2, r4, r1)
            goto L_0x08ff
        L_0x0251:
            androidx.fragment.app.Fragment r1 = r20.mo45892d()
            if (r1 == 0) goto L_0x0900
            com.etsy.android.ui.cardview.viewholders.q0 r12 = new com.etsy.android.ui.cardview.viewholders.q0
            com.etsy.android.lib.logger.p r3 = r0.f28983b
            r12.<init>(r1, r2, r3, r0)
            goto L_0x0900
        L_0x0260:
            com.etsy.android.ui.cardview.viewholders.p0 r3 = new com.etsy.android.ui.cardview.viewholders.p0
            o.j<of.a> r4 = r0.f28982a
            java.lang.Object r1 = r4.mo19993f(r1, r12)
            pf.c r1 = (p423pf.C13232c) r1
            com.etsy.android.lib.logger.p r4 = r0.f28983b
            r3.<init>(r2, r4, r1)
            goto L_0x08ff
        L_0x0271:
            com.etsy.android.ui.cardview.viewholders.c1 r3 = new com.etsy.android.ui.cardview.viewholders.c1
            o.j<of.a> r4 = r0.f28982a
            java.lang.Object r1 = r4.mo19993f(r1, r12)
            com.etsy.android.ui.cardview.clickhandlers.SavedCartClickHandler r1 = (com.etsy.android.p327ui.cardview.clickhandlers.SavedCartClickHandler) r1
            r3.<init>(r2, r1)
            goto L_0x08ff
        L_0x0280:
            androidx.fragment.app.Fragment r1 = r20.mo45892d()
            if (r1 == 0) goto L_0x0900
            android.content.res.Resources r3 = r1.getResources()
            int r18 = r3.getDimensionPixelOffset(r9)
            android.content.res.Resources r3 = r1.getResources()
            int r19 = r3.getDimensionPixelOffset(r9)
            qf.b r3 = new qf.b
            r14 = r3
            r15 = r18
            r16 = r18
            r17 = r18
            r14.<init>(r15, r16, r17, r18, r19)
            com.etsy.android.ui.cardview.viewholders.i0 r12 = new com.etsy.android.ui.cardview.viewholders.i0
            com.etsy.android.ui.cardview.viewholders.j0$a r4 = new com.etsy.android.ui.cardview.viewholders.j0$a
            r4.<init>()
            r4.f20245a = r1
            kotlin.jvm.internal.C19383o.m32797g(r2, r11)
            r4.f20246b = r2
            com.etsy.android.ui.util.h r1 = r0.f30389A
            r4.mo31425f(r1)
            com.etsy.android.lib.logger.p r1 = r0.f28983b
            r4.mo31429j(r1)
            r4.f20257m = r13
            of.k r1 = r0.f28985d
            r4.f20256l = r1
            r4.f20248d = r0
            ua.f r1 = r0.f30390B
            r4.mo31427h(r1)
            r4.mo31421b(r3)
            w8.e r1 = r0.f30392D
            r4.mo31420a(r1)
            fe.a r1 = r0.f30393E
            r4.mo31423d(r1)
            fe.o r1 = r0.f30394F
            r4.mo31426g(r1)
            x9.a r1 = r0.f30395G
            r4.mo31424e(r1)
            com.etsy.android.ui.search.h r1 = r0.f30396H
            r4.mo31428i(r1)
            com.etsy.android.ui.cardview.viewholders.j0 r1 = r4.mo31422c()
            r12.<init>(r1)
            goto L_0x0900
        L_0x02ec:
            com.etsy.android.ui.cardview.viewholders.SavedForLaterCarouselCartListingCardViewHolder r3 = new com.etsy.android.ui.cardview.viewholders.SavedForLaterCarouselCartListingCardViewHolder
            o.j<of.a> r4 = r0.f28982a
            java.lang.Object r1 = r4.mo19993f(r1, r12)
            com.etsy.android.ui.cardview.clickhandlers.SavedCartClickHandler r1 = (com.etsy.android.p327ui.cardview.clickhandlers.SavedCartClickHandler) r1
            r3.<init>(r2, r1)
            goto L_0x08ff
        L_0x02fb:
            com.etsy.android.ui.cardview.viewholders.l r3 = new com.etsy.android.ui.cardview.viewholders.l
            o.j<of.a> r4 = r0.f28982a
            java.lang.Object r1 = r4.mo19993f(r1, r12)
            pf.c r1 = (p423pf.C13232c) r1
            r3.<init>(r2, r1)
            goto L_0x08ff
        L_0x030a:
            com.etsy.android.vespa.viewholders.x r12 = new com.etsy.android.vespa.viewholders.x
            r12.<init>(r2)
            goto L_0x0900
        L_0x0311:
            com.etsy.android.ui.cardview.viewholders.ListingCollectionViewHolder r3 = new com.etsy.android.ui.cardview.viewholders.ListingCollectionViewHolder
            o.j<of.a> r4 = r0.f28982a
            java.lang.Object r1 = r4.mo19993f(r1, r12)
            com.etsy.android.ui.cardview.clickhandlers.l r1 = (com.etsy.android.p327ui.cardview.clickhandlers.C9129l) r1
            r3.<init>(r2, r1)
            goto L_0x08ff
        L_0x0320:
            com.etsy.android.uikit.viewholder.p r3 = new com.etsy.android.uikit.viewholder.p
            o.j<of.a> r4 = r0.f28982a
            java.lang.Object r1 = r4.mo19993f(r1, r12)
            com.etsy.android.ui.cardview.clickhandlers.j r1 = (com.etsy.android.p327ui.cardview.clickhandlers.C9125j) r1
            com.etsy.android.lib.currency.b r4 = r0.f30400m
            com.etsy.android.uikit.viewholder.t r5 = r0.f30412y
            r3.<init>(r2, r1, r4, r5)
            goto L_0x08ff
        L_0x0333:
            androidx.fragment.app.Fragment r1 = r20.mo45892d()
            if (r1 == 0) goto L_0x0900
            androidx.recyclerview.widget.GridLayoutManager r3 = new androidx.recyclerview.widget.GridLayoutManager
            r1.requireActivity()
            r3.<init>(r7, r4)
            android.content.res.Resources r4 = r1.getResources()
            int r17 = r4.getDimensionPixelOffset(r10)
            android.content.res.Resources r4 = r1.getResources()
            int r19 = r4.getDimensionPixelOffset(r5)
            qf.a r4 = new qf.a
            r14 = r4
            r15 = r17
            r16 = r17
            r18 = r19
            r14.<init>(r15, r16, r17, r18, r19)
            com.etsy.android.ui.cardview.viewholders.i0 r12 = new com.etsy.android.ui.cardview.viewholders.i0
            com.etsy.android.ui.cardview.viewholders.j0$a r5 = new com.etsy.android.ui.cardview.viewholders.j0$a
            r5.<init>()
            r5.f20245a = r1
            kotlin.jvm.internal.C19383o.m32797g(r2, r11)
            r5.f20246b = r2
            com.etsy.android.ui.util.h r1 = r0.f30389A
            r5.mo31425f(r1)
            com.etsy.android.lib.logger.p r1 = r0.f28983b
            r5.mo31429j(r1)
            r5.f20257m = r13
            of.k r1 = r0.f28985d
            r5.f20256l = r1
            com.etsy.android.ui.sdl.a r1 = r0.f30413z
            r5.f20258n = r1
            r5.f20259o = r3
            r5.f20248d = r0
            r5.mo31421b(r4)
            ua.f r1 = r0.f30390B
            r5.mo31427h(r1)
            w8.e r1 = r0.f30392D
            r5.mo31420a(r1)
            fe.a r1 = r0.f30393E
            r5.mo31423d(r1)
            fe.o r1 = r0.f30394F
            r5.mo31426g(r1)
            x9.a r1 = r0.f30395G
            r5.mo31424e(r1)
            com.etsy.android.ui.search.h r1 = r0.f30396H
            r5.mo31428i(r1)
            com.etsy.android.ui.cardview.viewholders.j0 r1 = r5.mo31422c()
            r12.<init>(r1)
            goto L_0x0900
        L_0x03ad:
            androidx.fragment.app.Fragment r1 = r20.mo45892d()
            if (r1 == 0) goto L_0x0900
            com.etsy.android.ui.cardview.viewholders.HorizontalTaxonomyListSectionViewHolder r12 = new com.etsy.android.ui.cardview.viewholders.HorizontalTaxonomyListSectionViewHolder
            com.etsy.android.ui.cardview.viewholders.j0$a r3 = new com.etsy.android.ui.cardview.viewholders.j0$a
            r3.<init>()
            r3.f20245a = r1
            kotlin.jvm.internal.C19383o.m32797g(r2, r11)
            r3.f20246b = r2
            com.etsy.android.ui.util.h r1 = r0.f30389A
            r3.mo31425f(r1)
            com.etsy.android.lib.logger.p r1 = r0.f28983b
            r3.mo31429j(r1)
            r3.f20257m = r13
            of.k r1 = r0.f28985d
            r3.f20256l = r1
            com.etsy.android.ui.sdl.a r1 = r0.f30413z
            r3.f20258n = r1
            r3.f20248d = r0
            ua.f r1 = r0.f30390B
            r3.mo31427h(r1)
            w8.e r1 = r0.f30392D
            r3.mo31420a(r1)
            fe.a r1 = r0.f30393E
            r3.mo31423d(r1)
            fe.o r1 = r0.f30394F
            r3.mo31426g(r1)
            x9.a r1 = r0.f30395G
            r3.mo31424e(r1)
            com.etsy.android.ui.search.h r1 = r0.f30396H
            r3.mo31428i(r1)
            com.etsy.android.ui.cardview.viewholders.j0 r1 = r3.mo31422c()
            r12.<init>(r1)
            goto L_0x0900
        L_0x03fe:
            com.etsy.android.ui.cardview.viewholders.n0 r3 = new com.etsy.android.ui.cardview.viewholders.n0
            o.j<of.a> r4 = r0.f28982a
            java.lang.Object r1 = r4.mo19993f(r1, r12)
            com.etsy.android.ui.cardview.viewholders.l0 r1 = (com.etsy.android.p327ui.cardview.viewholders.C9194l0) r1
            com.etsy.android.lib.logger.p r4 = r0.f28983b
            r3.<init>(r1, r4, r2)
            goto L_0x08ff
        L_0x040f:
            com.etsy.android.ui.cardview.viewholders.m0 r12 = new com.etsy.android.ui.cardview.viewholders.m0
            r12.<init>(r2)
            goto L_0x0900
        L_0x0416:
            com.etsy.android.ui.cardview.viewholders.k0 r12 = new com.etsy.android.ui.cardview.viewholders.k0
            r12.<init>(r2)
            goto L_0x0900
        L_0x041d:
            com.etsy.android.vespa.viewholders.s r3 = new com.etsy.android.vespa.viewholders.s
            com.etsy.android.lib.logger.p r4 = r0.f28983b
            o.j<of.a> r5 = r0.f28982a
            java.lang.Object r1 = r5.mo19993f(r1, r12)
            pf.c r1 = (p423pf.C13232c) r1
            r3.<init>(r2, r4, r1)
            goto L_0x08ff
        L_0x042e:
            com.etsy.android.vespa.viewholders.r r12 = new com.etsy.android.vespa.viewholders.r
            r1 = 0
            r12.<init>(r2, r1)
            goto L_0x0900
        L_0x0436:
            androidx.fragment.app.Fragment r1 = r20.mo45892d()
            if (r1 == 0) goto L_0x0900
            android.content.res.Resources r3 = r1.getResources()
            r4 = 2131165961(0x7f070309, float:1.7946154E38)
            int r3 = r3.getDimensionPixelOffset(r4)
            qf.d r4 = new qf.d
            r4.<init>(r3)
            com.etsy.android.ui.cardview.viewholders.i0 r12 = new com.etsy.android.ui.cardview.viewholders.i0
            com.etsy.android.ui.cardview.viewholders.j0$a r3 = new com.etsy.android.ui.cardview.viewholders.j0$a
            r3.<init>()
            r3.f20245a = r1
            kotlin.jvm.internal.C19383o.m32797g(r2, r11)
            r3.f20246b = r2
            com.etsy.android.ui.util.h r2 = r0.f30389A
            r3.mo31425f(r2)
            com.etsy.android.lib.logger.p r2 = r0.f28983b
            r3.mo31429j(r2)
            r3.f20257m = r13
            of.k r2 = r0.f28985d
            r3.f20256l = r2
            com.etsy.android.ui.sdl.a r2 = r0.f30413z
            r3.f20258n = r2
            r3.f20248d = r0
            ua.f r2 = r0.f30390B
            r3.mo31427h(r2)
            com.etsy.android.vespa.itemdecorators.TripletGridLayoutManager r2 = new com.etsy.android.vespa.itemdecorators.TripletGridLayoutManager
            androidx.fragment.app.FragmentActivity r1 = r1.requireActivity()
            r2.<init>(r1)
            r3.f20259o = r2
            r3.mo31421b(r4)
            w8.e r1 = r0.f30392D
            r3.mo31420a(r1)
            fe.a r1 = r0.f30393E
            r3.mo31423d(r1)
            fe.o r1 = r0.f30394F
            r3.mo31426g(r1)
            x9.a r1 = r0.f30395G
            r3.mo31424e(r1)
            com.etsy.android.ui.search.h r1 = r0.f30396H
            r3.mo31428i(r1)
            com.etsy.android.ui.cardview.viewholders.j0 r1 = r3.mo31422c()
            r12.<init>(r1)
            goto L_0x0900
        L_0x04a5:
            androidx.fragment.app.Fragment r1 = r20.mo45892d()
            if (r1 == 0) goto L_0x0900
            android.content.res.Resources r3 = r1.getResources()
            int r18 = r3.getDimensionPixelOffset(r10)
            android.content.res.Resources r3 = r1.getResources()
            int r19 = r3.getDimensionPixelOffset(r9)
            qf.b r3 = new qf.b
            r14 = r3
            r15 = r18
            r16 = r18
            r17 = r18
            r14.<init>(r15, r16, r17, r18, r19)
            com.etsy.android.ui.cardview.viewholders.i0 r12 = new com.etsy.android.ui.cardview.viewholders.i0
            com.etsy.android.ui.cardview.viewholders.j0$a r4 = new com.etsy.android.ui.cardview.viewholders.j0$a
            r4.<init>()
            r4.f20245a = r1
            kotlin.jvm.internal.C19383o.m32797g(r2, r11)
            r4.f20246b = r2
            com.etsy.android.ui.util.h r1 = r0.f30389A
            r4.mo31425f(r1)
            com.etsy.android.lib.logger.p r1 = r0.f28983b
            r4.mo31429j(r1)
            r4.f20257m = r13
            of.k r1 = r0.f28985d
            r4.f20256l = r1
            com.etsy.android.ui.sdl.a r1 = r0.f30413z
            r4.f20258n = r1
            r4.f20248d = r0
            ua.f r1 = r0.f30390B
            r4.mo31427h(r1)
            r4.mo31421b(r3)
            w8.e r1 = r0.f30392D
            r4.mo31420a(r1)
            fe.a r1 = r0.f30393E
            r4.mo31423d(r1)
            fe.o r1 = r0.f30394F
            r4.mo31426g(r1)
            x9.a r1 = r0.f30395G
            r4.mo31424e(r1)
            com.etsy.android.ui.search.h r1 = r0.f30396H
            r4.mo31428i(r1)
            com.etsy.android.ui.cardview.viewholders.j0 r1 = r4.mo31422c()
            r12.<init>(r1)
            goto L_0x0900
        L_0x0515:
            androidx.fragment.app.Fragment r1 = r20.mo45892d()
            if (r1 == 0) goto L_0x0900
            com.etsy.android.ui.cardview.viewholders.i0 r12 = new com.etsy.android.ui.cardview.viewholders.i0
            com.etsy.android.ui.cardview.viewholders.j0$a r3 = new com.etsy.android.ui.cardview.viewholders.j0$a
            r3.<init>()
            r3.f20245a = r1
            kotlin.jvm.internal.C19383o.m32797g(r2, r11)
            r3.f20246b = r2
            com.etsy.android.ui.util.h r2 = r0.f30389A
            r3.mo31425f(r2)
            com.etsy.android.lib.logger.p r2 = r0.f28983b
            r3.mo31429j(r2)
            r3.f20257m = r13
            of.k r2 = r0.f28985d
            r3.f20256l = r2
            com.etsy.android.ui.sdl.a r2 = r0.f30413z
            r3.f20258n = r2
            r3.f20248d = r0
            ua.f r2 = r0.f30390B
            r3.mo31427h(r2)
            w8.e r2 = r0.f30392D
            r3.mo31420a(r2)
            fe.a r2 = r0.f30393E
            r3.mo31423d(r2)
            fe.o r2 = r0.f30394F
            r3.mo31426g(r2)
            x9.a r2 = r0.f30395G
            r3.mo31424e(r2)
            com.etsy.android.ui.search.h r2 = r0.f30396H
            r3.mo31428i(r2)
            com.etsy.android.ui.cardview.viewholders.j0 r2 = r3.mo31422c()
            r12.<init>(r2)
            androidx.fragment.app.FragmentActivity r1 = r1.requireActivity()
            r2 = 12
            float r2 = (float) r2
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = android.util.TypedValue.applyDimension(r13, r2, r1)
            int r1 = (int) r1
            android.view.View r2 = r12.itemView
            r3 = 2131428574(0x7f0b04de, float:1.8478796E38)
            android.view.View r2 = r2.findViewById(r3)
            r2.setPadding(r1, r4, r1, r4)
            goto L_0x0900
        L_0x0586:
            com.etsy.android.ui.cardview.viewholders.s0 r3 = new com.etsy.android.ui.cardview.viewholders.s0
            o.j<of.a> r4 = r0.f28982a
            java.lang.Object r1 = r4.mo19993f(r1, r12)
            of.a r1 = (p415of.C13171a) r1
            r3.<init>(r2, r1)
            androidx.fragment.app.Fragment r1 = r20.mo45892d()
            if (r8 == 0) goto L_0x08ff
            if (r1 == 0) goto L_0x08ff
            android.content.res.Resources r2 = r1.getResources()
            r4 = 2131166265(0x7f070439, float:1.794677E38)
            int r2 = r2.getDimensionPixelSize(r4)
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getDimensionPixelSize(r9)
            android.view.View r4 = r3.itemView
            r4.setPadding(r2, r2, r2, r1)
            goto L_0x08ff
        L_0x05b5:
            androidx.fragment.app.Fragment r1 = r20.mo45892d()
            if (r1 == 0) goto L_0x0900
            com.etsy.android.ui.cardview.viewholders.i0 r12 = new com.etsy.android.ui.cardview.viewholders.i0
            com.etsy.android.ui.cardview.viewholders.j0$a r3 = new com.etsy.android.ui.cardview.viewholders.j0$a
            r3.<init>()
            r3.f20245a = r1
            kotlin.jvm.internal.C19383o.m32797g(r2, r11)
            r3.f20246b = r2
            com.etsy.android.ui.util.h r1 = r0.f30389A
            r3.mo31425f(r1)
            com.etsy.android.lib.logger.p r1 = r0.f28983b
            r3.mo31429j(r1)
            r3.f20257m = r13
            of.k r1 = r0.f28985d
            r3.f20256l = r1
            com.etsy.android.ui.sdl.a r1 = r0.f30413z
            r3.f20258n = r1
            r3.f20248d = r0
            ua.f r1 = r0.f30390B
            r3.mo31427h(r1)
            r3.f20262r = r13
            w8.e r1 = r0.f30392D
            r3.mo31420a(r1)
            fe.a r1 = r0.f30393E
            r3.mo31423d(r1)
            fe.o r1 = r0.f30394F
            r3.mo31426g(r1)
            x9.a r1 = r0.f30395G
            r3.mo31424e(r1)
            com.etsy.android.ui.search.h r1 = r0.f30396H
            r3.mo31428i(r1)
            com.etsy.android.ui.cardview.viewholders.j0 r1 = r3.mo31422c()
            r12.<init>(r1)
            goto L_0x0900
        L_0x0608:
            com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions r1 = r0.f30398k
            if (r1 == 0) goto L_0x062a
            java.lang.Integer r1 = r1.mo38791e()
            if (r1 == 0) goto L_0x062a
            com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions r1 = r0.f30398k
            java.lang.Integer r1 = r1.mo38791e()
            int r4 = r1.intValue()
            com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions r1 = r0.f30398k
            java.lang.Integer r1 = r1.mo38791e()
            int r1 = r1.intValue()
            int r1 = r1 * r7
            r10 = r1
            r9 = r4
            goto L_0x062c
        L_0x062a:
            r9 = r4
            r10 = r9
        L_0x062c:
            qf.b r1 = new qf.b
            r5 = r1
            r6 = r9
            r7 = r9
            r8 = r9
            r5.<init>(r6, r7, r8, r9, r10)
            androidx.fragment.app.Fragment r3 = r20.mo45892d()
            if (r3 == 0) goto L_0x0900
            com.etsy.android.ui.cardview.viewholders.i0 r12 = new com.etsy.android.ui.cardview.viewholders.i0
            com.etsy.android.ui.cardview.viewholders.j0$a r4 = new com.etsy.android.ui.cardview.viewholders.j0$a
            r4.<init>()
            r4.f20245a = r3
            kotlin.jvm.internal.C19383o.m32797g(r2, r11)
            r4.f20246b = r2
            com.etsy.android.ui.util.h r2 = r0.f30389A
            r4.mo31425f(r2)
            com.etsy.android.lib.logger.p r2 = r0.f28983b
            r4.mo31429j(r2)
            r4.f20257m = r13
            of.k r2 = r0.f28985d
            r4.f20256l = r2
            com.etsy.android.ui.sdl.a r2 = r0.f30413z
            r4.f20258n = r2
            r4.f20248d = r0
            ua.f r2 = r0.f30390B
            r4.mo31427h(r2)
            r4.mo31421b(r1)
            java.lang.ref.WeakReference<java.util.Queue<android.view.View>> r1 = r0.f30391C
            r4.f20261q = r1
            w8.e r1 = r0.f30392D
            r4.mo31420a(r1)
            fe.a r1 = r0.f30393E
            r4.mo31423d(r1)
            fe.o r1 = r0.f30394F
            r4.mo31426g(r1)
            x9.a r1 = r0.f30395G
            r4.mo31424e(r1)
            com.etsy.android.ui.search.h r1 = r0.f30396H
            r4.mo31428i(r1)
            com.etsy.android.ui.cardview.viewholders.j0 r1 = r4.mo31422c()
            r12.<init>(r1)
            goto L_0x0900
        L_0x068d:
            androidx.recyclerview.widget.RecyclerView r3 = new androidx.recyclerview.widget.RecyclerView
            android.content.Context r2 = r21.getContext()
            r3.<init>(r2)
            r2 = 2131429449(0x7f0b0849, float:1.8480571E38)
            r3.setId(r2)
            com.etsy.android.ui.cardview.viewholders.a0 r2 = new com.etsy.android.ui.cardview.viewholders.a0
            o.j<of.a> r4 = r0.f28982a
            java.lang.Object r1 = r4.mo19993f(r1, r12)
            com.etsy.android.ui.cardview.clickhandlers.z r1 = (com.etsy.android.p327ui.cardview.clickhandlers.C9145z) r1
            r2.<init>(r3, r1)
            r12 = r2
            goto L_0x0900
        L_0x06ac:
            com.etsy.android.ui.cardview.viewholders.z r3 = new com.etsy.android.ui.cardview.viewholders.z
            o.j<of.a> r4 = r0.f28982a
            java.lang.Object r1 = r4.mo19993f(r1, r12)
            com.etsy.android.ui.cardview.clickhandlers.z r1 = (com.etsy.android.p327ui.cardview.clickhandlers.C9145z) r1
            r3.<init>(r2, r1)
            goto L_0x08ff
        L_0x06bb:
            com.etsy.android.ui.search.v2.relatedcategories.FeaturedCategoryViewHolder r3 = new com.etsy.android.ui.search.v2.relatedcategories.FeaturedCategoryViewHolder
            o.j<of.a> r4 = r0.f28982a
            java.lang.Object r1 = r4.mo19993f(r1, r12)
            com.etsy.android.ui.cardview.clickhandlers.o r1 = (com.etsy.android.p327ui.cardview.clickhandlers.C9134o) r1
            r3.<init>(r2, r1)
            goto L_0x08ff
        L_0x06ca:
            androidx.fragment.app.Fragment r1 = r20.mo45892d()
            if (r1 == 0) goto L_0x0900
            com.etsy.android.ui.cardview.viewholders.i0 r12 = new com.etsy.android.ui.cardview.viewholders.i0
            com.etsy.android.ui.cardview.viewholders.j0$a r3 = new com.etsy.android.ui.cardview.viewholders.j0$a
            r3.<init>()
            r3.f20245a = r1
            kotlin.jvm.internal.C19383o.m32797g(r2, r11)
            r3.f20246b = r2
            com.etsy.android.ui.util.h r2 = r0.f30389A
            r3.mo31425f(r2)
            com.etsy.android.lib.logger.p r2 = r0.f28983b
            r3.mo31429j(r2)
            r3.f20257m = r13
            of.k r2 = r0.f28985d
            r3.f20256l = r2
            com.etsy.android.ui.sdl.a r2 = r0.f30413z
            r3.f20258n = r2
            r3.f20248d = r0
            qf.b r2 = new qf.b
            android.content.res.Resources r4 = r1.getResources()
            r5 = 2131165388(0x7f0700cc, float:1.7944992E38)
            int r6 = r4.getDimensionPixelSize(r5)
            android.content.res.Resources r4 = r1.getResources()
            int r7 = r4.getDimensionPixelSize(r5)
            r8 = 0
            r9 = 0
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getDimensionPixelSize(r10)
            r4 = r2
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r1
            r4.<init>(r5, r6, r7, r8, r9)
            r3.mo31421b(r2)
            ua.f r1 = r0.f30390B
            r3.mo31427h(r1)
            w8.e r1 = r0.f30392D
            r3.mo31420a(r1)
            fe.a r1 = r0.f30393E
            r3.mo31423d(r1)
            fe.o r1 = r0.f30394F
            r3.mo31426g(r1)
            x9.a r1 = r0.f30395G
            r3.mo31424e(r1)
            com.etsy.android.ui.search.h r1 = r0.f30396H
            r3.mo31428i(r1)
            com.etsy.android.ui.cardview.viewholders.j0 r1 = r3.mo31422c()
            r12.<init>(r1)
            goto L_0x0900
        L_0x0746:
            com.etsy.android.ui.cardview.viewholders.x r3 = new com.etsy.android.ui.cardview.viewholders.x
            com.etsy.android.lib.logger.p r4 = r0.f28983b
            o.j<of.a> r5 = r0.f28982a
            java.lang.Object r1 = r5.mo19993f(r1, r12)
            of.a r1 = (p415of.C13171a) r1
            r3.<init>(r2, r4, r1)
            goto L_0x08ff
        L_0x0757:
            com.etsy.android.ui.cardview.viewholders.v r3 = new com.etsy.android.ui.cardview.viewholders.v
            o.j<of.a> r4 = r0.f28982a
            java.lang.Object r1 = r4.mo19993f(r1, r12)
            com.etsy.android.ui.cardview.clickhandlers.o r1 = (com.etsy.android.p327ui.cardview.clickhandlers.C9134o) r1
            r3.<init>(r2, r1)
            goto L_0x08ff
        L_0x0766:
            com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions r3 = r0.f30398k
            if (r3 != 0) goto L_0x0773
            com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions$e r3 = new com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions$e
            com.etsy.android.lib.logger.p r5 = r0.f28983b
            com.etsy.android.lib.config.e r5 = r5.f19116n
            r3.<init>(r4, r5)
        L_0x0773:
            r18 = r3
            java.lang.ref.WeakReference<java.util.Queue<android.view.View>> r3 = r0.f30391C
            if (r3 == 0) goto L_0x078f
            java.lang.Object r3 = r3.get()
            java.util.Queue r3 = (java.util.Queue) r3
            if (r3 == 0) goto L_0x078f
            java.lang.Object r3 = r3.poll()
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L_0x078f
            com.etsy.android.uikit.viewholder.s r4 = new com.etsy.android.uikit.viewholder.s
            r4.<init>((android.view.View) r3)
            goto L_0x0790
        L_0x078f:
            r4 = r12
        L_0x0790:
            if (r4 != 0) goto L_0x079a
            com.etsy.android.uikit.viewholder.s r3 = new com.etsy.android.uikit.viewholder.s
            r3.<init>((android.view.ViewGroup) r2)
            r19 = r3
            goto L_0x079c
        L_0x079a:
            r19 = r4
        L_0x079c:
            com.etsy.android.uikit.viewholder.ListingCardViewHolder r3 = new com.etsy.android.uikit.viewholder.ListingCardViewHolder
            o.j<of.a> r4 = r0.f28982a
            java.lang.Object r1 = r4.mo19993f(r1, r12)
            r14 = r1
            com.etsy.android.ui.cardview.clickhandlers.j r14 = (com.etsy.android.p327ui.cardview.clickhandlers.C9125j) r14
            r15 = 0
            boolean r1 = r0.f30397j
            com.etsy.android.uikit.viewholder.t r4 = r0.f30412y
            r13 = r3
            r16 = r1
            r17 = r4
            r13.<init>(r14, r15, r16, r17, r18, r19)
            com.etsy.android.ui.cardview.viewholders.FormattedListingCardViewHolder r12 = new com.etsy.android.ui.cardview.viewholders.FormattedListingCardViewHolder
            r12.<init>(r2, r3, r8)
            goto L_0x0900
        L_0x07bb:
            com.etsy.android.ui.cardview.viewholders.b0 r12 = new com.etsy.android.ui.cardview.viewholders.b0
            r12.<init>(r2)
            goto L_0x0900
        L_0x07c2:
            com.etsy.android.ui.cardview.viewholders.k r12 = new com.etsy.android.ui.cardview.viewholders.k
            com.etsy.android.lib.logger.p r1 = r0.f28983b
            fe.o r3 = r0.f30394F
            fe.a r4 = r0.f30393E
            r12.<init>(r2, r1, r3, r4)
            goto L_0x0900
        L_0x07cf:
            com.etsy.android.ui.cardview.viewholders.u r3 = new com.etsy.android.ui.cardview.viewholders.u
            o.j<of.a> r4 = r0.f28982a
            java.lang.Object r1 = r4.mo19993f(r1, r12)
            com.etsy.android.ui.cardview.clickhandlers.d r1 = (com.etsy.android.p327ui.cardview.clickhandlers.C9119d) r1
            r3.<init>(r2, r1)
            goto L_0x08ff
        L_0x07de:
            com.etsy.android.ui.cardview.viewholders.s r3 = new com.etsy.android.ui.cardview.viewholders.s
            o.j<of.a> r4 = r0.f28982a
            java.lang.Object r1 = r4.mo19993f(r1, r12)
            com.etsy.android.ui.cardview.clickhandlers.d r1 = (com.etsy.android.p327ui.cardview.clickhandlers.C9119d) r1
            r3.<init>(r2, r1, r8)
            goto L_0x08ff
        L_0x07ed:
            com.etsy.android.vespa.viewholders.k r12 = new com.etsy.android.vespa.viewholders.k
            r12.<init>(r2)
            goto L_0x0900
        L_0x07f4:
            com.etsy.android.ui.cardview.viewholders.n r3 = new com.etsy.android.ui.cardview.viewholders.n
            o.j<of.a> r4 = r0.f28982a
            java.lang.Object r1 = r4.mo19993f(r1, r12)
            com.etsy.android.ui.cardview.clickhandlers.c r1 = (com.etsy.android.p327ui.cardview.clickhandlers.C9118c) r1
            r3.<init>(r2, r1)
            goto L_0x08ff
        L_0x0803:
            j9.a r12 = new j9.a
            r12.<init>(r2)
            goto L_0x0900
        L_0x080a:
            if (r8 != 0) goto L_0x086b
            r3 = 2131430431(0x7f0b0c1f, float:1.8482563E38)
            if (r1 != r3) goto L_0x0812
            goto L_0x086b
        L_0x0812:
            com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions r3 = r0.f30398k
            if (r3 == 0) goto L_0x083b
            com.etsy.android.uikit.viewholder.ListingCardViewHolder r3 = new com.etsy.android.uikit.viewholder.ListingCardViewHolder
            o.j<of.a> r4 = r0.f28982a
            java.lang.Object r1 = r4.mo19993f(r1, r12)
            r14 = r1
            com.etsy.android.ui.cardview.clickhandlers.j r14 = (com.etsy.android.p327ui.cardview.clickhandlers.C9125j) r14
            r15 = 0
            boolean r1 = r0.f30397j
            com.etsy.android.uikit.viewholder.t r4 = r0.f30412y
            com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions r5 = r0.f30398k
            com.etsy.android.uikit.viewholder.s r6 = new com.etsy.android.uikit.viewholder.s
            r6.<init>((android.view.ViewGroup) r2)
            r13 = r3
            r16 = r1
            r17 = r4
            r18 = r5
            r19 = r6
            r13.<init>(r14, r15, r16, r17, r18, r19)
            goto L_0x08ff
        L_0x083b:
            android.content.Context r3 = r21.getContext()
            android.content.res.Resources r3 = r3.getResources()
            int r3 = r3.getDimensionPixelSize(r10)
            com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions$e r9 = new com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions$e
            com.etsy.android.lib.logger.p r4 = r0.f28983b
            com.etsy.android.lib.config.e r4 = r4.f19116n
            r9.<init>(r3, r4)
            com.etsy.android.uikit.viewholder.ListingCardViewHolder r3 = new com.etsy.android.uikit.viewholder.ListingCardViewHolder
            o.j<of.a> r4 = r0.f28982a
            java.lang.Object r1 = r4.mo19993f(r1, r12)
            r5 = r1
            com.etsy.android.ui.cardview.clickhandlers.j r5 = (com.etsy.android.p327ui.cardview.clickhandlers.C9125j) r5
            r6 = 0
            boolean r7 = r0.f30397j
            com.etsy.android.uikit.viewholder.t r8 = r0.f30412y
            com.etsy.android.uikit.viewholder.s r10 = new com.etsy.android.uikit.viewholder.s
            r10.<init>((android.view.ViewGroup) r2)
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10)
            goto L_0x08ff
        L_0x086b:
            android.content.Context r3 = r21.getContext()
            android.content.res.Resources r3 = r3.getResources()
            int r3 = r3.getDimensionPixelSize(r10)
            com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions$g r11 = new com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions$g
            com.etsy.android.lib.logger.p r4 = r0.f28983b
            com.etsy.android.lib.config.e r4 = r4.f19116n
            r11.<init>(r3, r4)
            com.etsy.android.uikit.viewholder.ListingCardViewHolder r3 = new com.etsy.android.uikit.viewholder.ListingCardViewHolder
            o.j<of.a> r4 = r0.f28982a
            java.lang.Object r1 = r4.mo19993f(r1, r12)
            r7 = r1
            com.etsy.android.ui.cardview.clickhandlers.j r7 = (com.etsy.android.p327ui.cardview.clickhandlers.C9125j) r7
            boolean r9 = r0.f30397j
            com.etsy.android.uikit.viewholder.t r10 = r0.f30412y
            com.etsy.android.uikit.viewholder.s r12 = new com.etsy.android.uikit.viewholder.s
            r12.<init>((android.view.ViewGroup) r2)
            r6 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12)
            goto L_0x08ff
        L_0x0899:
            com.etsy.android.vespa.viewholders.j r3 = new com.etsy.android.vespa.viewholders.j
            com.etsy.android.lib.logger.p r4 = r0.f28983b
            o.j<of.a> r5 = r0.f28982a
            java.lang.Object r1 = r5.mo19993f(r1, r12)
            pf.d r1 = (p423pf.C13233d) r1
            r3.<init>(r2, r4, r1)
            goto L_0x08ff
        L_0x08a9:
            com.etsy.android.vespa.viewholders.i r3 = new com.etsy.android.vespa.viewholders.i
            o.j<of.a> r4 = r0.f28982a
            java.lang.Object r1 = r4.mo19993f(r1, r12)
            pf.c r1 = (p423pf.C13232c) r1
            r3.<init>(r2, r1)
            goto L_0x08ff
        L_0x08b7:
            com.etsy.android.ui.cardview.viewholders.g r3 = new com.etsy.android.ui.cardview.viewholders.g
            o.j<of.a> r4 = r0.f28982a
            java.lang.Object r1 = r4.mo19993f(r1, r12)
            of.a r1 = (p415of.C13171a) r1
            r3.<init>(r2, r1, r8)
            goto L_0x08ff
        L_0x08c5:
            com.etsy.android.ui.cardview.viewholders.e r3 = new com.etsy.android.ui.cardview.viewholders.e
            o.j<of.a> r4 = r0.f28982a
            java.lang.Object r1 = r4.mo19993f(r1, r12)
            com.etsy.android.ui.cardview.clickhandlers.e r1 = (com.etsy.android.p327ui.cardview.clickhandlers.C9120e) r1
            r3.<init>(r2, r1)
            goto L_0x08ff
        L_0x08d3:
            com.etsy.android.vespa.viewholders.g r3 = new com.etsy.android.vespa.viewholders.g
            o.j<of.a> r4 = r0.f28982a
            java.lang.Object r1 = r4.mo19993f(r1, r12)
            pf.b r1 = (p423pf.C13231b) r1
            r4 = 2131165390(0x7f0700ce, float:1.7944996E38)
            r3.<init>(r2, r1, r4, r4)
            goto L_0x08ff
        L_0x08e4:
            com.etsy.android.uikit.viewholder.d r3 = new com.etsy.android.uikit.viewholder.d
            o.j<of.a> r4 = r0.f28982a
            java.lang.Object r1 = r4.mo19993f(r1, r12)
            com.etsy.android.ui.cardview.clickhandlers.j r1 = (com.etsy.android.p327ui.cardview.clickhandlers.C9125j) r1
            r3.<init>(r2, r1)
            goto L_0x08ff
        L_0x08f2:
            com.etsy.android.ui.cardview.viewholders.b r3 = new com.etsy.android.ui.cardview.viewholders.b
            o.j<of.a> r4 = r0.f28982a
            java.lang.Object r1 = r4.mo19993f(r1, r12)
            pf.g r1 = (p423pf.C13236g) r1
            r3.<init>(r2, r1)
        L_0x08ff:
            r12 = r3
        L_0x0900:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p472wb.C13801b.mo31854b(android.view.ViewGroup, int):com.etsy.android.vespa.viewholders.e");
    }

    /* renamed from: e */
    public final int mo45893e(int i) {
        switch (i) {
            case R.id.view_type_finds_card:
            case R.id.view_type_formatted_listing_card:
            case R.id.view_type_formatted_taxonomy_categories_pills:
            case R.id.view_type_formatted_taxonomy_category:
            case R.id.view_type_formatted_taxonomy_featured_category:
            case R.id.view_type_formatted_topic:
            case R.id.view_type_horizontal_related_link_tag:
            case R.id.view_type_large_image_deep_link_card:
            case R.id.view_type_listing_card:
            case R.id.view_type_listing_card_3x3:
            case R.id.view_type_multishop_saved_for_later_card:
            case R.id.view_type_review_card:
            case R.id.view_type_search_suggestion_with_image:
            case R.id.view_type_search_term:
            case R.id.view_type_shop_card:
            case R.id.view_type_styled_banner:
            case R.id.view_type_taxonomy_category:
                return -2;
            default:
                return this.f30411x;
        }
    }

    /* renamed from: g */
    public final int mo33127g(int i, int i2) {
        switch (i) {
            case R.id.view_type_category_card:
                return this.f30404q;
            case R.id.view_type_discover_listing_card:
                boolean z = false;
                if (this.f28987f != null) {
                    int i3 = i2;
                    while (true) {
                        int i4 = i3 - 1;
                        if (i4 < 0 || this.f28987f.getItemViewType(i4) != R.id.view_type_discover_listing_card) {
                            int i5 = i2 - i3;
                        } else {
                            i3 = i4;
                        }
                    }
                    int i52 = i2 - i3;
                    boolean z2 = (i52 + 4) % 6 == 0;
                    boolean z3 = (i52 + 3) % 6 == 0;
                    if (z2 || z3) {
                        z = true;
                    }
                }
                return z ? this.f30405r : this.f30406s;
            case R.id.view_type_finds_card:
                return this.f30408u;
            case R.id.view_type_finds_card_small:
                return this.f30407t;
            case R.id.view_type_formatted_listing_card:
            case R.id.view_type_listing_card:
                return this.f30403p;
            case R.id.view_type_formatted_taxonomy_category:
                return this.f30410w;
            case R.id.view_type_listing_card_3x3:
                return this.f30402o;
            case R.id.view_type_shop_card:
                return this.f30409v;
            default:
                return this.f30401n;
        }
    }

    /* renamed from: h */
    public final void mo32273h() {
    }

    /* renamed from: j */
    public void mo36728j() {
        C9125j jVar = new C9125j(mo45892d(), this.f28987f, this.f28983b, (C9126k.C9128b) null, this.f30392D);
        this.f28982a.mo19994h(R.id.view_type_listing_card, jVar);
        this.f28982a.mo19994h(R.id.view_type_anchor_listing_card, jVar);
        this.f28982a.mo19994h(R.id.view_type_discover_listing_card, jVar);
        this.f28982a.mo19994h(R.id.view_type_listing_card_3x3, jVar);
        this.f28982a.mo19994h(R.id.view_type_formatted_listing_card, jVar);
        this.f28982a.mo19994h(R.id.view_type_listing_collection, new C9129l(mo45892d(), this.f28983b));
        ShopCardClickHandler shopCardClickHandler = new ShopCardClickHandler(mo45892d(), this.f28983b, this.f30389A, this.f30390B);
        this.f28982a.mo19994h(R.id.view_type_shop_card, shopCardClickHandler);
        this.f28982a.mo19994h(R.id.view_type_wide_shop_card, shopCardClickHandler);
        this.f28982a.mo19994h(R.id.view_type_section_link_footer, new C9116a(mo45892d(), this.f28983b));
        this.f28982a.mo19994h(R.id.view_type_section_collage_link_footer, new C9116a(mo45892d(), this.f28983b));
        this.f28982a.mo19994h(R.id.view_type_related_link_tag, new C9116a(mo45892d(), this.f28983b));
        this.f28982a.mo19994h(R.id.view_type_horizontal_related_link_tag, new C9116a(mo45892d(), this.f28983b));
        C9119d dVar = new C9119d(mo45892d(), this.f28983b);
        this.f28982a.mo19994h(R.id.view_type_finds_card, dVar);
        this.f28982a.mo19994h(R.id.view_type_finds_card_small, dVar);
        this.f28982a.mo19994h(R.id.view_type_category_card, new C9117b(mo45892d(), this.f28983b));
        C9134o oVar = new C9134o(mo45892d(), this.f28983b);
        this.f28982a.mo19994h(R.id.view_type_formatted_taxonomy_categories_pills, oVar);
        this.f28982a.mo19994h(R.id.view_type_formatted_taxonomy_featured_category, oVar);
        this.f28982a.mo19994h(R.id.view_type_formatted_taxonomy_category, oVar);
        C9145z zVar = new C9145z(mo45892d(), this.f28983b);
        this.f28982a.mo19994h(R.id.view_type_formatted_topic, zVar);
        this.f28982a.mo19994h(R.id.view_type_formatted_topic_first_featured, zVar);
        this.f28982a.mo19994h(R.id.view_type_search_term, new C9142w(mo45892d(), this.f28983b));
        this.f28982a.mo19994h(R.id.view_type_search_suggestion_column, new C9142w(mo45892d(), this.f28983b));
        this.f28982a.mo19994h(R.id.view_type_button, new C13802a(mo45892d(), this.f28983b));
        C13236g gVar = new C13236g(mo45892d(), this.f28983b, this.f28985d);
        this.f28982a.mo19994h(R.id.view_type_section_header_with_page_link, new C9121f(mo45892d(), this.f28983b, new C9116a(mo45892d(), this.f28983b), gVar));
        this.f28982a.mo19994h(R.id.view_type_carded_section_header_with_page_link, new C9120e(mo45892d(), this.f28983b, new C9116a(mo45892d(), this.f28983b), gVar, jVar));
        this.f28982a.mo19994h(R.id.view_type_actionable_header, gVar);
        this.f28982a.mo19994h(R.id.view_type_explore_segment_list, gVar);
        this.f28982a.mo19994h(R.id.view_type_explore_results_header, gVar);
        this.f28982a.mo19994h(R.id.view_type_explore_banner, new C9118c(mo45892d(), this.f28983b));
        C13803b bVar = new C13803b(mo45892d(), this.f28983b);
        this.f28982a.mo19994h(R.id.view_type_deep_link_segment_list, bVar);
        this.f28982a.mo19994h(R.id.view_type_large_image_deep_link_card, bVar);
        this.f28982a.mo19994h(R.id.view_type_navigational_page_header, bVar);
        this.f28982a.mo19994h(R.id.view_type_multishop_empty_cart, bVar);
        this.f28982a.mo19994h(R.id.view_type_styled_banner, new C9144y(mo45892d(), this.f28983b, gVar));
        this.f28982a.mo19994h(R.id.view_type_deep_link_table_row, new C13804c(mo45892d(), this.f28983b));
        this.f28982a.mo19994h(R.id.view_type_savable_search_query, new SavableSearchQueryClickHandler(mo45892d(), this.f28983b));
        this.f28982a.mo19994h(R.id.view_type_list_reminder_card, new C9194l0(mo45892d(), this.f28983b));
        this.f28982a.mo19994h(R.id.view_type_review_card, new C9135p(mo45892d(), this.f28983b, ReviewTrackingSource.HOME_SCREEN_CAROUSEL));
        this.f28982a.mo19994h(R.id.view_type_order_shipping_status, new C9133n(mo45892d(), this.f28983b));
    }
}

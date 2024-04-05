package com.etsy.android.p327ui.listing.viewholders;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.p327ui.listing.p329ui.C10424k;
import com.etsy.android.p327ui.view.HorizontalBarPageIndicator;
import com.etsy.android.stylekit.accessibility.navigation.extensions.NavigationExtensionsKt;
import com.etsy.android.stylekit.accessibility.views.extensions.ViewsExtensionsKt;
import com.etsy.android.uikit.adapter.C11833d;
import com.etsy.android.uikit.adapter.C11840k;
import com.etsy.android.uikit.adapter.C11847p;
import com.etsy.android.uikit.adapter.C11850r;
import com.etsy.android.uikit.adapter.ListingVideoPosition;
import com.etsy.android.uikit.view.DynamicHeightViewPager;
import java.util.ArrayList;
import kotlin.jvm.internal.C19383o;
import p213q2.C7717a;
import p449tb.C13389a;
import p466vc.C13573c;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.viewholders.ListingImagesViewHolder */
public final class ListingImagesViewHolder extends C10424k {

    /* renamed from: b */
    public final C13573c f23489b;

    /* renamed from: c */
    public final boolean f23490c;

    /* renamed from: d */
    public C11833d f23491d;

    /* renamed from: e */
    public final DynamicHeightViewPager f23492e;

    /* renamed from: f */
    public final View f23493f = this.itemView.findViewById(R.id.view_visually_similar_button);

    /* renamed from: g */
    public final View f23494g;

    /* renamed from: h */
    public final HorizontalBarPageIndicator f23495h;

    /* renamed from: i */
    public final View f23496i;

    /* renamed from: j */
    public final C10669b f23497j;

    /* renamed from: k */
    public final C11847p f23498k;

    /* renamed from: l */
    public final C10670c f23499l;

    /* renamed from: m */
    public int f23500m;

    /* renamed from: com.etsy.android.ui.listing.viewholders.ListingImagesViewHolder$a */
    public static final class C10668a implements C11840k.C11841a {

        /* renamed from: a */
        public final /* synthetic */ ListingImagesViewHolder f23501a;

        public C10668a(ListingImagesViewHolder listingImagesViewHolder) {
            this.f23501a = listingImagesViewHolder;
        }

        /* renamed from: a */
        public final void mo34360a(int i) {
            this.f23501a.f23489b.mo38043a(new C13597g.C13663j1(i));
        }

        /* renamed from: b */
        public final void mo34361b(int i) {
            this.f23501a.f23489b.mo38043a(new C13597g.C13633f("listing_image_pinch_to_open"));
            ListingImagesViewHolder listingImagesViewHolder = this.f23501a;
            listingImagesViewHolder.f23489b.mo38043a(new C13597g.C13684m1(i, listingImagesViewHolder.f23498k.mo38319B()));
        }

        /* renamed from: c */
        public final void mo34362c(Boolean bool) {
            this.f23501a.f23489b.mo38043a(new C13597g.C13723r5(bool != null ? bool.booleanValue() : false));
            NavigationExtensionsKt.m17420a(this.f23501a.f23492e, 100);
            DynamicHeightViewPager dynamicHeightViewPager = this.f23501a.f23492e;
            C19383o.m32797g(dynamicHeightViewPager, "<this>");
            String string = dynamicHeightViewPager.getContext().getString(R.string.listing_video_playing_desc);
            C19383o.m32796f(string, "context.getString(text)");
            ViewsExtensionsKt.m17422a(dynamicHeightViewPager, string, 500);
        }

        /* renamed from: d */
        public final void mo34363d() {
            this.f23501a.f23489b.mo38043a(new C13597g.C13633f("listing_image_zoom_on_listing_screen"));
        }

        /* renamed from: e */
        public final void mo34364e(int i) {
            ListingImagesViewHolder listingImagesViewHolder = this.f23501a;
            listingImagesViewHolder.f23489b.mo38043a(new C13597g.C13684m1(i, listingImagesViewHolder.f23498k.mo38319B()));
        }
    }

    /* renamed from: com.etsy.android.ui.listing.viewholders.ListingImagesViewHolder$b */
    public static final class C10669b implements C11847p.C11848a {

        /* renamed from: a */
        public final /* synthetic */ ListingImagesViewHolder f23502a;

        public C10669b(ListingImagesViewHolder listingImagesViewHolder) {
            this.f23502a = listingImagesViewHolder;
        }

        /* renamed from: a */
        public final void mo34365a(int i) {
            int F = this.f23502a.f23498k.mo38327F();
            if (F > 0) {
                i %= F;
            }
            if (i >= 0) {
                ListingImagesViewHolder listingImagesViewHolder = this.f23502a;
                listingImagesViewHolder.f23500m = i;
                listingImagesViewHolder.f23489b.mo38043a(new C13597g.C13677l1(i));
            }
        }
    }

    /* renamed from: com.etsy.android.ui.listing.viewholders.ListingImagesViewHolder$c */
    public static final class C10670c extends ViewPager.C3337l {

        /* renamed from: b */
        public final /* synthetic */ ListingImagesViewHolder f23503b;

        public C10670c(ListingImagesViewHolder listingImagesViewHolder) {
            this.f23503b = listingImagesViewHolder;
        }

        public final void onPageScrollStateChanged(int i) {
            this.f23503b.f23489b.mo38043a(new C13597g.C13670k1(i));
        }

        public final void onPageSelected(int i) {
            int F = this.f23503b.f23498k.mo38327F();
            if (F > 0) {
                i %= F;
            }
            if (i >= 0) {
                this.f23503b.f23498k.mo38328G(i);
            }
            if (!this.f23503b.f23498k.mo38329H(i)) {
                NavigationExtensionsKt.m17420a(this.f23503b.f23492e, 100);
            }
        }
    }

    /* renamed from: com.etsy.android.ui.listing.viewholders.ListingImagesViewHolder$d */
    public static final class C10671d implements C13389a {

        /* renamed from: a */
        public final /* synthetic */ ListingImagesViewHolder f23504a;

        public C10671d(ListingImagesViewHolder listingImagesViewHolder) {
            this.f23504a = listingImagesViewHolder;
        }

        public final int getCount() {
            return this.f23504a.f23498k.mo38327F();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ListingImagesViewHolder(android.view.ViewGroup r18, com.etsy.android.p327ui.listing.viewholders.C10672a r19, p466vc.C13573c r20, boolean r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            java.lang.String r5 = "parent"
            kotlin.jvm.internal.C19383o.m32797g(r1, r5)
            java.lang.String r5 = "dependencies"
            kotlin.jvm.internal.C19383o.m32797g(r2, r5)
            java.lang.String r5 = "listingEventDispatcher"
            kotlin.jvm.internal.C19383o.m32797g(r3, r5)
            r5 = 2131624345(0x7f0e0199, float:1.8875867E38)
            r6 = 0
            android.view.View r1 = androidx.activity.C0114h.m305j0(r1, r5, r6)
            r0.<init>(r1)
            r0.f23489b = r3
            r0.f23490c = r4
            android.view.View r1 = r0.itemView
            android.content.Context r1 = r1.getContext()
            java.lang.String r3 = "itemView.context"
            kotlin.jvm.internal.C19383o.m32796f(r1, r3)
            r3 = 2130968889(0x7f040139, float:1.7546444E38)
            int r1 = p435rb.C13350a.m21013d(r1, r3)
            android.view.View r3 = r0.itemView
            r5 = 2131430630(0x7f0b0ce6, float:1.8482966E38)
            android.view.View r3 = r3.findViewById(r5)
            r5 = r3
            com.etsy.android.uikit.view.DynamicHeightViewPager r5 = (com.etsy.android.uikit.view.DynamicHeightViewPager) r5
            r5.setBackgroundColor(r1)
            java.lang.String r5 = "itemView.findViewById<Dy…ackgroundColor)\n        }"
            kotlin.jvm.internal.C19383o.m32796f(r3, r5)
            com.etsy.android.uikit.view.DynamicHeightViewPager r3 = (com.etsy.android.uikit.view.DynamicHeightViewPager) r3
            r0.f23492e = r3
            android.view.View r5 = r0.itemView
            r6 = 2131430627(0x7f0b0ce3, float:1.848296E38)
            android.view.View r5 = r5.findViewById(r6)
            r0.f23493f = r5
            android.view.View r5 = r0.itemView
            r6 = 2131428926(0x7f0b063e, float:1.847951E38)
            android.view.View r5 = r5.findViewById(r6)
            com.etsy.android.stylekit.views.pageindicator.LoopingCirclePageIndicator r5 = (com.etsy.android.stylekit.views.pageindicator.LoopingCirclePageIndicator) r5
            android.view.View r6 = r0.itemView
            r7 = 2131428927(0x7f0b063f, float:1.8479512E38)
            android.view.View r6 = r6.findViewById(r7)
            r0.f23494g = r6
            android.view.View r7 = r0.itemView
            r8 = 2131428843(0x7f0b05eb, float:1.8479342E38)
            android.view.View r7 = r7.findViewById(r8)
            com.etsy.android.ui.view.HorizontalBarPageIndicator r7 = (com.etsy.android.p327ui.view.HorizontalBarPageIndicator) r7
            r0.f23495h = r7
            android.view.View r8 = r0.itemView
            r9 = 2131428709(0x7f0b0565, float:1.847907E38)
            android.view.View r8 = r8.findViewById(r9)
            r0.f23496i = r8
            com.etsy.android.ui.listing.viewholders.ListingImagesViewHolder$d r8 = new com.etsy.android.ui.listing.viewholders.ListingImagesViewHolder$d
            r8.<init>(r0)
            com.etsy.android.ui.listing.viewholders.ListingImagesViewHolder$b r15 = new com.etsy.android.ui.listing.viewholders.ListingImagesViewHolder$b
            r15.<init>(r0)
            r0.f23497j = r15
            com.etsy.android.ui.listing.viewholders.ListingImagesViewHolder$a r14 = new com.etsy.android.ui.listing.viewholders.ListingImagesViewHolder$a
            r14.<init>(r0)
            com.etsy.android.uikit.adapter.p r13 = new com.etsy.android.uikit.adapter.p
            com.etsy.android.ui.BOEActivity r10 = r2.f23505a
            android.widget.ImageView$ScaleType r11 = android.widget.ImageView.ScaleType.FIT_CENTER
            ya.a r12 = r2.f23506b
            com.etsy.android.lib.config.c r9 = r2.f23507c
            r18 = r9
            com.etsy.android.ui.listing.h r9 = r2.f23508d
            com.etsy.android.lib.config.e r9 = r9.f22335a
            r20 = r14
            com.etsy.android.lib.config.EtsyConfigKey r14 = com.etsy.android.lib.config.C8592b.C8601i.f18887a
            boolean r14 = r9.mo21132b(r14)
            r16 = r18
            r9 = r13
            r18 = r6
            r6 = r13
            r13 = r16
            r4 = r20
            r9.<init>(r10, r11, r12, r13, r14, r15)
            com.etsy.android.ui.listing.h r2 = r2.f23508d
            r2.getClass()
            kotlin.c r2 = com.etsy.android.uikit.image.glide.ProgressiveJpegEligibility.f26353b
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r6.f26335r = r2
            r2 = 0
            r6.f26325h = r2
            r6.f26332o = r1
            r6.f26323f = r4
            r6.f26333p = r4
            r0.f23498k = r6
            com.etsy.android.ui.listing.viewholders.ListingImagesViewHolder$c r1 = new com.etsy.android.ui.listing.viewholders.ListingImagesViewHolder$c
            r1.<init>(r0)
            r0.f23499l = r1
            r2 = -1
            r0.f23500m = r2
            r3.addOnPageChangeListener(r1)
            r5.setPagerCallback(r8)
            r7.setPagerCallback(r8)
            if (r21 == 0) goto L_0x00fe
            r3.addOnPageChangeListener(r7)
            com.etsy.android.extensions.ViewExtensions.m12869m(r7)
            com.etsy.android.extensions.ViewExtensions.m12860d(r18)
            goto L_0x0107
        L_0x00fe:
            r3.addOnPageChangeListener(r5)
            com.etsy.android.extensions.ViewExtensions.m12869m(r18)
            com.etsy.android.extensions.ViewExtensions.m12860d(r7)
        L_0x0107:
            com.etsy.android.ui.listing.viewholders.ListingImagesViewHolder$1 r1 = new com.etsy.android.ui.listing.viewholders.ListingImagesViewHolder$1
            r1.<init>(r0)
            r3.addOnAttachStateChangeListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.listing.viewholders.ListingImagesViewHolder.<init>(android.view.ViewGroup, com.etsy.android.ui.listing.viewholders.a, vc.c, boolean):void");
    }

    /* renamed from: b */
    public final void mo33629b() {
        this.f23492e.setAdapter((C7717a) null);
        this.f23498k.mo38322E((ArrayList) null);
        this.f23500m = -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x015f, code lost:
        if ((r3 == 1.25f) != false) goto L_0x0161;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33569e(com.etsy.android.p327ui.listing.p329ui.C10423j r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof p437rd.C13354a
            if (r0 == 0) goto L_0x01ce
            vc.c r0 = r8.f23489b
            vc.g$t1 r1 = new vc.g$t1
            com.etsy.android.uikit.view.DynamicHeightViewPager r2 = r8.f23492e
            r1.<init>(r2)
            r0.mo38043a(r1)
            com.etsy.android.uikit.adapter.d r0 = r8.f23491d
            r1 = 1
            if (r0 != 0) goto L_0x0043
            r0 = r9
            rd.a r0 = (p437rd.C13354a) r0
            java.util.List<com.etsy.android.lib.models.apiv3.listing.ListingImage> r2 = r0.f29277a
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r1
            if (r2 == 0) goto L_0x003c
            com.etsy.android.uikit.adapter.d r2 = new com.etsy.android.uikit.adapter.d
            java.util.List<com.etsy.android.lib.models.apiv3.listing.ListingImage> r0 = r0.f29277a
            java.lang.Object r0 = kotlin.collections.C19327t.m32638T0(r0)
            com.etsy.android.lib.models.apiv3.listing.ListingImage r0 = (com.etsy.android.lib.models.apiv3.listing.ListingImage) r0
            android.view.View r3 = r8.itemView
            android.content.Context r3 = r3.getContext()
            java.lang.String r4 = "itemView.context"
            kotlin.jvm.internal.C19383o.m32796f(r3, r4)
            r2.<init>(r0, r3)
            r8.f23491d = r2
            goto L_0x0043
        L_0x003c:
            com.etsy.android.uikit.view.DynamicHeightViewPager r0 = r8.f23492e
            r2 = 4604930618986332160(0x3fe8000000000000, double:0.75)
            r0.setHeightRatio(r2)
        L_0x0043:
            r0 = r9
            rd.a r0 = (p437rd.C13354a) r0
            boolean r2 = r0.mo46039c()
            java.lang.String r3 = "null cannot be cast to non-null type android.view.ViewGroup"
            r4 = 0
            if (r2 == 0) goto L_0x007e
            n2.d r2 = new n2.d
            r2.<init>()
            android.view.View r5 = r8.f23493f
            java.util.ArrayList<android.view.View> r6 = r2.f16565g
            r6.add(r5)
            android.view.View r5 = r8.f23493f
            android.view.ViewParent r5 = r5.getParent()
            kotlin.jvm.internal.C19383o.m32795e(r5, r3)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            p186n2.C7426q.m14342a(r5, r2)
            android.view.View r2 = r8.f23493f
            com.etsy.android.extensions.ViewExtensions.m12869m(r2)
            android.view.View r2 = r8.f23493f
            java.lang.String r3 = "viewVisuallySimilarButton"
            kotlin.jvm.internal.C19383o.m32796f(r2, r3)
            com.etsy.android.ui.listing.viewholders.ListingImagesViewHolder$bind$2 r3 = new com.etsy.android.ui.listing.viewholders.ListingImagesViewHolder$bind$2
            r3.<init>(r8, r9)
            com.etsy.android.extensions.ViewExtensions.m12866j(r2, r3)
            goto L_0x00a2
        L_0x007e:
            n2.d r9 = new n2.d
            r9.<init>()
            android.view.View r2 = r8.f23493f
            java.util.ArrayList<android.view.View> r5 = r9.f16565g
            r5.add(r2)
            android.view.View r2 = r8.f23493f
            android.view.ViewParent r2 = r2.getParent()
            kotlin.jvm.internal.C19383o.m32795e(r2, r3)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            p186n2.C7426q.m14342a(r2, r9)
            android.view.View r9 = r8.f23493f
            com.etsy.android.extensions.ViewExtensions.m12860d(r9)
            android.view.View r9 = r8.f23493f
            r9.setOnClickListener(r4)
        L_0x00a2:
            boolean r9 = r0.f29282f
            if (r9 == 0) goto L_0x00ac
            android.view.View r9 = r8.f23496i
            com.etsy.android.extensions.ViewExtensions.m12869m(r9)
            goto L_0x00b1
        L_0x00ac:
            android.view.View r9 = r8.f23496i
            com.etsy.android.extensions.ViewExtensions.m12860d(r9)
        L_0x00b1:
            int r9 = r8.f23500m
            int r2 = r0.f29279c
            if (r9 != r2) goto L_0x00eb
            com.etsy.android.uikit.adapter.p r9 = r8.f23498k
            boolean r9 = r9.mo38329H(r2)
            if (r9 == 0) goto L_0x00ea
            com.etsy.android.uikit.adapter.p r9 = r8.f23498k
            com.etsy.android.uikit.adapter.ListingVideoPosition r9 = r9.mo38319B()
            if (r9 == 0) goto L_0x00d0
            long r1 = r9.getCurrentPosition()
            java.lang.Long r9 = java.lang.Long.valueOf(r1)
            goto L_0x00d1
        L_0x00d0:
            r9 = r4
        L_0x00d1:
            com.etsy.android.uikit.adapter.ListingVideoPosition r1 = r0.f29280d
            if (r1 == 0) goto L_0x00dd
            long r1 = r1.getCurrentPosition()
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
        L_0x00dd:
            boolean r9 = kotlin.jvm.internal.C19383o.m32792b(r9, r4)
            if (r9 != 0) goto L_0x00ea
            int r9 = r0.f29279c
            com.etsy.android.uikit.adapter.ListingVideoPosition r0 = r0.f29280d
            r8.mo34357f(r9, r0)
        L_0x00ea:
            return
        L_0x00eb:
            com.etsy.android.uikit.adapter.p r9 = r8.f23498k
            int r9 = r9.mo38327F()
            java.util.List<com.etsy.android.lib.models.apiv3.listing.ListingImage> r2 = r0.f29277a
            int r2 = r2.size()
            if (r9 == r2) goto L_0x0104
            com.etsy.android.uikit.adapter.p r9 = r8.f23498k
            java.util.List<com.etsy.android.lib.models.apiv3.listing.ListingImage> r2 = r0.f29277a
            java.util.ArrayList r2 = kotlin.collections.C19327t.m32661q1(r2)
            r9.mo38322E(r2)
        L_0x0104:
            com.etsy.android.uikit.view.DynamicHeightViewPager r9 = r8.f23492e
            q2.a r9 = r9.getAdapter()
            com.etsy.android.uikit.adapter.p r2 = r8.f23498k
            boolean r9 = kotlin.jvm.internal.C19383o.m32792b(r9, r2)
            if (r9 != 0) goto L_0x0119
            com.etsy.android.uikit.view.DynamicHeightViewPager r9 = r8.f23492e
            com.etsy.android.uikit.adapter.p r2 = r8.f23498k
            r9.setAdapter(r2)
        L_0x0119:
            com.etsy.android.uikit.view.DynamicHeightViewPager r9 = r8.f23492e
            com.etsy.android.uikit.adapter.d r2 = r8.f23491d
            if (r2 == 0) goto L_0x01c8
            float r3 = r2.mo38309a()
            int r4 = r2.f26311c
            float r4 = (float) r4
            float r4 = r4 / r3
            int r5 = r2.f26312d
            float r5 = (float) r5
            r6 = 1059481190(0x3f266666, float:0.65)
            float r6 = r6 * r5
            r7 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r7
            int r7 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x0136
            r4 = r5
        L_0x0136:
            int r5 = r2.f26309a
            float r5 = (float) r5
            int r2 = r2.f26310b
            float r2 = (float) r2
            float r5 = r5 / r2
            r2 = 1058642330(0x3f19999a, float:0.6)
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r7 = 0
            if (r2 > 0) goto L_0x0147
            r2 = r1
            goto L_0x0148
        L_0x0147:
            r2 = r7
        L_0x0148:
            if (r2 != 0) goto L_0x0161
            r2 = 1068708659(0x3fb33333, float:1.4)
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0153
            r2 = r1
            goto L_0x0154
        L_0x0153:
            r2 = r7
        L_0x0154:
            if (r2 != 0) goto L_0x0161
            r2 = 1067450368(0x3fa00000, float:1.25)
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x015e
            r2 = r1
            goto L_0x015f
        L_0x015e:
            r2 = r7
        L_0x015f:
            if (r2 == 0) goto L_0x0168
        L_0x0161:
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x0166
            goto L_0x0167
        L_0x0166:
            r6 = r4
        L_0x0167:
            r4 = r6
        L_0x0168:
            int r2 = (int) r4
            r9.setHeight(r2)
            int r9 = r0.f29279c
            com.etsy.android.uikit.adapter.ListingVideoPosition r2 = r0.f29280d
            r8.f23500m = r9
            com.etsy.android.uikit.adapter.p r3 = r8.f23498k
            int r3 = r3.mo38327F()
            if (r3 <= 0) goto L_0x019c
            int r9 = r9 % r3
            int r3 = r3 * 10
            int r3 = r3 + r9
            com.etsy.android.uikit.view.DynamicHeightViewPager r4 = r8.f23492e
            int r4 = r4.getCurrentItem()
            if (r4 == r3) goto L_0x019c
            com.etsy.android.uikit.view.DynamicHeightViewPager r4 = r8.f23492e
            com.etsy.android.ui.listing.viewholders.ListingImagesViewHolder$c r5 = r8.f23499l
            r4.removeOnPageChangeListener(r5)
            com.etsy.android.uikit.view.DynamicHeightViewPager r4 = r8.f23492e
            r4.setCurrentItem(r3)
            r8.mo34357f(r9, r2)
            com.etsy.android.uikit.view.DynamicHeightViewPager r9 = r8.f23492e
            com.etsy.android.ui.listing.viewholders.ListingImagesViewHolder$c r2 = r8.f23499l
            r9.addOnPageChangeListener(r2)
        L_0x019c:
            java.util.List<com.etsy.android.lib.models.apiv3.listing.ListingImage> r9 = r0.f29277a
            int r9 = r9.size()
            if (r9 <= r1) goto L_0x01a5
            goto L_0x01a6
        L_0x01a5:
            r1 = r7
        L_0x01a6:
            if (r1 == 0) goto L_0x01b8
            boolean r9 = r8.f23490c
            if (r9 == 0) goto L_0x01b2
            com.etsy.android.ui.view.HorizontalBarPageIndicator r9 = r8.f23495h
            com.etsy.android.extensions.ViewExtensions.m12869m(r9)
            goto L_0x01c7
        L_0x01b2:
            android.view.View r9 = r8.f23494g
            com.etsy.android.extensions.ViewExtensions.m12869m(r9)
            goto L_0x01c7
        L_0x01b8:
            boolean r9 = r8.f23490c
            if (r9 == 0) goto L_0x01c2
            com.etsy.android.ui.view.HorizontalBarPageIndicator r9 = r8.f23495h
            com.etsy.android.extensions.ViewExtensions.m12860d(r9)
            goto L_0x01c7
        L_0x01c2:
            android.view.View r9 = r8.f23494g
            com.etsy.android.extensions.ViewExtensions.m12860d(r9)
        L_0x01c7:
            return
        L_0x01c8:
            java.lang.String r9 = "imageSizeUtil"
            kotlin.jvm.internal.C19383o.m32805o(r9)
            throw r4
        L_0x01ce:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.listing.viewholders.ListingImagesViewHolder.mo33569e(com.etsy.android.ui.listing.ui.j):void");
    }

    /* renamed from: f */
    public final void mo34357f(int i, ListingVideoPosition listingVideoPosition) {
        C11847p pVar = this.f23498k;
        pVar.f26342s = null;
        C11850r<ListingImage> rVar = pVar.f26334q;
        if (listingVideoPosition != null) {
            rVar.f26349e.put(listingVideoPosition.getUri(), Long.valueOf(listingVideoPosition.getCurrentPosition()));
        } else {
            rVar.getClass();
        }
        this.f23498k.mo38328G(i);
        this.f23498k.f26342s = this.f23497j;
    }
}

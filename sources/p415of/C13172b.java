package p415of;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.C8703p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p193o.C7507j;
import p423pf.C13230a;
import p423pf.C13234e;
import p423pf.C13235f;

/* renamed from: of.b */
public class C13172b {

    /* renamed from: a */
    public C7507j<C13171a> f28982a = new C7507j<>();

    /* renamed from: b */
    public C8703p f28983b;

    /* renamed from: c */
    public final ArrayList<C13172b> f28984c = new ArrayList<>();

    /* renamed from: d */
    public C13182k f28985d;

    /* renamed from: e */
    public WeakReference<Fragment> f28986e;

    /* renamed from: f */
    public C13180i f28987f;

    /* renamed from: g */
    public RecyclerView.C3109t f28988g;

    /* renamed from: h */
    public RecyclerView.C3109t f28989h;

    /* renamed from: i */
    public final int f28990i;

    public C13172b(C13179h hVar) {
        this.f28986e = new WeakReference<>(hVar.f29013a);
        this.f28987f = hVar.f29015c;
        this.f28985d = hVar.f29016d;
        this.f28983b = hVar.f29014b;
        this.f28988g = new RecyclerView.C3109t();
        this.f28990i = hVar.f29013a.getResources().getInteger(R.integer.vespa_grid_layout_max_span);
        mo32273h();
    }

    /* renamed from: a */
    public final void mo45890a(C13172b bVar) {
        bVar.f28988g = this.f28988g;
        this.f28984c.add(bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = ((androidx.recyclerview.widget.RecyclerView) r10).getLayoutManager();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.etsy.android.vespa.viewholders.C12086e mo31854b(android.view.ViewGroup r10, int r11) {
        /*
            r9 = this;
            androidx.fragment.app.Fragment r1 = r9.mo45892d()
            boolean r0 = r10 instanceof androidx.recyclerview.widget.RecyclerView
            r2 = 0
            if (r0 == 0) goto L_0x0017
            r0 = r10
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            androidx.recyclerview.widget.RecyclerView$o r0 = r0.getLayoutManager()
            if (r0 == 0) goto L_0x0017
            boolean r0 = r0.mo11297f()
            goto L_0x0018
        L_0x0017:
            r0 = r2
        L_0x0018:
            java.util.ArrayList<of.b> r3 = r9.f28984c
            int r3 = r3.size()
        L_0x001e:
            if (r2 >= r3) goto L_0x0032
            java.util.ArrayList<of.b> r4 = r9.f28984c
            java.lang.Object r4 = r4.get(r2)
            of.b r4 = (p415of.C13172b) r4
            com.etsy.android.vespa.viewholders.e r4 = r4.mo31854b(r10, r11)
            if (r4 == 0) goto L_0x002f
            return r4
        L_0x002f:
            int r2 = r2 + 1
            goto L_0x001e
        L_0x0032:
            r2 = 2131430549(0x7f0b0c95, float:1.8482802E38)
            if (r11 != r2) goto L_0x003e
            com.etsy.android.vespa.viewholders.u r11 = new com.etsy.android.vespa.viewholders.u
            r11.<init>(r10)
            goto L_0x00eb
        L_0x003e:
            r2 = 2131430429(0x7f0b0c1d, float:1.8482559E38)
            if (r11 != r2) goto L_0x004a
            com.etsy.android.vespa.viewholders.t r11 = new com.etsy.android.vespa.viewholders.t
            r11.<init>(r10)
            goto L_0x00eb
        L_0x004a:
            r2 = 2131430487(0x7f0b0c57, float:1.8482676E38)
            r3 = 0
            if (r11 != r2) goto L_0x0060
            com.etsy.android.vespa.viewholders.z r0 = new com.etsy.android.vespa.viewholders.z
            o.j<of.a> r1 = r9.f28982a
            java.lang.Object r11 = r1.mo19993f(r11, r3)
            of.a r11 = (p415of.C13171a) r11
            r0.<init>(r10, r11)
        L_0x005d:
            r11 = r0
            goto L_0x00eb
        L_0x0060:
            r2 = 2131430486(0x7f0b0c56, float:1.8482674E38)
            if (r11 != r2) goto L_0x006c
            com.etsy.android.vespa.viewholders.x r11 = new com.etsy.android.vespa.viewholders.x
            r11.<init>(r10)
            goto L_0x00eb
        L_0x006c:
            r2 = 2131430464(0x7f0b0c40, float:1.848263E38)
            if (r11 != r2) goto L_0x007f
            com.etsy.android.vespa.viewholders.l r0 = new com.etsy.android.vespa.viewholders.l
            o.j<of.a> r1 = r9.f28982a
            java.lang.Object r11 = r1.mo19993f(r11, r3)
            pf.a r11 = (p423pf.C13230a) r11
            r0.<init>(r10, r11)
            goto L_0x005d
        L_0x007f:
            r2 = 2131430472(0x7f0b0c48, float:1.8482646E38)
            if (r11 != r2) goto L_0x0092
            com.etsy.android.vespa.viewholders.q r0 = new com.etsy.android.vespa.viewholders.q
            o.j<of.a> r1 = r9.f28982a
            java.lang.Object r11 = r1.mo19993f(r11, r3)
            pf.a r11 = (p423pf.C13230a) r11
            r0.<init>(r10, r11)
            goto L_0x005d
        L_0x0092:
            r2 = 2131430471(0x7f0b0c47, float:1.8482644E38)
            if (r11 != r2) goto L_0x009d
            com.etsy.android.vespa.viewholders.HTMLTextViewHolder r11 = new com.etsy.android.vespa.viewholders.HTMLTextViewHolder
            r11.<init>(r10)
            goto L_0x00eb
        L_0x009d:
            r2 = 2131430466(0x7f0b0c42, float:1.8482634E38)
            if (r11 != r2) goto L_0x00be
            if (r1 == 0) goto L_0x00be
            androidx.recyclerview.widget.RecyclerView$t r11 = r9.f28989h
            if (r11 != 0) goto L_0x00af
            androidx.recyclerview.widget.RecyclerView$t r11 = new androidx.recyclerview.widget.RecyclerView$t
            r11.<init>()
            r9.f28989h = r11
        L_0x00af:
            com.etsy.android.vespa.viewholders.o r11 = new com.etsy.android.vespa.viewholders.o
            com.etsy.android.lib.logger.p r3 = r9.f28983b
            r4 = 1
            r6 = 0
            r7 = 0
            r8 = 1
            r0 = r11
            r2 = r10
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x00eb
        L_0x00be:
            r1 = 2131430552(0x7f0b0c98, float:1.8482808E38)
            if (r11 != r1) goto L_0x00d2
            com.etsy.android.vespa.viewholders.w r1 = new com.etsy.android.vespa.viewholders.w
            o.j<of.a> r2 = r9.f28982a
            java.lang.Object r11 = r2.mo19993f(r11, r3)
            of.a r11 = (p415of.C13171a) r11
            r1.<init>(r10, r11, r0)
            r11 = r1
            goto L_0x00eb
        L_0x00d2:
            r0 = 2131430534(0x7f0b0c86, float:1.8482772E38)
            if (r11 != r0) goto L_0x00e6
            com.etsy.android.uikit.viewholder.x r0 = new com.etsy.android.uikit.viewholder.x
            o.j<of.a> r1 = r9.f28982a
            java.lang.Object r11 = r1.mo19993f(r11, r3)
            of.a r11 = (p415of.C13171a) r11
            r0.<init>(r10, r11)
            goto L_0x005d
        L_0x00e6:
            com.etsy.android.vespa.viewholders.a0 r11 = new com.etsy.android.vespa.viewholders.a0
            r11.<init>(r10)
        L_0x00eb:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p415of.C13172b.mo31854b(android.view.ViewGroup, int):com.etsy.android.vespa.viewholders.e");
    }

    /* renamed from: c */
    public final C13171a mo45891c(int i) {
        return (C13171a) this.f28982a.mo19993f(i, (Integer) null);
    }

    /* renamed from: d */
    public final Fragment mo45892d() {
        return this.f28986e.get();
    }

    /* renamed from: e */
    public int mo45893e(int i) {
        int size = this.f28984c.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 = this.f28984c.get(i3).mo45893e(i);
            if (i2 != 0) {
                break;
            }
        }
        if (i2 == 0) {
            C8694h.f19097a.mo21306a("Horizontal section height was zero. Did you override the getHorizontalSectionHeightForViewType method in your ViewHolderFactory?");
        }
        return i2;
    }

    /* renamed from: f */
    public int mo36216f(C13186o oVar) {
        int viewType = oVar.getViewType();
        int size = this.f28984c.size();
        for (int i = 0; i < size; i++) {
            int f = this.f28984c.get(i).mo36216f(oVar);
            if (viewType != f) {
                return f;
            }
        }
        return viewType;
    }

    /* renamed from: g */
    public int mo33127g(int i, int i2) {
        int i3 = this.f28990i;
        int size = this.f28984c.size();
        for (int i4 = 0; i4 < size; i4++) {
            int g = this.f28984c.get(i4).mo33127g(i, i2);
            if (g < i3) {
                return g;
            }
        }
        return i3;
    }

    /* renamed from: h */
    public void mo32273h() {
        this.f28982a.mo19994h(R.id.view_type_message_card, new C13235f(mo45892d(), this.f28983b));
        if (this.f28985d != null) {
            C13230a aVar = new C13230a(mo45892d(), this.f28983b, this.f28987f, this.f28985d);
            this.f28982a.mo19994h(R.id.view_type_hero_banner, aVar);
            this.f28982a.mo19994h(R.id.view_type_icon_banner, aVar);
            this.f28982a.mo19994h(R.id.view_type_full_bleed_banner, aVar);
            this.f28982a.mo19994h(R.id.view_type_section_link_footer, new C13234e(mo45892d(), this.f28983b));
            this.f28982a.mo19994h(R.id.view_type_search_banner, aVar);
        }
    }

    /* renamed from: i */
    public final void mo45894i(int i, C13171a aVar) {
        this.f28982a.mo19994h(i, aVar);
        int size = this.f28984c.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f28984c.get(i2).mo45894i(i, aVar);
        }
    }
}

package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.tabs.d */
public final class C15459d {

    /* renamed from: a */
    public final TabLayout f34718a;

    /* renamed from: b */
    public final ViewPager2 f34719b;

    /* renamed from: c */
    public RecyclerView.Adapter<?> f34720c;

    /* renamed from: d */
    public boolean f34721d;

    /* renamed from: com.google.android.material.tabs.d$a */
    public class C15460a extends RecyclerView.C3091i {
        public C15460a() {
        }

        /* renamed from: a */
        public final void mo11115a() {
            C15459d.this.mo54888a();
        }

        /* renamed from: b */
        public final void mo11116b() {
            C15459d.this.mo54888a();
        }

        /* renamed from: c */
        public final void mo11117c(int i, int i2, Object obj) {
            C15459d.this.mo54888a();
        }

        /* renamed from: d */
        public final void mo11118d(int i, int i2) {
            C15459d.this.mo54888a();
        }

        /* renamed from: e */
        public final void mo11119e(int i, int i2) {
            C15459d.this.mo54888a();
        }

        /* renamed from: f */
        public final void mo11120f(int i, int i2) {
            C15459d.this.mo54888a();
        }
    }

    /* renamed from: com.google.android.material.tabs.d$b */
    public interface C15461b {
        /* renamed from: a */
        void mo54889a();
    }

    /* renamed from: com.google.android.material.tabs.d$c */
    public static class C15462c extends ViewPager2.C3349i {

        /* renamed from: a */
        public final WeakReference<TabLayout> f34723a;

        /* renamed from: b */
        public int f34724b = 0;

        /* renamed from: c */
        public int f34725c = 0;

        public C15462c(TabLayout tabLayout) {
            this.f34723a = new WeakReference<>(tabLayout);
        }

        /* renamed from: a */
        public final void mo12762a(int i) {
            this.f34724b = this.f34725c;
            this.f34725c = i;
        }

        /* renamed from: b */
        public final void mo12781b(int i, float f, int i2) {
            TabLayout tabLayout = this.f34723a.get();
            if (tabLayout != null) {
                int i3 = this.f34725c;
                boolean z = false;
                boolean z2 = i3 != 2 || this.f34724b == 1;
                if (!(i3 == 2 && this.f34724b == 0)) {
                    z = true;
                }
                tabLayout.setScrollPosition(i, f, z2, z);
            }
        }

        /* renamed from: c */
        public final void mo12763c(int i) {
            TabLayout tabLayout = this.f34723a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.f34725c;
                tabLayout.selectTab(tabLayout.getTabAt(i), i2 == 0 || (i2 == 2 && this.f34724b == 0));
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.d$d */
    public static class C15463d implements TabLayout.C15450d {

        /* renamed from: a */
        public final ViewPager2 f34726a;

        /* renamed from: b */
        public final boolean f34727b;

        public C15463d(ViewPager2 viewPager2, boolean z) {
            this.f34726a = viewPager2;
            this.f34727b = z;
        }

        /* renamed from: a */
        public final void mo36757a(TabLayout.C15453g gVar) {
            this.f34726a.setCurrentItem(gVar.f34703e, this.f34727b);
        }

        /* renamed from: b */
        public final void mo36758b() {
        }

        /* renamed from: c */
        public final void mo36759c(TabLayout.C15453g gVar) {
        }
    }

    public C15459d(TabLayout tabLayout, ViewPager2 viewPager2, C15461b bVar) {
        this.f34718a = tabLayout;
        this.f34719b = viewPager2;
    }

    /* renamed from: a */
    public final void mo54888a() {
        int min;
        this.f34718a.removeAllTabs();
        RecyclerView.Adapter<?> adapter = this.f34720c;
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            if (itemCount > 0) {
                this.f34718a.newTab();
                throw null;
            } else if (itemCount > 0 && (min = Math.min(this.f34719b.getCurrentItem(), this.f34718a.getTabCount() - 1)) != this.f34718a.getSelectedTabPosition()) {
                TabLayout tabLayout = this.f34718a;
                tabLayout.selectTab(tabLayout.getTabAt(min));
            }
        }
    }
}

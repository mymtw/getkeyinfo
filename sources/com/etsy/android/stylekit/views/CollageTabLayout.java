package com.etsy.android.stylekit.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.material.tabs.C15459d;
import com.google.android.material.tabs.TabLayout;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p260v0.C8184a;
import p388lb.C13006a;
import p435rb.C13350a;

public final class CollageTabLayout extends TabLayout {
    public static final int $stable = 8;
    private BadgeStyle badgeStyle;
    private boolean inflated;
    private int maxBadgeCount;

    public enum BadgeStyle {
        Notification,
        Status,
        Icon
    }

    public final class PagerAdapterObserver extends DataSetObserver {
        public PagerAdapterObserver() {
        }

        public void onChanged() {
            CollageTabLayout.this.updateTabCustomViews();
        }

        public void onInvalidated() {
            CollageTabLayout.this.updateTabCustomViews();
        }
    }

    /* renamed from: com.etsy.android.stylekit.views.CollageTabLayout$a */
    public /* synthetic */ class C9045a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19917a;

        static {
            int[] iArr = new int[BadgeStyle.values().length];
            iArr[BadgeStyle.Icon.ordinal()] = 1;
            iArr[BadgeStyle.Status.ordinal()] = 2;
            f19917a = iArr;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageTabLayout(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CollageTabLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public static /* synthetic */ TabLayout.C15453g addTab$default(CollageTabLayout collageTabLayout, String str, int i, int i2, Integer num, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = collageTabLayout.getTabCount();
        }
        if ((i3 & 8) != 0) {
            num = null;
        }
        return collageTabLayout.addTab(str, i, i2, num);
    }

    private final void addViewInternal(View view) {
        if (view instanceof CollageTabItem) {
            CollageTabItem collageTabItem = (CollageTabItem) view;
            addTab$default(this, collageTabItem.text.toString(), collageTabItem.getBadgeCount(), 0, collageTabItem.getBadgeIcon(), 4, (Object) null);
            return;
        }
        throw new IllegalArgumentException("Only CollageTabItem instances can be added to CollageTabLayout");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = (android.widget.TextView) r9.findViewById(com.etsy.android.R.id.clg_tab_text);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String getContentDescription(android.view.View r9, int r10) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x0013
            r1 = 2131427856(0x7f0b0210, float:1.847734E38)
            android.view.View r1 = r9.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x0013
            java.lang.CharSequence r1 = r1.getText()
            goto L_0x0014
        L_0x0013:
            r1 = r0
        L_0x0014:
            if (r9 == 0) goto L_0x0020
            r2 = 2131427854(0x7f0b020e, float:1.8477336E38)
            android.view.View r9 = r9.findViewById(r2)
            android.widget.TextView r9 = (android.widget.TextView) r9
            goto L_0x0021
        L_0x0020:
            r9 = r0
        L_0x0021:
            if (r9 == 0) goto L_0x0027
            java.lang.CharSequence r0 = r9.getText()
        L_0x0027:
            r9 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0034
            int r3 = r0.length()
            if (r3 != 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r3 = r9
            goto L_0x0035
        L_0x0034:
            r3 = r2
        L_0x0035:
            r4 = 2
            r5 = 3
            r6 = 2130969007(0x7f0401af, float:1.7546684E38)
            java.lang.String r7 = "context"
            if (r3 == 0) goto L_0x0063
            android.content.Context r0 = r8.getContext()
            kotlin.jvm.internal.C19383o.m32796f(r0, r7)
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r3[r9] = r1
            int r10 = r10 + r2
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r3[r2] = r9
            int r9 = r8.getTabCount()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r3[r4] = r9
            java.lang.String r9 = p435rb.C13350a.m21016g(r0, r6, r3)
            goto L_0x0097
        L_0x0063:
            android.content.Context r3 = r8.getContext()
            kotlin.jvm.internal.C19383o.m32796f(r3, r7)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            java.lang.String r1 = ": "
            r7.append(r1)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            r5[r9] = r0
            int r10 = r10 + r2
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r5[r2] = r9
            int r9 = r8.getTabCount()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r5[r4] = r9
            java.lang.String r9 = p435rb.C13350a.m21016g(r3, r6, r5)
        L_0x0097:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.stylekit.views.CollageTabLayout.getContentDescription(android.view.View, int):java.lang.String");
    }

    private final void setTabIcon(View view, Integer num) {
        ImageView imageView;
        if (view != null && (imageView = (ImageView) view.findViewById(R.id.clg_tab_icon)) != null) {
            if (num != null) {
                imageView.setVisibility(0);
                Context context = imageView.getContext();
                int intValue = num.intValue();
                Object obj = C8184a.f17966a;
                imageView.setImageDrawable(C8184a.C8187c.m16466b(context, intValue));
                return;
            }
            imageView.setVisibility(8);
        }
    }

    private final void updateAllTabsContentDescriptions() {
        int tabCount = getTabCount();
        if (tabCount >= 0) {
            int i = 0;
            while (true) {
                TabLayout.C15453g tabAt = getTabAt(i);
                if (tabAt != null) {
                    tabAt.mo54883b(getContentDescription(tabAt.f34704f, i));
                }
                if (i != tabCount) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final void updateTabCustomViews() {
        View view;
        int tabCount = getTabCount();
        for (int i = 0; i < tabCount; i++) {
            TabLayout.C15453g tabAt = getTabAt(i);
            if (!(tabAt == null || (view = tabAt.f34704f) == null)) {
                tabAt.f34707i.removeView(view);
            }
            if (tabAt != null) {
                int i2 = C9045a.f19917a[this.badgeStyle.ordinal()];
                tabAt.mo54882a(i2 != 1 ? i2 != 2 ? R.layout.clg_tab_with_badge : R.layout.clg_tab_with_badge_status : R.layout.clg_tab_with_icon);
            }
            CharSequence charSequence = null;
            View view2 = tabAt != null ? tabAt.f34704f : null;
            if (tabAt != null) {
                charSequence = tabAt.f34701c;
            }
            setTabText(view2, String.valueOf(charSequence));
        }
        updateAllTabsContentDescriptions();
    }

    public final TabLayout.C15453g addTab(String str, int i, int i2, Integer num) {
        C19383o.m32797g(str, "text");
        TabLayout.C15453g newTab = newTab();
        C19383o.m32796f(newTab, "newTab()");
        int i3 = C9045a.f19917a[this.badgeStyle.ordinal()];
        newTab.mo54882a(i3 != 1 ? i3 != 2 ? R.layout.clg_tab_with_badge : R.layout.clg_tab_with_badge_status : R.layout.clg_tab_with_icon);
        setTabText(newTab.f34704f, str);
        setTabBadgeCount(newTab.f34704f, i);
        setTabIcon(newTab.f34704f, num);
        addTab(newTab, i2);
        updateAllTabsContentDescriptions();
        return newTab;
    }

    public void addView(View view) {
        C19383o.m32797g(view, "child");
        if (this.inflated) {
            addViewInternal(view);
        } else {
            super.addView(view);
        }
    }

    public final void selectTab(int i) {
        selectTab(getTabAt(i));
    }

    public final void setBadgeStyle(BadgeStyle badgeStyle2) {
        C19383o.m32797g(badgeStyle2, "badgeStyle");
        this.badgeStyle = badgeStyle2;
    }

    public final void setTabBadgeCount(int i, int i2) {
        TabLayout.C15453g tabAt = getTabAt(i);
        View view = tabAt != null ? tabAt.f34704f : null;
        setTabBadgeCount(view, i2);
        TabLayout.C15453g tabAt2 = getTabAt(i);
        if (tabAt2 != null) {
            tabAt2.mo54883b(getContentDescription(view, i));
        }
    }

    public final void setTabBadgeIcon(int i, StateListDrawable stateListDrawable) {
        ImageView imageView;
        TabLayout.C15453g tabAt = getTabAt(i);
        View view = tabAt != null ? tabAt.f34704f : null;
        if (view != null && (imageView = (ImageView) view.findViewById(R.id.clg_tab_icon)) != null) {
            if (stateListDrawable != null) {
                imageView.setVisibility(0);
                imageView.setBackground(stateListDrawable);
                return;
            }
            imageView.setVisibility(8);
        }
    }

    public final void setTabText(int i, String str) {
        C19383o.m32797g(str, "text");
        TabLayout.C15453g tabAt = getTabAt(i);
        View view = tabAt != null ? tabAt.f34704f : null;
        setTabText(view, str);
        TabLayout.C15453g tabAt2 = getTabAt(i);
        if (tabAt2 != null) {
            tabAt2.mo54883b(getContentDescription(view, i));
        }
    }

    public void setupWithViewPager(ViewPager viewPager) {
        super.setupWithViewPager(viewPager);
        updateTabCustomViews();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollageTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this.maxBadgeCount = 99;
        BadgeStyle badgeStyle2 = BadgeStyle.Notification;
        this.badgeStyle = badgeStyle2;
        this.inflated = true;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13006a.f28655v, 0, 0);
            C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttr…e.CollageTabLayout, 0, 0)");
            int i2 = obtainStyledAttributes.getInt(2, 0);
            int i3 = obtainStyledAttributes.getInt(3, 1);
            int i4 = obtainStyledAttributes.getInt(1, 0);
            if (i4 != 1) {
                if (i4 == 2) {
                    badgeStyle2 = BadgeStyle.Status;
                } else if (i4 == 3) {
                    badgeStyle2 = BadgeStyle.Icon;
                }
            }
            this.badgeStyle = badgeStyle2;
            this.maxBadgeCount = obtainStyledAttributes.getInt(0, 99);
            setTabGravity(i2);
            setTabMode(i3);
            setSelectedTabIndicatorColor(C13350a.m21013d(context, R.attr.clg_color_text_primary));
            obtainStyledAttributes.recycle();
        }
    }

    public final void setupWithViewPager(ViewPager2 viewPager2, C15459d.C15461b bVar) {
        C19383o.m32797g(bVar, "tabConfigurationStrategy");
        if (viewPager2 != null && viewPager2.getAdapter() != null) {
            C15459d dVar = new C15459d(this, viewPager2, bVar);
            if (!dVar.f34721d) {
                RecyclerView.Adapter<?> adapter = viewPager2.getAdapter();
                dVar.f34720c = adapter;
                if (adapter != null) {
                    dVar.f34721d = true;
                    viewPager2.registerOnPageChangeCallback(new C15459d.C15462c(this));
                    addOnTabSelectedListener((TabLayout.C15450d) new C15459d.C15463d(viewPager2, true));
                    dVar.f34720c.registerAdapterDataObserver(new C15459d.C15460a());
                    dVar.mo54888a();
                    setScrollPosition(viewPager2.getCurrentItem(), 0.0f, true);
                    updateTabCustomViews();
                    return;
                }
                throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
            }
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
    }

    public void addView(View view, int i) {
        C19383o.m32797g(view, "child");
        if (this.inflated) {
            addViewInternal(view);
        } else {
            super.addView(view, i);
        }
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r5v5, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setTabBadgeCount(android.view.View r5, int r6) {
        /*
            r4 = this;
            r0 = 2131427854(0x7f0b020e, float:1.8477336E38)
            r1 = 0
            if (r6 <= 0) goto L_0x0033
            int r2 = r4.maxBadgeCount
            if (r6 <= r2) goto L_0x0018
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int r2 = r4.maxBadgeCount
            r3 = 43
            java.lang.String r6 = android.support.p013v4.media.C0073e.m208h(r6, r2, r3)
            goto L_0x001c
        L_0x0018:
            java.lang.String r6 = java.lang.String.valueOf(r6)
        L_0x001c:
            if (r5 == 0) goto L_0x0025
            android.view.View r5 = r5.findViewById(r0)
            r1 = r5
            android.widget.TextView r1 = (android.widget.TextView) r1
        L_0x0025:
            if (r1 != 0) goto L_0x0028
            goto L_0x002b
        L_0x0028:
            r1.setText(r6)
        L_0x002b:
            if (r1 != 0) goto L_0x002e
            goto L_0x004c
        L_0x002e:
            r5 = 0
            r1.setVisibility(r5)
            goto L_0x004c
        L_0x0033:
            if (r5 == 0) goto L_0x003c
            android.view.View r5 = r5.findViewById(r0)
            r1 = r5
            android.widget.TextView r1 = (android.widget.TextView) r1
        L_0x003c:
            if (r1 != 0) goto L_0x003f
            goto L_0x0044
        L_0x003f:
            java.lang.String r5 = ""
            r1.setText(r5)
        L_0x0044:
            if (r1 != 0) goto L_0x0047
            goto L_0x004c
        L_0x0047:
            r5 = 8
            r1.setVisibility(r5)
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.stylekit.views.CollageTabLayout.setTabBadgeCount(android.view.View, int):void");
    }

    private final void setTabText(View view, String str) {
        TextView textView = view != null ? (TextView) view.findViewById(R.id.clg_tab_text) : null;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        C19383o.m32797g(view, "child");
        C19383o.m32797g(layoutParams, ResponseConstants.PARAMS);
        if (this.inflated) {
            addViewInternal(view);
        } else {
            super.addView(view, layoutParams);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        C19383o.m32797g(view, "child");
        C19383o.m32797g(layoutParams, ResponseConstants.PARAMS);
        if (this.inflated) {
            addViewInternal(view);
        } else {
            super.addView(view, i, layoutParams);
        }
    }
}

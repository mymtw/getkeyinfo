package com.etsy.android.p327ui.shop;

import android.content.res.Resources;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.stylekit.views.CollageTabLayout;
import com.google.android.material.tabs.TabLayout;

/* renamed from: com.etsy.android.ui.shop.r0 */
public final class C11197r0 {

    /* renamed from: com.etsy.android.ui.shop.r0$a */
    public static class C11198a {

        /* renamed from: a */
        public int f24762a;

        /* renamed from: b */
        public int f24763b = -1;

        /* renamed from: c */
        public String f24764c;

        public C11198a(int i, String str) {
            this.f24762a = i;
            this.f24764c = str;
        }
    }

    /* renamed from: a */
    public static void m19139a(CollageTabLayout collageTabLayout, String str, int i) {
        String str2;
        Resources resources = collageTabLayout.getResources();
        int tabCount = collageTabLayout.getTabCount();
        char c = 65535;
        switch (str.hashCode()) {
            case -1225497630:
                if (str.equals("translations")) {
                    c = 0;
                    break;
                }
                break;
            case -234430262:
                if (str.equals("updates")) {
                    c = 1;
                    break;
                }
                break;
            case 3357525:
                if (str.equals("more")) {
                    c = 2;
                    break;
                }
                break;
            case 3529462:
                if (str.equals(ResponseConstants.SHOP)) {
                    c = 3;
                    break;
                }
                break;
            case 92611469:
                if (str.equals("about")) {
                    c = 4;
                    break;
                }
                break;
            case 100526016:
                if (str.equals(ResponseConstants.ITEMS)) {
                    c = 5;
                    break;
                }
                break;
            case 546894160:
                if (str.equals(ResponseConstants.POLICIES)) {
                    c = 6;
                    break;
                }
                break;
            case 1099953179:
                if (str.equals(ResponseConstants.REVIEWS)) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                str2 = resources.getString(R.string.shop_section_translations_heading);
                break;
            case 1:
                str2 = resources.getString(R.string.updates);
                break;
            case 2:
                str2 = resources.getString(R.string.shop_home_tab_title_more);
                break;
            case 3:
                str2 = resources.getString(R.string.shop);
                break;
            case 4:
                str2 = resources.getString(R.string.about);
                break;
            case 5:
                str2 = resources.getString(R.string.items_label);
                break;
            case 6:
                str2 = resources.getString(R.string.policies);
                break;
            case 7:
                str2 = resources.getString(R.string.reviews);
                break;
            default:
                str2 = "";
                break;
        }
        if (tabCount > 0) {
            ((C11198a) collageTabLayout.getTabAt(tabCount - 1).f34699a).f24763b = i - 1;
        }
        collageTabLayout.addTab(str2, 0, collageTabLayout.getTabCount(), (Integer) null).f34699a = new C11198a(i, str);
    }

    /* renamed from: b */
    public static void m19140b(CollageTabLayout collageTabLayout, TabLayout.C15453g gVar, int i) {
        Object obj = gVar != null ? gVar.f34699a : null;
        if (obj != null) {
            C11198a aVar = (C11198a) obj;
            int i2 = i - aVar.f24763b;
            aVar.f24763b = i;
            int tabCount = collageTabLayout.getTabCount();
            for (int i3 = gVar.f34703e + 1; i3 < tabCount; i3++) {
                TabLayout.C15453g tabAt = collageTabLayout.getTabAt(i3);
                Object obj2 = tabAt != null ? tabAt.f34699a : null;
                if (obj2 != null) {
                    C11198a aVar2 = (C11198a) obj2;
                    aVar2.f24762a += i2;
                    int i4 = aVar2.f24763b;
                    if (i4 >= 0) {
                        aVar2.f24763b = i4 + i2;
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public static TabLayout.C15453g m19141c(CollageTabLayout collageTabLayout, String str) {
        int tabCount = collageTabLayout.getTabCount();
        for (int i = 0; i < tabCount; i++) {
            TabLayout.C15453g tabAt = collageTabLayout.getTabAt(i);
            if (((C11198a) tabAt.f34699a).f24764c.equals(str)) {
                return tabAt;
            }
        }
        return null;
    }
}

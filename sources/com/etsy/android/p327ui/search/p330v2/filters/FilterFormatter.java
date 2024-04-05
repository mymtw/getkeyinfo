package com.etsy.android.p327ui.search.p330v2.filters;

import android.content.res.Resources;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.v2.filters.FilterFormatter */
public final class FilterFormatter {
    /* renamed from: a */
    public static String m18952a(ArrayList arrayList, Resources resources) {
        boolean z;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((C10978a) next).f24343b != FilterType.FILTER_CATEGORY) {
                z = false;
            }
            if (z) {
                arrayList2.add(next);
            }
        }
        String Z0 = C19327t.m32644Z0(arrayList2, (String) null, (String) null, (String) null, FilterFormatter$buildCategoriesString$categoryString$2.INSTANCE, 31);
        if (Z0.length() != 0) {
            z = false;
        }
        if (!z) {
            return Z0;
        }
        String string = resources.getString(R.string.all_categories);
        C19383o.m32796f(string, "{\n            resources.…all_categories)\n        }");
        return string;
    }

    /* renamed from: b */
    public static String m18953b(List list) {
        C19383o.m32797g(list, ResponseConstants.OPTIONS);
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((C10978a) next).f24343b != FilterType.FILTER_CATEGORY) {
                arrayList.add(next);
            }
        }
        return C19327t.m32644Z0(arrayList, (String) null, (String) null, (String) null, FilterFormatter$buildFiltersString$2.INSTANCE, 31);
    }

    /* renamed from: c */
    public static ArrayList m18954c(List list, FilterType filterType) {
        C19383o.m32797g(list, "userOrderedActiveOptions");
        C19383o.m32797g(filterType, "filterType");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((C10978a) next).f24343b != filterType) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}

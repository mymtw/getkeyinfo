package com.etsy.android.p327ui.search;

import android.net.Uri;
import com.appboy.Constants;
import com.etsy.android.lib.deeplinks.DeepLinkEntity;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import org.apache.commons.cli.HelpFormatter;
import p350fe.C12741o;
import p628nj.C18263b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.h */
public final class C10865h {

    /* renamed from: a */
    public final C12741o f24096a;

    public C10865h(C12741o oVar) {
        C19383o.m32797g(oVar, "routeInspector");
        this.f24096a = oVar;
    }

    /* renamed from: b */
    public static String m18884b(Uri uri) {
        C19383o.m32797g(uri, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        List<String> pathSegments = uri.getPathSegments();
        C19383o.m32796f(pathSegments, "uri.pathSegments");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = pathSegments.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                return C19457k.m33023a1(C19327t.m32644Z0(arrayList, ".", (String) null, (String) null, (C19857l) null, 62), HelpFormatter.DEFAULT_OPT_PREFIX, "_", false);
            }
            T next = it.next();
            String str = (String) next;
            if (!C19383o.m32792b(str, DeepLinkEntity.TAXONOMY_CATEGORY.getEntityName()) && !C19383o.m32792b(str, DeepLinkEntity.SEARCH.getEntityName()) && !C19383o.m32792b(str, ResponseConstants.HANDMADE) && !C19383o.m32792b(str, "vintage")) {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
    }

    /* renamed from: a */
    public final HashMap<String, String> mo36068a(Uri uri) {
        T t;
        boolean z;
        C19383o.m32797g(uri, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        this.f24096a.getClass();
        HashMap<String, String> hashMap = new HashMap<>(C12741o.m20403c(uri));
        List<String> pathSegments = uri.getPathSegments();
        C19383o.m32796f(pathSegments, "uri.pathSegments");
        Iterator<T> it = pathSegments.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            String str = (String) t;
            if (C19383o.m32792b(str, ResponseConstants.HANDMADE) || C19383o.m32792b(str, "vintage")) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        String str2 = (String) t;
        if (C18263b.m30839d0(str2)) {
            hashMap.put("marketplace", str2);
        }
        return hashMap;
    }
}

package com.etsy.android.lib.logger.referrers;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.etsy.android.lib.logger.C8693g;
import com.etsy.android.uikit.util.C11906j;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import p357gf.C12794c;
import p753kq.C19857l;

public final class Referrer {

    /* renamed from: c */
    public static final C19285c<String> f19131c = C19350d.m32677b(Referrer$Companion$schema$2.INSTANCE);

    /* renamed from: a */
    public final String f19132a;

    /* renamed from: b */
    public final LinkedHashMap f19133b = new LinkedHashMap();

    /* renamed from: com.etsy.android.lib.logger.referrers.Referrer$a */
    public static final class C8712a {
        /* renamed from: a */
        public static Referrer m17141a(Object obj) {
            String str;
            C12794c b;
            C19383o.m32797g(obj, "navContext");
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if ((activity instanceof FragmentActivity) && (b = C11906j.m19626b(((FragmentActivity) activity).getSupportFragmentManager())) != null) {
                    str = m17142b((Fragment) b);
                } else if (activity instanceof C8693g) {
                    str = ((C8693g) activity).getAnalyticsContext().f19060b;
                    C19383o.m32796f(str, "{\n                activi…ontext.name\n            }");
                } else {
                    str = activity.getClass().getSimpleName();
                }
            } else if (obj instanceof Fragment) {
                str = m17142b((Fragment) obj);
            } else if (obj instanceof C8693g) {
                str = ((C8693g) obj).getAnalyticsContext().f19060b;
                C19383o.m32796f(str, "navContext.analyticsContext.name");
            } else {
                str = obj.getClass().getName();
            }
            return new Referrer(str);
        }

        /* renamed from: b */
        public static String m17142b(Fragment fragment) {
            FragmentManager childFragmentManager = fragment.getChildFragmentManager();
            C19383o.m32796f(childFragmentManager, "fragment.childFragmentManager");
            C12794c b = C11906j.m19626b(childFragmentManager);
            String str = (b == null || !(b instanceof C8693g)) ? null : ((C8693g) b).getAnalyticsContext().f19060b;
            if (str != null) {
                return str;
            }
            if (!(fragment instanceof C8693g)) {
                return fragment.getClass().getSimpleName();
            }
            String str2 = ((C8693g) fragment).getAnalyticsContext().f19060b;
            C19383o.m32796f(str2, "{\n                fragme…ontext.name\n            }");
            return str2;
        }

        /* renamed from: c */
        public static String m17143c(Bundle bundle) {
            if (bundle != null) {
                return bundle.getString(".ref");
            }
            return null;
        }
    }

    static {
        new Referrer("referrer_not_set");
    }

    public Referrer(String str) {
        this.f19132a = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(f19131c.getValue() + "://screen/" + this.f19132a);
        if (!this.f19133b.isEmpty()) {
            LinkedHashMap linkedHashMap = this.f19133b;
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String encode = URLEncoder.encode((String) entry.getKey(), "UTF-8");
                String encode2 = URLEncoder.encode((String) entry.getValue(), "UTF-8");
                arrayList.add(encode + '=' + encode2);
            }
            String Z0 = C19327t.m32644Z0(arrayList, "&", (String) null, (String) null, (C19857l) null, 62);
            sb.append(RFC1522Codec.SEP + Z0);
        }
        String sb2 = sb.toString();
        C19383o.m32796f(sb2, "builder.toString()");
        return sb2;
    }
}

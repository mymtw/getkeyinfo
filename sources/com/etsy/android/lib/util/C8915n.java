package com.etsy.android.lib.util;

import android.net.Uri;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.lib.config.C8591a;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.deeplinks.DeepLinkEntity;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.models.ResponseConstants;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import p003a2.C0023f;
import p010a9.C0048b;
import p628nj.C18263b;

/* renamed from: com.etsy.android.lib.util.n */
public final class C8915n {

    /* renamed from: a */
    public static final List<String> f19672a = Arrays.asList(new String[]{"blog", "codeascraft", "forums", "giftcards", "help", "investors", "lookbooks", "wholesale", "education", "theetsymarket", "summit", "etsyu"});

    /* renamed from: a */
    public static String m17349a(URL url) {
        String str;
        String[] split = url.getHost().split("\\.");
        char c = 2;
        if (split.length > 2) {
            boolean z = false;
            if ("www".equalsIgnoreCase(split[0])) {
                str = split[1];
            } else {
                str = split[0];
                c = 1;
            }
            String trim = str.trim();
            if (trim.length() >= 4 && !f19672a.contains(trim)) {
                z = true;
            }
            if (z && "etsy".equalsIgnoreCase(split[c])) {
                try {
                    return m17351c(ResponseConstants.SHOP, str);
                } catch (IllegalArgumentException | NullPointerException e) {
                    C8694h.f19097a.mo21309d("Couldn't make shop url from " + str, e);
                    e.printStackTrace();
                    return url.toString();
                }
            }
        }
        return url.toString();
    }

    /* renamed from: b */
    public static String m17350b(DeepLinkEntity deepLinkEntity, List<Pair<String, String>> list) throws NullPointerException, IllegalArgumentException {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("etsy").authority(deepLinkEntity.getEntityName());
        for (Pair next : list) {
            builder.appendQueryParameter((String) next.getFirst(), (String) next.getSecond());
        }
        return builder.build().toString();
    }

    /* renamed from: c */
    public static String m17351c(String str, String str2) throws NullPointerException, IllegalArgumentException {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https").authority("www.etsy.com").appendPath(str);
        builder.appendEncodedPath(str2);
        return builder.build().toString();
    }

    /* renamed from: d */
    public static String m17352d(String str, String str2, String str3) throws NullPointerException, IllegalArgumentException {
        StringBuilder sb = new StringBuilder();
        List<String> list = C8591a.f18700r;
        sb.append(C18263b.f40056T.f18706f.mo21136f(C8592b.f18819p0));
        sb.append("/");
        sb.append(str);
        String k = C0023f.m110k(sb, "/", str2);
        return C8885d0.m17324h(str3) ? C0048b.m163a(k, "/", str3) : k;
    }

    /* renamed from: e */
    public static boolean m17353e(String str) {
        return C8885d0.m17323g(str) && ("etsy.com".equalsIgnoreCase(str) || m17354f(str, "etsy.com") || "etsy.me".equals(str) || m17354f(str, "etsy.me"));
    }

    /* renamed from: f */
    public static boolean m17354f(String str, String str2) {
        String i = C0326j.m864i(".", str2);
        int length = i.length();
        return str.regionMatches(true, str.length() - length, i, 0, length);
    }

    /* renamed from: g */
    public static boolean m17355g(String str) {
        return "http".equalsIgnoreCase(str) || "https".equalsIgnoreCase(str);
    }
}

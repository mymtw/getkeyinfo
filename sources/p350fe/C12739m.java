package p350fe;

import android.net.Uri;
import com.etsy.android.lib.deeplinks.DeepLinkEntity;
import com.etsy.android.lib.deeplinks.DeepLinkScheme;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19456j;
import p628nj.C18263b;

/* renamed from: fe.m */
public final class C12739m {
    /* renamed from: a */
    public static Uri m20402a(List list) {
        C19383o.m32797g(list, "routeInfoList");
        if (list.isEmpty()) {
            return null;
        }
        Uri.Builder scheme = new Uri.Builder().scheme(DeepLinkScheme.SCHEME_ETSY.getType());
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            C12740n nVar = (C12740n) it.next();
            DeepLinkEntity deepLinkEntity = nVar.f28145a;
            String str = nVar.f28146b;
            if (i == 0) {
                scheme.authority(deepLinkEntity.getEntityName());
            } else {
                scheme.appendEncodedPath(deepLinkEntity.getEntityName());
            }
            Long U0 = str != null ? C19456j.m33017U0(str) : null;
            if ((U0 == null || U0.longValue() <= 0) && (!deepLinkEntity.allowsStringIds() || !C18263b.m30839d0(str))) {
                str = null;
            }
            if (str != null) {
                scheme.appendEncodedPath(str);
            }
            i = i2;
        }
        return scheme.build();
    }
}

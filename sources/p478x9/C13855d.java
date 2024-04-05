package p478x9;

import com.etsy.android.lib.deeplinks.DeepLinkScheme;
import kotlin.text.C19457k;

/* renamed from: x9.d */
public final class C13855d implements C13861h {
    /* renamed from: a */
    public final boolean mo46686a(String str) {
        return C19457k.m33019W0(DeepLinkScheme.SCHEME_ETSY.getType(), str, true) || C19457k.m33019W0(DeepLinkScheme.SCHEME_ETSY_BETA.getType(), str, true);
    }

    /* renamed from: b */
    public final boolean mo46687b(String str) {
        return C19457k.m33019W0(DeepLinkScheme.SCHEME_WEB.getType(), str, true) || C19457k.m33019W0(DeepLinkScheme.SCHEME_WEB_SAFE.getType(), str, true);
    }
}

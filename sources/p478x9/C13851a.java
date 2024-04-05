package p478x9;

import android.net.Uri;
import com.appboy.Constants;
import com.etsy.android.lib.deeplinks.DeepLinkEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p568fn.C17782b;
import p628nj.C18263b;

/* renamed from: x9.a */
public final class C13851a {

    /* renamed from: a */
    public final C13861h f30480a;

    /* renamed from: b */
    public final C13860g f30481b;

    public C13851a(C13861h hVar, C13860g gVar) {
        C19383o.m32797g(hVar, "deepLinkSchemeChecker");
        C19383o.m32797g(gVar, "deepLinkHostChecker");
        this.f30480a = hVar;
        this.f30481b = gVar;
    }

    /* renamed from: a */
    public final DeepLinkEntity mo46683a(Uri uri) {
        C19383o.m32797g(uri, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        DeepLinkEntity.C8657a aVar = DeepLinkEntity.Companion;
        C13861h hVar = this.f30480a;
        C13860g gVar = this.f30481b;
        aVar.getClass();
        C19383o.m32797g(hVar, "deepLinkSchemeChecker");
        C19383o.m32797g(gVar, "deepLinkHostChecker");
        if (hVar.mo46686a(uri.getScheme())) {
            if (C18263b.m30839d0(uri.getHost())) {
                List<String> pathSegments = uri.getPathSegments();
                C19383o.m32796f(pathSegments, "uri.pathSegments");
                ArrayList arrayList = new ArrayList();
                for (T next : pathSegments) {
                    String str = (String) next;
                    DeepLinkEntity.C8657a aVar2 = DeepLinkEntity.Companion;
                    C19383o.m32796f(str, "it");
                    aVar2.getClass();
                    if (DeepLinkEntity.C8657a.m17039a(str) != null) {
                        arrayList.add(next);
                    }
                }
                if (arrayList.isEmpty()) {
                    String host = uri.getHost();
                    C19383o.m32794d(host);
                    return DeepLinkEntity.C8657a.m17039a(host);
                }
                Object obj = arrayList.get(C17782b.m29859Y(arrayList));
                C19383o.m32796f(obj, "entityList[entityList.lastIndex]");
                return DeepLinkEntity.C8657a.m17039a((String) obj);
            }
        } else if (hVar.mo46687b(uri.getScheme())) {
            List<String> pathSegments2 = uri.getPathSegments();
            C19383o.m32796f(pathSegments2, "uri.pathSegments");
            ArrayList arrayList2 = new ArrayList();
            for (T next2 : pathSegments2) {
                String str2 = (String) next2;
                DeepLinkEntity.C8657a aVar3 = DeepLinkEntity.Companion;
                C19383o.m32796f(str2, "it");
                aVar3.getClass();
                if (DeepLinkEntity.C8657a.m17039a(str2) != null) {
                    arrayList2.add(next2);
                }
            }
            if (!arrayList2.isEmpty()) {
                Object obj2 = arrayList2.get(C17782b.m29859Y(arrayList2));
                C19383o.m32796f(obj2, "entityList[entityList.lastIndex]");
                return DeepLinkEntity.C8657a.m17039a((String) obj2);
            }
        }
        return null;
    }
}

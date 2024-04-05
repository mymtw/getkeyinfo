package p365hg;

import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C19383o;
import org.json.JSONObject;
import p365hg.C12869i0;

/* renamed from: hg.j0 */
public final class C12873j0 implements GraphRequest.C12195b {

    /* renamed from: a */
    public final /* synthetic */ C12869i0.C12870a f28380a;

    /* renamed from: b */
    public final /* synthetic */ String f28381b;

    public C12873j0(C12869i0.C12870a aVar, String str) {
        this.f28380a = aVar;
        this.f28381b = str;
    }

    /* renamed from: a */
    public final void mo39238a(GraphResponse graphResponse) {
        FacebookRequestError facebookRequestError = graphResponse.f27247d;
        if (facebookRequestError != null) {
            this.f28380a.mo39273b(facebookRequestError.getException());
            return;
        }
        String str = this.f28381b;
        JSONObject jSONObject = graphResponse.f27244a;
        if (jSONObject != null) {
            ConcurrentHashMap<String, JSONObject> concurrentHashMap = C12863f0.f28358a;
            C19383o.m32797g(str, "key");
            C12863f0.f28358a.put(str, jSONObject);
            this.f28380a.mo39272a(graphResponse.f27244a);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}

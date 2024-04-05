package p464va;

import com.etsy.android.lib.core.HttpMethod;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: va.b */
public final class C13547b {

    /* renamed from: a */
    public final String f29627a;

    /* renamed from: b */
    public final Map<String, String> f29628b;

    /* renamed from: c */
    public final HttpMethod f29629c;

    public C13547b(String str, Map<String, String> map, HttpMethod httpMethod) {
        C19383o.m32797g(str, ResponseConstants.PATH);
        C19383o.m32797g(map, ResponseConstants.PARAMS);
        C19383o.m32797g(httpMethod, ResponseConstants.METHOD);
        this.f29627a = str;
        this.f29628b = map;
        this.f29629c = httpMethod;
    }
}

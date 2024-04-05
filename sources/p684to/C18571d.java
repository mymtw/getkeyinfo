package p684to;

import android.net.Uri;
import com.paypal.openid.C17153d;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: to.d */
public final class C18571d {

    /* renamed from: i */
    public static final Set<String> f40891i = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"redirect_uris", "response_types", "grant_types", "application_type", "subject_type", "token_endpoint_auth_method"})));

    /* renamed from: a */
    public final C17153d f40892a;

    /* renamed from: b */
    public final List<Uri> f40893b;

    /* renamed from: c */
    public final String f40894c;

    /* renamed from: d */
    public final List<String> f40895d;

    /* renamed from: e */
    public final List<String> f40896e;

    /* renamed from: f */
    public final String f40897f;

    /* renamed from: g */
    public final String f40898g = null;

    /* renamed from: h */
    public final Map<String, String> f40899h;

    public C18571d(C17153d dVar, List list, List list2, List list3, String str, Map map) {
        this.f40892a = dVar;
        this.f40893b = list;
        this.f40895d = list2;
        this.f40896e = list3;
        this.f40897f = str;
        this.f40899h = map;
        this.f40894c = "native";
    }
}

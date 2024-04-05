package p769rr;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17407s;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.JsonAdapter;
import java.io.IOException;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20002r;
import okhttp3.C20014w;
import okhttp3.C20016y;
import okio.ByteString;
import p756lr.C19893f;
import retrofit2.C20099f;

/* renamed from: rr.b */
public final class C20165b<T> implements C20099f<T, C20016y> {

    /* renamed from: b */
    public static final C20002r f44659b = C20002r.C20003a.m34243a("application/json; charset=UTF-8");

    /* renamed from: a */
    public final JsonAdapter<T> f44660a;

    static {
        C20002r.f44260f.getClass();
    }

    public C20165b(JsonAdapter<T> jsonAdapter) {
        this.f44660a = jsonAdapter;
    }

    public final Object convert(Object obj) throws IOException {
        C19893f fVar = new C19893f();
        this.f44660a.toJson((C17412w) new C17407s(fVar), obj);
        C20002r rVar = f44659b;
        ByteString t = fVar.mo72759t();
        C20016y.f44360a.getClass();
        C19383o.m32797g(t, ResponseConstants.CONTENT);
        return new C20014w(rVar, t);
    }
}

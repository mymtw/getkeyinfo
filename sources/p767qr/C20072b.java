package p767qr;

import com.etsy.android.lib.models.ResponseConstants;
import com.google.gson.C16708i;
import com.google.gson.C16807t;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20002r;
import okhttp3.C20014w;
import okhttp3.C20016y;
import okio.ByteString;
import p756lr.C19893f;
import p756lr.C19895g;
import retrofit2.C20099f;

/* renamed from: qr.b */
public final class C20072b<T> implements C20099f<T, C20016y> {

    /* renamed from: c */
    public static final C20002r f44452c = C20002r.C20003a.m34243a("application/json; charset=UTF-8");

    /* renamed from: d */
    public static final Charset f44453d = Charset.forName("UTF-8");

    /* renamed from: a */
    public final C16708i f44454a;

    /* renamed from: b */
    public final C16807t<T> f44455b;

    static {
        C20002r.f44260f.getClass();
    }

    public C20072b(C16708i iVar, C16807t<T> tVar) {
        this.f44454a = iVar;
        this.f44455b = tVar;
    }

    public final Object convert(Object obj) throws IOException {
        C19893f fVar = new C19893f();
        JsonWriter i = this.f44454a.mo59462i(new OutputStreamWriter(new C19895g(fVar), f44453d));
        this.f44455b.mo59450b(i, obj);
        i.close();
        C20002r rVar = f44452c;
        ByteString t = fVar.mo72759t();
        C20016y.f44360a.getClass();
        C19383o.m32797g(t, ResponseConstants.CONTENT);
        return new C20014w(rVar, t);
    }
}

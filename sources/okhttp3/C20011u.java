package okhttp3;

import android.support.p013v4.media.C0072d;
import androidx.compose.p015ui.text.input.C1993m;
import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.login.LoginFragment;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import okhttp3.C19994o;
import okhttp3.C19997p;
import p010a9.C0048b;
import p568fn.C17782b;
import p735br.C18980c;

/* renamed from: okhttp3.u */
public final class C20011u {

    /* renamed from: a */
    public C19941d f44341a;

    /* renamed from: b */
    public final C19997p f44342b;

    /* renamed from: c */
    public final String f44343c;

    /* renamed from: d */
    public final C19994o f44344d;

    /* renamed from: e */
    public final C20016y f44345e;

    /* renamed from: f */
    public final Map<Class<?>, Object> f44346f;

    public C20011u(C19997p pVar, String str, C19994o oVar, C20016y yVar, Map<Class<?>, ? extends Object> map) {
        C19383o.m32797g(str, ResponseConstants.METHOD);
        this.f44342b = pVar;
        this.f44343c = str;
        this.f44344d = oVar;
        this.f44345e = yVar;
        this.f44346f = map;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("Request{method=");
        h.append(this.f44343c);
        h.append(", url=");
        h.append(this.f44342b);
        if (this.f44344d.f44235b.length / 2 != 0) {
            h.append(", headers=[");
            int i = 0;
            for (Object next : this.f44344d) {
                int i2 = i + 1;
                if (i >= 0) {
                    Pair pair = (Pair) next;
                    String str = (String) pair.component1();
                    String str2 = (String) pair.component2();
                    if (i > 0) {
                        h.append(", ");
                    }
                    h.append(str);
                    h.append(':');
                    h.append(str2);
                    i = i2;
                } else {
                    C17782b.m29877o0();
                    throw null;
                }
            }
            h.append(']');
        }
        if (!this.f44346f.isEmpty()) {
            h.append(", tags=");
            h.append(this.f44346f);
        }
        h.append('}');
        String sb = h.toString();
        C19383o.m32796f(sb, "StringBuilder().apply(builderAction).toString()");
        return sb;
    }

    /* renamed from: okhttp3.u$a */
    public static class C20012a {

        /* renamed from: a */
        public C19997p f44347a;

        /* renamed from: b */
        public String f44348b;

        /* renamed from: c */
        public C19994o.C19995a f44349c;

        /* renamed from: d */
        public C20016y f44350d;

        /* renamed from: e */
        public LinkedHashMap f44351e;

        public C20012a() {
            this.f44351e = new LinkedHashMap();
            this.f44348b = "GET";
            this.f44349c = new C19994o.C19995a();
        }

        /* renamed from: a */
        public final void mo72998a(String str, String str2) {
            C19383o.m32797g(str, "name");
            C19383o.m32797g(str2, "value");
            this.f44349c.mo72958a(str, str2);
        }

        /* renamed from: b */
        public final C20011u mo72999b() {
            Map map;
            C19997p pVar = this.f44347a;
            if (pVar != null) {
                String str = this.f44348b;
                C19994o d = this.f44349c.mo72961d();
                C20016y yVar = this.f44350d;
                LinkedHashMap linkedHashMap = this.f44351e;
                byte[] bArr = C18980c.f42301a;
                C19383o.m32797g(linkedHashMap, "$this$toImmutableMap");
                if (linkedHashMap.isEmpty()) {
                    map = C19294b0.m32559p0();
                } else {
                    map = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
                    C19383o.m32796f(map, "Collections.unmodifiableMap(LinkedHashMap(this))");
                }
                return new C20011u(pVar, str, d, yVar, map);
            }
            throw new IllegalStateException("url == null".toString());
        }

        /* renamed from: c */
        public final void mo73000c(String str, String str2) {
            C19383o.m32797g(str, "name");
            C19383o.m32797g(str2, "value");
            C19994o.C19995a aVar = this.f44349c;
            aVar.getClass();
            C19994o.f44234c.getClass();
            C19994o.C19996b.m34214a(str);
            C19994o.C19996b.m34215b(str2, str);
            aVar.mo72963f(str);
            aVar.mo72960c(str, str2);
        }

        /* renamed from: d */
        public final void mo73001d(String str, C20016y yVar) {
            C19383o.m32797g(str, ResponseConstants.METHOD);
            boolean z = false;
            if (str.length() > 0) {
                if (yVar == null) {
                    if (C19383o.m32792b(str, "POST") || C19383o.m32792b(str, "PUT") || C19383o.m32792b(str, "PATCH") || C19383o.m32792b(str, "PROPPATCH") || C19383o.m32792b(str, "REPORT")) {
                        z = true;
                    }
                    if (!(!z)) {
                        throw new IllegalArgumentException(C0048b.m163a("method ", str, " must have a request body.").toString());
                    }
                } else if (!C1993m.m4361V(str)) {
                    throw new IllegalArgumentException(C0048b.m163a("method ", str, " must not have a request body.").toString());
                }
                this.f44348b = str;
                this.f44350d = yVar;
                return;
            }
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }

        /* renamed from: e */
        public final void mo73002e(Class cls, Object obj) {
            C19383o.m32797g(cls, "type");
            if (obj == null) {
                this.f44351e.remove(cls);
                return;
            }
            if (this.f44351e.isEmpty()) {
                this.f44351e = new LinkedHashMap();
            }
            LinkedHashMap linkedHashMap = this.f44351e;
            Object cast = cls.cast(obj);
            C19383o.m32794d(cast);
            linkedHashMap.put(cls, cast);
        }

        /* renamed from: f */
        public final void mo73003f(String str) {
            C19383o.m32797g(str, "url");
            if (C19457k.m33025c1(str, "ws:", true)) {
                StringBuilder h = C0072d.m201h("http:");
                String substring = str.substring(3);
                C19383o.m32796f(substring, "(this as java.lang.String).substring(startIndex)");
                h.append(substring);
                str = h.toString();
            } else if (C19457k.m33025c1(str, "wss:", true)) {
                StringBuilder h2 = C0072d.m201h("https:");
                String substring2 = str.substring(4);
                C19383o.m32796f(substring2, "(this as java.lang.String).substring(startIndex)");
                h2.append(substring2);
                str = h2.toString();
            }
            C19997p.f44238l.getClass();
            this.f44347a = C19997p.C19999b.m34234c(str);
        }

        public C20012a(C20011u uVar) {
            LinkedHashMap linkedHashMap;
            C19383o.m32797g(uVar, LoginFragment.EXTRA_REQUEST);
            this.f44351e = new LinkedHashMap();
            this.f44347a = uVar.f44342b;
            this.f44348b = uVar.f44343c;
            this.f44350d = uVar.f44345e;
            if (uVar.f44346f.isEmpty()) {
                linkedHashMap = new LinkedHashMap();
            } else {
                linkedHashMap = C19294b0.m32558A0(uVar.f44346f);
            }
            this.f44351e = linkedHashMap;
            this.f44349c = uVar.f44344d.mo72952g();
        }
    }
}

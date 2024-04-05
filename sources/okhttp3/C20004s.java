package okhttp3;

import android.support.p013v4.media.C0069a;
import com.etsy.android.p327ui.navigation.keys.bottomsheetkeys.DetailsBottomSheetNavigationKey;
import com.facebook.stetho.server.http.HttpHeaders;
import com.fasterxml.jackson.core.JsonFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19994o;
import okhttp3.C20002r;
import okhttp3.C20016y;
import okio.ByteString;
import org.apache.http.entity.mime.MIME;
import p735br.C18980c;
import p756lr.C19896h;

/* renamed from: okhttp3.s */
public final class C20004s extends C20016y {

    /* renamed from: f */
    public static final C20002r f44264f = C20002r.C20003a.m34243a("multipart/mixed");

    /* renamed from: g */
    public static final C20002r f44265g = C20002r.C20003a.m34243a("multipart/form-data");

    /* renamed from: h */
    public static final byte[] f44266h = {(byte) 58, (byte) 32};

    /* renamed from: i */
    public static final byte[] f44267i = {(byte) 13, (byte) 10};

    /* renamed from: j */
    public static final byte[] f44268j;

    /* renamed from: b */
    public final C20002r f44269b;

    /* renamed from: c */
    public long f44270c = -1;

    /* renamed from: d */
    public final ByteString f44271d;

    /* renamed from: e */
    public final List<C20007c> f44272e;

    /* renamed from: okhttp3.s$a */
    public static final class C20005a {

        /* renamed from: a */
        public final ByteString f44273a;

        /* renamed from: b */
        public C20002r f44274b;

        /* renamed from: c */
        public final ArrayList f44275c;

        public C20005a() {
            this(0);
        }

        public C20005a(int i) {
            String e = C0069a.m174e("UUID.randomUUID().toString()");
            ByteString.Companion.getClass();
            this.f44273a = ByteString.C20020a.m34295c(e);
            this.f44274b = C20004s.f44264f;
            this.f44275c = new ArrayList();
        }

        /* renamed from: a */
        public final void mo72988a(String str, String str2) {
            C19383o.m32797g(str, "name");
            C19383o.m32797g(str2, "value");
            C20007c.f44276c.getClass();
            this.f44275c.add(C20007c.C20008a.m34254b(str, str2));
        }

        /* renamed from: b */
        public final C20004s mo72989b() {
            if (!this.f44275c.isEmpty()) {
                return new C20004s(this.f44273a, this.f44274b, C18980c.m32118v(this.f44275c));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }

        /* renamed from: c */
        public final void mo72990c(C20002r rVar) {
            C19383o.m32797g(rVar, "type");
            if (C19383o.m32792b(rVar.f44262b, "multipart")) {
                this.f44274b = rVar;
                return;
            }
            throw new IllegalArgumentException(("multipart != " + rVar).toString());
        }
    }

    /* renamed from: okhttp3.s$b */
    public static final class C20006b {
        /* renamed from: a */
        public static void m34252a(StringBuilder sb, String str) {
            C19383o.m32797g(str, "key");
            sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt == 10) {
                    sb.append("%0A");
                } else if (charAt == 13) {
                    sb.append("%0D");
                } else if (charAt != '\"') {
                    sb.append(charAt);
                } else {
                    sb.append("%22");
                }
            }
            sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        }
    }

    /* renamed from: okhttp3.s$c */
    public static final class C20007c {

        /* renamed from: c */
        public static final C20008a f44276c = new C20008a();

        /* renamed from: a */
        public final C19994o f44277a;

        /* renamed from: b */
        public final C20016y f44278b;

        /* renamed from: okhttp3.s$c$a */
        public static final class C20008a {
            /* renamed from: a */
            public static C20007c m34253a(C19994o oVar, C20016y yVar) {
                C19383o.m32797g(yVar, DetailsBottomSheetNavigationKey.PARAM_BODY);
                String str = null;
                boolean z = true;
                if ((oVar != null ? oVar.mo72948a("Content-Type") : null) == null) {
                    if (oVar != null) {
                        str = oVar.mo72948a(HttpHeaders.CONTENT_LENGTH);
                    }
                    if (str != null) {
                        z = false;
                    }
                    if (z) {
                        return new C20007c(oVar, yVar);
                    }
                    throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
                }
                throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
            }

            /* renamed from: b */
            public static C20007c m34254b(String str, String str2) {
                C19383o.m32797g(str, "name");
                C19383o.m32797g(str2, "value");
                C20016y.f44360a.getClass();
                return m34255c(str, (String) null, C20016y.C20017a.m34281b(str2, (C20002r) null));
            }

            /* renamed from: c */
            public static C20007c m34255c(String str, String str2, C20016y yVar) {
                C19383o.m32797g(str, "name");
                StringBuilder sb = new StringBuilder();
                sb.append("form-data; name=");
                C20002r rVar = C20004s.f44264f;
                C20006b.m34252a(sb, str);
                if (str2 != null) {
                    sb.append("; filename=");
                    C20006b.m34252a(sb, str2);
                }
                String sb2 = sb.toString();
                C19383o.m32796f(sb2, "StringBuilder().apply(builderAction).toString()");
                C19994o.C19995a aVar = new C19994o.C19995a();
                C19994o.f44234c.getClass();
                C19994o.C19996b.m34214a(MIME.CONTENT_DISPOSITION);
                aVar.mo72960c(MIME.CONTENT_DISPOSITION, sb2);
                return m34253a(aVar.mo72961d(), yVar);
            }
        }

        public C20007c(C19994o oVar, C20016y yVar) {
            this.f44277a = oVar;
            this.f44278b = yVar;
        }
    }

    static {
        C20002r.f44260f.getClass();
        C20002r.C20003a.m34243a("multipart/alternative");
        C20002r.C20003a.m34243a("multipart/digest");
        C20002r.C20003a.m34243a("multipart/parallel");
        byte b = (byte) 45;
        f44268j = new byte[]{b, b};
    }

    public C20004s(ByteString byteString, C20002r rVar, List<C20007c> list) {
        C19383o.m32797g(byteString, "boundaryByteString");
        C19383o.m32797g(rVar, "type");
        this.f44271d = byteString;
        this.f44272e = list;
        C20002r.f44260f.getClass();
        this.f44269b = C20002r.C20003a.m34243a(rVar + "; boundary=" + byteString.utf8());
    }

    /* renamed from: a */
    public final long mo72943a() throws IOException {
        long j = this.f44270c;
        if (j != -1) {
            return j;
        }
        long d = mo72987d((C19896h) null, true);
        this.f44270c = d;
        return d;
    }

    /* renamed from: b */
    public final C20002r mo72944b() {
        return this.f44269b;
    }

    /* renamed from: c */
    public final void mo72945c(C19896h hVar) throws IOException {
        mo72987d(hVar, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: lr.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: lr.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: lr.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: lr.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: lr.f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo72987d(p756lr.C19896h r13, boolean r14) throws java.io.IOException {
        /*
            r12 = this;
            if (r14 == 0) goto L_0x0009
            lr.f r13 = new lr.f
            r13.<init>()
            r0 = r13
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            java.util.List<okhttp3.s$c> r1 = r12.f44272e
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r5 = r2
        L_0x0014:
            if (r5 >= r1) goto L_0x00a9
            java.util.List<okhttp3.s$c> r6 = r12.f44272e
            java.lang.Object r6 = r6.get(r5)
            okhttp3.s$c r6 = (okhttp3.C20004s.C20007c) r6
            okhttp3.o r7 = r6.f44277a
            okhttp3.y r6 = r6.f44278b
            kotlin.jvm.internal.C19383o.m32794d(r13)
            byte[] r8 = f44268j
            r13.write(r8)
            okio.ByteString r8 = r12.f44271d
            r13.mo72757s0(r8)
            byte[] r8 = f44267i
            r13.write(r8)
            if (r7 == 0) goto L_0x005c
            java.lang.String[] r8 = r7.f44235b
            int r8 = r8.length
            int r8 = r8 / 2
            r9 = r2
        L_0x003c:
            if (r9 >= r8) goto L_0x005c
            java.lang.String r10 = r7.mo72949c(r9)
            lr.h r10 = r13.mo72716H(r10)
            byte[] r11 = f44266h
            lr.h r10 = r10.write(r11)
            java.lang.String r11 = r7.mo72955m(r9)
            lr.h r10 = r10.mo72716H(r11)
            byte[] r11 = f44267i
            r10.write(r11)
            int r9 = r9 + 1
            goto L_0x003c
        L_0x005c:
            okhttp3.r r7 = r6.mo72944b()
            if (r7 == 0) goto L_0x0073
            java.lang.String r8 = "Content-Type: "
            lr.h r8 = r13.mo72716H(r8)
            java.lang.String r7 = r7.f44261a
            lr.h r7 = r8.mo72716H(r7)
            byte[] r8 = f44267i
            r7.write(r8)
        L_0x0073:
            long r7 = r6.mo72943a()
            r9 = -1
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x008d
            java.lang.String r9 = "Content-Length: "
            lr.h r9 = r13.mo72716H(r9)
            lr.h r9 = r9.mo72724V(r7)
            byte[] r10 = f44267i
            r9.write(r10)
            goto L_0x0096
        L_0x008d:
            if (r14 == 0) goto L_0x0096
            kotlin.jvm.internal.C19383o.m32794d(r0)
            r0.mo72726a()
            return r9
        L_0x0096:
            byte[] r9 = f44267i
            r13.write(r9)
            if (r14 == 0) goto L_0x009f
            long r3 = r3 + r7
            goto L_0x00a2
        L_0x009f:
            r6.mo72945c(r13)
        L_0x00a2:
            r13.write(r9)
            int r5 = r5 + 1
            goto L_0x0014
        L_0x00a9:
            kotlin.jvm.internal.C19383o.m32794d(r13)
            byte[] r1 = f44268j
            r13.write(r1)
            okio.ByteString r2 = r12.f44271d
            r13.mo72757s0(r2)
            r13.write(r1)
            byte[] r1 = f44267i
            r13.write(r1)
            if (r14 == 0) goto L_0x00c9
            kotlin.jvm.internal.C19383o.m32794d(r0)
            long r13 = r0.f43876c
            long r3 = r3 + r13
            r0.mo72726a()
        L_0x00c9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.C20004s.mo72987d(lr.h, boolean):long");
    }
}

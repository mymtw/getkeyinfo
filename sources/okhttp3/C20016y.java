package okhttp3;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19446a;
import okhttp3.C20002r;
import p735br.C18980c;
import p756lr.C19896h;

/* renamed from: okhttp3.y */
public abstract class C20016y {

    /* renamed from: a */
    public static final C20017a f44360a = new C20017a();

    /* renamed from: okhttp3.y$a */
    public static final class C20017a {
        /* renamed from: a */
        public static C20013v m34280a(File file, C20002r rVar) {
            C19383o.m32797g(file, "$this$asRequestBody");
            return new C20013v(file, rVar);
        }

        /* renamed from: b */
        public static C20015x m34281b(String str, C20002r rVar) {
            C19383o.m32797g(str, "$this$toRequestBody");
            Charset charset = C19446a.f43373b;
            if (rVar != null) {
                Pattern pattern = C20002r.f44258d;
                Charset a = rVar.mo72983a((Charset) null);
                if (a == null) {
                    C20002r.f44260f.getClass();
                    rVar = C20002r.C20003a.m34244b(rVar + "; charset=utf-8");
                } else {
                    charset = a;
                }
            }
            byte[] bytes = str.getBytes(charset);
            C19383o.m32796f(bytes, "(this as java.lang.String).getBytes(charset)");
            return m34282c(bytes, rVar, 0, bytes.length);
        }

        /* renamed from: c */
        public static C20015x m34282c(byte[] bArr, C20002r rVar, int i, int i2) {
            C19383o.m32797g(bArr, "$this$toRequestBody");
            long length = (long) bArr.length;
            long j = (long) i;
            long j2 = (long) i2;
            byte[] bArr2 = C18980c.f42301a;
            if ((j | j2) >= 0 && j <= length && length - j >= j2) {
                return new C20015x(rVar, bArr, i2, i);
            }
            throw new ArrayIndexOutOfBoundsException();
        }

        /* renamed from: d */
        public static /* synthetic */ C20015x m34283d(C20017a aVar, byte[] bArr, C20002r rVar, int i) {
            if ((i & 1) != 0) {
                rVar = null;
            }
            int length = (i & 4) != 0 ? bArr.length : 0;
            aVar.getClass();
            return m34282c(bArr, rVar, 0, length);
        }
    }

    /* renamed from: a */
    public long mo72943a() throws IOException {
        return -1;
    }

    /* renamed from: b */
    public abstract C20002r mo72944b();

    /* renamed from: c */
    public abstract void mo72945c(C19896h hVar) throws IOException;
}

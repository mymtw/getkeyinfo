package p739dr;

import androidx.appcompat.widget.C0326j;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import okhttp3.Protocol;

/* renamed from: dr.i */
public final class C19009i {

    /* renamed from: a */
    public final Protocol f42359a;

    /* renamed from: b */
    public final int f42360b;

    /* renamed from: c */
    public final String f42361c;

    /* renamed from: dr.i$a */
    public static final class C19010a {
        /* renamed from: a */
        public static C19009i m32164a(String str) throws IOException {
            Protocol protocol;
            String str2;
            C19383o.m32797g(str, "statusLine");
            int i = 9;
            if (C19457k.m33025c1(str, "HTTP/1.", false)) {
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException(C0326j.m864i("Unexpected status line: ", str));
                }
                int charAt = str.charAt(7) - '0';
                if (charAt == 0) {
                    protocol = Protocol.HTTP_1_0;
                } else if (charAt == 1) {
                    protocol = Protocol.HTTP_1_1;
                } else {
                    throw new ProtocolException(C0326j.m864i("Unexpected status line: ", str));
                }
            } else if (C19457k.m33025c1(str, "ICY ", false)) {
                protocol = Protocol.HTTP_1_0;
                i = 4;
            } else {
                throw new ProtocolException(C0326j.m864i("Unexpected status line: ", str));
            }
            int i2 = i + 3;
            if (str.length() >= i2) {
                try {
                    String substring = str.substring(i, i2);
                    C19383o.m32796f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    int parseInt = Integer.parseInt(substring);
                    if (str.length() <= i2) {
                        str2 = "";
                    } else if (str.charAt(i2) == ' ') {
                        str2 = str.substring(i + 4);
                        C19383o.m32796f(str2, "(this as java.lang.String).substring(startIndex)");
                    } else {
                        throw new ProtocolException(C0326j.m864i("Unexpected status line: ", str));
                    }
                    return new C19009i(protocol, parseInt, str2);
                } catch (NumberFormatException unused) {
                    throw new ProtocolException(C0326j.m864i("Unexpected status line: ", str));
                }
            } else {
                throw new ProtocolException(C0326j.m864i("Unexpected status line: ", str));
            }
        }
    }

    public C19009i(Protocol protocol, int i, String str) {
        C19383o.m32797g(protocol, "protocol");
        this.f42359a = protocol;
        this.f42360b = i;
        this.f42361c = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f42359a == Protocol.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.f42360b);
        sb.append(' ');
        sb.append(this.f42361c);
        String sb2 = sb.toString();
        C19383o.m32796f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}

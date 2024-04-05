package okhttp3;

import androidx.appcompat.widget.C0326j;
import java.io.IOException;
import kotlin.jvm.internal.C19383o;

public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    
    public static final C19925a Companion = null;
    /* access modifiers changed from: private */
    public final String protocol;

    /* renamed from: okhttp3.Protocol$a */
    public static final class C19925a {
        /* renamed from: a */
        public static Protocol m34073a(String str) throws IOException {
            C19383o.m32797g(str, "protocol");
            Protocol protocol = Protocol.HTTP_1_0;
            if (!C19383o.m32792b(str, protocol.protocol)) {
                protocol = Protocol.HTTP_1_1;
                if (!C19383o.m32792b(str, protocol.protocol)) {
                    protocol = Protocol.H2_PRIOR_KNOWLEDGE;
                    if (!C19383o.m32792b(str, protocol.protocol)) {
                        protocol = Protocol.HTTP_2;
                        if (!C19383o.m32792b(str, protocol.protocol)) {
                            protocol = Protocol.SPDY_3;
                            if (!C19383o.m32792b(str, protocol.protocol)) {
                                protocol = Protocol.QUIC;
                                if (!C19383o.m32792b(str, protocol.protocol)) {
                                    throw new IOException(C0326j.m864i("Unexpected protocol: ", str));
                                }
                            }
                        }
                    }
                }
            }
            return protocol;
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new C19925a();
    }

    private Protocol(String str) {
        this.protocol = str;
    }

    public static final Protocol get(String str) throws IOException {
        Companion.getClass();
        return C19925a.m34073a(str);
    }

    public String toString() {
        return this.protocol;
    }
}

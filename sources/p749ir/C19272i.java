package p749ir;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.C19383o;
import okhttp3.Protocol;
import org.conscrypt.Conscrypt;
import p747hr.C19075d;
import p747hr.C19084h;
import p749ir.C19274j;

/* renamed from: ir.i */
public final class C19272i implements C19276k {

    /* renamed from: a */
    public static final C19273a f43143a = new C19273a();

    /* renamed from: ir.i$a */
    public static final class C19273a implements C19274j.C19275a {
        /* renamed from: a */
        public final boolean mo71433a(SSLSocket sSLSocket) {
            C19075d.f42577f.getClass();
            return C19075d.C19076a.m32334b() && Conscrypt.isConscrypt(sSLSocket);
        }

        /* renamed from: b */
        public final C19276k mo71434b(SSLSocket sSLSocket) {
            return new C19272i();
        }
    }

    /* renamed from: a */
    public final boolean mo71423a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    /* renamed from: b */
    public final String mo71424b(SSLSocket sSLSocket) {
        if (mo71423a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    /* renamed from: c */
    public final void mo71425c(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        C19383o.m32797g(list, "protocols");
        if (mo71423a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            C19084h.f42595c.getClass();
            Object[] array = C19084h.C19085a.m32358a(list).toArray(new String[0]);
            if (array != null) {
                Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    public final boolean isSupported() {
        C19075d.f42577f.getClass();
        return C19075d.f42576e;
    }
}

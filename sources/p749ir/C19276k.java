package p749ir;

import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;

/* renamed from: ir.k */
public interface C19276k {
    /* renamed from: a */
    boolean mo71423a(SSLSocket sSLSocket);

    /* renamed from: b */
    String mo71424b(SSLSocket sSLSocket);

    /* renamed from: c */
    void mo71425c(SSLSocket sSLSocket, String str, List<? extends Protocol> list);

    boolean isSupported();
}

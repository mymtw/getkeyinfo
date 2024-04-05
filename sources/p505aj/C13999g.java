package p505aj;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: aj.g */
public interface C13999g extends C13997e {

    /* renamed from: aj.g$a */
    public interface C14000a {
        /* renamed from: a */
        C13999g mo46816a();
    }

    /* renamed from: b */
    long mo46812b(C14002i iVar) throws IOException;

    void close() throws IOException;

    /* renamed from: d */
    Map<String, List<String>> mo46815d() {
        return Collections.emptyMap();
    }

    /* renamed from: e */
    void mo46806e(C14014t tVar);

    Uri getUri();
}

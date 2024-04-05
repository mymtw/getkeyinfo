package p108fh;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import com.google.android.datatransport.runtime.C6547k;
import com.google.android.datatransport.runtime.C6556p;
import com.google.android.datatransport.runtime.backends.C6535i;
import java.util.logging.Logger;

/* renamed from: fh.a */
public final /* synthetic */ class C6817a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C6819c f15003b;

    /* renamed from: c */
    public final /* synthetic */ C6556p f15004c;

    /* renamed from: d */
    public final /* synthetic */ C0073e f15005d;

    /* renamed from: e */
    public final /* synthetic */ C6547k f15006e;

    public /* synthetic */ C6817a(C6819c cVar, C6556p pVar, C0073e eVar, C6547k kVar) {
        this.f15003b = cVar;
        this.f15004c = pVar;
        this.f15005d = eVar;
        this.f15006e = kVar;
    }

    public final void run() {
        C6819c cVar = this.f15003b;
        C6556p pVar = this.f15004c;
        C0073e eVar = this.f15005d;
        C6547k kVar = this.f15006e;
        cVar.getClass();
        try {
            C6535i iVar = cVar.f15013c.get(pVar.getBackendName());
            if (iVar == null) {
                String format = String.format("Transport backend '%s' is not registered", new Object[]{pVar.getBackendName()});
                C6819c.f15010f.warning(format);
                new IllegalArgumentException(format);
                eVar.getClass();
                return;
            }
            cVar.f15015e.mo18790e(new C6818b(cVar, pVar, iVar.mo13003a(kVar)));
            eVar.getClass();
        } catch (Exception e) {
            Logger logger = C6819c.f15010f;
            StringBuilder h = C0072d.m201h("Error scheduling event ");
            h.append(e.getMessage());
            logger.warning(h.toString());
            eVar.getClass();
        }
    }
}

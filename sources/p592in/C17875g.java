package p592in;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import okhttp3.C19944e;
import okhttp3.C19946f;
import okhttp3.C19997p;
import okhttp3.C20011u;
import okhttp3.C20018z;
import okhttp3.internal.connection.C19971e;
import p576gn.C17801b;
import p616ln.C18208f;

/* renamed from: in.g */
public final class C17875g implements C19946f {

    /* renamed from: a */
    public final C19946f f38816a;

    /* renamed from: b */
    public final C17801b f38817b;

    /* renamed from: c */
    public final Timer f38818c;

    /* renamed from: d */
    public final long f38819d;

    public C17875g(C19946f fVar, C18208f fVar2, Timer timer, long j) {
        this.f38816a = fVar;
        this.f38817b = new C17801b(fVar2);
        this.f38819d = j;
        this.f38818c = timer;
    }

    public final void onFailure(C19944e eVar, IOException iOException) {
        C20011u uVar = ((C19971e) eVar).f44169r;
        if (uVar != null) {
            C19997p pVar = uVar.f44342b;
            if (pVar != null) {
                this.f38817b.mo69042j(pVar.mo72972h().toString());
            }
            String str = uVar.f44343c;
            if (str != null) {
                this.f38817b.mo69035c(str);
            }
        }
        this.f38817b.mo69038f(this.f38819d);
        this.f38817b.mo69041i(this.f38818c.getDurationMicros());
        C17876h.m30013c(this.f38817b);
        this.f38816a.onFailure(eVar, iOException);
    }

    public final void onResponse(C19944e eVar, C20018z zVar) throws IOException {
        C20018z zVar2 = zVar;
        FirebasePerfOkHttpClient.m27485a(zVar2, this.f38817b, this.f38819d, this.f38818c.getDurationMicros());
        this.f38816a.onResponse(eVar, zVar);
    }
}

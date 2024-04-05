package p592in;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;
import p576gn.C17801b;

/* renamed from: in.f */
public final class C17874f<T> implements ResponseHandler<T> {

    /* renamed from: a */
    public final ResponseHandler<? extends T> f38813a;

    /* renamed from: b */
    public final Timer f38814b;

    /* renamed from: c */
    public final C17801b f38815c;

    public C17874f(ResponseHandler<? extends T> responseHandler, Timer timer, C17801b bVar) {
        this.f38813a = responseHandler;
        this.f38814b = timer;
        this.f38815c = bVar;
    }

    public final T handleResponse(HttpResponse httpResponse) throws IOException {
        this.f38815c.mo69041i(this.f38814b.getDurationMicros());
        this.f38815c.mo69036d(httpResponse.getStatusLine().getStatusCode());
        Long a = C17876h.m30011a(httpResponse);
        if (a != null) {
            this.f38815c.mo69040h(a.longValue());
        }
        String b = C17876h.m30012b(httpResponse);
        if (b != null) {
            this.f38815c.mo69039g(b);
        }
        this.f38815c.mo69034a();
        return this.f38813a.handleResponse(httpResponse);
    }
}

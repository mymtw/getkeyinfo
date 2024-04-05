package p561eo;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.p013v4.media.C0072d;
import android.util.Log;
import com.appboy.Constants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import p324cf.C8584a;

/* renamed from: eo.a */
public final class C17727a {

    /* renamed from: e */
    public static final /* synthetic */ int f38531e = 0;

    /* renamed from: a */
    public final Map<String, Future<?>> f38532a;

    /* renamed from: b */
    public final C17732e f38533b;

    /* renamed from: c */
    public Bundle f38534c = new Bundle();

    /* renamed from: d */
    public C17728a f38535d;

    /* renamed from: eo.a$a */
    public static class C17728a extends Handler {

        /* renamed from: a */
        public final C17732e f38536a;

        public C17728a(Looper looper, C8584a aVar) {
            super(looper);
            this.f38536a = aVar;
        }

        public final void handleMessage(Message message) {
            Object obj = message.obj;
            List list = obj == null ? null : (List) obj;
            Bundle data = message.getData();
            String string = data.getString("jobId");
            if (string != null) {
                int i = message.what;
                if (i == 0) {
                    this.f38536a.mo21094e(string);
                } else if (i == 1) {
                    this.f38536a.mo21092c(string, list);
                } else if (i == 2) {
                    this.f38536a.mo21090a(string, (Throwable) data.getSerializable("throwable"), list);
                } else if (i == 3) {
                    this.f38536a.mo21091b(string, data.getFloat("progress"));
                } else if (i != 4) {
                    int i2 = C17727a.f38531e;
                    StringBuilder h = C0072d.m201h("Unknown event received: ");
                    h.append(message.what);
                    Log.e(Constants.APPBOY_PUSH_CONTENT_KEY, h.toString());
                } else {
                    this.f38536a.mo21093d(string, list);
                }
            } else {
                throw new IllegalArgumentException("Handler message doesn't contain an id!");
            }
        }
    }

    public C17727a(HashMap hashMap, C8584a aVar, Looper looper) {
        this.f38532a = hashMap;
        this.f38533b = aVar;
        if (looper != null) {
            this.f38535d = new C17728a(looper, aVar);
        }
    }
}

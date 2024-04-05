package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.support.p013v4.media.C0073e;
import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.GraphRequest;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p365hg.C12869i0;
import p401mg.C13080a;
import p453tf.C13418j;
import p453tf.C13426p;

public class GraphRequestAsyncTask extends AsyncTask<Void, Void, List<? extends GraphResponse>> {
    public static final C12202a Companion = new C12202a();
    private static final String TAG = GraphRequestAsyncTask.class.getCanonicalName();
    private final HttpURLConnection connection;
    private Exception exception;
    private final C13426p requests;

    /* renamed from: com.facebook.GraphRequestAsyncTask$a */
    public static final class C12202a {
    }

    public GraphRequestAsyncTask(HttpURLConnection httpURLConnection, C13426p pVar) {
        C19383o.m32797g(pVar, "requests");
        this.connection = httpURLConnection;
        this.requests = pVar;
    }

    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (C13080a.m20762b(this)) {
            return null;
        }
        try {
            return doInBackground((Void[]) objArr);
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return null;
        }
    }

    public final Exception getException() {
        return this.exception;
    }

    public final C13426p getRequests() {
        return this.requests;
    }

    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (!C13080a.m20762b(this)) {
            try {
                onPostExecute((List<GraphResponse>) (List) obj);
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    public void onPreExecute() {
        if (!C13080a.m20762b(this)) {
            try {
                super.onPreExecute();
                if (C13418j.f29389i) {
                    String str = TAG;
                    String format = String.format("execute async task: %s", Arrays.copyOf(new Object[]{this}, 1));
                    C19383o.m32796f(format, "java.lang.String.format(format, *args)");
                    C12869i0.m20551G(str, format);
                }
                if (this.requests.f29411b == null) {
                    this.requests.f29411b = Thread.currentThread() instanceof HandlerThread ? new Handler() : new Handler(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    public String toString() {
        StringBuilder k = C0073e.m211k("{RequestAsyncTask: ", " connection: ");
        k.append(this.connection);
        k.append(", requests: ");
        k.append(this.requests);
        k.append("}");
        String sb = k.toString();
        C19383o.m32796f(sb, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return sb;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GraphRequestAsyncTask(GraphRequest... graphRequestArr) {
        this((HttpURLConnection) null, new C13426p((GraphRequest[]) Arrays.copyOf(graphRequestArr, graphRequestArr.length)));
        C19383o.m32797g(graphRequestArr, "requests");
    }

    public List<GraphResponse> doInBackground(Void... voidArr) {
        ArrayList arrayList;
        if (C13080a.m20762b(this)) {
            return null;
        }
        try {
            C19383o.m32797g(voidArr, ResponseConstants.PARAMS);
            HttpURLConnection httpURLConnection = this.connection;
            if (httpURLConnection == null) {
                C13426p pVar = this.requests;
                pVar.getClass();
                GraphRequest.f27224o.getClass();
                arrayList = GraphRequest.C12196c.m20003c(pVar);
            } else {
                GraphRequest.C12196c cVar = GraphRequest.f27224o;
                C13426p pVar2 = this.requests;
                cVar.getClass();
                arrayList = GraphRequest.C12196c.m20004d(httpURLConnection, pVar2);
            }
            return arrayList;
        } catch (Exception e) {
            this.exception = e;
            return null;
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return null;
        }
    }

    public void onPostExecute(List<GraphResponse> list) {
        if (!C13080a.m20762b(this)) {
            try {
                C19383o.m32797g(list, "result");
                super.onPostExecute(list);
                Exception exc = this.exception;
                if (exc != null) {
                    String str = TAG;
                    String format = String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1));
                    C19383o.m32796f(format, "java.lang.String.format(format, *args)");
                    C12869i0.m20551G(str, format);
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GraphRequestAsyncTask(Collection<GraphRequest> collection) {
        this((HttpURLConnection) null, new C13426p(collection));
        C19383o.m32797g(collection, "requests");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GraphRequestAsyncTask(C13426p pVar) {
        this((HttpURLConnection) null, pVar);
        C19383o.m32797g(pVar, "requests");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GraphRequestAsyncTask(HttpURLConnection httpURLConnection, GraphRequest... graphRequestArr) {
        this(httpURLConnection, new C13426p((GraphRequest[]) Arrays.copyOf(graphRequestArr, graphRequestArr.length)));
        C19383o.m32797g(graphRequestArr, "requests");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GraphRequestAsyncTask(HttpURLConnection httpURLConnection, Collection<GraphRequest> collection) {
        this(httpURLConnection, new C13426p(collection));
        C19383o.m32797g(collection, "requests");
    }
}

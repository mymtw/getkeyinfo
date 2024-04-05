package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;
import p576gn.C17801b;
import p592in.C17874f;
import p592in.C17876h;
import p616ln.C18208f;

public class FirebasePerfHttpClient {
    public FirebasePerfHttpClient() {
        throw null;
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) throws IOException {
        Timer timer = new Timer();
        C17801b b = C17801b.m29927b(C18208f.f39882t);
        try {
            b.mo69042j(httpUriRequest.getURI().toString());
            b.mo69035c(httpUriRequest.getMethod());
            Long a = C17876h.m30011a(httpUriRequest);
            if (a != null) {
                b.mo69037e(a.longValue());
            }
            timer.reset();
            b.mo69038f(timer.getMicros());
            HttpResponse execute = httpClient.execute(httpUriRequest);
            b.mo69041i(timer.getDurationMicros());
            b.mo69036d(execute.getStatusLine().getStatusCode());
            Long a2 = C17876h.m30011a(execute);
            if (a2 != null) {
                b.mo69040h(a2.longValue());
            }
            String b2 = C17876h.m30012b(execute);
            if (b2 != null) {
                b.mo69039g(b2);
            }
            b.mo69034a();
            return execute;
        } catch (IOException e) {
            b.mo69041i(timer.getDurationMicros());
            C17876h.m30013c(b);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        C17801b b = C17801b.m29927b(C18208f.f39882t);
        try {
            b.mo69042j(httpUriRequest.getURI().toString());
            b.mo69035c(httpUriRequest.getMethod());
            Long a = C17876h.m30011a(httpUriRequest);
            if (a != null) {
                b.mo69037e(a.longValue());
            }
            timer.reset();
            b.mo69038f(timer.getMicros());
            HttpResponse execute = httpClient.execute(httpUriRequest, httpContext);
            b.mo69041i(timer.getDurationMicros());
            b.mo69036d(execute.getStatusLine().getStatusCode());
            Long a2 = C17876h.m30011a(execute);
            if (a2 != null) {
                b.mo69040h(a2.longValue());
            }
            String b2 = C17876h.m30012b(execute);
            if (b2 != null) {
                b.mo69039g(b2);
            }
            b.mo69034a();
            return execute;
        } catch (IOException e) {
            b.mo69041i(timer.getDurationMicros());
            C17876h.m30013c(b);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) throws IOException {
        Timer timer = new Timer();
        C17801b b = C17801b.m29927b(C18208f.f39882t);
        try {
            b.mo69042j(httpUriRequest.getURI().toString());
            b.mo69035c(httpUriRequest.getMethod());
            Long a = C17876h.m30011a(httpUriRequest);
            if (a != null) {
                b.mo69037e(a.longValue());
            }
            timer.reset();
            b.mo69038f(timer.getMicros());
            return httpClient.execute(httpUriRequest, new C17874f(responseHandler, timer, b));
        } catch (IOException e) {
            b.mo69041i(timer.getDurationMicros());
            C17876h.m30013c(b);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        C17801b b = C17801b.m29927b(C18208f.f39882t);
        try {
            b.mo69042j(httpUriRequest.getURI().toString());
            b.mo69035c(httpUriRequest.getMethod());
            Long a = C17876h.m30011a(httpUriRequest);
            if (a != null) {
                b.mo69037e(a.longValue());
            }
            timer.reset();
            b.mo69038f(timer.getMicros());
            return httpClient.execute(httpUriRequest, new C17874f(responseHandler, timer, b), httpContext);
        } catch (IOException e) {
            b.mo69041i(timer.getDurationMicros());
            C17876h.m30013c(b);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        Timer timer = new Timer();
        C17801b b = C17801b.m29927b(C18208f.f39882t);
        try {
            b.mo69042j(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            b.mo69035c(httpRequest.getRequestLine().getMethod());
            Long a = C17876h.m30011a(httpRequest);
            if (a != null) {
                b.mo69037e(a.longValue());
            }
            timer.reset();
            b.mo69038f(timer.getMicros());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest);
            b.mo69041i(timer.getDurationMicros());
            b.mo69036d(execute.getStatusLine().getStatusCode());
            Long a2 = C17876h.m30011a(execute);
            if (a2 != null) {
                b.mo69040h(a2.longValue());
            }
            String b2 = C17876h.m30012b(execute);
            if (b2 != null) {
                b.mo69039g(b2);
            }
            b.mo69034a();
            return execute;
        } catch (IOException e) {
            b.mo69041i(timer.getDurationMicros());
            C17876h.m30013c(b);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        C17801b b = C17801b.m29927b(C18208f.f39882t);
        try {
            b.mo69042j(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            b.mo69035c(httpRequest.getRequestLine().getMethod());
            Long a = C17876h.m30011a(httpRequest);
            if (a != null) {
                b.mo69037e(a.longValue());
            }
            timer.reset();
            b.mo69038f(timer.getMicros());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest, httpContext);
            b.mo69041i(timer.getDurationMicros());
            b.mo69036d(execute.getStatusLine().getStatusCode());
            Long a2 = C17876h.m30011a(execute);
            if (a2 != null) {
                b.mo69040h(a2.longValue());
            }
            String b2 = C17876h.m30012b(execute);
            if (b2 != null) {
                b.mo69039g(b2);
            }
            b.mo69034a();
            return execute;
        } catch (IOException e) {
            b.mo69041i(timer.getDurationMicros());
            C17876h.m30013c(b);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        Timer timer = new Timer();
        C17801b b = C17801b.m29927b(C18208f.f39882t);
        try {
            b.mo69042j(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            b.mo69035c(httpRequest.getRequestLine().getMethod());
            Long a = C17876h.m30011a(httpRequest);
            if (a != null) {
                b.mo69037e(a.longValue());
            }
            timer.reset();
            b.mo69038f(timer.getMicros());
            return httpClient.execute(httpHost, httpRequest, new C17874f(responseHandler, timer, b));
        } catch (IOException e) {
            b.mo69041i(timer.getDurationMicros());
            C17876h.m30013c(b);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        C17801b b = C17801b.m29927b(C18208f.f39882t);
        try {
            b.mo69042j(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            b.mo69035c(httpRequest.getRequestLine().getMethod());
            Long a = C17876h.m30011a(httpRequest);
            if (a != null) {
                b.mo69037e(a.longValue());
            }
            timer.reset();
            b.mo69038f(timer.getMicros());
            return httpClient.execute(httpHost, httpRequest, new C17874f(responseHandler, timer, b), httpContext);
        } catch (IOException e) {
            b.mo69041i(timer.getDurationMicros());
            C17876h.m30013c(b);
            throw e;
        }
    }
}

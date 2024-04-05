package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import p576gn.C17801b;
import p592in.C17871c;
import p592in.C17872d;
import p592in.C17876h;
import p616ln.C18208f;

public class FirebasePerfUrlConnection {
    public FirebasePerfUrlConnection() {
        throw null;
    }

    @Keep
    public static Object getContent(URL url) throws IOException {
        C18208f fVar = C18208f.f39882t;
        Timer timer = new Timer();
        timer.reset();
        long micros = timer.getMicros();
        C17801b bVar = new C17801b(fVar);
        try {
            URLConnection openConnection = url.openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                return new C17872d((HttpsURLConnection) openConnection, timer, bVar).getContent();
            }
            if (openConnection instanceof HttpURLConnection) {
                return new C17871c((HttpURLConnection) openConnection, timer, bVar).getContent();
            }
            return openConnection.getContent();
        } catch (IOException e) {
            bVar.mo69038f(micros);
            bVar.mo69041i(timer.getDurationMicros());
            bVar.mo69042j(url.toString());
            C17876h.m30013c(bVar);
            throw e;
        }
    }

    @Keep
    public static Object instrument(Object obj) throws IOException {
        return obj instanceof HttpsURLConnection ? new C17872d((HttpsURLConnection) obj, new Timer(), new C17801b(C18208f.f39882t)) : obj instanceof HttpURLConnection ? new C17871c((HttpURLConnection) obj, new Timer(), new C17801b(C18208f.f39882t)) : obj;
    }

    @Keep
    public static InputStream openStream(URL url) throws IOException {
        C18208f fVar = C18208f.f39882t;
        Timer timer = new Timer();
        timer.reset();
        long micros = timer.getMicros();
        C17801b bVar = new C17801b(fVar);
        try {
            URLConnection openConnection = url.openConnection();
            return openConnection instanceof HttpsURLConnection ? new C17872d((HttpsURLConnection) openConnection, timer, bVar).getInputStream() : openConnection instanceof HttpURLConnection ? new C17871c((HttpURLConnection) openConnection, timer, bVar).getInputStream() : openConnection.getInputStream();
        } catch (IOException e) {
            bVar.mo69038f(micros);
            bVar.mo69041i(timer.getDurationMicros());
            bVar.mo69042j(url.toString());
            C17876h.m30013c(bVar);
            throw e;
        }
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) throws IOException {
        C18208f fVar = C18208f.f39882t;
        Timer timer = new Timer();
        timer.reset();
        long micros = timer.getMicros();
        C17801b bVar = new C17801b(fVar);
        try {
            URLConnection openConnection = url.openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                return new C17872d((HttpsURLConnection) openConnection, timer, bVar).getContent(clsArr);
            }
            if (openConnection instanceof HttpURLConnection) {
                return new C17871c((HttpURLConnection) openConnection, timer, bVar).getContent(clsArr);
            }
            return openConnection.getContent(clsArr);
        } catch (IOException e) {
            bVar.mo69038f(micros);
            bVar.mo69041i(timer.getDurationMicros());
            bVar.mo69042j(url.toString());
            C17876h.m30013c(bVar);
            throw e;
        }
    }
}

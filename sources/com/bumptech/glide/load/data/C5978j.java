package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.widget.C0326j;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.C5968d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import p036c5.C4414c;
import p036c5.C4421h;
import p197o4.C7575f;

/* renamed from: com.bumptech.glide.load.data.j */
public final class C5978j implements C5968d<InputStream> {

    /* renamed from: b */
    public final C7575f f12788b;

    /* renamed from: c */
    public final int f12789c;

    /* renamed from: d */
    public HttpURLConnection f12790d;

    /* renamed from: e */
    public InputStream f12791e;

    /* renamed from: f */
    public volatile boolean f12792f;

    /* renamed from: com.bumptech.glide.load.data.j$a */
    public static class C5979a {
    }

    static {
        new C5979a();
    }

    public C5978j(C7575f fVar, int i) {
        this.f12788b = fVar;
        this.f12789c = i;
    }

    /* renamed from: c */
    public static int m11824c(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e);
            return -1;
        }
    }

    /* renamed from: a */
    public final Class<InputStream> mo16848a() {
        return InputStream.class;
    }

    /* renamed from: b */
    public final void mo16851b() {
        InputStream inputStream = this.f12791e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f12790d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f12790d = null;
    }

    public final void cancel() {
        this.f12792f = true;
    }

    /* renamed from: d */
    public final DataSource mo16854d() {
        return DataSource.REMOTE;
    }

    /* renamed from: e */
    public final void mo16855e(Priority priority, C5968d.C5969a<? super InputStream> aVar) {
        int i = C4421h.f9699b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            aVar.mo16863f(mo16870f(this.f12788b.mo20011d(), 0, (URL) null, this.f12788b.f16830b.mo20013a()));
            if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                return;
            }
        } catch (IOException e) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e);
            }
            aVar.mo16862c(e);
            if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                return;
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                C4421h.m10119a(elapsedRealtimeNanos);
            }
            throw th;
        }
        C4421h.m10119a(elapsedRealtimeNanos);
    }

    /* renamed from: f */
    public final InputStream mo16870f(URL url, int i, URL url2, Map<String, String> map) throws HttpException {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new HttpException("In re-direct loop", -1);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            boolean z = false;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                for (Map.Entry next : map.entrySet()) {
                    httpURLConnection.addRequestProperty((String) next.getKey(), (String) next.getValue());
                }
                httpURLConnection.setConnectTimeout(this.f12789c);
                httpURLConnection.setReadTimeout(this.f12789c);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                this.f12790d = httpURLConnection;
                try {
                    httpURLConnection.connect();
                    this.f12791e = this.f12790d.getInputStream();
                    if (this.f12792f) {
                        return null;
                    }
                    int c = m11824c(this.f12790d);
                    int i2 = c / 100;
                    if (i2 == 2) {
                        HttpURLConnection httpURLConnection2 = this.f12790d;
                        try {
                            if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                                this.f12791e = new C4414c(httpURLConnection2.getInputStream(), (long) httpURLConnection2.getContentLength());
                            } else {
                                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                                }
                                this.f12791e = httpURLConnection2.getInputStream();
                            }
                            return this.f12791e;
                        } catch (IOException e) {
                            throw new HttpException("Failed to obtain InputStream", m11824c(httpURLConnection2), e);
                        }
                    } else {
                        if (i2 == 3) {
                            z = true;
                        }
                        if (z) {
                            String headerField = this.f12790d.getHeaderField("Location");
                            if (!TextUtils.isEmpty(headerField)) {
                                try {
                                    URL url3 = new URL(url, headerField);
                                    mo16851b();
                                    return mo16870f(url3, i + 1, url, map);
                                } catch (MalformedURLException e2) {
                                    throw new HttpException(C0326j.m864i("Bad redirect url: ", headerField), c, e2);
                                }
                            } else {
                                throw new HttpException("Received empty or null redirect url", c);
                            }
                        } else if (c == -1) {
                            throw new HttpException(c);
                        } else {
                            try {
                                throw new HttpException(this.f12790d.getResponseMessage(), c);
                            } catch (IOException e3) {
                                throw new HttpException("Failed to get a response message", c, e3);
                            }
                        }
                    }
                } catch (IOException e4) {
                    throw new HttpException("Failed to connect or obtain data", m11824c(this.f12790d), e4);
                }
            } catch (IOException e5) {
                throw new HttpException("URL.openConnection threw", 0, e5);
            }
        } else {
            throw new HttpException("Too many (> 5) redirects!", -1);
        }
    }
}

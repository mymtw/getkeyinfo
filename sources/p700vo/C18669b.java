package p700vo;

import android.net.Uri;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import p568fn.C17782b;

/* renamed from: vo.b */
public final class C18669b implements C18668a {

    /* renamed from: a */
    public static final C18669b f41282a = new C18669b();

    /* renamed from: b */
    public static final int f41283b;

    /* renamed from: c */
    public static final int f41284c;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f41283b = (int) timeUnit.toMillis(15);
        f41284c = (int) timeUnit.toMillis(10);
    }

    /* renamed from: a */
    public final HttpURLConnection mo70181a(Uri uri) {
        if (uri != null) {
            C17782b.m29832B("https".equals(uri.getScheme()), "only https connections are permitted");
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
            httpURLConnection.setConnectTimeout(f41283b);
            httpURLConnection.setReadTimeout(f41284c);
            httpURLConnection.setInstanceFollowRedirects(false);
            return httpURLConnection;
        }
        throw new NullPointerException("url must not be null");
    }
}

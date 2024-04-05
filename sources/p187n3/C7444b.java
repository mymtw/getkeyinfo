package p187n3;

import android.content.Context;
import android.support.p013v4.media.C0072d;
import com.airbnb.lottie.C4828c;
import com.airbnb.lottie.C4829d;
import com.airbnb.lottie.C4841l;
import com.airbnb.lottie.network.FileExtension;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.ZipInputStream;
import p206p3.C7656b;
import p206p3.C7659e;

/* renamed from: n3.b */
public final class C7444b {

    /* renamed from: a */
    public final String f16629a;

    /* renamed from: b */
    public final C7443a f16630b;

    public C7444b(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        this.f16629a = str;
        this.f16630b = new C7443a(applicationContext, str);
    }

    /* renamed from: b */
    public static String m14378b(HttpURLConnection httpURLConnection) throws IOException {
        httpURLConnection.getResponseCode();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append(10);
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e) {
                throw e;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        return sb.toString();
    }

    /* renamed from: a */
    public final C4841l mo19817a() throws IOException {
        C7656b.m14694a();
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f16629a).openConnection();
        httpURLConnection.setRequestMethod("GET");
        try {
            httpURLConnection.connect();
            if (httpURLConnection.getErrorStream() == null) {
                if (httpURLConnection.getResponseCode() == 200) {
                    C4841l<C4828c> c = mo19818c(httpURLConnection);
                    V v = c.f10902a;
                    C7656b.m14694a();
                    httpURLConnection.disconnect();
                    return c;
                }
            }
            String b = m14378b(httpURLConnection);
            return new C4841l((Throwable) new IllegalArgumentException("Unable to fetch " + this.f16629a + ". Failed with " + httpURLConnection.getResponseCode() + "\n" + b));
        } catch (Exception e) {
            return new C4841l((Throwable) e);
        } finally {
            httpURLConnection.disconnect();
        }
    }

    /* renamed from: c */
    public final C4841l<C4828c> mo19818c(HttpURLConnection httpURLConnection) throws IOException {
        C4841l<C4828c> lVar;
        FileExtension fileExtension;
        String contentType = httpURLConnection.getContentType();
        if (contentType == null) {
            contentType = "application/json";
        }
        if (contentType.contains("application/zip")) {
            C7656b.m14694a();
            fileExtension = FileExtension.ZIP;
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(this.f16630b.mo19816b(httpURLConnection.getInputStream(), fileExtension)));
            try {
                lVar = C4829d.m10422e(zipInputStream, this.f16629a);
            } finally {
                C7659e.m14701b(zipInputStream);
            }
        } else {
            C7656b.m14694a();
            fileExtension = FileExtension.JSON;
            lVar = C4829d.m10419b(new FileInputStream(new File(this.f16630b.mo19816b(httpURLConnection.getInputStream(), fileExtension).getAbsolutePath())), this.f16629a);
        }
        if (lVar.f10902a != null) {
            C7443a aVar = this.f16630b;
            File file = new File(aVar.f16627a.getCacheDir(), C7443a.m14376a(aVar.f16628b, fileExtension, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean renameTo = file.renameTo(file2);
            file2.toString();
            C7656b.m14694a();
            if (!renameTo) {
                StringBuilder h = C0072d.m201h("Unable to rename cache file ");
                h.append(file.getAbsolutePath());
                h.append(" to ");
                h.append(file2.getAbsolutePath());
                h.append(".");
                C7656b.m14695b(h.toString());
            }
        }
        return lVar;
    }
}

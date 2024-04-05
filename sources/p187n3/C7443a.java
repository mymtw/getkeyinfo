package p187n3;

import android.content.Context;
import android.support.p013v4.media.C0072d;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.network.FileExtension;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: n3.a */
public final class C7443a {

    /* renamed from: a */
    public final Context f16627a;

    /* renamed from: b */
    public final String f16628b;

    public C7443a(Context context, String str) {
        this.f16627a = context.getApplicationContext();
        this.f16628b = str;
    }

    /* renamed from: a */
    public static String m14376a(String str, FileExtension fileExtension, boolean z) {
        StringBuilder h = C0072d.m201h("lottie_cache_");
        h.append(str.replaceAll("\\W+", ""));
        h.append(z ? fileExtension.tempExtension() : fileExtension.extension);
        return h.toString();
    }

    /* renamed from: b */
    public final File mo19816b(InputStream inputStream, FileExtension fileExtension) throws IOException {
        FileOutputStream fileOutputStream;
        File file = new File(this.f16627a.getCacheDir(), m14376a(this.f16628b, fileExtension, true));
        try {
            fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    inputStream.close();
                    return file;
                }
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }
}

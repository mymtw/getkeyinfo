package p030bo.app;

import android.support.p013v4.media.C0072d;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import p030bo.app.C3971n0;

/* renamed from: bo.app.t0 */
final class C4207t0 {

    /* renamed from: a */
    public final String f9336a;

    /* renamed from: b */
    public final long[] f9337b;

    /* renamed from: c */
    public boolean f9338c;

    /* renamed from: d */
    public C3971n0.C3974c f9339d;

    /* renamed from: e */
    public long f9340e;

    /* renamed from: f */
    private final int f9341f;

    /* renamed from: g */
    private final File f9342g;

    public C4207t0(String str, int i, File file) {
        this.f9336a = str;
        this.f9341f = i;
        this.f9342g = file;
        this.f9337b = new long[i];
    }

    /* renamed from: a */
    public String mo14103a() {
        StringBuilder sb = new StringBuilder();
        for (long append : this.f9337b) {
            sb.append(' ');
            sb.append(append);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public void mo14105b(String[] strArr) {
        if (strArr.length == this.f9341f) {
            int i = 0;
            while (i < strArr.length) {
                try {
                    this.f9337b[i] = Long.parseLong(strArr[i]);
                    i++;
                } catch (NumberFormatException unused) {
                    throw mo14102a(strArr);
                }
            }
            return;
        }
        throw mo14102a(strArr);
    }

    /* renamed from: a */
    public IOException mo14102a(String[] strArr) {
        StringBuilder h = C0072d.m201h("unexpected journal line: ");
        h.append(Arrays.toString(strArr));
        throw new IOException(h.toString());
    }

    /* renamed from: b */
    public File mo14104b(int i) {
        File file = this.f9342g;
        return new File(file, this.f9336a + "." + i + ".tmp");
    }

    /* renamed from: a */
    public File mo14101a(int i) {
        File file = this.f9342g;
        return new File(file, this.f9336a + "." + i);
    }
}

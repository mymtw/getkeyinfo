package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* renamed from: androidx.fragment.app.l0 */
public final class C2773l0 extends Writer {

    /* renamed from: b */
    public final String f6321b = "FragmentManager";

    /* renamed from: c */
    public StringBuilder f6322c = new StringBuilder(128);

    /* renamed from: a */
    public final void mo10578a() {
        if (this.f6322c.length() > 0) {
            Log.d(this.f6321b, this.f6322c.toString());
            StringBuilder sb = this.f6322c;
            sb.delete(0, sb.length());
        }
    }

    public final void close() {
        mo10578a();
    }

    public final void flush() {
        mo10578a();
    }

    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                mo10578a();
            } else {
                this.f6322c.append(c);
            }
        }
    }
}

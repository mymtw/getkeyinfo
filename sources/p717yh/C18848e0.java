package p717yh;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p513bj.C14077r;
import p513bj.C14086y;
import p644ph.C18351j;

/* renamed from: yh.e0 */
public interface C18848e0 {

    /* renamed from: yh.e0$a */
    public static final class C18849a {

        /* renamed from: a */
        public final String f41787a;

        /* renamed from: b */
        public final byte[] f41788b;

        public C18849a(String str, byte[] bArr) {
            this.f41787a = str;
            this.f41788b = bArr;
        }
    }

    /* renamed from: yh.e0$b */
    public static final class C18850b {

        /* renamed from: a */
        public final String f41789a;

        /* renamed from: b */
        public final List<C18849a> f41790b;

        /* renamed from: c */
        public final byte[] f41791c;

        public C18850b(int i, String str, ArrayList arrayList, byte[] bArr) {
            this.f41789a = str;
            this.f41790b = arrayList == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
            this.f41791c = bArr;
        }
    }

    /* renamed from: yh.e0$c */
    public interface C18851c {
        /* renamed from: a */
        C18848e0 mo70292a(int i, C18850b bVar);
    }

    /* renamed from: yh.e0$d */
    public static final class C18852d {

        /* renamed from: a */
        public final String f41792a;

        /* renamed from: b */
        public final int f41793b;

        /* renamed from: c */
        public final int f41794c;

        /* renamed from: d */
        public int f41795d;

        /* renamed from: e */
        public String f41796e;

        public C18852d(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        /* renamed from: a */
        public final void mo70293a() {
            int i = this.f41795d;
            int i2 = i == Integer.MIN_VALUE ? this.f41793b : i + this.f41794c;
            this.f41795d = i2;
            String str = this.f41792a;
            this.f41796e = C0072d.m200g(C0391c.m1055a(str, 11), str, i2);
        }

        /* renamed from: b */
        public final void mo70294b() {
            if (this.f41795d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public C18852d(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                StringBuilder sb = new StringBuilder(12);
                sb.append(i);
                sb.append("/");
                str = sb.toString();
            } else {
                str = "";
            }
            this.f41792a = str;
            this.f41793b = i2;
            this.f41794c = i3;
            this.f41795d = Integer.MIN_VALUE;
            this.f41796e = "";
        }
    }

    /* renamed from: a */
    void mo70289a(int i, C14077r rVar) throws ParserException;

    /* renamed from: b */
    void mo70290b(C14086y yVar, C18351j jVar, C18852d dVar);

    /* renamed from: c */
    void mo70291c();
}

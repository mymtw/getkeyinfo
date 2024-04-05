package p701wh;

import androidx.compose.animation.C0391c;
import java.util.ArrayList;
import java.util.Arrays;
import p003a2.C0015b;
import p513bj.C14077r;

/* renamed from: wh.a */
public abstract class C18670a {

    /* renamed from: a */
    public final int f41285a;

    /* renamed from: wh.a$a */
    public static final class C18671a extends C18670a {

        /* renamed from: b */
        public final long f41286b;

        /* renamed from: c */
        public final ArrayList f41287c = new ArrayList();

        /* renamed from: d */
        public final ArrayList f41288d = new ArrayList();

        public C18671a(int i, long j) {
            super(i);
            this.f41286b = j;
        }

        /* renamed from: b */
        public final C18671a mo70183b(int i) {
            int size = this.f41288d.size();
            for (int i2 = 0; i2 < size; i2++) {
                C18671a aVar = (C18671a) this.f41288d.get(i2);
                if (aVar.f41285a == i) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: c */
        public final C18672b mo70184c(int i) {
            int size = this.f41287c.size();
            for (int i2 = 0; i2 < size; i2++) {
                C18672b bVar = (C18672b) this.f41287c.get(i2);
                if (bVar.f41285a == i) {
                    return bVar;
                }
            }
            return null;
        }

        public final String toString() {
            String a = C18670a.m31498a(this.f41285a);
            String arrays = Arrays.toString(this.f41287c.toArray());
            String arrays2 = Arrays.toString(this.f41288d.toArray());
            StringBuilder k = C0015b.m92k(C0391c.m1055a(arrays2, C0391c.m1055a(arrays, C0391c.m1055a(a, 22))), a, " leaves: ", arrays, " containers: ");
            k.append(arrays2);
            return k.toString();
        }
    }

    /* renamed from: wh.a$b */
    public static final class C18672b extends C18670a {

        /* renamed from: b */
        public final C14077r f41289b;

        public C18672b(int i, C14077r rVar) {
            super(i);
            this.f41289b = rVar;
        }
    }

    public C18670a(int i) {
        this.f41285a = i;
    }

    /* renamed from: a */
    public static String m31498a(int i) {
        StringBuilder sb = new StringBuilder(4);
        sb.append((char) ((i >> 24) & 255));
        sb.append((char) ((i >> 16) & 255));
        sb.append((char) ((i >> 8) & 255));
        sb.append((char) (i & 255));
        return sb.toString();
    }

    public String toString() {
        return m31498a(this.f41285a);
    }
}

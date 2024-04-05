package p030bo.app;

import com.google.android.exoplayer2.p526ui.C14416b;
import java.util.Comparator;

/* renamed from: bo.app.c7 */
public final /* synthetic */ class C3607c7 implements Comparator {

    /* renamed from: b */
    public final /* synthetic */ int f8305b;

    public /* synthetic */ C3607c7(int i) {
        this.f8305b = i;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.f8305b) {
            case 0:
                return C3784i6.m8830a((C4275x2) obj, (C4275x2) obj2);
            default:
                C14416b.C14418b bVar = (C14416b.C14418b) obj;
                C14416b.C14418b bVar2 = (C14416b.C14418b) obj2;
                int compare = Integer.compare(bVar2.f32459a, bVar.f32459a);
                if (compare != 0) {
                    return compare;
                }
                int compareTo = bVar2.f32461c.compareTo(bVar.f32461c);
                return compareTo != 0 ? compareTo : bVar2.f32462d.compareTo(bVar.f32462d);
        }
    }
}

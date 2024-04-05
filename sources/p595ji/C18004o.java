package p595ji;

import android.util.SparseArray;
import androidx.room.C3221c;
import com.google.android.exoplayer2.source.C14368p;
import p513bj.C14052d;
import p513bj.C14075p;

/* renamed from: ji.o */
public final class C18004o<V> {

    /* renamed from: a */
    public int f39386a;

    /* renamed from: b */
    public final SparseArray<V> f39387b = new SparseArray<>();

    /* renamed from: c */
    public final C14052d<V> f39388c;

    public C18004o(C3221c cVar) {
        this.f39388c = cVar;
        this.f39386a = -1;
    }

    /* renamed from: a */
    public final void mo69574a(int i, C14368p.C14370b bVar) {
        boolean z = false;
        if (this.f39386a == -1) {
            C14075p.m21694f(this.f39387b.size() == 0);
            this.f39386a = 0;
        }
        if (this.f39387b.size() > 0) {
            SparseArray<V> sparseArray = this.f39387b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            if (i >= keyAt) {
                z = true;
            }
            C14075p.m21691c(z);
            if (keyAt == i) {
                C14052d<V> dVar = this.f39388c;
                SparseArray<V> sparseArray2 = this.f39387b;
                dVar.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f39387b.append(i, bVar);
    }

    /* renamed from: b */
    public final V mo69575b(int i) {
        if (this.f39386a == -1) {
            this.f39386a = 0;
        }
        while (true) {
            int i2 = this.f39386a;
            if (i2 > 0 && i < this.f39387b.keyAt(i2)) {
                this.f39386a--;
            }
        }
        while (this.f39386a < this.f39387b.size() - 1 && i >= this.f39387b.keyAt(this.f39386a + 1)) {
            this.f39386a++;
        }
        return this.f39387b.valueAt(this.f39386a);
    }
}

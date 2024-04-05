package p678ti;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p513bj.C14049b0;
import p513bj.C14075p;
import p636oi.C18296a;
import p636oi.C18300d;

/* renamed from: ti.d */
public final class C18556d implements C18300d {

    /* renamed from: b */
    public final List<List<C18296a>> f40865b;

    /* renamed from: c */
    public final List<Long> f40866c;

    public C18556d(ArrayList arrayList, ArrayList arrayList2) {
        this.f40865b = arrayList;
        this.f40866c = arrayList2;
    }

    /* renamed from: a */
    public final int mo69841a(long j) {
        int i;
        List<Long> list = this.f40866c;
        Long valueOf = Long.valueOf(j);
        int i2 = C14049b0.f30913a;
        int binarySearch = Collections.binarySearch(list, valueOf);
        if (binarySearch < 0) {
            i = ~binarySearch;
        } else {
            int size = list.size();
            do {
                binarySearch++;
                if (binarySearch >= size || list.get(binarySearch).compareTo(valueOf) != 0) {
                    i = binarySearch;
                }
                binarySearch++;
                break;
            } while (list.get(binarySearch).compareTo(valueOf) != 0);
            i = binarySearch;
        }
        if (i < this.f40866c.size()) {
            return i;
        }
        return -1;
    }

    /* renamed from: c */
    public final List<C18296a> mo69842c(long j) {
        int c = C14049b0.m21630c(this.f40866c, Long.valueOf(j), false);
        return c == -1 ? Collections.emptyList() : this.f40865b.get(c);
    }

    /* renamed from: e */
    public final long mo69843e(int i) {
        boolean z = true;
        C14075p.m21691c(i >= 0);
        if (i >= this.f40866c.size()) {
            z = false;
        }
        C14075p.m21691c(z);
        return this.f40866c.get(i).longValue();
    }

    /* renamed from: f */
    public final int mo69844f() {
        return this.f40866c.size();
    }
}

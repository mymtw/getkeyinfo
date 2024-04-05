package p125h3;

import com.airbnb.lottie.model.content.Mask;
import java.util.ArrayList;
import java.util.List;

/* renamed from: h3.g */
public final class C6935g {

    /* renamed from: a */
    public final ArrayList f15361a;

    /* renamed from: b */
    public final ArrayList f15362b;

    /* renamed from: c */
    public final List<Mask> f15363c;

    public C6935g(List<Mask> list) {
        this.f15363c = list;
        this.f15361a = new ArrayList(list.size());
        this.f15362b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.f15361a.add(list.get(i).f10917b.mo19485a());
            this.f15362b.add(list.get(i).f10918c.mo19485a());
        }
    }
}

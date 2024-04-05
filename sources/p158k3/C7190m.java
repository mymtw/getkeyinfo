package p158k3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p214q3.C7718a;

/* renamed from: k3.m */
public abstract class C7190m implements C7189l {

    /* renamed from: b */
    public final /* synthetic */ int f15968b;

    /* renamed from: c */
    public Object f15969c;

    public /* synthetic */ C7190m(List list, int i) {
        this.f15968b = i;
        this.f15969c = list;
    }

    /* renamed from: b */
    public final List mo19486b() {
        return (List) this.f15969c;
    }

    /* renamed from: c */
    public final boolean mo19487c() {
        return ((List) this.f15969c).isEmpty() || (((List) this.f15969c).size() == 1 && ((C7718a) ((List) this.f15969c).get(0)).mo20191c());
    }

    public final String toString() {
        switch (this.f15968b) {
            case 0:
                StringBuilder sb = new StringBuilder();
                if (!((List) this.f15969c).isEmpty()) {
                    sb.append("values=");
                    sb.append(Arrays.toString(((List) this.f15969c).toArray()));
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C7190m(Float f) {
        this(Collections.singletonList(new C7718a(f)), 0);
        this.f15968b = 0;
    }
}

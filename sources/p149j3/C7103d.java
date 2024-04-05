package p149j3;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: j3.d */
public final class C7103d {

    /* renamed from: a */
    public final List<String> f15803a;

    /* renamed from: b */
    public C7104e f15804b;

    public C7103d(String... strArr) {
        this.f15803a = Arrays.asList(strArr);
    }

    /* renamed from: a */
    public final boolean mo19431a(int i, String str) {
        if (i >= this.f15803a.size()) {
            return false;
        }
        boolean z = i == this.f15803a.size() - 1;
        String str2 = this.f15803a.get(i);
        if (!str2.equals("**")) {
            boolean z2 = str2.equals(str) || str2.equals("*");
            if (!z) {
                if (i != this.f15803a.size() - 2) {
                    return false;
                }
                List<String> list = this.f15803a;
                if (!list.get(list.size() - 1).equals("**")) {
                    return false;
                }
            }
            return z2;
        }
        if (!z && this.f15803a.get(i + 1).equals(str)) {
            if (i != this.f15803a.size() - 2) {
                if (i != this.f15803a.size() - 3) {
                    return false;
                }
                List<String> list2 = this.f15803a;
                if (!list2.get(list2.size() - 1).equals("**")) {
                    return false;
                }
            }
            return true;
        } else if (z) {
            return true;
        } else {
            int i2 = i + 1;
            if (i2 < this.f15803a.size() - 1) {
                return false;
            }
            return this.f15803a.get(i2).equals(str);
        }
    }

    /* renamed from: b */
    public final int mo19432b(int i, String str) {
        if ("__container".equals(str)) {
            return 0;
        }
        if (!this.f15803a.get(i).equals("**")) {
            return 1;
        }
        return (i != this.f15803a.size() - 1 && this.f15803a.get(i + 1).equals(str)) ? 2 : 0;
    }

    /* renamed from: c */
    public final boolean mo19433c(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        if (i >= this.f15803a.size()) {
            return false;
        }
        return this.f15803a.get(i).equals(str) || this.f15803a.get(i).equals("**") || this.f15803a.get(i).equals("*");
    }

    /* renamed from: d */
    public final boolean mo19434d(int i, String str) {
        return "__container".equals(str) || i < this.f15803a.size() - 1 || this.f15803a.get(i).equals("**");
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("KeyPath{keys=");
        h.append(this.f15803a);
        h.append(",resolved=");
        return C0391c.m1058d(h, this.f15804b != null, '}');
    }

    public C7103d(C7103d dVar) {
        this.f15803a = new ArrayList(dVar.f15803a);
        this.f15804b = dVar.f15804b;
    }
}

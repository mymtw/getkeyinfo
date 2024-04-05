package p100f2;

import androidx.slice.SliceItem;
import java.util.List;
import p100f2.C6777c;

/* renamed from: f2.b */
public final class C6776b implements C6777c.C6779b<SliceItem> {

    /* renamed from: a */
    public final /* synthetic */ String f14912a = "slice";

    /* renamed from: b */
    public final /* synthetic */ String[] f14913b;

    /* renamed from: c */
    public final /* synthetic */ String[] f14914c;

    public C6776b(String[] strArr) {
        this.f14913b = strArr;
        this.f14914c = null;
    }

    /* renamed from: a */
    public final boolean mo18916a(Object obj) {
        boolean z;
        SliceItem sliceItem = (SliceItem) obj;
        String str = this.f14912a;
        if (!(str == null || str.equals(sliceItem.f7609b)) || !C6777c.m13167b(sliceItem, this.f14913b)) {
            return false;
        }
        String[] strArr = this.f14914c;
        if (strArr != null) {
            List<String> c = sliceItem.mo12110c();
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (c.contains(strArr[i])) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        z = false;
        return !z;
    }
}

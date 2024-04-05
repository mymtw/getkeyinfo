package p100f2;

import android.text.TextUtils;
import androidx.slice.Slice;
import androidx.slice.SliceItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: f2.c */
public final class C6777c {

    /* renamed from: f2.c$a */
    public static class C6778a implements C6779b<SliceItem> {

        /* renamed from: a */
        public final /* synthetic */ String f14915a;

        /* renamed from: b */
        public final /* synthetic */ String[] f14916b;

        /* renamed from: c */
        public final /* synthetic */ String[] f14917c;

        public C6778a(String str, String[] strArr, String[] strArr2) {
            this.f14915a = str;
            this.f14916b = strArr;
            this.f14917c = strArr2;
        }

        /* renamed from: a */
        public final boolean mo18916a(Object obj) {
            boolean z;
            SliceItem sliceItem = (SliceItem) obj;
            String str = this.f14915a;
            if (!(str == null || str.equals(sliceItem.f7609b)) || !C6777c.m13167b(sliceItem, this.f14916b)) {
                return false;
            }
            String[] strArr = this.f14917c;
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

    /* renamed from: f2.c$b */
    public interface C6779b<T> {
        /* renamed from: a */
        boolean mo18916a(T t);
    }

    /* renamed from: a */
    public static SliceItem m13166a(Slice slice, String str, String[] strArr, String[] strArr2) {
        SliceItem sliceItem;
        Object obj;
        Object obj2;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(slice.f7600b));
        C6780d dVar = new C6780d(arrayList);
        C6778a aVar = new C6778a(str, strArr, strArr2);
        while (true) {
            sliceItem = null;
            if (!dVar.hasNext()) {
                obj = null;
                break;
            }
            obj = dVar.next();
            if (aVar.mo18916a(obj)) {
                break;
            }
        }
        while (true) {
            if (!(obj != null)) {
                break;
            }
            while (true) {
                if (!dVar.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = dVar.next();
                if (aVar.mo18916a(obj2)) {
                    break;
                }
            }
            if (obj != null) {
                sliceItem = obj;
                break;
            }
            obj = obj2;
        }
        return sliceItem;
    }

    /* renamed from: b */
    public static boolean m13167b(SliceItem sliceItem, String... strArr) {
        if (strArr == null) {
            return true;
        }
        List<String> c = sliceItem.mo12110c();
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str) && !c.contains(str)) {
                return false;
            }
        }
        return true;
    }
}

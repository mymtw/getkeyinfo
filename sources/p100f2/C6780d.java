package p100f2;

import androidx.slice.SliceItem;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: f2.d */
public final class C6780d implements Iterator<SliceItem> {

    /* renamed from: b */
    public final /* synthetic */ ArrayList f14918b;

    public C6780d(ArrayList arrayList) {
        this.f14918b = arrayList;
    }

    public final boolean hasNext() {
        return this.f14918b.size() != 0;
    }

    public final Object next() {
        SliceItem sliceItem = (SliceItem) this.f14918b.remove(0);
        if ("slice".equals(sliceItem.f7609b) || ResponseConstants.ACTION.equals(sliceItem.f7609b)) {
            this.f14918b.addAll(Arrays.asList(sliceItem.mo12111d().f7600b));
        }
        return sliceItem;
    }
}

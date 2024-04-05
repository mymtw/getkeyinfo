package p472wb;

import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.logger.C8698l;
import kotlin.jvm.internal.C19383o;
import p439rf.C13364c;

/* renamed from: wb.c */
public final class C13805c extends RecyclerView.C3108s {

    /* renamed from: b */
    public final /* synthetic */ C13364c f30415b;

    /* renamed from: c */
    public final /* synthetic */ C13364c.C13365a<C8698l> f30416c;

    public C13805c(C13364c cVar, C13806d dVar) {
        this.f30415b = cVar;
        this.f30416c = dVar;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        C19383o.m32797g(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        this.f30415b.f29296c = i;
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [androidx.recyclerview.widget.RecyclerView$o] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onScrolled(androidx.recyclerview.widget.RecyclerView r9, int r10, int r11) {
        /*
            r8 = this;
            java.lang.String r0 = "recyclerView"
            kotlin.jvm.internal.C19383o.m32797g(r9, r0)
            super.onScrolled(r9, r10, r11)
            rf.c r10 = r8.f30415b
            rf.c$a<com.etsy.android.lib.logger.l> r11 = r8.f30416c
            int r0 = r10.f29296c
            if (r0 != 0) goto L_0x0012
            goto L_0x008b
        L_0x0012:
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r9.getAdapter()
            boolean r1 = r0 instanceof p415of.C13173c
            r2 = 0
            if (r1 == 0) goto L_0x001e
            of.c r0 = (p415of.C13173c) r0
            goto L_0x001f
        L_0x001e:
            r0 = r2
        L_0x001f:
            if (r0 != 0) goto L_0x0023
            goto L_0x008b
        L_0x0023:
            androidx.recyclerview.widget.RecyclerView$o r9 = r9.getLayoutManager()
            boolean r1 = r9 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r1 == 0) goto L_0x002e
            r2 = r9
            androidx.recyclerview.widget.GridLayoutManager r2 = (androidx.recyclerview.widget.GridLayoutManager) r2
        L_0x002e:
            if (r2 != 0) goto L_0x0031
            goto L_0x008b
        L_0x0031:
            int r9 = r2.mo11282S0()
            int r1 = r2.mo11284U0()
            java.util.List r2 = r0.getItems()
            java.lang.String r3 = "adapter.items"
            kotlin.jvm.internal.C19383o.m32796f(r2, r3)
            int r2 = p568fn.C17782b.m29859Y(r2)
            r3 = -1
            if (r9 == r3) goto L_0x008b
            if (r1 == r3) goto L_0x008b
            if (r2 != r3) goto L_0x004e
            goto L_0x008b
        L_0x004e:
            int r4 = r10.f29294a
            r5 = 1
            r6 = 0
            if (r4 != r3) goto L_0x0056
            r7 = r5
            goto L_0x0057
        L_0x0056:
            r7 = r6
        L_0x0057:
            if (r7 != 0) goto L_0x0063
            if (r4 > r2) goto L_0x0063
            java.lang.Object r4 = r0.getItem(r4)
            boolean r4 = r4 instanceof com.etsy.android.lib.logger.C8698l
            if (r4 != 0) goto L_0x0068
        L_0x0063:
            r10.f29294a = r3
            r10.f29295b = r6
            r9 = r6
        L_0x0068:
            int r3 = r10.f29294a
            if (r3 != r2) goto L_0x006d
            goto L_0x008b
        L_0x006d:
            if (r9 > r1) goto L_0x008b
        L_0x006f:
            java.lang.Object r3 = r0.getItem(r9)
            of.o r3 = (p415of.C13186o) r3
            boolean r4 = r3 instanceof com.etsy.android.lib.logger.C8698l
            if (r4 == 0) goto L_0x0082
            int r4 = r10.f29294a
            if (r9 <= r4) goto L_0x0082
            r11.mo33210a(r3)
            r10.f29294a = r9
        L_0x0082:
            if (r9 != r2) goto L_0x0086
            r10.f29295b = r5
        L_0x0086:
            if (r9 == r1) goto L_0x008b
            int r9 = r9 + 1
            goto L_0x006f
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p472wb.C13805c.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}

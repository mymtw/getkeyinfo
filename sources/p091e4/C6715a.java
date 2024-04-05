package p091e4;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.appboy.p043ui.C4940R;
import kotlin.jvm.internal.C19383o;

/* renamed from: e4.a */
public final class C6715a extends RecyclerView.C3099n {

    /* renamed from: a */
    public final int f14807a;

    /* renamed from: b */
    public final int f14808b;

    public C6715a(Context context) {
        Context applicationContext = context.getApplicationContext();
        C19383o.m32796f(applicationContext, "context.applicationContext");
        this.f14807a = applicationContext.getResources().getDimensionPixelSize(C4940R.dimen.com_braze_content_cards_divider_height);
        this.f14808b = applicationContext.getResources().getDimensionPixelSize(C4940R.dimen.com_braze_content_cards_max_width);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getItemOffsets(android.graphics.Rect r2, android.view.View r3, androidx.recyclerview.widget.RecyclerView r4, androidx.recyclerview.widget.RecyclerView.C3117y r5) {
        /*
            r1 = this;
            java.lang.String r0 = "itemViewOutputRect"
            kotlin.jvm.internal.C19383o.m32797g(r2, r0)
            java.lang.String r0 = "view"
            kotlin.jvm.internal.C19383o.m32797g(r3, r0)
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.C19383o.m32797g(r4, r0)
            java.lang.String r0 = "state"
            kotlin.jvm.internal.C19383o.m32797g(r5, r0)
            super.getItemOffsets(r2, r3, r4, r5)
            int r3 = r4.getChildAdapterPosition(r3)
            androidx.recyclerview.widget.RecyclerView$Adapter r5 = r4.getAdapter()
            boolean r5 = r5 instanceof com.braze.p044ui.contentcards.adapters.ContentCardAdapter
            r0 = 0
            if (r5 == 0) goto L_0x0042
            androidx.recyclerview.widget.RecyclerView$Adapter r5 = r4.getAdapter()
            if (r5 == 0) goto L_0x003a
            com.braze.ui.contentcards.adapters.ContentCardAdapter r5 = (com.braze.p044ui.contentcards.adapters.ContentCardAdapter) r5
            com.appboy.models.cards.Card r5 = r5.mo16241j(r3)
            if (r5 == 0) goto L_0x0042
            boolean r5 = r5.isControl()
            if (r5 == 0) goto L_0x0042
            r5 = 1
            goto L_0x0043
        L_0x003a:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "null cannot be cast to non-null type com.braze.ui.contentcards.adapters.ContentCardAdapter"
            r2.<init>(r3)
            throw r2
        L_0x0042:
            r5 = r0
        L_0x0043:
            if (r3 != 0) goto L_0x0048
            int r3 = r1.f14807a
            goto L_0x0049
        L_0x0048:
            r3 = r0
        L_0x0049:
            r2.top = r3
            if (r5 == 0) goto L_0x004f
            r3 = r0
            goto L_0x0051
        L_0x004f:
            int r3 = r1.f14807a
        L_0x0051:
            r2.bottom = r3
            int r3 = r4.getWidth()
            int r4 = r1.f14808b
            int r3 = r3 - r4
            int r3 = r3 / 2
            if (r3 >= 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r0 = r3
        L_0x0060:
            r2.left = r0
            r2.right = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p091e4.C6715a.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$y):void");
    }
}

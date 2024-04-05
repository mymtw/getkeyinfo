package p413od;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.p327ui.BOEActivity;
import com.etsy.android.p327ui.listing.C10156h;
import com.etsy.android.stylekit.views.CollageBottomSheet;
import com.etsy.android.stylekit.views.CollageTextView;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;

/* renamed from: od.e */
public final class C13161e {

    /* renamed from: a */
    public final C13573c f28942a;

    /* renamed from: b */
    public final C10156h f28943b;

    /* renamed from: c */
    public final CollageBottomSheet f28944c;

    /* renamed from: d */
    public final LinearLayoutManager f28945d = new LinearLayoutManager();

    /* renamed from: e */
    public final CollageTextView f28946e;

    /* renamed from: f */
    public final RecyclerView f28947f;

    /* renamed from: g */
    public C13154a f28948g;

    public C13161e(C13573c cVar, C10156h hVar, BOEActivity bOEActivity) {
        C19383o.m32797g(bOEActivity, "boeActivity");
        this.f28942a = cVar;
        this.f28943b = hVar;
        CollageBottomSheet collageBottomSheet = new CollageBottomSheet(bOEActivity);
        collageBottomSheet.setContentView((int) R.layout.layout_variation_options_bottom_sheet);
        this.f28944c = collageBottomSheet;
        this.f28946e = (CollageTextView) collageBottomSheet.findViewById(R.id.variation_title);
        this.f28947f = (RecyclerView) collageBottomSheet.findViewById(R.id.variation_options);
    }
}

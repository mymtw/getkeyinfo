package p420pc;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.stylekit.views.CollageBottomSheet;
import com.etsy.android.stylekit.views.CollageTextView;

/* renamed from: pc.a */
public final class C13212a {

    /* renamed from: a */
    public final CollageBottomSheet f29047a;

    /* renamed from: b */
    public final LinearLayoutManager f29048b = new LinearLayoutManager();

    /* renamed from: c */
    public final CollageTextView f29049c;

    /* renamed from: d */
    public final RecyclerView f29050d;

    public C13212a(Context context) {
        CollageBottomSheet collageBottomSheet = new CollageBottomSheet(context);
        collageBottomSheet.setContentView((int) R.layout.layout_variation_options_bottom_sheet);
        this.f29047a = collageBottomSheet;
        this.f29049c = (CollageTextView) collageBottomSheet.findViewById(R.id.variation_title);
        this.f29050d = (RecyclerView) collageBottomSheet.findViewById(R.id.variation_options);
    }
}

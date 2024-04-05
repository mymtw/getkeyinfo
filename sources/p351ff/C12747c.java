package p351ff;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.etsy.android.R;

/* renamed from: ff.c */
public final class C12747c {

    /* renamed from: a */
    public View f28161a;

    /* renamed from: b */
    public LinearLayout f28162b;

    /* renamed from: c */
    public TextView f28163c;

    /* renamed from: d */
    public int f28164d;

    /* renamed from: e */
    public int f28165e;

    /* renamed from: f */
    public int f28166f;

    public C12747c(View view) {
        View findViewById = view.findViewById(R.id.refund_view_group);
        this.f28161a = findViewById;
        if (findViewById == null) {
            this.f28161a = view.findViewById(R.id.refund_view);
        }
        this.f28162b = (LinearLayout) view.findViewById(R.id.refund_list_layout);
        this.f28163c = (TextView) view.findViewById(R.id.text_adjusted_total_value);
        this.f28164d = R.layout.list_item_refund_redesign;
        this.f28165e = R.id.text_refund_value;
        this.f28166f = R.id.refund_reason;
    }
}

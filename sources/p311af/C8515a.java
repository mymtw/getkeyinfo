package p311af;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.stylekit.views.ratings.CollageRatingView;
import com.etsy.android.uikit.view.ClickableImageView;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.C19383o;

/* renamed from: af.a */
public final class C8515a extends RecyclerView.C3084b0 {

    /* renamed from: j */
    public static final /* synthetic */ int f18530j = 0;

    /* renamed from: b */
    public final TextView f18531b;

    /* renamed from: c */
    public final ClickableImageView f18532c;

    /* renamed from: d */
    public final CollageRatingView f18533d;

    /* renamed from: e */
    public final TextView f18534e;

    /* renamed from: f */
    public final TextView f18535f;

    /* renamed from: g */
    public final TextView f18536g;

    /* renamed from: h */
    public final String f18537h;

    /* renamed from: i */
    public final SimpleDateFormat f18538i = new SimpleDateFormat("yyyy", Locale.getDefault());

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8515a(View view) {
        super(view);
        C19383o.m32797g(view, "view");
        View findViewById = view.findViewById(R.id.shop_name);
        C19383o.m32796f(findViewById, "view.findViewById(R.id.shop_name)");
        this.f18531b = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.shop_icon);
        C19383o.m32796f(findViewById2, "view.findViewById(R.id.shop_icon)");
        this.f18532c = (ClickableImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.shop_rating);
        C19383o.m32796f(findViewById3, "view.findViewById(R.id.shop_rating)");
        this.f18533d = (CollageRatingView) findViewById3;
        View findViewById4 = view.findViewById(R.id.shop_info_header);
        C19383o.m32796f(findViewById4, "view.findViewById(R.id.shop_info_header)");
        this.f18534e = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.shop_open_date);
        C19383o.m32796f(findViewById5, "view.findViewById(R.id.shop_open_date)");
        this.f18535f = (TextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.shop_num_transactions);
        C19383o.m32796f(findViewById6, "view.findViewById(R.id.shop_num_transactions)");
        this.f18536g = (TextView) findViewById6;
        String string = view.getContext().getString(R.string.shop_info_header);
        C19383o.m32796f(string, "view.context.getString(R.string.shop_info_header)");
        this.f18537h = string;
    }
}

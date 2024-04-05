package p351ff;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.stylekit.views.ratings.CollageRatingView;
import com.etsy.android.uikit.view.ListingFullImageView;
import java.util.ArrayList;

/* renamed from: ff.b */
public final class C12746b extends RecyclerView.C3084b0 {

    /* renamed from: b */
    public final View f28152b;

    /* renamed from: c */
    public final TextView f28153c;

    /* renamed from: d */
    public final ImageView f28154d;

    /* renamed from: e */
    public final TextView f28155e;

    /* renamed from: f */
    public final ImageView f28156f;

    /* renamed from: g */
    public final CollageRatingView f28157g;

    /* renamed from: h */
    public ArrayList f28158h = new ArrayList(0);

    /* renamed from: i */
    public final int f28159i;

    /* renamed from: j */
    public final boolean f28160j;

    public C12746b(View view, int i, boolean z) {
        super(view);
        this.f28159i = i;
        this.f28152b = view.findViewById(R.id.click_region);
        this.f28153c = (TextView) view.findViewById(R.id.title);
        this.f28154d = (ImageView) view.findViewById(R.id.title_icon);
        this.f28155e = (TextView) view.findViewById(R.id.subtitle);
        this.f28157g = (CollageRatingView) view.findViewById(R.id.rating);
        this.f28156f = (ImageView) view.findViewById(R.id.avatar);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.image_layout);
        if (viewGroup instanceof TableLayout) {
            TableLayout tableLayout = (TableLayout) viewGroup;
            Context context = tableLayout.getContext();
            int i2 = (i + 1) / 2;
            ArrayList arrayList = new ArrayList(i);
            for (int i3 = 0; i3 < i2; i3++) {
                TableRow tableRow = new TableRow(context);
                ListingFullImageView e = m20409e(context, true);
                tableRow.addView(e);
                arrayList.add(e);
                ListingFullImageView e2 = m20409e(context, true);
                tableRow.addView(e2);
                tableLayout.addView(tableRow, new TableLayout.LayoutParams(-1, -2, 1.0f));
                arrayList.add(e2);
            }
            this.f28158h = arrayList;
        } else if (viewGroup instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) viewGroup;
            Context context2 = linearLayout.getContext();
            ArrayList arrayList2 = new ArrayList(i);
            for (int i4 = 0; i4 < i; i4++) {
                ListingFullImageView e3 = m20409e(context2, false);
                linearLayout.addView(e3);
                arrayList2.add(e3);
            }
            this.f28158h = arrayList2;
        }
        this.f28160j = z;
    }

    /* renamed from: e */
    public static ListingFullImageView m20409e(Context context, boolean z) {
        ListingFullImageView listingFullImageView = new ListingFullImageView(context);
        listingFullImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        listingFullImageView.setUseStandardRatio(true);
        if (z) {
            listingFullImageView.setLayoutParams(new TableRow.LayoutParams(0, 0, 1.0f));
        } else {
            listingFullImageView.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
        }
        return listingFullImageView;
    }
}

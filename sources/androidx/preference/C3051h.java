package androidx.preference;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;

/* renamed from: androidx.preference.h */
public final class C3051h extends RecyclerView.C3084b0 {

    /* renamed from: b */
    public final SparseArray<View> f6951b;

    /* renamed from: c */
    public boolean f6952c;

    /* renamed from: d */
    public boolean f6953d;

    public C3051h(View view) {
        super(view);
        SparseArray<View> sparseArray = new SparseArray<>(4);
        this.f6951b = sparseArray;
        sparseArray.put(16908310, view.findViewById(16908310));
        sparseArray.put(16908304, view.findViewById(16908304));
        sparseArray.put(16908294, view.findViewById(16908294));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        sparseArray.put(16908350, view.findViewById(16908350));
    }

    /* renamed from: e */
    public final View mo11208e(int i) {
        View view = this.f6951b.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = this.itemView.findViewById(i);
        if (findViewById != null) {
            this.f6951b.put(i, findViewById);
        }
        return findViewById;
    }
}

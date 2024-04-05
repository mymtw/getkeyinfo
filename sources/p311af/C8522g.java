package p311af;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;

/* renamed from: af.g */
public final class C8522g extends RecyclerView.C3084b0 {

    /* renamed from: b */
    public final ImageView f18552b;

    /* renamed from: c */
    public final TextView f18553c;

    /* renamed from: d */
    public final TextView f18554d;

    /* renamed from: e */
    public final View f18555e;

    /* renamed from: f */
    public final TextView f18556f;

    /* renamed from: g */
    public final TextView f18557g;

    /* renamed from: h */
    public final TextView f18558h;

    /* renamed from: i */
    public final View f18559i;

    /* renamed from: j */
    public final int f18560j;

    /* renamed from: k */
    public boolean f18561k;

    public C8522g(View view) {
        super(view);
        this.f18552b = (ImageView) view.findViewById(R.id.avatar);
        this.f18553c = (TextView) view.findViewById(R.id.username);
        this.f18554d = (TextView) view.findViewById(R.id.user_location);
        this.f18555e = view.findViewById(R.id.admin_badge);
        this.f18557g = (TextView) view.findViewById(R.id.followers_button);
        this.f18556f = (TextView) view.findViewById(R.id.following_button);
        this.f18558h = (TextView) view.findViewById(R.id.user_bio);
        this.f18559i = view.findViewById(R.id.user_bio_read_more);
        this.f18560j = view.getResources().getDimensionPixelOffset(R.dimen.user_avatar_image_large);
    }
}

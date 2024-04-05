package p102f4;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.appboy.p043ui.C4940R;

/* renamed from: f4.b */
public class C6784b extends RecyclerView.C3084b0 {

    /* renamed from: b */
    public final View f14925b;

    /* renamed from: c */
    public final ImageView f14926c;

    /* renamed from: d */
    public final TextView f14927d;

    public C6784b(View view, boolean z) {
        super(view);
        View findViewById = view.findViewById(C4940R.C4942id.com_braze_content_cards_unread_bar);
        this.f14925b = findViewById;
        this.f14926c = (ImageView) view.findViewById(C4940R.C4942id.com_braze_content_cards_pinned_icon);
        this.f14927d = (TextView) view.findViewById(C4940R.C4942id.com_braze_content_cards_action_hint);
        if (z) {
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            if (findViewById != null) {
                findViewById.setBackground(view.getContext().getResources().getDrawable(C4940R.C4941drawable.com_braze_content_cards_unread_bar_background));
            }
        } else if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }
}

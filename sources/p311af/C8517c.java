package p311af;

import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.stylekit.views.CollageButton;
import kotlin.jvm.internal.C19383o;

/* renamed from: af.c */
public final class C8517c extends RecyclerView.C3084b0 {

    /* renamed from: d */
    public static final /* synthetic */ int f18541d = 0;

    /* renamed from: b */
    public final CollageButton f18542b;

    /* renamed from: c */
    public final Button f18543c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8517c(View view) {
        super(view);
        C19383o.m32797g(view, "view");
        View findViewById = view.findViewById(R.id.follow_button);
        C19383o.m32796f(findViewById, "view.findViewById(R.id.follow_button)");
        this.f18542b = (CollageButton) findViewById;
        View findViewById2 = view.findViewById(R.id.message_button);
        C19383o.m32796f(findViewById2, "view.findViewById(R.id.message_button)");
        this.f18543c = (Button) findViewById2;
    }

    /* renamed from: e */
    public final void mo21052e(boolean z) {
        this.f18542b.setText(z ? R.string.following : R.string.follow);
        this.f18542b.setIconResource(z ? R.drawable.clg_icon_core_check_v1 : R.drawable.clg_icon_core_add_v1);
    }
}

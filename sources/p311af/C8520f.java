package p311af;

import android.text.Layout;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p356ge.C12788a;
import p370ie.C12952l;

/* renamed from: af.f */
public final class C8520f implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ FragmentActivity f18548b;

    /* renamed from: c */
    public final /* synthetic */ String f18549c;

    /* renamed from: d */
    public final /* synthetic */ C8522g f18550d;

    /* renamed from: af.f$a */
    public class C8521a extends TrackingOnClickListener {
        public C8521a() {
        }

        public final void onViewClick(View view) {
            String c0 = C19421p.m32935c0(C8520f.this.f18548b);
            String string = C8520f.this.f18548b.getResources().getString(R.string.about);
            C19383o.m32797g(string, "title");
            String str = C8520f.this.f18549c;
            C19383o.m32797g(str, ResponseConstants.CONTENT);
            C12788a.m20424c(C8520f.this.f18548b, new C12952l(c0, string, str));
        }
    }

    public C8520f(C8522g gVar, FragmentActivity fragmentActivity, String str) {
        this.f18550d = gVar;
        this.f18548b = fragmentActivity;
        this.f18549c = str;
    }

    public final void run() {
        C8522g gVar = this.f18550d;
        boolean z = true;
        gVar.f18561k = true;
        Layout layout = gVar.f18558h.getLayout();
        if ((layout == null || layout.getLineCount() <= 2) && layout != null) {
            z = false;
        }
        if (z) {
            this.f18550d.f18559i.setVisibility(0);
            this.f18550d.f18559i.setOnClickListener(new C8521a());
        }
    }
}

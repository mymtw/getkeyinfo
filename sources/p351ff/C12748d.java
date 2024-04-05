package p351ff;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.GenericHelpKey;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;

/* renamed from: ff.d */
public final class C12748d extends TrackingOnClickListener {

    /* renamed from: b */
    public final /* synthetic */ FragmentActivity f28167b;

    /* renamed from: c */
    public final /* synthetic */ String f28168c;

    public C12748d(FragmentActivity fragmentActivity, String str) {
        this.f28167b = fragmentActivity;
        this.f28168c = str;
    }

    public final void onViewClick(View view) {
        FragmentActivity fragmentActivity = this.f28167b;
        if (fragmentActivity != null) {
            String c0 = C19421p.m32935c0(fragmentActivity);
            String str = this.f28168c;
            C19383o.m32797g(str, "url");
            C19421p.m32932V(this.f28167b, new GenericHelpKey(c0, str));
        }
    }
}

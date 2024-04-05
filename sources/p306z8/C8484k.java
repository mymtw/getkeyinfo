package p306z8;

import androidx.fragment.app.FragmentActivity;
import androidx.preference.Preference;
import com.etsy.android.config.PrefsFragment;
import java.lang.ref.WeakReference;

/* renamed from: z8.k */
public final /* synthetic */ class C8484k implements Preference.C3010d {

    /* renamed from: b */
    public final /* synthetic */ WeakReference f18512b;

    /* renamed from: c */
    public final /* synthetic */ PrefsFragment f18513c;

    /* renamed from: d */
    public final /* synthetic */ FragmentActivity f18514d;

    public /* synthetic */ C8484k(WeakReference weakReference, PrefsFragment prefsFragment, FragmentActivity fragmentActivity) {
        this.f18512b = weakReference;
        this.f18513c = prefsFragment;
        this.f18514d = fragmentActivity;
    }

    /* renamed from: g */
    public final boolean mo412g(Preference preference) {
        return PrefsFragment.m34852addHomeAdminTabsPref$lambda3(this.f18512b, this.f18513c, this.f18514d, preference);
    }
}

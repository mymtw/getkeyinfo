package androidx.fragment.app.testing;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.compose.foundation.layout.C0761x;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C2870k0;
import androidx.lifecycle.C2878l0;
import com.etsy.android.R;
import kotlin.jvm.internal.C19379k;
import kotlin.jvm.internal.C19386q;
import p753kq.C19846a;

public final class FragmentScenario$EmptyFragmentActivity extends FragmentActivity {
    public static final C2790a Companion = new C2790a();
    public static final String THEME_EXTRAS_BUNDLE_KEY = "androidx.fragment.app.testing.FragmentScenario.EmptyFragmentActivity.THEME_EXTRAS_BUNDLE_KEY";

    /* renamed from: androidx.fragment.app.testing.FragmentScenario$EmptyFragmentActivity$a */
    public static final class C2790a {
    }

    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        setTheme(getIntent().getIntExtra(THEME_EXTRAS_BUNDLE_KEY, R.style.FragmentScenarioEmptyFragmentActivityTheme));
        C19846a aVar = C2791x9c4eba7f.INSTANCE;
        if (aVar == null) {
            aVar = new C2788xcdcaaea6(this);
        }
        C19379k a = C19386q.m32807a(C2792a.class);
        C2792a aVar2 = (C2792a) new C2870k0((C2878l0) new C2789xcdcaaea7(this).invoke(), (C2870k0.C2872b) aVar.invoke()).mo10829a(C0761x.m1713c0(a));
        super.onCreate(bundle);
    }
}

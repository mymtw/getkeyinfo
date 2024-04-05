package com.etsy.android.p327ui.singleactivity;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p013v4.media.C0069a;
import androidx.fragment.app.C2781q;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.zhuinden.simplestack.C17518a;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.singleactivity.MultistackFragmentKey */
public abstract class MultistackFragmentKey implements Parcelable {
    public static final int $stable = 8;
    public static final C11314a Companion = new C11314a();
    /* access modifiers changed from: private */
    public static final int DEFAULT_ANIMATION_ORDINAL = FragmentAnimationMode.FADE.ordinal();
    private final C19285c fragmentTag$delegate = C19350d.m32677b(new MultistackFragmentKey$fragmentTag$2(this));

    /* renamed from: com.etsy.android.ui.singleactivity.MultistackFragmentKey$a */
    public static final class C11314a {
    }

    public int animationModeOrdinal() {
        return DEFAULT_ANIMATION_ORDINAL;
    }

    public final Fragment createFragment(FragmentManager fragmentManager) {
        C19383o.m32797g(fragmentManager, "fragManager");
        C2781q G = fragmentManager.mo10357G();
        ClassLoader classLoader = fragmentManager.getClass().getClassLoader();
        C19383o.m32794d(classLoader);
        Fragment a = G.mo10411a(classLoader, fragmentClassName());
        C19383o.m32796f(a, "fragManager\n            …r!!, fragmentClassName())");
        return a;
    }

    public abstract String fragmentClassName();

    public String generateFragmentTag() {
        return C0069a.m174e("randomUUID().toString()");
    }

    public Bundle getArguments() {
        return null;
    }

    public final String getFragmentTag() {
        return (String) this.fragmentTag$delegate.getValue();
    }

    public boolean isDialog() {
        return false;
    }

    public boolean isSingleTop() {
        return false;
    }

    public final Fragment newFragment(FragmentManager fragmentManager, Bundle bundle, boolean z) {
        C19383o.m32797g(fragmentManager, "fragmentManager");
        Fragment createFragment = createFragment(fragmentManager);
        if (z) {
            Bundle arguments = createFragment.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.setClassLoader(createFragment.getClass().getClassLoader());
            if (bundle != null) {
                bundle.setClassLoader(createFragment.getClass().getClassLoader());
                arguments.putAll(bundle);
            }
            createFragment.setArguments(arguments);
        } else {
            Bundle arguments2 = createFragment.getArguments();
            if (arguments2 == null) {
                arguments2 = new Bundle();
            }
            if (bundle != null) {
                arguments2.putAll(bundle);
            }
            createFragment.setArguments(arguments2);
        }
        return createFragment;
    }

    public final C17518a selectBackstack(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        String stackIdentifier = stackIdentifier();
        C19383o.m32797g(stackIdentifier, "name");
        return (C17518a) context.getSystemService(stackIdentifier);
    }

    public abstract String stackIdentifier();
}

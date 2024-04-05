package androidx.fragment.app.strictmode;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C19294b0;
import kotlin.collections.C19327t;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p204p1.C7650b;

public final class FragmentStrictMode {

    /* renamed from: a */
    public static C2785b f6339a = C2785b.f6340c;

    public enum Flag {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* renamed from: androidx.fragment.app.strictmode.FragmentStrictMode$a */
    public interface C2784a {
        /* renamed from: a */
        void mo10589a();
    }

    /* renamed from: androidx.fragment.app.strictmode.FragmentStrictMode$b */
    public static final class C2785b {

        /* renamed from: c */
        public static final C2785b f6340c = new C2785b(EmptySet.INSTANCE, C19294b0.m32559p0());

        /* renamed from: a */
        public final Set<Flag> f6341a;

        /* renamed from: b */
        public final LinkedHashMap f6342b;

        public C2785b(EmptySet emptySet, Map map) {
            C19383o.m32797g(emptySet, ResponseConstants.FLAGS);
            this.f6341a = emptySet;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put((Class) entry.getKey(), (Set) entry.getValue());
            }
            this.f6342b = linkedHashMap;
        }
    }

    /* renamed from: a */
    public static C2785b m6672a(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                C19383o.m32796f(fragment.getParentFragmentManager(), "declaringFragment.parentFragmentManager");
            }
            fragment = fragment.getParentFragment();
        }
        return f6339a;
    }

    /* renamed from: b */
    public static void m6673b(C2785b bVar, Violation violation) {
        Fragment fragment = violation.getFragment();
        String name = fragment.getClass().getName();
        if (bVar.f6341a.contains(Flag.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", C19383o.m32802l(name, "Policy violation in "), violation);
        }
        bVar.getClass();
        if (bVar.f6341a.contains(Flag.PENALTY_DEATH)) {
            m6676e(fragment, new C7650b(0, name, violation));
        }
    }

    /* renamed from: c */
    public static void m6674c(Violation violation) {
        if (FragmentManager.m6465J(3)) {
            Log.d("FragmentManager", C19383o.m32802l(violation.getFragment().getClass().getName(), "StrictMode violation in "), violation);
        }
    }

    /* renamed from: d */
    public static final void m6675d(Fragment fragment, String str) {
        C19383o.m32797g(fragment, "fragment");
        C19383o.m32797g(str, "previousFragmentId");
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, str);
        m6674c(fragmentReuseViolation);
        C2785b a = m6672a(fragment);
        if (a.f6341a.contains(Flag.DETECT_FRAGMENT_REUSE) && m6677f(a, fragment.getClass(), FragmentReuseViolation.class)) {
            m6673b(a, fragmentReuseViolation);
        }
    }

    /* renamed from: e */
    public static void m6676e(Fragment fragment, Runnable runnable) {
        if (fragment.isAdded()) {
            Handler handler = fragment.getParentFragmentManager().f6147q.f6335d;
            C19383o.m32796f(handler, "fragment.parentFragmentManager.host.handler");
            if (C19383o.m32792b(handler.getLooper(), Looper.myLooper())) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        } else {
            runnable.run();
        }
    }

    /* renamed from: f */
    public static boolean m6677f(C2785b bVar, Class cls, Class cls2) {
        Set set = (Set) bVar.f6342b.get(cls);
        if (set == null) {
            return true;
        }
        if (C19383o.m32792b(cls2.getSuperclass(), Violation.class) || !C19327t.m32634P0(cls2.getSuperclass(), set)) {
            return !set.contains(cls2);
        }
        return false;
    }
}

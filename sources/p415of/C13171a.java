package p415of;

import androidx.fragment.app.Fragment;
import com.etsy.android.lib.logger.C8703p;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C19383o;

/* renamed from: of.a */
public abstract class C13171a<Element> {

    /* renamed from: b */
    public final C8703p f28980b;

    /* renamed from: c */
    public final WeakReference<Fragment> f28981c;

    public C13171a(Fragment fragment, C8703p pVar) {
        C19383o.m32797g(pVar, "viewTracker");
        this.f28980b = pVar;
        this.f28981c = new WeakReference<>(fragment);
    }

    /* renamed from: a */
    public final Fragment mo45889a() {
        return this.f28981c.get();
    }

    /* renamed from: c */
    public abstract void mo31328c(Element element);
}

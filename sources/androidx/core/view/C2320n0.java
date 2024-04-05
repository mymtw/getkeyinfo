package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.jvm.internal.C19383o;
import kotlin.sequences.C19431g;

/* renamed from: androidx.core.view.n0 */
public final class C2320n0 implements C19431g<View> {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f5578a;

    public C2320n0(ViewGroup viewGroup) {
        this.f5578a = viewGroup;
    }

    public final Iterator<View> iterator() {
        ViewGroup viewGroup = this.f5578a;
        C19383o.m32797g(viewGroup, "<this>");
        return new C2322o0(viewGroup);
    }
}

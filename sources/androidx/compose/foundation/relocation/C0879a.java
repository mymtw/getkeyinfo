package androidx.compose.foundation.relocation;

import android.graphics.Rect;
import android.view.View;
import androidx.activity.C0114h;
import androidx.compose.p015ui.layout.C1689j;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import p288y.C8345d;

/* renamed from: androidx.compose.foundation.relocation.a */
public final class C0879a implements C0881c {

    /* renamed from: b */
    public final View f1890b;

    public C0879a(View view) {
        C19383o.m32797g(view, "view");
        this.f1890b = view;
    }

    /* renamed from: a */
    public final Object mo4409a(C8345d dVar, C1689j jVar, C19340c<? super C19394m> cVar) {
        C8345d e = dVar.mo20930e(C0114h.m320t0(jVar));
        this.f1890b.requestRectangleOnScreen(new Rect((int) e.f18301a, (int) e.f18302b, (int) e.f18303c, (int) e.f18304d), false);
        return C19394m.f43287a;
    }
}

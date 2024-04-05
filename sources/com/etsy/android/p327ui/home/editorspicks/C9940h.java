package com.etsy.android.p327ui.home.editorspicks;

import androidx.lifecycle.C2866i0;
import com.etsy.android.lib.models.finds.FindsPage;
import kotlin.collections.C19327t;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.flow.StateFlowImpl;
import p346fa.C12703a;

/* renamed from: com.etsy.android.ui.home.editorspicks.h */
public final class C9940h extends C2866i0 {

    /* renamed from: b */
    public final EditorPicksRepository f21900b;

    /* renamed from: c */
    public final C12703a f21901c;

    /* renamed from: d */
    public final StateFlowImpl f21902d;

    /* renamed from: e */
    public final StateFlowImpl f21903e;

    /* renamed from: f */
    public String f21904f;

    /* renamed from: g */
    public String f21905g;

    /* renamed from: h */
    public Boolean f21906h;

    /* renamed from: i */
    public String f21907i;

    /* renamed from: j */
    public FindsPage f21908j;

    public C9940h(EditorPicksRepository editorPicksRepository, C12703a aVar) {
        C19383o.m32797g(editorPicksRepository, "editorPicksRepository");
        C19383o.m32797g(aVar, "grafana");
        this.f21900b = editorPicksRepository;
        this.f21901c = aVar;
        StateFlowImpl g = C19388s.m32862g(new C9938f(EmptyList.INSTANCE));
        this.f21902d = g;
        this.f21903e = g;
    }

    /* renamed from: b */
    public static void m18145b(StateFlowImpl stateFlowImpl, C9930e eVar) {
        C9938f fVar = (C9938f) stateFlowImpl.getValue();
        fVar.getClass();
        C19383o.m32797g(eVar, "sideEffect");
        stateFlowImpl.setValue(new C9938f(C19327t.m32651g1(fVar.f21895a, eVar)));
    }
}

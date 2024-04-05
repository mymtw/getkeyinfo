package p420pc;

import android.view.View;
import com.etsy.android.extensions.ViewExtensions;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Ref$BooleanRef;
import p420pc.C13215d;

/* renamed from: pc.c */
public final /* synthetic */ class C13214c implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ Ref$BooleanRef f29053b;

    /* renamed from: c */
    public final /* synthetic */ C13215d.C13216a f29054c;

    /* renamed from: d */
    public final /* synthetic */ C13215d f29055d;

    /* renamed from: e */
    public final /* synthetic */ C13213b f29056e;

    public /* synthetic */ C13214c(Ref$BooleanRef ref$BooleanRef, C13215d.C13216a aVar, C13215d dVar, C13213b bVar) {
        this.f29053b = ref$BooleanRef;
        this.f29054c = aVar;
        this.f29055d = dVar;
        this.f29056e = bVar;
    }

    public final void onClick(View view) {
        Ref$BooleanRef ref$BooleanRef = this.f29053b;
        C13215d.C13216a aVar = this.f29054c;
        C13215d dVar = this.f29055d;
        C13213b bVar = this.f29056e;
        C19383o.m32797g(ref$BooleanRef, "$isSelected");
        C19383o.m32797g(aVar, "this$0");
        C19383o.m32797g(dVar, "this$1");
        C19383o.m32797g(bVar, "$filterData");
        boolean z = !ref$BooleanRef.element;
        ref$BooleanRef.element = z;
        if (z) {
            ViewExtensions.m12869m(aVar.f29060c);
        } else {
            ViewExtensions.m12863g(aVar.f29060c);
        }
        dVar.f29058c.invoke(new C13213b(bVar.f29051a, ref$BooleanRef.element));
    }
}

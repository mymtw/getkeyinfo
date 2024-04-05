package androidx.compose.foundation.text.selection;

import androidx.compose.p015ui.layout.C1689j;
import com.appboy.Constants;
import java.util.Comparator;
import kotlin.jvm.internal.C19383o;
import p288y.C8343c;
import p628nj.C18263b;

/* renamed from: androidx.compose.foundation.text.selection.m */
public final /* synthetic */ class C1019m implements Comparator {

    /* renamed from: b */
    public final /* synthetic */ C1689j f2135b;

    public /* synthetic */ C1019m(C1689j jVar) {
        this.f2135b = jVar;
    }

    public final int compare(Object obj, Object obj2) {
        C1689j jVar = this.f2135b;
        C1010f fVar = (C1010f) obj;
        C1010f fVar2 = (C1010f) obj2;
        C19383o.m32797g(jVar, "$containerLayoutCoordinates");
        C19383o.m32797g(fVar, Constants.APPBOY_PUSH_CONTENT_KEY);
        C19383o.m32797g(fVar2, "b");
        C1689j c = fVar.mo4697c();
        C1689j c2 = fVar2.mo4697c();
        long m = c != null ? jVar.mo6686m(c, C8343c.f18295b) : C8343c.f18295b;
        long m2 = c2 != null ? jVar.mo6686m(c2, C8343c.f18295b) : C8343c.f18295b;
        return (C8343c.m16643d(m) > C8343c.m16643d(m2) ? 1 : (C8343c.m16643d(m) == C8343c.m16643d(m2) ? 0 : -1)) == 0 ? C18263b.m30880z(Float.valueOf(C8343c.m16642c(m)), Float.valueOf(C8343c.m16642c(m2))) : C18263b.m30880z(Float.valueOf(C8343c.m16643d(m)), Float.valueOf(C8343c.m16643d(m2)));
    }
}

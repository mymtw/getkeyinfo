package p113g3;

import android.graphics.Path;
import androidx.compose.p015ui.platform.C1830f0;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.C4845a;
import java.util.ArrayList;
import java.util.List;
import p125h3.C6928a;
import p125h3.C6940l;
import p167l3.C7241g;
import p167l3.C7244j;

/* renamed from: g3.p */
public final class C6857p implements C6852l, C6928a.C6929a {

    /* renamed from: a */
    public final Path f15155a = new Path();

    /* renamed from: b */
    public final boolean f15156b;

    /* renamed from: c */
    public final LottieDrawable f15157c;

    /* renamed from: d */
    public final C6940l f15158d;

    /* renamed from: e */
    public boolean f15159e;

    /* renamed from: f */
    public C1830f0 f15160f = new C1830f0(2, 0);

    public C6857p(LottieDrawable lottieDrawable, C4845a aVar, C7244j jVar) {
        jVar.getClass();
        this.f15156b = jVar.f16092d;
        this.f15157c = lottieDrawable;
        C6928a<C7241g, Path> a = jVar.f16091c.mo19485a();
        this.f15158d = (C6940l) a;
        aVar.mo14606e(a);
        a.mo19077a(this);
    }

    /* renamed from: a */
    public final void mo14602a() {
        this.f15159e = false;
        this.f15157c.invalidateSelf();
    }

    /* renamed from: b */
    public final void mo14603b(List<C6841b> list, List<C6841b> list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i < arrayList.size()) {
                C6841b bVar = (C6841b) arrayList.get(i);
                if (bVar instanceof C6859r) {
                    C6859r rVar = (C6859r) bVar;
                    if (rVar.f15168c == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                        ((List) this.f15160f.f4088a).add(rVar);
                        rVar.mo18981c(this);
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final Path getPath() {
        if (this.f15159e) {
            return this.f15155a;
        }
        this.f15155a.reset();
        if (this.f15156b) {
            this.f15159e = true;
            return this.f15155a;
        }
        this.f15155a.set((Path) this.f15158d.mo19083g());
        this.f15155a.setFillType(Path.FillType.EVEN_ODD);
        this.f15160f.mo7211c(this.f15155a);
        this.f15159e = true;
        return this.f15155a;
    }
}

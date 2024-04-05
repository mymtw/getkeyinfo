package p438re;

import androidx.fragment.app.Fragment;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.p327ui.shop.C11178m0;
import p415of.C13171a;
import p452te.C13393b;
import p452te.C13394c;
import p452te.C13396e;

/* renamed from: re.a */
public final class C13355a extends C13171a {

    /* renamed from: d */
    public final C11178m0 f29284d;

    public C13355a(Fragment fragment, C8703p pVar, C11178m0 m0Var) {
        super(fragment, pVar);
        this.f29284d = m0Var;
    }

    /* renamed from: c */
    public final void mo31328c(Object obj) {
        if (obj instanceof C13396e) {
            ((C13396e) obj).getClass();
            throw null;
        } else if (obj instanceof C13393b) {
            this.f29284d.mo36809j(((C13393b) obj).f29328a.getUserId());
        } else if (obj instanceof C13394c) {
            this.f29284d.mo36809j(((C13394c) obj).f29335e);
        }
    }
}

package androidx.compose.p015ui.input.pointer;

import android.view.MotionEvent;
import com.google.android.play.core.appupdate.C15562d;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.input.pointer.l */
public final class C1640l {

    /* renamed from: a */
    public final List<C1644p> f3651a;

    /* renamed from: b */
    public final C1635g f3652b;

    /* renamed from: c */
    public final int f3653c;

    /* renamed from: d */
    public int f3654d;

    public C1640l(List<C1644p> list, C1635g gVar) {
        C19383o.m32797g(list, "changes");
        this.f3651a = list;
        this.f3652b = gVar;
        MotionEvent a = mo6609a();
        int i = 0;
        this.f3653c = a != null ? a.getButtonState() : 0;
        MotionEvent a2 = mo6609a();
        if (a2 != null) {
            a2.getMetaState();
        }
        MotionEvent a3 = mo6609a();
        int i2 = 3;
        if (a3 == null) {
            int size = list.size();
            while (true) {
                if (i >= size) {
                    break;
                }
                C1644p pVar = list.get(i);
                if (C15562d.m25206v(pVar)) {
                    i2 = 2;
                    break;
                } else if (C15562d.m25204t(pVar)) {
                    i2 = 1;
                    break;
                } else {
                    i++;
                }
            }
        } else {
            int actionMasked = a3.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                i = 6;
                                break;
                            case 9:
                                i = 4;
                                break;
                            case 10:
                                i = 5;
                                break;
                        }
                    }
                    i = 3;
                    i2 = i;
                }
                i = 2;
                i2 = i;
            }
            i = 1;
            i2 = i;
        }
        this.f3654d = i2;
    }

    /* renamed from: a */
    public final MotionEvent mo6609a() {
        C1635g gVar = this.f3652b;
        if (gVar != null) {
            return gVar.f3633b.f3672b;
        }
        return null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C1640l(List<C1644p> list) {
        this(list, (C1635g) null);
        C19383o.m32797g(list, "changes");
    }
}

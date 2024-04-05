package p030bo.app;

import android.app.Activity;
import java.util.List;
import p030bo.app.C4276x3;

/* renamed from: bo.app.x1 */
public interface C4274x1 {
    /* renamed from: a */
    static /* synthetic */ void m9763a(C4274x1 x1Var, long j, long j2, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 4) != 0) {
                i = 0;
            }
            x1Var.mo13827a(j, j2, i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestContentCardsSync");
    }

    /* renamed from: a */
    String mo13826a();

    /* renamed from: a */
    void mo13827a(long j, long j2, int i);

    /* renamed from: a */
    void mo13829a(C4173s2 s2Var);

    /* renamed from: a */
    void mo13830a(C4215t5 t5Var, C4173s2 s2Var);

    /* renamed from: a */
    void mo13831a(C4257w1 w1Var);

    /* renamed from: a */
    void mo13832a(C4276x3.C4277a aVar);

    /* renamed from: a */
    void mo13833a(C4296y1 y1Var);

    /* renamed from: a */
    void mo13834a(Throwable th);

    /* renamed from: a */
    void mo13836a(List<String> list, long j);

    /* renamed from: a */
    void mo13837a(boolean z);

    /* renamed from: a */
    boolean mo13838a(C4208t1 t1Var);

    /* renamed from: b */
    void mo13839b();

    /* renamed from: b */
    void mo13840b(C4208t1 t1Var);

    /* renamed from: b */
    void mo13841b(Throwable th);

    /* renamed from: b */
    void mo13842b(boolean z);

    /* renamed from: c */
    boolean mo13843c();

    void closeSession(Activity activity);

    /* renamed from: d */
    void mo13845d();

    /* renamed from: e */
    void mo13846e();

    void openSession(Activity activity);
}

package p027b8;

import com.fasterxml.jackson.core.JsonFactory;
import java.util.Date;
import p305z7.C8462e;
import p305z7.C8465g;

/* renamed from: b8.g */
public final class C3497g implements C3504n<Date> {
    /* renamed from: a */
    public final void mo12997a(Object obj, Appendable appendable, C8462e eVar) {
        appendable.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        String date = ((Date) obj).toString();
        C8462e eVar2 = C8465g.f18488a;
        if (date != null) {
            eVar.f18486d.mo21035a(appendable, date);
        }
        appendable.append(JsonFactory.DEFAULT_QUOTE_CHAR);
    }
}

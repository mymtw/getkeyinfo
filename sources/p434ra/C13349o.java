package p434ra;

import android.os.Bundle;
import com.etsy.android.lib.util.NotificationType;
import kotlin.text.C19456j;

/* renamed from: ra.o */
public final class C13349o extends C13337e {

    /* renamed from: d */
    public static final C13349o f29275d = new C13349o();

    public C13349o() {
        super(NotificationType.UNSEEN_UPDATES);
    }

    /* renamed from: f */
    public final int mo46032f(Bundle bundle) {
        Integer T0;
        String string = bundle.getString("unseen_count");
        if (string == null || (T0 = C19456j.m33016T0(string)) == null) {
            return 0;
        }
        return T0.intValue();
    }
}

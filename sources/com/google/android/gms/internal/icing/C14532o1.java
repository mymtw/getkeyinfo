package com.google.android.gms.internal.icing;

import androidx.compose.p015ui.text.input.C1993m;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.icing.o1 */
public final class C14532o1 extends C14552u1 {
    public C14532o1(int i) {
        super(i);
    }

    /* renamed from: a */
    public final void mo49858a() {
        if (!this.f32713e) {
            for (int i = 0; i < this.f32711c.size(); i++) {
                Map.Entry entry = this.f32711c.get(i);
                if (((C14562y) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : this.f32712d.isEmpty() ? C1993m.f4505t : this.f32712d.entrySet()) {
                if (((C14562y) entry2.getKey()).zzc()) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        super.mo49858a();
    }
}

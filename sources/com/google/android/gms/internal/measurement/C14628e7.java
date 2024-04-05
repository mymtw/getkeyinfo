package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.e7 */
public final class C14628e7 extends C14706k7 {
    public C14628e7(int i) {
        super(i);
    }

    /* renamed from: a */
    public final void mo50477a() {
        if (!this.f32916e) {
            for (int i = 0; i < this.f32914c.size(); i++) {
                Map.Entry entry = this.f32914c.get(i);
                if (((C14717l5) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : this.f32915d.isEmpty() ? C14794r4.f33069b : this.f32915d.entrySet()) {
                if (((C14717l5) entry2.getKey()).zzc()) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        super.mo50477a();
    }
}

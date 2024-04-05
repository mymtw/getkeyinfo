package p506ak;

import android.content.Intent;
import android.location.Location;
import com.google.android.gms.common.internal.Constants;
import com.google.android.gms.internal.location.zzbh;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ak.d */
public final class C14018d {

    /* renamed from: a */
    public final int f30853a;

    /* renamed from: b */
    public final int f30854b;

    /* renamed from: c */
    public final List<C14016b> f30855c;

    public C14018d(int i, int i2, ArrayList arrayList) {
        this.f30853a = i;
        this.f30854b = i2;
        this.f30855c = arrayList;
    }

    /* renamed from: a */
    public static C14018d m21576a(Intent intent) {
        ArrayList arrayList = null;
        if (intent == null) {
            return null;
        }
        int i = -1;
        int intExtra = intent.getIntExtra(Constants.KEY_GMS_ERROR_CODE, -1);
        int intExtra2 = intent.getIntExtra("com.google.android.location.intent.extra.transition", -1);
        if (intExtra2 != -1 && (intExtra2 == 1 || intExtra2 == 2 || intExtra2 == 4)) {
            i = intExtra2;
        }
        ArrayList arrayList2 = (ArrayList) intent.getSerializableExtra("com.google.android.location.intent.extra.geofence_list");
        if (arrayList2 != null) {
            arrayList = new ArrayList(arrayList2.size());
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                arrayList.add(zzbh.zza((byte[]) obj));
            }
        }
        Location location = (Location) intent.getParcelableExtra("com.google.android.location.intent.extra.triggering_location");
        return new C14018d(intExtra, i, arrayList);
    }
}

package androidx.slice;

import android.app.PendingIntent;
import android.app.RemoteInput;
import android.app.slice.Slice;
import android.app.slice.Slice$Builder;
import android.app.slice.SliceSpec;
import android.content.Context;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import p077d1.C6619c;
import p193o.C7496d;

/* renamed from: androidx.slice.a */
public final class C3274a {
    /* renamed from: a */
    public static Slice m7945a(Slice slice) {
        if (slice == null || Uri.parse(slice.f7602d) == null) {
            return null;
        }
        Uri parse = Uri.parse(slice.f7602d);
        SliceSpec sliceSpec = slice.f7599a;
        Slice$Builder slice$Builder = new Slice$Builder(parse, sliceSpec == null ? null : new SliceSpec(sliceSpec.f7618a, sliceSpec.f7619b));
        slice$Builder.addHints(slice.mo12097c());
        for (SliceItem sliceItem : Arrays.asList(slice.f7600b)) {
            String str = sliceItem.f7609b;
            str.getClass();
            char c = 65535;
            switch (str.hashCode()) {
                case -1422950858:
                    if (str.equals(ResponseConstants.ACTION)) {
                        c = 0;
                        break;
                    }
                    break;
                case 104431:
                    if (str.equals("int")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3327612:
                    if (str.equals("long")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3556653:
                    if (str.equals("text")) {
                        c = 3;
                        break;
                    }
                    break;
                case 100313435:
                    if (str.equals(ResponseConstants.IMAGE)) {
                        c = 4;
                        break;
                    }
                    break;
                case 100358090:
                    if (str.equals("input")) {
                        c = 5;
                        break;
                    }
                    break;
                case 109526418:
                    if (str.equals("slice")) {
                        c = 6;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    F f = ((C6619c) sliceItem.f7611d).f14606a;
                    slice$Builder.addAction(f instanceof PendingIntent ? (PendingIntent) f : null, m7945a(sliceItem.mo12111d()), sliceItem.f7610c);
                    break;
                case 1:
                    slice$Builder.addInt(((Integer) sliceItem.f7611d).intValue(), sliceItem.f7610c, sliceItem.mo12110c());
                    break;
                case 2:
                    slice$Builder.addLong(((Long) sliceItem.f7611d).longValue(), sliceItem.f7610c, sliceItem.mo12110c());
                    break;
                case 3:
                    slice$Builder.addText((CharSequence) sliceItem.f7611d, sliceItem.f7610c, sliceItem.mo12110c());
                    break;
                case 4:
                    slice$Builder.addIcon(((IconCompat) sliceItem.f7611d).mo8750g((Context) null), sliceItem.f7610c, sliceItem.mo12110c());
                    break;
                case 5:
                    slice$Builder.addRemoteInput((RemoteInput) sliceItem.f7611d, sliceItem.f7610c, sliceItem.mo12110c());
                    break;
                case 6:
                    slice$Builder.addSubSlice(m7945a(sliceItem.mo12111d()), sliceItem.f7610c);
                    break;
            }
        }
        return slice$Builder.build();
    }

    /* renamed from: b */
    public static C7496d m7946b(Set set) {
        C7496d dVar = new C7496d();
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                SliceSpec sliceSpec = (SliceSpec) it.next();
                dVar.add(sliceSpec == null ? null : new SliceSpec(sliceSpec.getType(), sliceSpec.getRevision()));
            }
        }
        return dVar;
    }
}

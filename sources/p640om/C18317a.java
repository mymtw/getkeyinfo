package p640om;

import android.os.Parcelable;
import com.google.firebase.appindexing.internal.Thing;
import java.util.Comparator;

/* renamed from: om.a */
public final /* synthetic */ class C18317a implements Comparator {

    /* renamed from: b */
    public static final C18317a f40215b = new C18317a();

    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        Parcelable.Creator<Thing> creator = Thing.CREATOR;
        if (str == null) {
            return str2 != null ? -1 : 0;
        }
        if (str2 == null) {
            return 1;
        }
        return str.compareTo(str2);
    }
}

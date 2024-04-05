package p380ka;

import com.etsy.android.lib.models.apiv3.Image;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import java.util.Comparator;

/* renamed from: ka.a */
public final /* synthetic */ class C12989a implements Comparator {

    /* renamed from: b */
    public final /* synthetic */ int f28600b;

    public /* synthetic */ C12989a(int i) {
        this.f28600b = i;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.f28600b) {
            case 0:
                return Image.lambda$static$0((Image.Source) obj, (Image.Source) obj2);
            default:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                int[] iArr = DefaultTrackSelector.f32313f;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
        }
    }
}

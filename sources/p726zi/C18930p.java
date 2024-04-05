package p726zi;

import com.google.android.exoplayer2.p526ui.TrackSelectionView;
import java.util.Comparator;

/* renamed from: zi.p */
public final /* synthetic */ class C18930p implements Comparator {

    /* renamed from: b */
    public final /* synthetic */ Comparator f42214b;

    public /* synthetic */ C18930p(Comparator comparator) {
        this.f42214b = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        return this.f42214b.compare(((TrackSelectionView.C14413b) obj).f32447c, ((TrackSelectionView.C14413b) obj2).f32447c);
    }
}

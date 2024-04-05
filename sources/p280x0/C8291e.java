package p280x0;

import java.util.ArrayList;

/* renamed from: x0.e */
public final class C8291e {

    /* renamed from: a */
    public final int[] f18170a;

    /* renamed from: b */
    public final float[] f18171b;

    public C8291e(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.f18170a = new int[size];
        this.f18171b = new float[size];
        for (int i = 0; i < size; i++) {
            this.f18170a[i] = ((Integer) arrayList.get(i)).intValue();
            this.f18171b[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public C8291e(int i, int i2) {
        this.f18170a = new int[]{i, i2};
        this.f18171b = new float[]{0.0f, 1.0f};
    }

    public C8291e(int i, int i2, int i3) {
        this.f18170a = new int[]{i, i2, i3};
        this.f18171b = new float[]{0.0f, 0.5f, 1.0f};
    }
}

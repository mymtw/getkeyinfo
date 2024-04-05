package androidx.constraintlayout.motion.widget;

import java.util.HashMap;

/* renamed from: androidx.constraintlayout.motion.widget.e */
public final class C2119e {

    /* renamed from: a */
    public HashMap<Object, HashMap<String, float[]>> f4814a = new HashMap<>();

    /* renamed from: a */
    public final float mo8140a(String str, Object obj) {
        if (!this.f4814a.containsKey(obj)) {
            return Float.NaN;
        }
        HashMap hashMap = this.f4814a.get(obj);
        if (!hashMap.containsKey(str)) {
            return Float.NaN;
        }
        float[] fArr = (float[]) hashMap.get(str);
        if (fArr.length > 0) {
            return fArr[0];
        }
        return Float.NaN;
    }
}

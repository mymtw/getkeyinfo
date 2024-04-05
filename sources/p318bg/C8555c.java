package p318bg;

import com.facebook.appevents.p332ml.ModelManager;

/* renamed from: bg.c */
public final /* synthetic */ class C8555c {

    /* renamed from: a */
    public static final /* synthetic */ int[] f18637a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f18638b;

    static {
        int[] iArr = new int[ModelManager.Task.values().length];
        f18637a = iArr;
        ModelManager.Task task = ModelManager.Task.MTML_INTEGRITY_DETECT;
        iArr[task.ordinal()] = 1;
        ModelManager.Task task2 = ModelManager.Task.MTML_APP_EVENT_PREDICTION;
        iArr[task2.ordinal()] = 2;
        int[] iArr2 = new int[ModelManager.Task.values().length];
        f18638b = iArr2;
        iArr2[task.ordinal()] = 1;
        iArr2[task2.ordinal()] = 2;
    }
}

package p641on;

import java.io.FileOutputStream;
import java.util.concurrent.Callable;

/* renamed from: on.b */
public final /* synthetic */ class C18323b implements Callable {

    /* renamed from: b */
    public final /* synthetic */ C18325d f40220b;

    /* renamed from: c */
    public final /* synthetic */ C18327e f40221c;

    public /* synthetic */ C18323b(C18325d dVar, C18327e eVar) {
        this.f40220b = dVar;
        this.f40221c = eVar;
    }

    public final Object call() {
        C18325d dVar = this.f40220b;
        C18327e eVar = this.f40221c;
        C18331i iVar = dVar.f40228b;
        synchronized (iVar) {
            FileOutputStream openFileOutput = iVar.f40250a.openFileOutput(iVar.f40251b, 0);
            try {
                openFileOutput.write(eVar.toString().getBytes("UTF-8"));
            } finally {
                openFileOutput.close();
            }
        }
        return null;
    }
}

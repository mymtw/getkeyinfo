package kotlinx.coroutines.android;

import android.os.Looper;
import java.util.List;
import kotlinx.coroutines.C19764o1;
import kotlinx.coroutines.internal.C19728l;

public final class AndroidDispatcherFactory implements C19728l {
    public C19764o1 createDispatcher(List<? extends C19728l> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new C19470c(C19472e.m33091a(mainLooper));
        }
        throw new IllegalStateException("The main looper is not available");
    }

    public int getLoadPriority() {
        return 1073741823;
    }

    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
}

package p114g4;

import android.app.Activity;
import android.view.View;
import com.braze.models.inappmessage.C5483a;

/* renamed from: g4.o */
public interface C6877o {
    void close();

    C5483a getInAppMessage();

    View getInAppMessageView();

    boolean getIsAnimatingClose();

    void open(Activity activity);
}

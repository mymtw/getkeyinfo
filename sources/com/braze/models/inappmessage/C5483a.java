package com.braze.models.inappmessage;

import android.net.Uri;
import com.braze.enums.inappmessage.ClickAction;
import com.braze.enums.inappmessage.CropType;
import com.braze.enums.inappmessage.DismissType;
import com.braze.enums.inappmessage.InAppMessageFailureType;
import com.braze.enums.inappmessage.MessageType;
import com.braze.enums.inappmessage.Orientation;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p005a4.C0035b;

/* renamed from: com.braze.models.inappmessage.a */
public interface C5483a extends C0035b<JSONObject> {
    /* renamed from: E */
    DismissType mo15952E();

    /* renamed from: F */
    boolean mo15953F(InAppMessageFailureType inAppMessageFailureType);

    /* renamed from: G */
    void mo15954G(Map<String, String> map);

    /* renamed from: I */
    Orientation mo15955I();

    /* renamed from: K */
    boolean mo15956K();

    /* renamed from: L */
    int mo15957L();

    /* renamed from: M */
    List<String> mo15958M();

    /* renamed from: N */
    void mo15959N();

    /* renamed from: O */
    int mo15960O();

    /* renamed from: Q */
    int mo15962Q();

    /* renamed from: R */
    MessageType mo16002R();

    /* renamed from: S */
    void mo15963S(boolean z);

    /* renamed from: T */
    void mo15964T(long j);

    /* renamed from: U */
    boolean mo15965U();

    /* renamed from: W */
    long mo15966W();

    /* renamed from: Y */
    int mo15967Y();

    /* renamed from: Z */
    void mo15968Z();

    /* renamed from: a0 */
    CropType mo15969a0();

    /* renamed from: b0 */
    ClickAction mo15970b0();

    int getBackgroundColor();

    Map<String, String> getExtras();

    String getIcon();

    String getMessage();

    boolean getOpenUriInWebView();

    Uri getUri();

    boolean isControl();

    boolean logClick();

    boolean logImpression();
}

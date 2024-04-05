package androidx.compose.p015ui.text.input;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.activity.C0114h;
import androidx.compose.p015ui.text.C2022r;
import java.util.ArrayList;
import java.util.List;
import kotlin.C19394m;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.text.input.RecordingInputConnection */
public final class RecordingInputConnection implements InputConnection {
    private final boolean autoCorrect;
    private int batchDepth;
    private int currentExtractedTextRequestToken;
    private final List<C1984d> editCommands = new ArrayList();
    private final C1991k eventCallback;
    private boolean extractedTextMonitorMode;
    private boolean isActive = true;
    private TextFieldValue mTextFieldValue;

    public RecordingInputConnection(TextFieldValue textFieldValue, C1991k kVar, boolean z) {
        C19383o.m32797g(textFieldValue, "initState");
        C19383o.m32797g(kVar, "eventCallback");
        this.eventCallback = kVar;
        this.autoCorrect = z;
        this.mTextFieldValue = textFieldValue;
    }

    private final void addEditCommandWithBatch(C1984d dVar) {
        beginBatchEditInternal();
        try {
            this.editCommands.add(dVar);
        } finally {
            endBatchEditInternal();
        }
    }

    private final boolean beginBatchEditInternal() {
        this.batchDepth++;
        return true;
    }

    private final boolean endBatchEditInternal() {
        int i = this.batchDepth - 1;
        this.batchDepth = i;
        if (i == 0 && (!this.editCommands.isEmpty())) {
            this.eventCallback.mo7676b(C19327t.m32661q1(this.editCommands));
            this.editCommands.clear();
        }
        return this.batchDepth > 0;
    }

    private final boolean ensureActive(C19846a<C19394m> aVar) {
        boolean z = this.isActive;
        if (z) {
            aVar.invoke();
        }
        return z;
    }

    private final void logDebug(String str) {
    }

    private final void sendSynthesizedKeyEvent(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    public boolean beginBatchEdit() {
        boolean z = this.isActive;
        return z ? beginBatchEditInternal() : z;
    }

    public boolean clearMetaKeyStates(int i) {
        boolean z = this.isActive;
        if (z) {
            return false;
        }
        return z;
    }

    public void closeConnection() {
        this.editCommands.clear();
        this.batchDepth = 0;
        this.isActive = false;
    }

    public boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.isActive;
        if (z) {
            return false;
        }
        return z;
    }

    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        C19383o.m32797g(inputContentInfo, "inputContentInfo");
        boolean z = this.isActive;
        if (z) {
            return false;
        }
        return z;
    }

    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.isActive;
        return z ? this.autoCorrect : z;
    }

    public boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.isActive;
        if (z) {
            addEditCommandWithBatch(new C1981a(String.valueOf(charSequence), i));
        }
        return z;
    }

    public boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        addEditCommandWithBatch(new C1982b(i, i2));
        return true;
    }

    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        addEditCommandWithBatch(new C1983c(i, i2));
        return true;
    }

    public boolean endBatchEdit() {
        return endBatchEditInternal();
    }

    public boolean finishComposingText() {
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        addEditCommandWithBatch(new C1987g());
        return true;
    }

    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    public int getCursorCapsMode(int i) {
        TextFieldValue textFieldValue = this.mTextFieldValue;
        return TextUtils.getCapsMode(textFieldValue.f4448a.f4296b, C2022r.m4466e(textFieldValue.f4449b), i);
    }

    public final C1991k getEventCallback() {
        return this.eventCallback;
    }

    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = true;
        int i2 = 0;
        if ((i & 1) == 0) {
            z = false;
        }
        this.extractedTextMonitorMode = z;
        if (z) {
            if (extractedTextRequest != null) {
                i2 = extractedTextRequest.token;
            }
            this.currentExtractedTextRequestToken = i2;
        }
        return C0114h.m268A0(this.mTextFieldValue);
    }

    public Handler getHandler() {
        return null;
    }

    public final TextFieldValue getMTextFieldValue$ui_release() {
        return this.mTextFieldValue;
    }

    public CharSequence getSelectedText(int i) {
        if (C2022r.m4463b(this.mTextFieldValue.f4449b)) {
            return null;
        }
        return C1993m.m4349J(this.mTextFieldValue).f4296b;
    }

    public CharSequence getTextAfterCursor(int i, int i2) {
        return C1993m.m4352M(this.mTextFieldValue, i).f4296b;
    }

    public CharSequence getTextBeforeCursor(int i, int i2) {
        return C1993m.m4353N(this.mTextFieldValue, i).f4296b;
    }

    public boolean performContextMenuAction(int i) {
        boolean z = this.isActive;
        if (z) {
            z = false;
            switch (i) {
                case 16908319:
                    addEditCommandWithBatch(new C2001s(0, this.mTextFieldValue.f4448a.f4296b.length()));
                    break;
                case 16908320:
                    sendSynthesizedKeyEvent(277);
                    break;
                case 16908321:
                    sendSynthesizedKeyEvent(278);
                    break;
                case 16908322:
                    sendSynthesizedKeyEvent(279);
                    break;
            }
        }
        return z;
    }

    public boolean performEditorAction(int i) {
        int i2;
        boolean z = this.isActive;
        if (z) {
            z = true;
            if (i != 0) {
                switch (i) {
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                        i2 = 7;
                        break;
                    case 7:
                        i2 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
                        break;
                }
            }
            i2 = 1;
            this.eventCallback.mo7677c(i2);
        }
        return z;
    }

    public boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.isActive;
        if (z) {
            return true;
        }
        return z;
    }

    public boolean reportFullscreenMode(boolean z) {
        return false;
    }

    public boolean requestCursorUpdates(int i) {
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        Log.w("RecordingIC", "requestCursorUpdates is not supported");
        return false;
    }

    public boolean sendKeyEvent(KeyEvent keyEvent) {
        C19383o.m32797g(keyEvent, "event");
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        this.eventCallback.mo7675a(keyEvent);
        return true;
    }

    public boolean setComposingRegion(int i, int i2) {
        boolean z = this.isActive;
        if (z) {
            addEditCommandWithBatch(new C1999q(i, i2));
        }
        return z;
    }

    public boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.isActive;
        if (z) {
            addEditCommandWithBatch(new C2000r(String.valueOf(charSequence), i));
        }
        return z;
    }

    public final void setMTextFieldValue$ui_release(TextFieldValue textFieldValue) {
        C19383o.m32797g(textFieldValue, "value");
        this.mTextFieldValue = textFieldValue;
    }

    public boolean setSelection(int i, int i2) {
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        addEditCommandWithBatch(new C2001s(i, i2));
        return true;
    }

    public final void updateInputState(TextFieldValue textFieldValue, C1992l lVar, View view) {
        C19383o.m32797g(textFieldValue, "state");
        C19383o.m32797g(lVar, "inputMethodManager");
        C19383o.m32797g(view, "view");
        if (this.isActive) {
            setMTextFieldValue$ui_release(textFieldValue);
            if (this.extractedTextMonitorMode) {
                lVar.mo7600d(view, this.currentExtractedTextRequestToken, C0114h.m268A0(textFieldValue));
            }
            C2022r rVar = textFieldValue.f4450c;
            int i = -1;
            int e = rVar != null ? C2022r.m4466e(rVar.f4597a) : -1;
            C2022r rVar2 = textFieldValue.f4450c;
            if (rVar2 != null) {
                i = C2022r.m4465d(rVar2.f4597a);
            }
            lVar.mo7598b(view, C2022r.m4466e(textFieldValue.f4449b), C2022r.m4465d(textFieldValue.f4449b), e, i);
        }
    }
}

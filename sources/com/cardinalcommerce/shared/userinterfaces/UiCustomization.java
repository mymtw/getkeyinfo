package com.cardinalcommerce.shared.userinterfaces;

import com.cardinalcommerce.shared.models.enums.ButtonType;
import com.cardinalcommerce.shared.models.exceptions.InvalidInputException;
import java.io.Serializable;
import java.util.HashMap;

public class UiCustomization implements Serializable {
    public static ButtonType ButtonType;

    /* renamed from: a */
    private ToolbarCustomization f14085a;

    /* renamed from: b */
    private LabelCustomization f14086b;

    /* renamed from: c */
    private TextBoxCustomization f14087c;

    /* renamed from: d */
    private final HashMap<String, ButtonCustomization> f14088d = new HashMap<>();

    public ButtonCustomization getButtonCustomization(ButtonType buttonType) {
        Throwable th = new Throwable("Caught in ButtonCustomization.setButtonCustomization");
        if (buttonType != null) {
            try {
                return this.f14088d.get(buttonType.name());
            } catch (Exception unused) {
                return null;
            }
        } else {
            throw new InvalidInputException("InvalidInputException", th);
        }
    }

    public ButtonCustomization getButtonCustomization(String str) {
        Throwable th = new Throwable("Caught in ButtonCustomization.setButtonCustomization");
        if (str != null) {
            try {
                return this.f14088d.get(str);
            } catch (Exception unused) {
                return null;
            }
        } else {
            throw new InvalidInputException("InvalidInputException", th);
        }
    }

    public LabelCustomization getLabelCustomization() {
        return this.f14086b;
    }

    public TextBoxCustomization getTextBoxCustomization() {
        return this.f14087c;
    }

    public ToolbarCustomization getToolbarCustomization() {
        return this.f14085a;
    }

    public void setButtonCustomization(ButtonCustomization buttonCustomization, ButtonType buttonType) {
        if (buttonCustomization == null || buttonType == null) {
            throw new InvalidInputException("InvalidInputException", new Throwable("Caught in ButtonCustomization.setButtonCustomization"));
        }
        this.f14088d.put(buttonType.name(), buttonCustomization);
    }

    public void setButtonCustomization(ButtonCustomization buttonCustomization, String str) {
        if (buttonCustomization == null || str == null) {
            throw new InvalidInputException("InvalidInputException", new Throwable("Caught in ButtonCustomization.setButtonCustomization"));
        }
        this.f14088d.put(str, buttonCustomization);
    }

    public void setLabelCustomization(LabelCustomization labelCustomization) {
        if (labelCustomization != null) {
            this.f14086b = labelCustomization;
            return;
        }
        throw new InvalidInputException("InvalidInputException", new Throwable("Caught in ButtonCustomization.setLabelCustomization"));
    }

    public void setTextBoxCustomization(TextBoxCustomization textBoxCustomization) {
        if (textBoxCustomization != null) {
            this.f14087c = textBoxCustomization;
            return;
        }
        throw new InvalidInputException("InvalidInputException", new Throwable("Caught in ButtonCustomization.setTextBoxCustomization"));
    }

    public void setToolbarCustomization(ToolbarCustomization toolbarCustomization) {
        if (toolbarCustomization != null) {
            this.f14085a = toolbarCustomization;
            return;
        }
        throw new InvalidInputException("InvalidInputException", new Throwable("Caught in ButtonCustomization.setToolbarCustomization"));
    }
}

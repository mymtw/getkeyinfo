package com.paypal.pyplcheckout.home.view.customviews.alertview;

import com.paypal.pyplcheckout.C17165R;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p010a9.C0048b;

public abstract class AlertToast {
    private final int backgroundColor;
    private final String bodyText;
    private final String headerText;
    private final Integer icon;
    private final int textColor;

    public static final class Error extends AlertToast {
        private final String bodyText;
        private final String headerText;

        public Error(String str, String str2) {
            super(C17165R.color.add_card_red_bg, C17165R.color.add_card_red, Integer.valueOf(C17165R.C17166drawable.ic_error_cricle), (String) null, (String) null, 24, (DefaultConstructorMarker) null);
            this.headerText = str;
            this.bodyText = str2;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.getHeaderText();
            }
            if ((i & 2) != 0) {
                str2 = error.getBodyText();
            }
            return error.copy(str, str2);
        }

        public final String component1() {
            return getHeaderText();
        }

        public final String component2() {
            return getBodyText();
        }

        public final Error copy(String str, String str2) {
            return new Error(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return C19383o.m32792b(getHeaderText(), error.getHeaderText()) && C19383o.m32792b(getBodyText(), error.getBodyText());
        }

        public String getBodyText() {
            return this.bodyText;
        }

        public String getHeaderText() {
            return this.headerText;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = (getHeaderText() == null ? 0 : getHeaderText().hashCode()) * 31;
            if (getBodyText() != null) {
                i = getBodyText().hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return C0048b.m164c("Error(headerText=", getHeaderText(), ", bodyText=", getBodyText(), ")");
        }
    }

    public static final class ErrorNoIcon extends AlertToast {
        private final String bodyText;
        private final String headerText;

        public ErrorNoIcon(String str, String str2) {
            super(C17165R.color.add_card_red_bg, C17165R.color.add_card_red, (Integer) null, (String) null, (String) null, 28, (DefaultConstructorMarker) null);
            this.headerText = str;
            this.bodyText = str2;
        }

        public static /* synthetic */ ErrorNoIcon copy$default(ErrorNoIcon errorNoIcon, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = errorNoIcon.getHeaderText();
            }
            if ((i & 2) != 0) {
                str2 = errorNoIcon.getBodyText();
            }
            return errorNoIcon.copy(str, str2);
        }

        public final String component1() {
            return getHeaderText();
        }

        public final String component2() {
            return getBodyText();
        }

        public final ErrorNoIcon copy(String str, String str2) {
            return new ErrorNoIcon(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ErrorNoIcon)) {
                return false;
            }
            ErrorNoIcon errorNoIcon = (ErrorNoIcon) obj;
            return C19383o.m32792b(getHeaderText(), errorNoIcon.getHeaderText()) && C19383o.m32792b(getBodyText(), errorNoIcon.getBodyText());
        }

        public String getBodyText() {
            return this.bodyText;
        }

        public String getHeaderText() {
            return this.headerText;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = (getHeaderText() == null ? 0 : getHeaderText().hashCode()) * 31;
            if (getBodyText() != null) {
                i = getBodyText().hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return C0048b.m164c("ErrorNoIcon(headerText=", getHeaderText(), ", bodyText=", getBodyText(), ")");
        }
    }

    public static final class Success extends AlertToast {
        private final String bodyText;
        private final String headerText;

        public Success(String str, String str2) {
            super(C17165R.color.add_card_green_bg, C17165R.color.add_card_green, Integer.valueOf(C17165R.C17166drawable.ic_checkmark_circle), (String) null, (String) null, 24, (DefaultConstructorMarker) null);
            this.headerText = str;
            this.bodyText = str2;
        }

        public static /* synthetic */ Success copy$default(Success success, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = success.getHeaderText();
            }
            if ((i & 2) != 0) {
                str2 = success.getBodyText();
            }
            return success.copy(str, str2);
        }

        public final String component1() {
            return getHeaderText();
        }

        public final String component2() {
            return getBodyText();
        }

        public final Success copy(String str, String str2) {
            return new Success(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return C19383o.m32792b(getHeaderText(), success.getHeaderText()) && C19383o.m32792b(getBodyText(), success.getBodyText());
        }

        public String getBodyText() {
            return this.bodyText;
        }

        public String getHeaderText() {
            return this.headerText;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = (getHeaderText() == null ? 0 : getHeaderText().hashCode()) * 31;
            if (getBodyText() != null) {
                i = getBodyText().hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return C0048b.m164c("Success(headerText=", getHeaderText(), ", bodyText=", getBodyText(), ")");
        }
    }

    public static final class SuccessNoIcon extends AlertToast {
        private final String bodyText;
        private final String headerText;

        public SuccessNoIcon(String str, String str2) {
            super(C17165R.color.add_card_green_bg, C17165R.color.add_card_green, (Integer) null, (String) null, (String) null, 28, (DefaultConstructorMarker) null);
            this.headerText = str;
            this.bodyText = str2;
        }

        public static /* synthetic */ SuccessNoIcon copy$default(SuccessNoIcon successNoIcon, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = successNoIcon.getHeaderText();
            }
            if ((i & 2) != 0) {
                str2 = successNoIcon.getBodyText();
            }
            return successNoIcon.copy(str, str2);
        }

        public final String component1() {
            return getHeaderText();
        }

        public final String component2() {
            return getBodyText();
        }

        public final SuccessNoIcon copy(String str, String str2) {
            return new SuccessNoIcon(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuccessNoIcon)) {
                return false;
            }
            SuccessNoIcon successNoIcon = (SuccessNoIcon) obj;
            return C19383o.m32792b(getHeaderText(), successNoIcon.getHeaderText()) && C19383o.m32792b(getBodyText(), successNoIcon.getBodyText());
        }

        public String getBodyText() {
            return this.bodyText;
        }

        public String getHeaderText() {
            return this.headerText;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = (getHeaderText() == null ? 0 : getHeaderText().hashCode()) * 31;
            if (getBodyText() != null) {
                i = getBodyText().hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return C0048b.m164c("SuccessNoIcon(headerText=", getHeaderText(), ", bodyText=", getBodyText(), ")");
        }
    }

    private AlertToast(int i, int i2, Integer num, String str, String str2) {
        this.backgroundColor = i;
        this.textColor = i2;
        this.icon = num;
        this.headerText = str;
        this.bodyText = str2;
    }

    public /* synthetic */ AlertToast(int i, int i2, Integer num, String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, num, str, str2);
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public String getBodyText() {
        return this.bodyText;
    }

    public String getHeaderText() {
        return this.headerText;
    }

    public final Integer getIcon() {
        return this.icon;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AlertToast(int i, int i2, Integer num, String str, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? null : num, (i3 & 8) != 0 ? null : str, (i3 & 16) != 0 ? null : str2, (DefaultConstructorMarker) null);
    }
}

package com.paypal.pyplcheckout.exception;

import com.google.gson.JsonSyntaxException;
import com.paypal.pyplcheckout.exception.ExceptionTypeDescriptor;
import java.io.IOException;
import java.text.ParseException;
import org.json.JSONException;

public class PYPLException extends Exception {
    private int errorCode;
    private ExceptionTypeDescriptor exceptionTypeDescriptor;

    /* renamed from: com.paypal.pyplcheckout.exception.PYPLException$1 */
    public static /* synthetic */ class C172191 {

        /* renamed from: $SwitchMap$com$paypal$pyplcheckout$exception$ExceptionTypeDescriptor$Type */
        public static final /* synthetic */ int[] f37737x7586a1c6;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.paypal.pyplcheckout.exception.ExceptionTypeDescriptor$Type[] r0 = com.paypal.pyplcheckout.exception.ExceptionTypeDescriptor.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f37737x7586a1c6 = r0
                com.paypal.pyplcheckout.exception.ExceptionTypeDescriptor$Type r1 = com.paypal.pyplcheckout.exception.ExceptionTypeDescriptor.Type.UNKNOWN_EXCEPTION     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f37737x7586a1c6     // Catch:{ NoSuchFieldError -> 0x001d }
                com.paypal.pyplcheckout.exception.ExceptionTypeDescriptor$Type r1 = com.paypal.pyplcheckout.exception.ExceptionTypeDescriptor.Type.NETWORK_EXCEPTION     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f37737x7586a1c6     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.paypal.pyplcheckout.exception.ExceptionTypeDescriptor$Type r1 = com.paypal.pyplcheckout.exception.ExceptionTypeDescriptor.Type.JSON_PARSING_EXCEPTION     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f37737x7586a1c6     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.paypal.pyplcheckout.exception.ExceptionTypeDescriptor$Type r1 = com.paypal.pyplcheckout.exception.ExceptionTypeDescriptor.Type.WEB_PARAM_EXCEPTION     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f37737x7586a1c6     // Catch:{ NoSuchFieldError -> 0x003e }
                com.paypal.pyplcheckout.exception.ExceptionTypeDescriptor$Type r1 = com.paypal.pyplcheckout.exception.ExceptionTypeDescriptor.Type.WEB_SERVER_EXCEPTION     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f37737x7586a1c6     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.paypal.pyplcheckout.exception.ExceptionTypeDescriptor$Type r1 = com.paypal.pyplcheckout.exception.ExceptionTypeDescriptor.Type.OBJECT_INSTANTIATION_EXCEPTION     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f37737x7586a1c6     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.paypal.pyplcheckout.exception.ExceptionTypeDescriptor$Type r1 = com.paypal.pyplcheckout.exception.ExceptionTypeDescriptor.Type.DATE_PARSING_EXCEPTION     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f37737x7586a1c6     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.paypal.pyplcheckout.exception.ExceptionTypeDescriptor$Type r1 = com.paypal.pyplcheckout.exception.ExceptionTypeDescriptor.Type.NO_DATA_EXCEPTION     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f37737x7586a1c6     // Catch:{ NoSuchFieldError -> 0x006c }
                com.paypal.pyplcheckout.exception.ExceptionTypeDescriptor$Type r1 = com.paypal.pyplcheckout.exception.ExceptionTypeDescriptor.Type.UPDATE_STATUS_FORCE_EXCEPTION     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.exception.PYPLException.C172191.<clinit>():void");
        }
    }

    public PYPLException(ExceptionTypeDescriptor exceptionTypeDescriptor2) {
        super(getErrorMessage(exceptionTypeDescriptor2));
        this.exceptionTypeDescriptor = exceptionTypeDescriptor2;
    }

    public static PYPLException getAppException(Exception exc) {
        return exc instanceof PYPLException ? (PYPLException) exc : ((exc instanceof InstantiationException) || (exc instanceof IllegalAccessException)) ? new PYPLException(new ExceptionTypeDescriptor(ExceptionTypeDescriptor.Type.OBJECT_INSTANTIATION_EXCEPTION)) : exc instanceof IOException ? new PYPLException(new ExceptionTypeDescriptor(ExceptionTypeDescriptor.Type.NETWORK_EXCEPTION)) : ((exc instanceof JSONException) || (exc instanceof JsonSyntaxException)) ? new PYPLException(new ExceptionTypeDescriptor(ExceptionTypeDescriptor.Type.JSON_PARSING_EXCEPTION)) : exc instanceof ParseException ? new PYPLException(new ExceptionTypeDescriptor(ExceptionTypeDescriptor.Type.DATE_PARSING_EXCEPTION)) : new PYPLException(new ExceptionTypeDescriptor(ExceptionTypeDescriptor.Type.UNKNOWN_EXCEPTION));
    }

    private static String getErrorMessage(int i) {
        return "Unknown error";
    }

    private static String getErrorMessage(ExceptionTypeDescriptor exceptionTypeDescriptor2) {
        switch (C172191.f37737x7586a1c6[exceptionTypeDescriptor2.getExceptionType().ordinal()]) {
            case 1:
                return "Unknown exception has occurred";
            case 2:
                return "Please make sure you are connected to internet";
            case 3:
                return "An exception has occurred when trying to parsing your data";
            case 4:
                return "A web service parameter is missing or incorrect";
            case 5:
                return "An exception has occurred at the server side";
            case 6:
                return "An exception has occurred when trying to instantiate object of generic type [.....]";
            case 7:
                return "An exception has occurred while parsing date";
            case 8:
                return "No data available on the server right now";
            case 9:
                return "Your version is outdated please download the latest version";
            default:
                return "Unknown error";
        }
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public ExceptionTypeDescriptor getExceptionTypeDescriptor() {
        return this.exceptionTypeDescriptor;
    }

    public void setErrorCode(int i) {
        this.errorCode = i;
    }

    public void setExceptionTypeDescriptor(ExceptionTypeDescriptor exceptionTypeDescriptor2) {
        this.exceptionTypeDescriptor = exceptionTypeDescriptor2;
    }

    public PYPLException(int i) {
        super(getErrorMessage(i));
        this.errorCode = i;
    }

    public PYPLException(String str, int i) {
        super(str);
        this.errorCode = i;
    }

    public PYPLException(String str) {
        super(str);
    }
}

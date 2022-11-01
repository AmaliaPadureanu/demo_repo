import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

public enum FieldType {

    PASSWORD(FieldType.passwordFieldName) {
        public boolean validate(String fieldValue) {
            return Pattern.matches("((?=.*\\\\d)(?=.*[a-z])(?=.*[A-Z]).{6,})", fieldValue);
        }
    },
    EMAIL_ADDRESS(FieldType.emailFieldName) {
        public boolean validate(String fieldValue) {
            return Pattern.matches("^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z|a-z]{2,4}$", fieldValue);
        }
    },
    PHONE_NUMBER(FieldType.phoneFieldName) {
        public boolean validate(String fieldValue) {
            return Pattern.matches("^1?[- ]?\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", fieldValue);
        }
    },
    SOCIAL_SECURITY_NUMBER(FieldType.ssnFieldName) {
        public boolean validate(String fieldValue) {
            return Pattern.matches("^\\d{3}[- ]?\\d{2}[- ]?\\d{4}$", fieldValue);
        }
    };

    private String fieldName;
    static final String passwordFieldName = "password";
    static final String emailFieldName = "email";
    static final String phoneFieldName = "phone";
    static final  String ssnFieldName = "ssn";

    private FieldType(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    abstract boolean validate(String fieldValue);

    private static final Map<String, FieldType> nameToFieldTypeMap = new HashMap<>();

    static {
        for(FieldType field : FieldType.values()) {
            nameToFieldTypeMap.put(field.getFieldName(), field);
        }
    }

    public static FieldType lookup(String fieldName) {
        return nameToFieldTypeMap.get(fieldName.toLowerCase());
    }

    private static void printValid(FieldType field, String fieldValue, boolean valid) {
        System.out.println(field.getFieldName() + "(\"" + fieldValue + "\") valid: " + valid );
    }

    public static void main(String... args) {
        String fieldName = FieldType.passwordFieldName;
        String fieldValue = "1Cxy9";
        FieldType field = lookup(fieldName);
        printValid(field,fieldValue, field.validate(fieldValue));
        fieldName = FieldType.phoneFieldName;
        fieldValue = "1-800-555-1234";
        field = lookup(fieldName);
        printValid(field, fieldValue, field.validate(fieldValue));
        fieldName = FieldType.emailFieldName;
        fieldValue = "john@doe";
        field = lookup(fieldName);
        printValid(field, fieldValue, field.validate(fieldValue));
        fieldName = FieldType.ssnFieldName;
        fieldValue = "111-11-1111";
        field = lookup(fieldName);
        printValid(field, fieldValue, field.validate(fieldValue));
    }
}

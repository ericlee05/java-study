package change_value_to_reference;

import java.util.*;

public class SmartPhone {
    private static final HashMap<String, SmartPhone> phones = new LinkedHashMap<>();

    private static String getKey(String manufacturer, String modelName) {
        return String.format("%s %s", manufacturer, modelName);
    }

    public static SmartPhone create(String manufacturer, String modelName) {
        String key = getKey(manufacturer, modelName);
        if(phones.containsKey(key))
            return phones.get(key);

        SmartPhone phone = new SmartPhone(manufacturer, modelName);
        phones.put(key, phone);

        return phone;
    }

    private final String manufacturer;
    private final String modelName;

    // Factory 메서드에서만 생성이 가능하도록, 생성자는 private 접근자 이용
    private SmartPhone(String manufacturer, String modelName) {
        this.manufacturer = manufacturer;
        this.modelName = modelName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModelName() {
        return modelName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartPhone that = (SmartPhone) o;
        return manufacturer.equals(that.manufacturer) && modelName.equals(that.modelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, modelName);
    }
}

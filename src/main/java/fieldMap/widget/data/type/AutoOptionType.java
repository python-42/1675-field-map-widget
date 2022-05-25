package fieldMap.widget.data.type;

import java.util.Map;
import java.util.function.Function;

import edu.wpi.first.shuffleboard.api.data.ComplexDataType;
import fieldMap.widget.data.AutoOption;

public class AutoOptionType extends ComplexDataType<AutoOption>{
    private static final String NAME = "AutoOption";
    public static final AutoOptionType Instance = new AutoOptionType();

    private AutoOptionType() {
        super(NAME, AutoOption.class);
    }

    @Override
    public Function<Map<String, Object>, AutoOption> fromMap() {
        return map -> {
            return new AutoOption((String) map.getOrDefault("pos", "AREA_1"), (String) map.getOrDefault("cargo", "NONE"));
        };

    }

    @Override
    public AutoOption getDefaultValue(){
        return new AutoOption("AREA_1", "NONE");
    }
    
}

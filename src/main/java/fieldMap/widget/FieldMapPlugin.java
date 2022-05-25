package fieldMap.widget;

import java.util.List;
import java.util.Map;

import edu.wpi.first.shuffleboard.api.data.DataType;
import edu.wpi.first.shuffleboard.api.plugin.Description;
import edu.wpi.first.shuffleboard.api.plugin.Plugin;
import edu.wpi.first.shuffleboard.api.widget.ComponentType;
import edu.wpi.first.shuffleboard.api.widget.WidgetType;
import fieldMap.widget.data.type.AutoOptionType;

@Description(group = "fieldMap.widget", name = "FieldMap", version = "1.0.0", summary = "Used to select auto options on an image of the field.")
public class FieldMapPlugin extends Plugin {

    @Override
    public List<DataType> getDataTypes() {//passes data type to shuffleboard
        return List.of(AutoOptionType.Instance);
    }

    @Override
    public List<ComponentType> getComponents() {
        return List.of(WidgetType.forAnnotatedWidget(FieldMapWidget.class));
    }

    @Override
    public Map<DataType, ComponentType> getDefaultComponents() {
        return Map.of(AutoOptionType.Instance, WidgetType.forAnnotatedWidget(FieldMapWidget.class));
    }
}

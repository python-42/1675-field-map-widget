package fieldMap.widget;

import edu.wpi.first.shuffleboard.api.widget.Description;
import edu.wpi.first.shuffleboard.api.widget.ParametrizedController;
import edu.wpi.first.shuffleboard.api.widget.SimpleAnnotatedWidget;
import fieldMap.widget.data.AutoOption;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;


@Description(name = "1675FieldMap", dataTypes = AutoOption.class)
@ParametrizedController("FieldMap.fxml")
public final class FieldMapWidget extends SimpleAnnotatedWidget<AutoOption>{
    
    @FXML
    private Pane root;
    
    @FXML
    private ImageView fieldImage;

    @FXML
    private Text msg;

    @FXML
    private void initialize() {
        
    }

    @Override
    public Pane getView() {
        return root;
    }
}

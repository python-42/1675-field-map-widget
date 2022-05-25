package fieldMap.widget;

import edu.wpi.first.shuffleboard.api.widget.Description;
import edu.wpi.first.shuffleboard.api.widget.ParametrizedController;
import edu.wpi.first.shuffleboard.api.widget.SimpleAnnotatedWidget;
import fieldMap.widget.data.AutoOption;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;


@Description(name = "1675FieldMap", dataTypes = AutoOption.class)
@ParametrizedController("FieldMap.fxml")
public final class FieldMapWidget extends SimpleAnnotatedWidget<AutoOption>{
    
    @FXML
    private Pane root;
    
    @FXML
    private ImageView fieldImage;

    @FXML
    private void initialize() {
        //Image image = new Image("file:/c/Dev/field-map-widget/src/main/resources/fieldMap/widget/field.png");
        //fieldImage.setImage(image);
       
    }

    @Override
    public Pane getView() {
        return root;
    }
}

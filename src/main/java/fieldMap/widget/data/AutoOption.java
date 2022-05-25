package fieldMap.widget.data;

import java.util.Map;

import edu.wpi.first.shuffleboard.api.data.ComplexData;

public class AutoOption extends ComplexData<AutoOption>{
    private String pos;
    private String cargo;
    
    public AutoOption(String pos, String cargo){
        this.pos = pos.toUpperCase();
        this.cargo = cargo.toUpperCase();
    }

    @Override
    public Map<String, Object> asMap(){
        return Map.of("pos", pos, "cargo", cargo);
    }

    public void setPos(String pos){
        this.pos = pos.toUpperCase();
    }

    public void setCargo(String cargo){
        this.cargo = cargo.toUpperCase();
    }

    public String getPos(){
        return pos;
    }

    public String getCargo(){
        return cargo;
    }

}

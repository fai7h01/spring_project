package stereotype_annotations.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import org.springframework.stereotype.Component;

@Component
@Data
public class DataStructure{

    @NonNull
    private ExtraHours extraHours;

    public void getTotalHours() {
        System.out.println("Total hours: " + (35 + extraHours.getHours()));
    }
}

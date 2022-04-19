package Activities.Activities_Put_ID;

import lombok.Getter;
import lombok.Setter;

@Getter
    @Setter
    public class ActivitiesPutResponse {
        public String id;
        public String title;
        public String dueDate;
        public Boolean completed;
    }


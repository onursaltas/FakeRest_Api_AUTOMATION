package Activities.Activities_Put_ID;

import lombok.Builder;

@Builder
public class ActivitiesPutRequest {
    public String id;
    public String title;
    public String dueDate;
    public Boolean completed;
}

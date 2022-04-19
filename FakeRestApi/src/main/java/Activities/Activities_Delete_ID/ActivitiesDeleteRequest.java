package Activities.Activities_Delete_ID;

import lombok.Builder;

@Builder
public class ActivitiesDeleteRequest {
    public String id;
    public String title;
    public String dueDate;
    public Boolean completed;
}

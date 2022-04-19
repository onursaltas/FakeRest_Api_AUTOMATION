package Activities.Activities_Post;

import lombok.Builder;

@Builder
public class ActivitiesPostRequest {
    public String id;
    public String title;
    public String dueDate;
    public Boolean completed;
}

package Activities.Activities_Post;

import base.BaseAPI;
import io.restassured.mapper.ObjectMapperType;

public class ActivitiesPost extends BaseAPI {


    public ActivitiesPostResponse activitiesPost(String id, String title , String dueDate , Boolean completed) {
        ActivitiesPostRequest activitiesPostRequest = ActivitiesPostRequest.builder()
                .id(id)
                .title(title)
                .dueDate(dueDate)
                .completed(completed)
                .build();

        return post(actPost, activitiesPostRequest)
                .then()
                .extract()
                .as(ActivitiesPostResponse.class, ObjectMapperType.GSON);
    }
}

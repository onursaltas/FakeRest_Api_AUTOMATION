package Activities.Activities_Put_ID;

import base.BaseAPI;
import io.restassured.mapper.ObjectMapperType;

public class ActivitiesPut extends BaseAPI {


    public ActivitiesPutResponse activitiesPost(String id, String title , String dueDate , Boolean completed) {
        ActivitiesPutRequest activitiesPostRequest = ActivitiesPutRequest.builder()
                .id(id)
                .title(title)
                .dueDate(dueDate)
                .completed(completed)
                .build();

        return put(actPost, activitiesPostRequest)
                .then()
                .extract()
                .as(ActivitiesPutResponse.class, ObjectMapperType.GSON);
    }
}

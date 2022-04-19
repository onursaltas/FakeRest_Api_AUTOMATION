package Activities.Activities_Delete_ID;

import base.BaseAPI;
import io.restassured.mapper.ObjectMapperType;

public class ActivitiesDelete extends BaseAPI {


    public ActivitiesDeleteResponse activitiesDelete(String id) {


        return delete(actPost + id)
                .then()
                .extract()
                .as(ActivitiesDeleteResponse.class, ObjectMapperType.GSON);
    }
}

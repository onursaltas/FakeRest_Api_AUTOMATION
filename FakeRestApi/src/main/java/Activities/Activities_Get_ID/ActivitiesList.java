package Activities.Activities_Get_ID;


import base.BaseAPI;
import io.restassured.mapper.ObjectMapperType;

import java.util.HashMap;
import java.util.Map;

public class ActivitiesList extends BaseAPI {


        public ActivitiesListResponse getListUsersWithPageParameter(String actID) {

            return get(actCRUD + actID)
                    .then()
                    .extract()
                    .as(ActivitiesListResponse.class, ObjectMapperType.GSON);
        }
}

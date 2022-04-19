package config;

public class Var {

    public static String baseURL = XmlFileParse.xmlFileParse("baseURL", "Variables.xml");
    public static String actPost = XmlFileParse.xmlFileParse("activitiesPost", "Variables.xml");
    public static String actCRUD = XmlFileParse.xmlFileParse("activitiesCRUD", "Variables.xml");


}

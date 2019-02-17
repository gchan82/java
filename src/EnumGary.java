public enum EnumGary {
    gary("nice", "22"),
    jennifer("cutie", "19"),
    julia("bigmistake", "21"),
    nicole("italian", "22"),
    candy("different", "23"),
    erin("iwish", "24");

    private final String desc;
    private final String year;

    EnumGary(String description, String birthday){
        desc = description;
        year = birthday;
    }
    public String getDesc(){
        return desc;
    }
    public String getYear(){
        return year;
    }
}

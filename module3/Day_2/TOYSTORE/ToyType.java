package TOYSTORE;

public enum ToyType {
    STUFFED_ANIMAL, PUZZLE, VEHICLE;

    public static String getToyTypes(){
        String toyTypesString = "";
        ToyType[] toyTypes = ToyType.value();
        for(int i = 0; i < toyTypes.length; i++){
            toyTypesString += toyTypes[i];
            if(i < toyTypes.length - 1){
                toyTypesString += ", ";
            }
        }
        return toyTypesString;
    }
}

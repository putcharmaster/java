public enum FlightStatus{
    ON_TIME, DELAYED, CANCELLED;

    /**
     * Function to get the list of flight statuses as a string
     */
    public static String getStatusString() {
        String statusString = "";
        FlightStatus[] FlightStatuses = FlightStatus.values();
        for(int i = 0; i < FlightStatuses.length; i++) {
            statusString += FlightStatuses[i];
            if (i < FlightStatuses.length - 2) {
                statusString += ", ";
            }
            if (i == FlightStatuses.length - 2) {
                statusString += " or ";
            }
        }
        return statusString;
    }

}
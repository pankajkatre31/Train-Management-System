package FindMyTrain;

import java.util.ArrayList;
import java.util.List;

public class Station
{
    private String stationId;
    private String stationName;
    private List<Platform> platformList;

    public Station(String stationName, String stationId) {
        this.stationName = stationName;
        this.stationId = stationId;
        this.platformList=new ArrayList<>();//ye jab bhi platform banenge uske liye jagah choddi hai
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public List<Platform> getPlatformList() {
        return platformList;
    }

    public void setPlatformList(List<Platform> platformList) {
        this.platformList = platformList;
    }

    @Override
    public String toString() {
        return "Station{" +
                "stationId='" + stationId + '\'' +
                ", stationName='" + stationName + '\'' +
                ", platformList=" + platformList +
                '}';
    }
}

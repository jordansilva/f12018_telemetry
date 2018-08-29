package classes;

import Packets.CarStatusData;
import Packets.CarTelemetryData;
import Packets.PacketCarStatusData;
import Packets.PacketCarTelemetryData;
import Packets.PacketEventData;
import Packets.PacketParticipantsData;
import Packets.PacketSessionData;
import Packets.ParticipantData;
import java.util.ArrayList;

/**
 *
 * @author miguelangel.garciar
 */
public class Session {
    
    public int userIndex;
    public CarStatusData ownCar;
    public CarTelemetryData ownTelemetry;
    public ArrayList<ParticipantData> participants;
    public PacketSessionData data;
    
    public Session(){
        
    }
    
    public void setUserIndex(int user){
        this.userIndex = user;
    }
    
    public void setOwnCarStatusData(PacketCarStatusData packetCarStatusData){
        this.ownCar = packetCarStatusData.carStatusData.get(userIndex);
    }
    
    public void setOwnCarTelemetryData(PacketCarTelemetryData packetCarTelemetryData){
        this.ownTelemetry = packetCarTelemetryData.carTelemetryData.get(userIndex);
    }
    
    public void setParticipantsData(PacketParticipantsData packetParticipantsData){
        participants = packetParticipantsData.participants;
    }
    
    public void setSessionData(PacketSessionData packetSessionData){
        data = packetSessionData;
    }
    
    public void setEventAction(PacketEventData packetEventData){
       
    }
}
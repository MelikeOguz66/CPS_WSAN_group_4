package no.nordicsemi.android.nrfthingy.ClusterHead;

public class ClhPathPacket {
    private static final int type = 0; //what type of message is this? 1 = ack 0 = data;
    private static final int route = 1; //should be 6 bytes long

    //private static final int SOUND_POWER_POSH=6;
    //private static final int SOUND_POWER_POSL=7;
    private static final int CLH_ARRAY_SIZE=5+1;
    byte[] ClhAdvData=new byte[CLH_ARRAY_SIZE];
}

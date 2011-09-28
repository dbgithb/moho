package com.voxeo.moho.spi;

public interface RemoteJoinDriver extends ProtocolDriver {

  public final String PROTOCOL_REMOTEJOIN = "REMOTEJOIN";

  public final String[] schemas = new String[] {"remotejoin"};

  public String getRemoteAddress(String participantType, String id);

}
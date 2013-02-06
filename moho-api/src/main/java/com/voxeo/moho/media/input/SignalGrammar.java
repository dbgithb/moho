package com.voxeo.moho.media.input;

public class SignalGrammar extends Grammar {

  public enum Signal {
    FAX_CED, FAX_CNG, BEEP, RING, SIT, MODEM, OFFHOOK;

    public static Signal parse(String value) {
      if ("beep".equalsIgnoreCase(value)) {
        return BEEP;
      }
      if ("modem".equalsIgnoreCase(value)) {
        return MODEM;
      }
      if ("sit".equalsIgnoreCase(value)) {
        return SIT;
      }
      if ("fax".equalsIgnoreCase(value)) {
        return FAX_CED;
      }
      if ("fax-cng".equalsIgnoreCase(value)) {
        return FAX_CNG;
      }
      return null;
    }
  }

  protected final Signal _signal;

  public SignalGrammar(final Signal signal) {
    _signal = signal;
  }

  public Signal getSignal() {
    return _signal;
  }
}
package ua.hillel.lesson06.phone;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public abstract class Phone implements Filming, Audioable {
  protected String model;

  String packageName;//deprecated

  public abstract void makeCall(String num);

  public abstract void receiveCall(String num);

  public void sendSms(String num, String text) {
    enableGsmModule("ON");
    System.out.println("Sending sms to " + num + "with text:\n" + text);
    enableGsmModule("OFF");
  }

  public void receiveSms(String num, String text) {
    System.out.println("Receiving sms to " + num + "with text:\n" + text);
  }

  private void enableGsmModule(String state) {
    System.out.println("Setting GSM to " + state);
  }
}

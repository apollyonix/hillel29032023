package ua.hillel.lesson06.phone;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class AndroidPhone extends Phone {
  @Override
  public void makeCall(String num) {
    System.out.println("Calling " + num + " from Android");
  }

  @Override
  public void receiveCall(String num) {
    System.out.println("New call " + num + " on Android");
  }

  @Override
  public void playMusic() {

  }

  @Override
  public void playPodcast() {

  }

  @Override
  public void makePhoto() {

  }

  @Override
  public void makeVideo() {

  }
}

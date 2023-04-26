package ua.hillel.lesson06.phone;

public interface Filming {
  void makePhoto();

  void makeVideo();

  default public void shareVideo() {

  }
}

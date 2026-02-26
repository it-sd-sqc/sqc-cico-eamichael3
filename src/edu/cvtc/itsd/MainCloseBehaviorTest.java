package edu.cvtc.itsd;

import javax.swing.WindowConstants;

public class MainCloseBehaviorTest {
  public static void main(String[] args) {
    if (Main.FRAME_CLOSE_OPERATION != WindowConstants.EXIT_ON_CLOSE) {
      throw new AssertionError("Main.FRAME_CLOSE_OPERATION must be EXIT_ON_CLOSE");
    }

    System.out.println("PASS: close behavior constant is EXIT_ON_CLOSE");
  }
}

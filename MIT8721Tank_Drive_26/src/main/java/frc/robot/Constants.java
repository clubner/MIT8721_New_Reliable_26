// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 */
public final class Constants {
  //Class for button bindings, ports for controller, constants for deadband, etc.
  public static class kControls {
    public static final int CONTROLLER_USB_PORT_ID = 0; // USB port for controller
    
    // Controller input axes (placeholders for now)
    public static final int LEFT_VERTICAL_JOYSTICK_AXIS = 1; //Forward & Back
    public static final int RIGHT_VERTICAL_JOYSTICK_AXIS = 2; //Turning
    public static final int RIGHT_HORIZONTAL_JOYSTICK_AXIS = 3; //Turning
    // Buttons (placeholders, probably won't use all of them)
    public static final int X_BUTTON = 4;
    public static final int Y_BUTTON = 5;
    public static final int A_BUTTON = 6;
    public static final int B_BUTTON = 7;
  }
  //Class for CAN IDs
  public static class kCan {
    public static final int LEFT_DRIVE_MOTOR_ID = 1;
    public static final int RIGHT_DRIVE_MOTOR_ID = 2;
    public static final int INTAKE_MOTOR_ID = 3;
    public static final int SHOOTER_MOTOR_ID = 4;
  }

  //Class for drivetrain constants
  public static class kDrivetrain{
    public static final boolean DRIVE_INVERT_LEFT = false; //Inversion of left drivetrain motors
    public static final boolean DRIVE_INVERT_RIGHT = true; //Inversion of right drivetrain motors
  }

  //Class for subsystem constants

  public static class kSubsystem {
    public static final boolean INTAKE_MOTOR_INVERTED = false; //Inversion of intake motor
    public static final boolean SHOOTER_MOTOR_INVERTED = false; //Inversion of shooter motor
  }
}

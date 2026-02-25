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
  public static final class kControls 
  {
    //Connects controller to roborio 2.0
    public static final int DRIVER_CONTROLLER_PORT = 0;
    //Different port for alternative control method, we don't anticipate using this
    //public static final int OPERATOR_CONTROLLER_PORT = 1;
  }
  //Class for CAN/motor IDs
  public static final class kCan 
  {
    //Driving Motor IDs
    public static final int LEFT_LEADER_ID = 1;
    public static final int LEFT_FOLLOWER_ID = 2;
    public static final int RIGHT_LEADER_ID = 3;
    public static final int RIGHT_FOLLOWER_ID = 4;
    //Launcher Motor IDs
    public static final int FEEDER_MOTOR_ID = 6;
    public static final int INTAKE_LAUNCHER_MOTOR_ID = 5;
  }

  //Class for drivetrain constants
  public static final class kDrivetrain
  {
    //60 amps max for drive motors
    public static final int DRIVE_MOTOR_CURRENT_LIMIT = 60;
    //Percent controller input is slowed down when translated to motor motion
    public static final double DRIVE_SCALING = 0.7;
    public static final double ROTATION_SCALING = 0.8;
  }

  //Class for subsystem constants

  public static final class kFuel 
  {
    //60 amps max for launch motors
    public static final int FEEDER_MOTOR_CURRENT_LIMIT = 60;
    public static final int LAUNCHER_MOTOR_CURRENT_LIMIT = 60;
    //More voltage control, probably should change to match our bot
    //
    public static final double INTAKING_FEEDER_VOLTAGE = -12;
    public static final double INTAKING_INTAKE_VOLTAGE = 10;
    public static final double LAUNCHING_FEEDER_VOLTAGE = 9;
    public static final double LAUNCHING_LAUNCHER_VOLTAGE = 10.6;
    public static final double SPIN_UP_FEEDER_VOLTAGE = -6;
    
    public static final double SPIN_UP_SECONDS = 1;
  }
}

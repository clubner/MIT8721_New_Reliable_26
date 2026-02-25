package frc.robot;

import frc.robot.Constants;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkLowLevel;
import frc.robot.Constants.kCan;
import frc.robot.Constants.kDrivetrain;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class Drivetrain extends SubsystemBase {
    //Initialize and drivetrain's motor controllers
    private SparkMax leftMotor;
    private SparkMax rightMotor;
    
    //A 'direction' variable is initialized to flip the 'front' of the robot
    private int direction = 1;
    
    //Create a chooser for selecting the desired drive speed scale
    SendableChooser<Double> driveScaleChooser = new SendableChooser<Double>();
    public double CURRENT_DRIVE_SCALE;

    public Drivetrain() {
        //Initialize the Drivetrain motor controllers (constructors)
        leftMotor = new SparkMax(kCan.LEFT_DRIVE_MOTOR_ID, MotorType.kBrushed);
        rightMotor = new SparkMax(kCan.RIGHT_DRIVE_MOTOR_ID, MotorType.kBrushed);

        //Reverse some of the motors if needed
        leftMotor.setInverted(kDrivetrain.DRIVE_INVERT_LEFT); //this is false in Constants.java
    }
}

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Drivetrain;





public class TurnRight extends Command {
    
    Drivetrain driveSubsystem;
    double xSpeed, zRotation;

    public TurnRight(Drivetrain driveSystem) {
        addRequirements(driveSystem);
        this.driveSubsystem = driveSystem;
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        driveSubsystem.driveArcade(0, .5);
    }

    @Override
    public boolean isFinished() {
        return false;
    }
  





}

package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Drivetrain;
import frc.robot.Constants.DriveConstants.*;




public class TurnLeft extends Command {
    
    Drivetrain driveSubsystem;
    double xSpeed, zRotation;

    public TurnLeft(Drivetrain driveSystem) {
        addRequirements(driveSystem);
        this.driveSubsystem = driveSystem;
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        driveSubsystem.driveArcade(.5, .5);
    }

    @Override
    public boolean isFinished() {
        return false;
    }
  





}

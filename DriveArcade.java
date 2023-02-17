package frc.robot.commands;

import java.util.Set;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Subsystem;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;

public class DriveArcade extends SubsystemBase implements Command {
  // Create left and right TalonFX motor controllers

  // ArcadeDrive method
  public void arcadeDrive(double moveSpeed, double rotateSpeed, DifferentialDrive m_driveTrain) {
    m_driveTrain.arcadeDrive(moveSpeed, rotateSpeed);
  }

    double m_moveSpeed = -RobotContainer.driverController_1.getRawAxis(Constants.DRIVER_CONTROLLER_MOVE_AXIS);
    double m_rotateSpeed = RobotContainer.driverController_2.getRawAxis(Constants.DRIVER_CONTROLLER_ROTATE_AXIS);

    @Override
    public Set<Subsystem> getRequirements() {
      return null;
    }

    
  








}


